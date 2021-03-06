package transcriptPrinter;

public class CertificateStudentTranscript extends StudentTranscript
{
    private String passOrFail;
    protected int courseArraySize;
    
    public CertificateStudentTranscript(int i)
    {
    	super.initializeArray(i);
    }
    
    public void setPassOrFail(Course course)
    {
       double mark = course.getMark();
       
       if( mark >= 50 && mark <= 100)
       {
           this.passOrFail = "Pass";
       }
       else if ( mark < 50)
       {
           this.passOrFail = "Fail";
       }
    }
    
    public String getPassOrFail(){
    	return passOrFail;
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
			System.out.println(getPassOrFail());
			
		}
    }
}