package transcriptPrinter;

import java.util.Scanner;

public class __INIT 
{

    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    Student Student = new Student();
    Course Course = new Course();
    
    char student_type;
        System.out.println("Enter the student first name:");
        Student.setStudent_fname(input.next());
        input.nextLine();
        System.out.println("Enter the student last name");
        Student.setStudent_lname(input.next());
        input.nextLine();
        System.out.println("Enter the student ID:");
        Student.setStudent_ID(input.nextLine());
        System.out.println("Enter the programme:");
        Student.setProgramme(input.nextLine());

        System.out.println("Enter the number of courses you did in the above semester:");
        Student.setNumber_of_courses(input.nextInt());
        
        System.out.println("What Type of Student are you?"
                + "\n" + "'U' or 'u':Undergradudate"
                + "\n" + "'C' or 'c':Certificate");
        student_type = input.next().charAt(0);
        
        if(student_type == 'U' || student_type == 'u')//If student typed in U execute this part of code
        {
        	UndergraduateStudentTranscript  UST = new UndergraduateStudentTranscript(Student.getNumber_of_courses());
        	input.nextLine();
        	for(int i = 0; i < Student.getNumber_of_courses(); i++)
            {
    	        System.out.println("Course code:");
    	        Course.setCourse_code(input.next());
    	        
    	        System.out.println("Course Title:");
    	        Course.setCourse_title(input.nextLine());
    	        
    	        System.out.println("Course Credit:");
    	        Course.setCourse_credit(input.nextInt());
    	        
    	        System.out.println("Mark received in course:");
    	        Course.setMark(input.nextDouble());
    	        
    	        Course.setGrade(Course.getMark());
    	        
    	        UST.setCourseAt(i, Course);
            }
        	UST.printTranscriptInfo(Student,Course);
        }
        else if(student_type == 'C' || student_type == 'c')
        {
        	CertificateStudentTranscript CST = new CertificateStudentTranscript(Student.getNumber_of_courses());
        	for(int i = 0; i < Student.getNumber_of_courses(); i++)
            {
            	
    	        System.out.println("Course code:");
    	        Course.setCourse_code(input.next());
    	        
    	        System.out.println("Course Title:");
    	        Course.setCourse_title(input.next());
    	        
    	        System.out.println("Mark received in course:");
    	        Course.setMark(input.nextDouble());
    	        
    	        CST.setCourseAt(i, Course);
            }
        	CST.printTranscriptInfo(Student,Course);
        }
        input.close();
        }
}