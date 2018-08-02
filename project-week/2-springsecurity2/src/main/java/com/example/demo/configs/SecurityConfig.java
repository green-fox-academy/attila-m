package com.example.demo.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  private static final String USER = "USER";
  private static final String ADMIN = "ADMIN";

  @Override
  public void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.authorizeRequests()
            .antMatchers("testing/public/account/*").hasRole(USER)
            .antMatchers("testing/private/admin/**").hasRole(ADMIN)
            .and()
            .formLogin();
  }

  @Autowired
  public void globalConfig(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
            .withUser("Attila").password("{noop}password").roles(USER)
            .and()
            .withUser("Franci").password("{noop}pass").roles(USER,ADMIN);
  }
}
