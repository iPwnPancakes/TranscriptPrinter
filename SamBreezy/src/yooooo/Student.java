package yooooo;

public class Student 
{
    private String student_fname;
    private String student_lname;
    private String student_ID;
    private String programme;
    private int number_of_courses;
    
    public Student()
    {
        
    }

    public String getStudent_fname() {
        return student_fname;
    }

    public void setStudent_fname(String student_fname) {
        this.student_fname = student_fname;
    }

    public String getStudent_lname() {
        return student_lname;
    }

    public void setStudent_lname(String student_lname) {
        this.student_lname = student_lname;
    }

    public String getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(String student_ID) {
        this.student_ID = student_ID;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
    
    public void setNumber_of_courses(int number_of_courses) {
        this.number_of_courses = number_of_courses;
    }
    
    public int getNumber_of_courses() {
        return number_of_courses;
    }
}