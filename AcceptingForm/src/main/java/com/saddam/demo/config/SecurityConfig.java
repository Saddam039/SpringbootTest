package com.saddam.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@EnableWebSecurity
//@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	/*@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("sam").password("S143").roles("USER")
		.and()
		.withUser("Saddam").password("sammy123").roles("USER");
	}*/
	
	
	
	/*@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers("/person").hasRole("USER")
		.and()
		.csrf().disable()
		.formLogin().disable();
		
	}*/
	
	
}


