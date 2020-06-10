package com.example.Config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebAuthentication extends WebSecurityConfigurerAdapter {

	@Autowired
	  public void configureGlobal(AuthenticationManagerBuilder auth)
	      throws Exception {
	    auth
	    .inMemoryAuthentication()
	    .withUser("userId").password("passwd")
	    .authorities("ROLE_USER");

	  }

	  @Override
	  protected void configure(HttpSecurity http) throws Exception {
	    http
	    .authorizeRequests()
	    .antMatchers("/securityNone").permitAll()
	    .anyRequest().authenticated()
	    .and()
	    .httpBasic();
	    

	  }
}
