package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This is controller used to expose URL for application access.
 * 
 * @author shyam.pareek
 *
 */
@Controller
public class WebController {

	@RequestMapping("/")
	String home() {
		return "app.homepage";
	}
}
