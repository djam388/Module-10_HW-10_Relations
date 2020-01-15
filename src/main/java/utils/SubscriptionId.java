package utils;

import model.Course;
import model.Student;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SubscriptionId implements Serializable {
    //private static final long serialVersionUID = 1L;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="student_id", referencedColumnName = "id")
    private Student student;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="course_id", referencedColumnName = "id")
    private Course course;
//    private int student_id;
//    private int course_id;

    public SubscriptionId()
    {

    }

    public SubscriptionId(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubscriptionId that = (SubscriptionId) o;
        return Objects.equals(student, that.student) &&
                Objects.equals(course, that.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, course);
    }
    //    public SubscriptionId(int student_id, int course_id) {
//        this.student_id = student_id;
//        this.course_id = course_id;
//    }
//
//    public int getStudent_id() {
//        return student_id;
//    }
//
//    public void setStudent_id(int student_id) {
//        this.student_id = student_id;
//    }
//
//    public int getCourse_id() {
//        return course_id;
//    }
//
//    public void setCourse_id(int course_id) {
//        this.course_id = course_id;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        SubscriptionId that = (SubscriptionId) o;
//        return student_id == that.student_id &&
//                course_id == that.course_id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(student_id, course_id);
//    }
}
