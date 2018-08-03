package com.greenfox.tokentesting.security.services;

import com.greenfox.tokentesting.security.ApplicationUser;
import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.greenfox.tokentesting.security.SecurityConstants.HEADER_STRING;
import static com.greenfox.tokentesting.security.SecurityConstants.SECRET;
import static com.greenfox.tokentesting.security.SecurityConstants.TOKEN_PREFIX;

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

  private final CustomerDetailsServer customerDetailsServer;

  public JWTAuthorizationFilter(AuthenticationManager authenticationManager,
                                CustomerDetailsServer customerDetailsServer) {
    super(authenticationManager);
    this.customerDetailsServer = customerDetailsServer;
  }

  @Override
  protected void doFilterInternal(HttpServletRequest request,
                                  HttpServletResponse response,
                                  FilterChain chain) throws IOException, ServletException {
    String header = request.getHeader(HEADER_STRING);
    if (header == null || !header.startsWith(TOKEN_PREFIX)) {
      chain.doFilter(request, response);
      return;
    }

    UsernamePasswordAuthenticationToken usernamePasswordAuth = getAuthenticationToken(request);
    SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuth);
    chain.doFilter(request, response);
  }

  private UsernamePasswordAuthenticationToken getAuthenticationToken(HttpServletRequest request) {
    String token = request.getHeader(HEADER_STRING);
    if (token == null) return null;
    String username = Jwts.parser().setSigningKey(SECRET)
            .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
            .getBody()
            .getSubject();
    UserDetails userDetails = customerDetailsServer.loadUserByUsername(username);
    ApplicationUser applicationUser = customerDetailsServer.loadApplicationUserByUserName(username);
    return username != null? new UsernamePasswordAuthenticationToken(applicationUser, null, userDetails.getAuthorities()) : null;
  }

}
