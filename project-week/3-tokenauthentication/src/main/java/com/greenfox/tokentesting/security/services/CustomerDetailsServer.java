package com.greenfox.tokentesting.security.services;

import com.greenfox.tokentesting.security.ApplicationUser;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomerDetailsServer implements UserDetailsService {

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    ApplicationUser applicationUser = loadApplicationUserByUserName(username);
    return new User(applicationUser.getUsername(),applicationUser.getPassword(),
            AuthorityUtils.createAuthorityList("ROLE_USER"));
  }

  public ApplicationUser loadApplicationUserByUserName(String username) {
    return new ApplicationUser("User", "pass");
  }
}
