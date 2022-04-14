package lab2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<CourseLike> courses = new ArrayList<>();
        courses.add(new AdvancedJavaCourse("Adv Java", "J123"));
        courses.add(new IntroJavaCourse("A Java Course", "J567"));
        courses.add(new IntroToProgrammingCourse("New to YOU Programming", "P123"));

        for (CourseLike c : courses) {
            System.out.println(c);
        }
    }
}