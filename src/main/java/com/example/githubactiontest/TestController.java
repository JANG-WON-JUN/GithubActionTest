package com.example.githubactiontest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/")
	public ResponseEntity<String> test() {
		return ResponseEntity.ok("안녕하세요!");
	}
}
