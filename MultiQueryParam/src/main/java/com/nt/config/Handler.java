package com.nt.config;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler{
	private boolean name;
	private boolean id;
	private boolean desg;
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(qName.equals("id")) {
			id=true;
		}
		else if(qName.equals("name")) {
			name=true;
		}
		if(qName.equals("desg")) {
			desg=true;
		}
		
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if(id||name||desg) {
			System.out.println(new String(ch,start,length));
			id=false;name=false;desg=false;
		}
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
	}
}
