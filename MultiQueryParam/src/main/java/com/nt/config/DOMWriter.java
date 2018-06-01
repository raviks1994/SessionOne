package com.nt.config;

import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOMWriter {

	public static void main(String[] args)throws Exception {
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		Document doc=builder.newDocument();
		Element e0=doc.createElement("employees");
		Element e1=doc.createElement("employee");
		Element e11=doc.createElement("id");
		e11.setTextContent("1");
		Element e12=doc.createElement("employee");
		e12.setTextContent("ravi");
		Element e13=doc.createElement("employee");
		e13.setTextContent("SE");
		e1.appendChild(e11);e1.appendChild(e12);e1.appendChild(e13);
		
		Element e2=doc.createElement("employee");
		Element e21=doc.createElement("id");
		e21.setTextContent("2");
		Element e22=doc.createElement("employee");
		e22.setTextContent("anshu");
		Element e23=doc.createElement("employee");
		e23.setTextContent("Testing");
		e2.appendChild(e21);e2.appendChild(e22);e2.appendChild(e23);
		
		e0.appendChild(e1);e0.appendChild(e2);
		
		Transformer tr=TransformerFactory.newInstance().newTransformer();
		tr.transform(new DOMSource(e0), new StreamResult("data2.xml"));
		System.out.println("done");
		
		
		
		
		
		
		
		
	}

}
