package com.quiz.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import com.quiz.model.UserModel;

public class SaveTextFile {
	
	public void saveFile(UserModel user,String subject,CalculateResult result) {
		File file = new File("D:\\JavaWorkspace\\QuizSystem - final\\stddata.txt");
		try(FileWriter fw = new FileWriter(file,true);
			BufferedWriter out = new BufferedWriter(fw)){
			
			out.append(user.getFirstName()+" "+user.getLastName()+" "+subject+" "+result.result()+" "+result.calculatePercentage());
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
