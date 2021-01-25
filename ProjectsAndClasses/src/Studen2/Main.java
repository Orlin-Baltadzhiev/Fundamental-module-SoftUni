package Studen2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String input = scan.nextLine();

        while (!input.equals("end")) {
            String[] studentParts = input.split(" ");
            int age = Integer.parseInt(studentParts[2]);

            Student found=findByFirstNameAndLastName(studentList, studentParts[0],studentParts[1]);
            if (found !=null){
                studentList.remove(found);
            }
            Student student = new Student(studentParts[0], studentParts[1], age, studentParts[3]);

            studentList.add(student);
            input = scan.nextLine();
        }
        String city = scan.nextLine();
        for (int i = 0; i <studentList.size() ; i++) {
            Student current = studentList.get(i);

            if (current.getCity().equals(city)){
                printStudent(current);
            }
        }
    }

    private static Student findByFirstNameAndLastName(List<Student> studentList,
                                   String firstName, String lastName) {
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName)&&
            student.getLastName().equals(lastName)){
                return student;
            }
        }
        return null;
    }

    private static void printStudent(Student current) {
        System.out.printf("%s %s is %d years old%n",
                current.getFirstName(),
                current.getLastName(),
                current.getAge());
    }


}
