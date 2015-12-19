package transcriptPrinter;

public abstract class StudentTranscript 
{
	protected String Student;
    protected Course[] finalCourse_array;
    
    public StudentTranscript()
    {
        
    }
    public String getStudent() {
        return Student;
    }
    public void setStudent(String Student) {
        this.Student = Student;
    }
    public Course getCourseAt(int i) {
        return finalCourse_array[i];
    }
    public void setCourseArrayAt(int i, Course coursedetails) {
        this.finalCourse_array[i] = coursedetails;
    }
    public abstract void printTranscriptInfo(Student student, Course course);
}