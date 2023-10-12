import java.util.ArrayList;

public class Student extends Person {

    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses = new ArrayList<>();

    Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
    }

    @Override
    public boolean addCourse(String course) {

        if (this.passedCourses.contains(course)) {
            return false;
        }
        else {
            currentCourses.add(course);
            return true;
        }
    }
}
