package com.p500plus.test.bean;

import javax.inject.Named;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Named
public class AuthUser {
	 public String showGreeting() {
		    Authentication authentication =
		        SecurityContextHolder.getContext().getAuthentication();

		    return "Hello " + authentication.getName() + "!";
	 }
}
