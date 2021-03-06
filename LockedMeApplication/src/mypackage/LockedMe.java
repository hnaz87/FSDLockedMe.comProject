package mypackage;
import java.util.*;
import java.io.*;

public class LockedMe {
	
	
	
   static final String projectFilespath="C:\\Users\\Administrator\\eclipse-workspace\\LockedMe.com\\TextFiles";
   static final String errorMessage="An unexpected error happened. Please contact the admin@Lockedme.com";
   
  public static void mainOptions()
  {
	  Scanner obj = new Scanner(System.in);
	  
	   
	    System.out.println("**************************************************************");
		System.out.println("\n Explore the world of Information and Contribute to it!!!!! \n");
		System.out.println("**************************************************************");
		System.out.println("\n 1.Read Existing Pages \n 2.Make you own \n 3.Close  \n");
		try
		{
		System.out.println("Enter your choice \n");
		int option= obj.nextInt();
		if(option == 1)
		{
			viewFiles();
			mainOptions();
		}
		else if(option == 2)
		{
			subOptions();
		
		}
		else if(option==3)
		{
			System.out.println("Thanks for using LockedMe.com.Plz visit again.");
			System.exit(0);
		}
		else
		{
	     System.out.println("Invalid choice.Enter a choice from 1-3");
	     mainOptions();
		}
		}
		catch(Exception ex)
		{
			System.out.println(errorMessage);
		}
		finally
		{
			obj.close();
		}
	   
	
  }
  
  public static void subOptions()
  {
	  Scanner obj = new Scanner(System.in);
      
			   
		      System.out.println("\n 1-Add a file\n 2-Delete a file \n 3-Search a file\n 4-Back to Main Menu");
		      try
		      {
		      System.out.println("\n Enter your choice :\n");
		      int suboption=obj.nextInt();
		      
					      switch(suboption)
					      {
					      case 1: addFile();
					              subOptions();
					      break;
					      case 2: deleteFile(); 
					              subOptions();
					      break;
					      case 3: SearchFile();
					              subOptions();
					      break;
					      case 4:System.out.println("returning to MainScreen");
					             mainOptions();
					             
					      break;
					      case 5:System.out.println("Invalid choice.Enter your choice from 1-4");
					             subOptions();
					      
					      }
		      
		      
      }
      catch(Exception ex)
      {
    	  System.out.println(errorMessage);
    	  
      }
       obj.close();
    
  }
	
	
public static void main(String[] args)throws IOException
{
		// TODO Auto-generated method stub
		/**Welcome Screen of LockedMe.com*/
		
		
		System.out.println("===============================================================================");

		System.out.println("\t\t\t \b Welcome to LockeMe.com");
		
		System.out.println("===============================================================================");
		System.out.println("\t\t *********** developed by Hina Naz.************\n\n\n\n");
		
		System.out.println("\t\t#### How about getting to know about LockedMe.com ####\n\n\n");
		System.out.println("-------------------------------------------------------------------------------");
        
		mainOptions();
		
		
		
		
 }
	
            
     //Function to display the existing files in directory
	 public static void viewFiles() 
	 {  
	            	
	      System.out.println("Thanks for choosing option 1\n");
	      try
	      
	      {
	                
			 File folder= new File(projectFilespath);
			 File[] listOfFiles=folder.listFiles();
	                
	                
	                if(listOfFiles.length==0)
	                {	
	                 System.out.println("No files Exist in Directory");
	                }
	                else
	                {
	                	
	                System.out.println("The files in ascending order are: \n");
	                for(var l:listOfFiles)
	                {
	                	
	                	System.out.println(l.getName());
	                	
	                }
	                
	                
	                }
	                
	      }
	                	
	   catch(Exception ex)
	    {
	            
	       System.out.println(errorMessage);
	       
	    }
	      
	      
	 }   
            
	 //Function to create a file and add data to it       
	 public static void  addFile()
	 {
		 	Scanner obj=new Scanner(System.in);
		 	try
		 	{
		     System.out.println("Enter the file name to be added \n");
		     String filename;
		     int linescount;
		     
		     filename= obj.nextLine();
		     System.out.println("Enter  the lines to be written in the file");
		     linescount=Integer.parseInt(obj.nextLine());
		     FileWriter file= new FileWriter(projectFilespath+"\\"+filename);
		     System.out.println("Enter  the text to be written in the file");
			     for(int i=0;i<linescount;i++)
			     {
			     	
			     	file.write(obj.nextLine()+"\n");
			     }
		     System.out.println("success");
		     file.close();
		     subOptions();
		     
		    
		 	}
		 	catch(Exception ex)
		 	{
		 		System.out.println(errorMessage);
		 		subOptions();
		 		
		 		
		 	}
		 	
		    
		    obj.close();
	 }           
 public static void  deleteFile()
 {
	 	Scanner obj=new Scanner(System.in);
	 	try
	 	{
	     System.out.println("Enter the file name to be deleted \n");
	     String filename;
	     
	     filename= obj.nextLine();
	     File file= new File(projectFilespath+"\\"+filename);
		     if(file.exists())
		     {	
		     	file.delete();
		         System.out.println("File deleted successfully");
		     }
		     else
		     {
		     	System.out.println("file does not exist");
		     
		 	}
	      subOptions();
	 	}
	 	catch(Exception ex)
	 	{
	 		System.out.println(errorMessage);
	 		
	 	}
	 	
	 obj.close();
 	 
 	  }           
	 public static void  SearchFile()
	 {
	
		 	Scanner obj=new Scanner(System.in);
		 	try
		 	{
		     System.out.println("Enter the file name to be searched \n");
		     String filename;
		     
		     filename= obj.nextLine();
		     File folder= new File(projectFilespath);
		     File[] listOfFiles=folder.listFiles();
		     LinkedList<String> filenames=new LinkedList<String>();
			     for(var l:listOfFiles)
				   filenames.add(l.getName());
			    if(filenames.contains(filename))
			 	   System.out.println("File found");
			    else
			 	   System.out.println("file not found");
		    subOptions();
		 	}
		 	catch(Exception ex)
		 	{
		 		System.out.println(errorMessage);
		 		System.exit(0);
		 	}
		 	
	     
	     obj.close();
	     
	     
	
	 }
  
 	}


