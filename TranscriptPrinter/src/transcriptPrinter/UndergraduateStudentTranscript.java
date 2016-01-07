package transcriptPrinter;

public class UndergraduateStudentTranscript extends StudentTranscript
{
    private double GPA;
    
    public UndergraduateStudentTranscript(int i)
    {
        super.initializeArray(i);
    }
    
    public void setGPA(Course course, int totalCredit)
    {
    	double n = course.getQualityPoints();
        GPA = n / totalCredit;
    }
    public double getGPA(){
    	return GPA;
    }
    
    public void setCourseAt(int i, Course coursedetails){
    	super.setCourseArrayAt(i, coursedetails);
    }
    
    public Course getCourseAt(int i){
    	return super.getCourseAt(i);
    }
    
    @Override
    public void printTranscriptInfo(Student Student, Course Course)
    {
    	int sum = 0;
		System.out.println("Student ID: " + Student.getStudent_ID());
		System.out.println("Student Name: " + Student.getStudent_fname() + " " + Student.getStudent_lname());
		System.out.println("Student Programme: " + Student.getProgramme());
		System.out.println("Number of courses taken: " + Student.getNumber_of_courses());
		for(int i = 0; i < Student.getNumber_of_courses(); i++)
		{
			System.out.println("Course: " + i + "\n");
			System.out.println("Course Code: " + getCourseAt(i).getCourse_code());//Prints out course code
			System.out.println("Course Title: " +getCourseAt(i).getCourse_title());//Prints out course title
			System.out.println("Course Credit: " + getCourseAt(i).getCourse_credit());//Prints out course credit
			System.out.println("Course Mark: " + getCourseAt(i).getMark());//Prints out the mark of course
			System.out.println("Course Grade: " + getCourseAt(i).getGrade());//Prints out the letter grade of course
			sum += getCourseAt(i).getCourse_credit();
    	}
		setGPA(Course, sum);
		System.out.println("GPA: " + getGPA());
    }
  
}
