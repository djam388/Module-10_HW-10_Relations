package model;

import utils.PurchaseListId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "purchaselist")
public class PurchaseList
{

    @EmbeddedId
    private PurchaseListId id;
    @Column(name = "student_name", insertable=false, updatable=false)
    private String studentName;
    @Column(name = "course_name", insertable=false, updatable=false)
    private String courseName;
    private int price;
    private Date subscription_date;

    public PurchaseListId getId() {
        return id;
    }

    public void setId(PurchaseListId id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getSubscription_date() {
        return subscription_date;
    }

    public void setSubscription_date(Date subscription_date) {
        this.subscription_date = subscription_date;
    }
}
