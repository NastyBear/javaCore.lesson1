package lesson9;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    public enum Course{
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN;
    }

    private String name;
    private List<Course> courses;

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student " +
                "name='" + name + '\'' +
                ", courses= " + courses + '\n'
                ;
    }

    public Student(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }


    public static void main(String[] args) {
        List<Student>students=new ArrayList<>();
        List<Course>courses1=new ArrayList<>(Arrays.asList(Course.FIVE, Course.FOUR));
        List<Course>courses2=new ArrayList<>(Arrays.asList(Course.FIVE, Course.FOUR,Course.SIX));
        List<Course>courses3=new ArrayList<>(Arrays.asList(Course.ONE, Course.TWO,Course.THREE));
        List<Course>courses4=new ArrayList<>(Arrays.asList(Course.SEVEN, Course.THREE));
        List<Course>courses5=new ArrayList<>(Arrays.asList(Course.TWO, Course.THREE,Course.SIX,Course.ONE));
        Student student1 = new Student("1",courses1);
        Student student2=new Student("2",courses2);
        Student student3=new Student("3",courses3);
        Student student4=new Student("4",courses4);
        Student student5=new Student("5",courses5);
        Student student6=new Student("6",courses2);
      students.add(student1);
      students.add(student2);
      students.add(student3);
      students.add(student4);
      students.add(student5);
      students.add(student6);


       students.stream().flatMap(str->str.getCourses().stream()).distinct().forEach(System.out::println);
        students.stream().reduce((students1,students2)->students1.getCourses().size()>students2.getCourses().size()?students1:students2)
                .ifPresent(System.out::println);
       students.stream().sorted((students1,students2)->students1.getCourses().size()-students2.getCourses().size())
                .limit(3).forEach(System.out::println);
        students.stream().filter(student->student.getCourses().contains(Course.ONE)).forEach(System.out::println);

    }
}
