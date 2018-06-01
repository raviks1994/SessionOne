package com.nt.config;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test {

	public static void main(String[] args)throws Exception {
	DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=factory.newDocumentBuilder();
	Document doc=builder.parse("data.xml");
	NodeList nl=doc.getElementsByTagName("employee");
	for(int i=0;i<nl.getLength();i++) {
		Node node=nl.item(i);
		if(node.getNodeType()==node.ELEMENT_NODE) {
			Element e=(Element)node;
			System.out.println(e.getElementsByTagName("id").item(0).getTextContent());
			System.out.println(e.getElementsByTagName("name").item(0).getTextContent());
			System.out.println(e.getElementsByTagName("desg").item(0).getTextContent());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
