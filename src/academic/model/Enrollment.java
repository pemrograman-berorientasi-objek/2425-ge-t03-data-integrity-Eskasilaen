package academic.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Enrollment {

    private String courseId;
    private String studentId;
    private String academicYear;
    private String semester;

    public Enrollment(String courseId, String studentId, String academicYear, String semester) {
        this.courseId = courseId;
        this.studentId = studentId;
        this.academicYear = academicYear;
        this.semester = semester;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public String getSemester() {
        return semester;
    }

    public void displayEnrollment() {
        System.out.println(courseId + "|" + studentId + "|" + academicYear + "|" + semester + "|None");
    }

}