package org.example;
import org.example.MyHashTable;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();
        Random rand = new Random();

        // create students
        Student student1 = new Student("Chandler", 20);
        Student student2 = new Student("Monica", 18);
        Student student2 = new Student("Ross", 22);

        // put them into the table
        table.put(new MyTestingClass(1, "subject1"), student1);
        table.put(new MyTestingClass(2, "subject2"), student2);
        table.put(new MyTestingClass(3, "subject3"), student3);

        // take a student by using key
        Student student = table.get(new MyTestingClass(2, "subject2"));
        System.out.println("Student with second key: " + student.getName() + " " + student.getAge());

        // remove a student
        Student removedStudent = table.remove(new MyTestingClass(1, "subject1"));
        System.out.println("Removed one: " + removedStudent.getName() + " " + removedStudent.getAge());

        // check is a student in the table?
        boolean containsStudent = table.contains(student3);
        System.out.println("Contains student number 3: " + containsStudent);

        // put a new student with the same key by updating the previous value
        Student newStudent = new Student("Joe", 20);
        table.put(new MyTestingClass(2, "subject2"), newStudent);

        // update student by key
        Student updatedStudent = table.get(new MyTestingClass(2, "subject2"));
        System.out.println("Updated student with key 2: " + updatedStudent.getName() + " " + updatedStudent.getAge());

        // check is the removed student still in the table?
        containsStudent = table.contains(removedStudent);
        System.out.println("Contains removed student: " + containsStudent);

        for (int i = 0; i < 10000; i++) {
            MyTestingClass key2 = new MyTestingClass(rand.nextInt(1000), "Name" + i);
            Student value = new Student("Student" + i, rand.nextInt(20) + 18);
            table.put(key2, value);
        }
        table.printBucketSizes();
    }

}
