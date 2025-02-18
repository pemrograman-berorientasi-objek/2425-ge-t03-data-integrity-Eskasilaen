package academic.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Course {

    private String courseId;
    private String courseName;
    private int credits;
    private String grade;

    public Course(String courseId, String courseName, int credits, String grade) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.grade = grade;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public String getGrade() {
        return grade;
    }

    public void displayCourse() {
        System.out.println(courseId + "|" + courseName + "|" + credits + "|" + grade);
    }

}