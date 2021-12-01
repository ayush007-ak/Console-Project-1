package com.quiz.service;


import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.quiz.model.QuizModel;

public class GetQuizQuestionExtends extends ReadingXmlService {

	protected static QuizModel getQuestion(Node node,Node n) {
	      // XMLReaderDOM domReader = new XMLReaderDOM();
	      if (node.getNodeType() == Node.ELEMENT_NODE) {
	         Element element = (Element) node;
	       //   user.setId(Integer.parseInt(getTagValue("id", element)));
	          user.setQuestion(getTagValue("Question",element));
	          user.setOption1(getTagValue("Option1", element));
	          user.setOption2(getTagValue("Option2", element));
	          user.setOption3(getTagValue("Option3", element));
	          user.setOption4(getTagValue("Option4",element));
	          user.setCorrect(getTagValue("Correct",element));
	          user.setCorrectOption(getTagAttribute("Correct",n));
	          
	      }
	     return user;
	     
		}
	
	private static String getTagAttribute(String tag, Node n) {
		String option = n.getAttributes().getNamedItem("answer").getNodeValue();
		return option;
	}
		
		private static String getTagValue(String tag, Element element) {
			NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		    Node node = (Node) nodeList.item(0);
		    	return node.getNodeValue();
		}
}
