package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Table(name="MEMBER")
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date enrollmentDate;
    private String firstName;
    private String lastName;

    public Member(Date enrollmentDate, String firstName, String lastName) {
        this.enrollmentDate = enrollmentDate;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Member(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
