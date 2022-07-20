//package com.soturno.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
////import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SpringSecurityConfig {
//	
//	@Autowired
//	UserDetailsServiceImpl userDetailsServiceImpl;
//	
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userDetailsServiceImpl).passwordEncoder(passwordEncoder());
//	}
//	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		
//		http.authorizeRequests().antMatchers("/", "/login").permitAll()
//		.antMatchers("/home").authenticated()
//		.and().csrf().disable()
//		.formLogin().loginPage("/login")
//		.defaultSuccessUrl("/home")
//		.usernameParameter("username")
//		.passwordParameter("password")
//		.and().exceptionHandling().accessDeniedPage("/access-denied")
//		.and().logout().logoutUrl("/logout").logoutSuccessUrl("/login")
//		.permitAll();
//		
//		http.headers().frameOptions().sameOrigin();
//		
//		return http.build();
//	}
//	
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//}
