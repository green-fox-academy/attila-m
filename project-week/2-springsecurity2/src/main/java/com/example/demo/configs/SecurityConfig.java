package com.example.demo.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  private static final String USERR = "first";
  private static final String ADD = "first";

  @Autowired
  public void globalConfig(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
            .withUser("Peter").password("{noop}szam").roles(USERR)
            .and()
            .withUser("Ubul").password("{noop}betu").roles(USERR, ADD);
  }

  @Override
  public void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.authorizeRequests()
            .antMatchers("/private/account/**").hasRole(USERR)
            .antMatchers("/private/admin/**").hasRole(ADD)
            .and()
            .formLogin();
  }
}
