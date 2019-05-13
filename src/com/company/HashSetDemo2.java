package com.company;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetDemo2 {
    public static void main(String[] args) {

        Major economicsBS_1 = new Major("Economics", "Bachelor");
        Major economicsBS_2 = new Major("Economics", "Bachelor");

        Major economicsMS = new Major("Economics", "Master");

        Set<Student> students = new HashSet<>();
        students.add(new Student("David", 4.8, economicsBS_1));
        students.add(new Student("David", 4.8, economicsMS));

        System.out.println("Size: " + students.size());
        for (Student student : students) {
            System.out.println(student.toString());
        }

        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        System.out.println(c1.toString());
        System.out.println(Integer.toHexString(c1.hashCode()));
    }
}

//class Object {
//    Object() {
//        hash code creation
//    }
//}

class Car extends Object {
    public Car() {
        super();
    }
}

class Major {
    private String majorName;
    private String degree;

    public Major(String majorName, String degree) {
        this.majorName = majorName;
        this.degree = degree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Major major = (Major) o;
        return Objects.equals(majorName, major.majorName) &&
                Objects.equals(degree, major.degree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(majorName, degree);
    }

    @Override
    public String toString() {
        return String.format("Major: %s - Degree: %s",
                this.majorName,
                this.degree);
    }
}

class Student {
    private String name;
    private double averageScore;
    private Major major;

    public Student(String name, double averageScore, Major major) {
        this.name = name;
        this.averageScore = averageScore;
        this.major = major;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.averageScore, averageScore) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(major, student.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, averageScore, major);
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Score: %s | %s",
                this.name,
                this.averageScore,
                this.major.toString());
    }
}