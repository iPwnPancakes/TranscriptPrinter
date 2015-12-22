package transcriptPrinter;

import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    Student Student = new Student();
    Course Course = new Course();
    CertificateStudentTranscript CST = new CertificateStudentTranscript (); 
    UndergraduateStudentTranscript  UST = new UndergraduateStudentTranscript ();
    char student_type;
        System.out.println("Enter the student first name:");
        Student.setStudent_fname(input.next());

        System.out.println("Enter the student last name");
        Student.setStudent_lname(input.next());

        System.out.println("Enter the student ID:");
        Student.setStudent_ID(input.next());

        System.out.println("Enter the programme:");
        Student.setProgramme(input.next());
        //Studentdetails.setProgramme(input.next());

        System.out.println("Enter the number of courses you did in the above semester:");
        int numberOfCourses = input.nextInt();
        Student.setNumber_of_courses(numberOfCourses);
        
        System.out.println("What Type of Student are you?"
                + "\n" + "'U' or 'u':Undergradudate"
                + "\n" + "'C' or 'c':Certificate");
        student_type = input.next().charAt(0);//U or C
        
        ////////////////////////////////////////////////////////////////////
        //TODO Print in Undergrad transcript class the total credit earned//
        //double totalcreditearned =+ Course.getCourse_credit();   //
        ////////////////////////////////////////////////////////////////////
        
        if(student_type == 'U' || student_type == 'u')//If student typed in U execute this part of code
        {
        	UST.setCourseArraySize(Student.getNumber_of_courses());
        	
        	for(int i = 0; i < Student.getNumber_of_courses(); i++)
            {
            	
    	        System.out.println("Course code:");
    	        Course.setCourse_code(input.next());
    	        
    	        System.out.println("Course Title:");
    	        Course.setCourse_title(input.next());
    	        
    	        System.out.println("Course Credit:");
    	        Course.setCourse_credit(input.nextInt());
    	        
    	        System.out.println("Mark received in course:");//THE ACTUAL # GRADE
    	        Course.setMark(input.nextDouble());

    	        //TODO Add the actual letter grade
    	        
    	        UST.setCourseAt(i, Course);
            }
        	UST.printTranscriptInfo(Student,Course);
        }
        else if(student_type == 'C' || student_type == 'c')
        {
        	CST.setCourseArraySize(Student.getNumber_of_courses());
        	//WE ARE HERE BOYZ THIS IS STILL A WORK IN PROGRESS
        	for(int i = 0; i < Student.getNumber_of_courses(); i++)
            {
            	
    	        System.out.println("Course code:");
    	        Course.setCourse_code(input.next());
    	        
    	        System.out.println("Course Title:");
    	        Course.setCourse_title(input.next());
    	        
    	        System.out.println("Mark received in course:");
    	        Course.setMark(input.nextDouble());
    	        
    	        CST.setCourseAt(i, Course);
    	        //REMEMBER TO PRINT OUT IF THEY PASSED OR FAILED
            }
        	CST.printTranscriptInfo(Student,Course);
        }
        input.close();
        }
}