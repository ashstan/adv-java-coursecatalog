package lab1;

/**
 * Describe responsibilities here.
 *
 *
 * added
 *
 *
 * @author your name goes here
 * @version 1.00
 */

//test
public class IntroJavaCourse extends CourseAbstract{

    String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super.setCourseName(courseName);
        super.setCourseNumber(courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return super.toString() +
                "IntroJavaCourse{" +
                "prerequisites='" + prerequisites + '\'' +
                '}';
    }

}
