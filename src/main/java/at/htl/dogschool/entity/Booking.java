package at.htl.dogschool.entity;

import javax.persistence.*;
import java.time.LocalDate;

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Course course;
    private Dog dog;



    private LocalDate bookingDate;
    private double price;

    //region Constructor
    public Booking() {
    }

    public Booking(Course course, Dog dog, LocalDate bookingDate, double price) {
        this.course = course;
        this.dog = dog;
        this.bookingDate = bookingDate;
        this.price = price;
    }


    //endregion


    //region Getter and Setter
    public Long getId() {
        return id;
    }


    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //endregion


//    @Override
//    public String toString() {
//        return String.format("Buchung: %s mit %s (%s %s)",
//                course.getName(),
//                dog.getName(),
//                dog.getOwner().getFirstName(),
//                dog.getOwner().getLastName());
//    }
}
