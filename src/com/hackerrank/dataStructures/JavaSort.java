package com.hackerrank.dataStructures;
import java.util.*;

class Student{
private int id;
private String fname;
private double cgpa;
public Student(int id, String fname, double cgpa) {
   super();
   this.id = id;
   this.fname = fname;
   this.cgpa = cgpa;
}
public int getId() {
   return id;
}
public String getFname() {
   return fname;
}
public double getCgpa() {
   return cgpa;
}
}

class StudentOrdering implements Comparator<Student> {
public int compare(Student o1, Student o2) {
   double gpaDiff = o2.getCgpa() - o1.getCgpa();
   int compareCGPA;
   if(gpaDiff > 0 )
      compareCGPA = 1;
   else if (gpaDiff < 0)
      compareCGPA = -1;
   else
      compareCGPA = 0;

   int compareName = o1.getFname().compareTo(o2.getFname());
   int compareID = o2.getId() - o1.getId();

   // first compare the CPGA
   if(compareCGPA !=0)
      return compareCGPA;
   // else compare the first names
   else if (compareName != 0)
      return compareName;
   // else compare the student numbers
   else
      return compareID;
}
}

//Complete the code
public class JavaSort
{
public static void main(String[] args){
   Scanner in = new Scanner(System.in);
   int testCases = Integer.parseInt(in.nextLine());

   ArrayList<Student> studentList = new ArrayList<Student>();
   while(testCases>0){
      int id = in.nextInt();
      String fname = in.next();
      double cgpa = in.nextDouble();

      Student st = new Student(id, fname, cgpa);
      studentList.add(st);

      testCases--;
   }

   StudentOrdering myOrder = new StudentOrdering();

   // sort the students here
   studentList.sort(myOrder );

   for(Student st: studentList){
      System.out.println(st.getFname());
   }
}
}
