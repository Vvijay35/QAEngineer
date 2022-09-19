package com.corejava.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sept19_FileHadndling {
	
	// Escape characters in java - \n, \t, \",\r,\'
	
	//String s = "ramu is from i\ndia and he is an engineer";
	//String s = "ramu is from \"india\" and he is an engineer";		
	//String filePath = "D:\\newFile.txt";		
	//System.out.println(filePath);

	public static void main(String[] args) throws IOException  {
		
		

	}
	
	public static void fileReadingEx() throws IOException
	{
		File f = new File("D:\\MorningBatchSAAG_Aug22\\sample\\logs.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		//System.out.println(br.readLine());
		
		String line = "";
		
		while((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
		
	}
	
	//writeLogsToFile("Starting the test case login_001");
	//writeLogsToFile("successfully loged in ");
	//writeLogsToFile("Verifying whether the logout link is seen or not");
	
	public static void writeLogsToFile(String logMessage) throws IOException
	{
		File f = new File("D:\\MorningBatchSAAG_Aug22\\sample\\logs.txt");
		
		FileWriter fw = new FileWriter(f,true);
		
		fw.write(logMessage+"\n");
		
		
		fw.flush();
		fw.close();
		
	}
	
	
	//writeResultsToFile("loging_001","Pass");
	//writeResultsToFile("loging_002","Failed");
	//writeResultsToFile("loging_003","Pass");
	public static void writeResultsToFile(String testCaseName, String testCaseStatus) throws IOException
	{
		File f = new File("D:\\MorningBatchSAAG_Aug22\\sample\\results.txt");
		
		FileWriter fw = new FileWriter(f,true);
		
		fw.write(testCaseName+"-----"+testCaseStatus+"\n");
		
		
		fw.flush();
		fw.close();
		
	}
	
	public static void appendToFile() throws IOException
	{
		File f = new File("D:\\MorningBatchSAAG_Aug22\\sample\\test.txt");
		
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("Welcome to Java\n");
		fw.write("Java is very interesting\n");
		fw.write("Selenium will be further easy interesting....\n");
		
		fw.flush();
		fw.close();
	}
	
	public static void writeToAFile() throws IOException
	{
		
	File f = new File("D:\\MorningBatchSAAG_Aug22\\sample\\test.txt");
	
	FileWriter fw = new FileWriter(f);
	
	fw.write("Welcome to Java\n");
	fw.write("Java is very interesting\n");
	fw.write("Selenium will be further easy interesting....\n");
	
	fw.flush();
	fw.close();
	}
	
	public static void basicFileMethods() throws IOException
	{
		File f = new File("D:\\MorningBatchSAAG_Aug22\\sample\\test.txt");	
		File f1 = new File("D:\\MorningBatchSAAG_Aug22\\sample\\test1.txt");	
		f.createNewFile();	
		
		System.out.println(f.isFile());
		
		System.out.println(f.getAbsolutePath());
		
		System.out.println(f.canWrite());
		
		System.out.println(f.exists());
		
		System.out.println(f.getName());
		
		
		System.out.println(f.getParent());
		
		System.out.println(f.isHidden());
		
		f.renameTo(f1);
	}
	
	public static void folderRalatedMethods()
	{
		// creating an object of file class, Java will decide based on the extension whether its a file or folder..
				File f = new File("D:\\MorningBatchSAAG_Aug22");
				//File f1 = new File("D:\\MorningBatchSAAG_Aug22\\sample1");
				
				// To create  a new folder in the above path...
				f.mkdir();
				
				System.out.println(f.isDirectory());		
				System.out.println(f.exists());		
				System.out.println(f.canRead());		
				System.out.println(f.getAbsolutePath());			
				System.out.println(f.getParent());		
				//f.renameTo(f1);		
				//f.setReadOnly();		
				//f.delete();		
				System.out.println(f.exists());
				
				String[] fList = f.list();
				
				for(String m : fList)
				{
					System.out.println(m);
				}
				
				System.out.println("==================");
				
				File[] fList1 = f.listFiles();
				
				for(File m : fList1)
				{
					System.out.println(m);
					System.out.println(m.getName());
				}
				
	}

}
