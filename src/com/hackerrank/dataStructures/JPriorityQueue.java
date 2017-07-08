package com.hackerrank.dataStructures;

import java.util.*;

class StudentOrdering2 implements Comparator<Student2> {
public int compare(Student2 o1, Student2 o2) {
   double gpaDiff = o2.getCgpa() - o1.getCgpa();
   int compareCGPA;
   if(gpaDiff > 0 )
      compareCGPA = 1;
   else if (gpaDiff < 0)
      compareCGPA = -1;
   else
      compareCGPA = 0;

   int compareName = o1.getFname().compareTo(o2.getFname());
   int compareID = o2.getToken() - o1.getToken();

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

class Student2 implements Comparable<Student2>{
private int token;
private String fname;
private double cgpa;
public Student2(int id, String fname, double cgpa) {
   super();
   this.token = id;
   this.fname = fname;
   this.cgpa = cgpa;
}
public int getToken() {
   return token;
}
public String getFname() {
   return fname;
}
public double getCgpa() {
   return cgpa;
}
@Override
public int hashCode(){
   Double d = new Double(this.cgpa);

   return (int) (d.hashCode() + token + cgpa);
}
@Override
public int compareTo(Student2 other) {
   double cGPA_diff = other.cgpa - this.cgpa;
   int cmpGPA;

   if(cGPA_diff > 0)       cmpGPA = 1;
   else if(cGPA_diff < 0)  cmpGPA = -1;
   else                    cmpGPA = 0;

   int cmpName = this.fname.compareTo(other.fname);
   int cmpToken = other.token - this.token;

   if(cGPA_diff != 0)
      return cmpGPA;
   else if (cmpName != 0)
      return cmpName;
   else
      return cmpToken;

}

@Override
public boolean equals(Object obj) {
   if (obj==null)
      return false;

   Student2 other = (Student2) obj;
   if (this.fname.equals(other.fname) &&
         this.cgpa == other.cgpa &&
         this.token == other.token)
      return true;
   
   return false; // default
}

} // class

public class JPriorityQueue {

public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int totalEvents = Integer.parseInt(in.nextLine());

   StudentOrdering2 myOrder = new StudentOrdering2();
   PriorityQueue<Student2> stuQueue = new PriorityQueue<>(myOrder);

   while(totalEvents>0){
      String event = in.next();

      if(event.equals("ENTER"))  {
         // read the data
         String name = in.next();
         double cGPA = in.nextDouble();
         int stuID = in.nextInt();

         // create a student object    a
         Student2 crStudent = new Student2(stuID, name, cGPA);
         // add the object ot the priority queue
         stuQueue.add(crStudent);

      } else if (!stuQueue.isEmpty()) {
         Student2 serveStudent = stuQueue.peek();
         stuQueue.remove(serveStudent);
         //System.err.println("remove " + serveStudent.getFname());
      }
      totalEvents--;
   }
   // print the final queue
   if(stuQueue.isEmpty())
      System.out.println("EMPTY");
   else
      while(!stuQueue.isEmpty()) {
      Student2 crStu = stuQueue.peek();
      stuQueue.remove(crStu);
      System.out.println(crStu.getFname());
   }
}
}
