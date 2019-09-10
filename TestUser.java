package com.xdclass.com.xdclass.test;

public class TestUser {

    public static void main(String[] args) {
        System.out.println("hello world");

    }

    public static Student covert(User user){
        Student student = new Student();
        student.setName(user.getName());
        student.setAge(user.getAge());
        student.setAddress(user.getAddress());
        student.setPhone(user.getPhone());
        student.setEmail(user.getEmail());
        return student;



    }

}
