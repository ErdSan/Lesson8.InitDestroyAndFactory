package ru.erdyneev.springcourse;

public class ClassicalMusic implements Music {

    public void doMyInit() {
        System.out.println("doing my init");
    }

    public void doMyDestroy() {
        System.out.println("doing my destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
