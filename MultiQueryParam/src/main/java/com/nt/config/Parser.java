package com.nt.config;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class Parser {
	public static void main(String[] args) throws Exception {
		SAXParser parser=SAXParserFactory.newInstance().newSAXParser();
		parser.parse(new File("data.xml"), new Handler());
		
	}
}
