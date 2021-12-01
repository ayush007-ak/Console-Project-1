package com.quiz.controller;

import java.io.File;

import com.quiz.service.ReadingXmlService;

public class XmlController {
	public int xmlController(File f) {
		return ReadingXmlService.readSubjectXML(f);
	}
}
