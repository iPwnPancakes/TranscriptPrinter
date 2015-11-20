package yooooo;

public class CertificateStudentTranscript extends StudentTranscript
{
    private double mark;
    private String grade;
    protected int courseArraySize;
    private Course[] tempCourseArray = new Course[courseArraySize];
    
    public CertificateStudentTranscript()
    {
        
    }
    
    public double CalGrade()
    {
       double Mark=0;
       
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
    
    public Course[] getCourse_arraySuper() {
        return super.getCourse_array();
    }
    
    public void setCourse_arrayWhole (int size){
    	this.courseArraySize = size;
    }

    
    public void setCourse_arrayAt(Course course_array, int i) {
        this.tempCourseArray[i] = course_array;
    } 
    
    //No reason for a method that gets the Course in the array at i
    
    @Override
    public void printTranscriptInfo()
    {
        
    }
    
}