package yooooo;

public class Course 
{
    private String course_code;
    private String course_title;
    private int course_credit;
    private double mark;
    private String grade;
    
    public Course()
    {
        
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getCourse_title() {
        return course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }

    public int getCourse_credit() {
        return course_credit;
    }

    public void setCourse_credit(int course_credit) {
        this.course_credit = course_credit;
    }
    
    public double CalGrade()
    {
       double  gradeValue= 0;
       double qp = gradeValue * this.getCourse_credit();

       if( mark >= 90 && mark <= 100)
       {
           gradeValue = 4;
           this.grade = "A";
       }
       else if ( mark >= 85 && mark <= 89.9)
       {
           gradeValue = 3.5;
           this.grade = "B+";
       }
       else if ( mark >= 80 && mark <= 84.9)
       {
           gradeValue = 3;
           this.grade = "B";
       }
       else if ( mark >= 75 && mark <= 79.9)
       {
           gradeValue = 2.5;
           this.grade="C+";
       }
       else if ( mark >= 70 && mark <= 74.9)
       {
           gradeValue = 2;
           this.grade="C";
       }
       else if ( mark >= 65 && mark <= 69.9)
       {
           gradeValue = 1.5;
           this.grade="D+";
       }
       else if ( mark >= 60 && mark <= 64.9)
       {
           gradeValue = 1;
           this.grade = "D";
       }
       else if ( mark >= 0.0 && mark <= 59.9)
       {
           gradeValue = 0;
           this.grade = "F";
       }
        return mark;
    }  
}