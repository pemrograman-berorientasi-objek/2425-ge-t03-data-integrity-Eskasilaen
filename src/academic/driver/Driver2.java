package academic.driver;

import java.util.ArrayList;
import java.util.Scanner;
import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;

/**
 * @author NIM Nama
 * @author NIM Nama
 */

public class Driver2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        ArrayList<Course> courseList = new ArrayList<>();
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Enrollment> enrollmentList = new ArrayList<>();

        while (true) {
            String command = scn.nextLine();

            if (command.equalsIgnoreCase("---")) {
                break;
            }

            String[] splitCommand = command.split("#");
            String action = splitCommand[0];

            if (action.equals("course-add")) {
                Course course = new Course(splitCommand[1], splitCommand[2], Integer.parseInt(splitCommand[3]), splitCommand[4]);
                if (!courseExists(courseList, course.getCourseId())) {
                    courseList.add(course);
                }
            } else if (action.equals("student-add")) {
                Student student = new Student(splitCommand[1], splitCommand[2], Integer.parseInt(splitCommand[3]), splitCommand[4]);
                if (!studentExists(studentList, student.getStudentId())) {
                    studentList.add(student);
                }
            } else if (action.equals("enrollment-add")) {
                String courseId = splitCommand[1];
                String studentId = splitCommand[2];
                if (courseExists(courseList, courseId) && studentExists(studentList, studentId)) {
                    Enrollment enrollment = new Enrollment(courseId, studentId, splitCommand[3], splitCommand[4]);
                    enrollmentList.add(enrollment);
                } else {
                    if (!courseExists(courseList, courseId)) {
                        System.out.println("invalid course|" + courseId);
                    }
                    if (!studentExists(studentList, studentId)) {
                        System.out.println("invalid student|" + studentId);
                    }
                }
            }
        }

        for (Course course : courseList) {
            course.displayCourse();
        }

        for (Student student : studentList) {
            student.displayStudent();
        }

        for (Enrollment enrollment : enrollmentList) {
            enrollment.displayEnrollment();
        }
    }

    private static boolean courseExists(ArrayList<Course> courses, String courseId) {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                return true;
            }
        }
        return false;
    }

    private static boolean studentExists(ArrayList<Student> students, String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return true;
            }
        }
        return false;
    }
}