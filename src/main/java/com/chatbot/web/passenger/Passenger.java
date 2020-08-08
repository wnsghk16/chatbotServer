package com.chatbot.web.passenger;
/*
Variable Notes
* 0-PassengerId, 1-Survived,2-Pclass,3-Name,4-Gender,
* 5-Age,6-SibSp, 7-Parch, 8-Ticket, 9-Fare,
* 10-Cabin, 11-Embarked
1-PassengerId: Primary Key
2-pclass: Ticket class
A proxy for socio-economic status (SES)
1st = Upper
2nd = Middle
3rd = Lower
5-age: Age is fractional if less than 1. If the age is estimated, is it in the form of xx.5
6-sibsp: # of siblings / spouses aboard the Titanic
The dataset defines family relations in this way...
Sibling = brother, sister, stepbrother, stepsister
Spouse = husband, wife (mistresses and fiancés were ignored)
7-parch: # of parents / children aboard the Titanic
The dataset defines family relations in this way...
Parent = mother, father
Child = daughter, son, stepdaughter, stepson
Some children travelled only with a nanny, therefore parch=0 for them.
8-Ticket: Ticket number
9-Fare: Passenger fare
10-Cabin: Cabin number
11-Embarked: Port of Embarkation,  C = Cherbourg, Q = Queenstown, S = Southampton
* */

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "passenger")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passenger_id") private Long passengerId;
    @Column(name = "passenger_number", nullable = false) private String passengerNumber;
    @Column(name = "survived", nullable = false) private String survived;
    @Column(name = "pclass") private String pclass;
    @Column(name = "name") private String name;
    @Column(name = "sex") private String sex;
    @Column(name = "age") private String age;
    @Column(name = "sib_sp") private String sib_sp;
    @Column(name = "parch") private String parch;
    @Column(name = "ticket") private String ticket;
    @Column(name = "fare") private String fare;
    @Column(name = "cabin") private String cabin;
    @Column(name = "embarked") private String embarked;

    @Override
    public String toString() {
        return String.format("Passenger[passenger_id=%d, passenger_number='%d', name='%s']",
                passengerId, passengerNumber, name);
    }
    @Builder
    private Passenger(String passengerNumber,
                      String survived,
                      String pclass,
                      String name,
                      String sex,
                      String age,
                      String sib_sp,
                      String parch,
                      String ticket,
                      String fare,
                      String cabin,
                      String embarked) {
        this.passengerNumber = passengerNumber;
        this.survived = survived;
        this.pclass = pclass;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sib_sp = sib_sp;
        this.parch = parch;
        this.ticket = ticket;
        this.fare = fare;
        this.cabin = cabin;
        this.embarked = embarked;
    }
}
