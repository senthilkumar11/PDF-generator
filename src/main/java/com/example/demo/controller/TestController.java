package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PdfGenerate;

@RestController
public class TestController {
	@Autowired
	PdfGenerate pdfGenerate;
	@GetMapping
	public String test() {
		pdfGenerate.generatePdf();
		return "true";
	}
}
