package at.htl.dogschool.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Course {

    private Long id;

    private String name;
    private double price;
    private LocalDateTime startDatetime;
    private int noOfMeetings;
    private CourseType courseType;



    //region Constructors
    public Course() {
    }

    public Course(
            String name,
            double price,
            LocalDateTime startDatetime,
            int noOfMeetings,
            CourseType courseType) {

        this.courseType = courseType;
        this.name = name;
        this.price = price;
        this.startDatetime = startDatetime;
        this.noOfMeetings = noOfMeetings;
    }

    //endregion

    //region Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoOfMeetings() {
        return noOfMeetings;
    }

    public void setNoOfMeetings(int noOfMeetings) {
        this.noOfMeetings = noOfMeetings;
    }
    //endregion

    public boolean equals(Object obj){
        return false;
    }


    @Override
    public String toString() {
        return name;
    }


}
