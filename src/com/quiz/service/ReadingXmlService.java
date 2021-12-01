package com.quiz.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.quiz.model.QuizModel;

public class ReadingXmlService {

	public static List<QuizModel> subjectdata;
	
	static QuizModel user = new QuizModel();
	static GetQuizQuestionExtends gud = new GetQuizQuestionExtends();
	
	public static int readSubjectXML(File xmlFile) {
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		Scanner scan = new Scanner(System.in);
		
		int correctCount=0;
		int incorrectCount=0;
		
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc=dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			NodeList nodeList = doc.getElementsByTagName("Item");
			NodeList attributeList = doc.getElementsByTagName("Correct");
			
			subjectdata = new ArrayList<QuizModel>();
			
			for (int i=0; i<nodeList.getLength(); i++) {
				
				subjectdata.add(GetQuizQuestionExtends.getQuestion(nodeList.item(i),attributeList.item(i)));
				System.out.println("Question "+(i+1)+" : "+(user.getQuestion()));
				System.out.println("A :"+(user.getOption1()));
				System.out.println("B :"+(user.getOption2()));
				System.out.println("C :"+(user.getOption3()));
				System.out.println("D :"+(user.getOption4()));
				
				System.out.print("\nEnter your answer: ");
				String answer = scan.nextLine();
				if(user.getCorrectOption().equalsIgnoreCase(answer)){
				System.out.println("Correct Answer\n");
					correctCount++;
				}else {
						System.out.println("Incorrect Answer. Correct Answer is "+user.getCorrect()+"\n");
						incorrectCount++;
					}
			}

			System.out.println("********** Result ************");
			System.out.println("Correct Answer = "+correctCount);
			System.out.println("Incorrect Answer = "+incorrectCount);
						
		}catch (SAXException | ParserConfigurationException | IOException e1){
			e1.printStackTrace();
		}
		scan.close();
		return correctCount;
	}

}