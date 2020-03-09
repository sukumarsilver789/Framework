package javaLearning;

import java.io.*; 
public class ReadingFromFile 
{ 
  public static void main(String[] args) throws Exception 
  { 
    // pass the path to the file as a parameter 
	  
	  //Using Filereader
    FileReader fr = 
      new FileReader("C:\\Users\\sukumar.busipalli\\Documents\\WebApp_Pen_Testing_1.txt"); 
  
    int i; 
    while ((i=fr.read()) != -1) 
      System.out.print((char) i); 
    
    //Using bufferedReader
    File file = new File("C:\\Users\\sukumar.busipalli\\Documents\\WebApp_Pen_Testing_1.txt"); 
	  
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  
	  String st; 
	  while ((st = br.readLine()) != null) 
	    System.out.println(st); 
  } 
}
