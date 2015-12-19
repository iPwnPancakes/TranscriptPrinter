package transcriptPrinter;

import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    Student Studentdetails = new Student();
    Course coursedetails = new Course();
    CertificateStudentTranscript CST = new CertificateStudentTranscript (); 
    UndergraduateStudentTranscript  UST = new UndergraduateStudentTranscript ();
    char student_type;
        System.out.println("Enter the student first name:");
        Studentdetails.setStudent_fname(input.next());
        
        System.out.println("Enter the student last name");
        Studentdetails.setStudent_lname(input.next());
        
        System.out.println("Enter the student ID:");
        Studentdetails.setStudent_ID(input.next());
        
        System.out.println("Enter the programme:");
        Studentdetails.setProgramme(input.next());
        //Studentdetails.setProgramme(input.next());
        
        System.out.println("Enter the number of courses you did in the above semester:");
        int numberOfCourses = input.nextInt();
        Studentdetails.setNumber_of_courses(numberOfCourses);
        
        System.out.println("What Type of Student are you?"
                + "\n" + "'U' or 'u':Undergradudate"
                + "\n" + "'C' or 'c':Certificate");
        student_type = input.next().charAt(0);
        
        ////////////////////////////////////////////////////////////////////
        //TODO Print in Undergrad transcript class the total credit earned//
        //double totalcreditearned =+ coursedetails.getCourse_credit();   //
        ////////////////////////////////////////////////////////////////////
        
        if(student_type == 'U' || student_type == 'u')
        {
        	UST.setCourseArraySize(Studentdetails.getNumber_of_courses());
        	
        	for(int i = 0; i < Studentdetails.getNumber_of_courses(); i++) 
            {
            	
    	        System.out.println("Course code:");
    	        coursedetails.setCourse_code(input.next());
    	        
    	        System.out.println("Course Title:");
    	        coursedetails.setCourse_title(input.next());
    	        
    	        System.out.println("Course Credit:");
    	        coursedetails.setCourse_credit(input.nextInt());
    	        
    	        System.out.println("Mark received in course:");//THE ACTUAL GRADE
    	        coursedetails.setMark(input.nextDouble());
    	        
    	        //TODO Add the actual letter grade
    	        
    	        UST.setCourseAt(i, coursedetails);
            }
        	UST.printTranscriptInfo(Studentdetails,coursedetails);
        }
        else if(student_type == 'C' || student_type == 'c')
        {
        	CST.setCourseArraySize(Studentdetails.getNumber_of_courses());
        	//WE ARE HERE BOYZ THIS IS STILL A WORK IN PROGRESS
        	for(int i = 0; i < Studentdetails.getNumber_of_courses(); i++) 
            {
            	
    	        System.out.println("Course code:");
    	        coursedetails.setCourse_code(input.next());
    	        
    	        System.out.println("Course Title:");
    	        coursedetails.setCourse_title(input.next());
    	        
    	        System.out.println("Mark received in course:");
    	        coursedetails.setMark(input.nextDouble());
    	        
    	        CST.setCourseAt(i, coursedetails);
    	        //REMEMBER TO PRINT OUT IF THEY PASSED OR FAILED
            }
        	CST.printTranscriptInfo(Studentdetails,coursedetails);
        }
        input.close();
        }
}