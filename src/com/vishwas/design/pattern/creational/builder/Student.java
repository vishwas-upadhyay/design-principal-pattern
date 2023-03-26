package com.vishwas.design.pattern.creational.builder;

public class Student {
    // We want to make Student objects as Immutable Object hence members are final
    private final String name;
    private final String university;
    private final int age;

    public Student(Builder builder) {
        this.name = builder.name;
        this.university = builder.university;
        this.age = builder.age;

    }

    public static class Builder {
        //Mandatory fields are final and optional fields are non-final
        private final String name;
        private final String university;
        private int age;

        public Builder(String name, String university) {
            this.name = name;
            this.university = university;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", age=" + age +
                '}';
    }
}
