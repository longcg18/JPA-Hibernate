package org.longcg.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "STUD")
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    private LocalDate birthDateByLocalDate;

    @Column(name = "BIRTHDATE")
    private Date birthDateByDate;

    private Address address;

    @Column(name = "GENDER")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    public Long getId() {
        return id;
    }

    @Column(name = "WANTSNEWLETTER")
    private Boolean wantsNewLetter;

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getWantsNewLetter() {
        return wantsNewLetter;
    }

    public Gender getGender() {
        return gender;
    }

    public Date getBirthDateByDate() {
        return birthDateByDate;
    }

    public LocalDate getBirthDateByLocalDate() {
        return birthDateByLocalDate;
    }

    public Address getAddress() {
        return address;
    }

}
