package com.wbl.Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class Congiguration {

  public static String URL="";
  public static String BROWSER="";
  public static void readProperties()
  {
	  Properties prop=new Properties();
	  FileReader fr;
	  
      try
      {
    	  fr=new FileReader(new File("C:\\neeru\\workspace\\NewAutomation\\config,properties"));
           prop.load(fr);
          BROWSER=prop.getProperty("browser");
          System.out.println(BROWSER);
          
          
          URL=prop.getProperty("url") ; 
          System.out.println(URL);
         
      }catch(FileNotFoundException e)
      {
      
       e.printStackTrace();
      }catch(Exception e)
      {
  
       e.printStackTrace();
  
     }
  }
     /* public static void main(String[] args)
   {
	
    	 // Congiguration bc=new Congiguration();
    	 
      readProperties();
         
   
   }*/

  }








