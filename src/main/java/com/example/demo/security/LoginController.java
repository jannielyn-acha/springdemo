package com.example.demo.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/showLoginPage")
	public String showLoginPage() {
		return "user_login";
	}

	@GetMapping("/accessDenied")
	public String accessDenied() {
		return "access_denied";
	}
}
