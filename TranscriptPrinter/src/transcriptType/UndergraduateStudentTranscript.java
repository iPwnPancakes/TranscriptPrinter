package transcriptPrinter;

public class UndergraduateStudentTranscript extends StudentTranscript
{
    private double total_num_of_creditsearned;
    private double quality_points, mark;
    protected String grade;
    protected int courseArraySize;
    
    public UndergraduateStudentTranscript()
    {
        
    }
    //TODO FIX CalGrade()
    public static void setGrade(mark)
    {
       double  gradeValue = 0;
       double qp = gradeValue * getCourse_credit();

       if( mark >= 90 && mark <= 100)
       {
           gradeValue = 4;
           grade = "A";
       }
       else if ( mark >= 85 && mark <= 89.9)
       {
           gradeValue = 3.5;
           grade = "B+";
       }
       else if ( mark >= 80 && mark <= 84.9)
       {
           gradeValue = 3;
           grade = "B";
       }
       else if ( mark >= 75 && mark <= 79.9)
       {
           gradeValue = 2.5;
           grade="C+";
       }
       else if ( mark >= 70 && mark <= 74.9)
       {
           gradeValue = 2;
           grade="C";
       }
       else if ( mark >= 65 && mark <= 69.9)
       {
           gradeValue = 1.5;
           grade="D+";
       }
       else if ( mark >= 60 && mark <= 64.9)
       {
           gradeValue = 1;
           grade = "D";
       }
       else if ( mark >= 0.0 && mark <= 59.9)
       {
           gradeValue = 0;
           grade = "F";
       }
    }
    public static void getGrade(){
        return grade;
    } 
    
    public double calcGPA()
    {
        double GPA=0;
        GPA = this.quality_points / this.total_num_of_creditsearned;
        return GPA;
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
		//TODO get all of the information
		System.out.println("Student ID: " + Studentdetails.getStudent_ID());
		System.out.println("Student Name: " + Studentdetails.getStudent_fname() + " " + Studentdetails.getStudent_lname());
		System.out.println("Student Programme: " + Studentdetails.getProgramme());
		System.out.println("Number of courses taken: " + Studentdetails.getNumber_of_courses());
		for(int i = 0; i < Studentdetails.getNumber_of_courses(); i++)
		{
			System.out.println("Courses: \n");
			System.out.println(getCourseAt(i).getCourse_code());
			System.out.println(getCourseAt(i).getCourse_title());
			System.out.println(getCourseAt(i).getCourse_credit());
			System.out.println(getCourseAt(i).getMark());
			System.out.println(CalGrade());
			System.out.println(calcGPA());
    	}
    }
  
}
