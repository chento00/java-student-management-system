package model;

import helper.ValidateUserInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String classroom;
    private float score;

    public void inputStudent(Scanner scanner){
        id= ValidateUserInput.valueInputInteger(scanner,"Student's ID");
        scanner.nextLine();
        name=ValidateUserInput.valueInputString(scanner," Student's Name ");
        gender=ValidateUserInput.valueInputString(scanner," Student's Gender ");
        age=ValidateUserInput.valueInputInteger(scanner,"Student's Age");
        scanner.nextLine();
        classroom=ValidateUserInput.valueInputString(scanner," Student's Classroom ");
        score=ValidateUserInput.valueInputFloat(scanner,"Student's Score");
        System.out.println("SUCCESSFULLY ADDED STUDENT TO THE SYSTEM");
        System.out.println("Press ENTER To Continue");
        scanner.nextLine();
        scanner.nextLine();
    }
    public void inputUpdateStudent(Scanner scanner,Integer id){
        this.id=id;
        scanner.nextLine();
        name=ValidateUserInput.valueInputString(scanner," Student's Name To Update");
        gender=ValidateUserInput.valueInputString(scanner," Student's Gender To Update");
        age=ValidateUserInput.valueInputInteger(scanner," Student's Age To Update");
        scanner.nextLine();
        classroom=ValidateUserInput.valueInputString(scanner," Student's Classroom To Update");
        score=ValidateUserInput.valueInputFloat(scanner," Student's Score To Update");
        System.out.println("SUCCESSFULLY UPDATE STUDENT TO THE SYSTEM");
        System.out.println("Press ENTER To Continue");
        scanner.nextLine();
        scanner.nextLine();
    }
    public Student() {
    }

    public Student(Integer id, String name, String gender, Integer age, String classroom, float score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.classroom = classroom;
        this.score = score;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", classroom='" + classroom + '\'' +
                " score=" + score ;
    }
}
