package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();

        System.out.println();
        System.out.print("Note One: ");
        student.noteOne = sc.nextDouble();
        System.out.print("Note Two: ");
        student.noteTwo = sc.nextDouble();
        System.out.print("Note Three: ");
        student.noteThree = sc.nextDouble();

        System.out.println();
        System.out.println(student);

        if (student.finalGrade() > 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS %n", student.pointMissing());
        }

        sc.close();
    }
}
