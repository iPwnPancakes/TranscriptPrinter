package transcriptPrinter;

public class CertificateStudentTranscript extends StudentTranscript
{
    private String grade;
    protected int courseArraySize;
    
    public CertificateStudentTranscript()
    {
        
    }
    
    public double passFail()
    {
       double Mark = 0;
       
       if( mark >= 50 && mark <= 100)
       {
           this.grade = "Pass";
       }
       else if ( mark < 50)
       {
           this.grade = "Fail";
       }
        return Mark;
    }  
    
    public void setCourseArraySize(int i){
    	this.courseArraySize = i;
    }
    
    public void setCourseAt(int i, Course coursedetails){
    	super.setCourseArrayAt(i, coursedetails);
    }
    
    public Course getCourseAt(int i){
    	return super.getCourseAt(i);
    }
    
    @Override
    public void printTranscriptInfo(Student Studentdetails, Course coursedetails)
    {
    	System.out.println("Student ID: " + Studentdetails.getStudent_ID());
		System.out.println("Student Name: " + Studentdetails.getStudent_fname() + " " + Studentdetails.getStudent_lname());
		System.out.println("Student Programme: " + Studentdetails.getProgramme());
		System.out.println("Number of courses taken: " + Studentdetails.getNumber_of_courses());
		for(int i = 0; i < Studentdetails.getNumber_of_courses(); i++)
		{
			System.out.println("Course: \n");
			System.out.println(getCourseAt(i).getCourse_code());
			System.out.println(getCourseAt(i).getCourse_title());
			System.out.println(getCourseAt(i).getCourse_credit());
			System.out.println(getCourseAt(i).getMark());
		}
    }
}