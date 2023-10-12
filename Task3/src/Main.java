import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        ArrayList<String> passedCoursesST1 = new ArrayList<>();
        passedCoursesST1.add("Math");
        passedCoursesST1.add("Computer Science");
        Student st1 = new Student("Claus (1)",passedCoursesST1);

        ArrayList<String> passedCoursesST2 = new ArrayList<>();
        passedCoursesST2.add("Java 1.0");
        passedCoursesST2.add("Computer Science");
        Student st2 = new Student("Joe (2)",passedCoursesST2);

        ArrayList<String> canTeachT1 = new ArrayList<>();
        canTeachT1.add("Math");
        canTeachT1.add("Computer Science");
        Teacher t1 = new Teacher("John (3)",canTeachT1);

        ArrayList<String> canTeachT2 = new ArrayList<>();
        canTeachT2.add("Java 1.0");
        canTeachT2.add("Computer Science");
        Teacher t2 = new Teacher("Johnny (4)",canTeachT2);



        people.add(st1);
        people.add(st2);
        people.add(t1);
        people.add(t2);

        for(Person person : people) {
            if(person instanceof Student) {
                if(!person.addCourse("Java 1.0")) {
                    System.out.println(person.getName() + " has already passed this course");
                }
                else {
                    System.out.println(person.getName() + " has not passed this course");
                }
                System.out.println(person.getName() + " has currently has these course: " + ((Student) person).currentCourses);
            }
            if(person instanceof Teacher) {
                if (!person.addCourse("Java 1.0")) {
                    System.out.println(person.getName() + " can't teach this course");
                }
                else {
                    System.out.println(person.getName() + " can teach this course");
                }
                System.out.println(person.getName() + " currently has these courses: " + ((Teacher) person).currentCourses);
            }
        }

    }
}