package com.techlab.student.comparator.test;

import java.util.ArrayList;
import java.util.Collections;

import com.techlab.student.comparator.Student;

public class StudentTest {

  public static void main(String[] args) {
    ArrayList<Student>a=new ArrayList<Student>();
    a.add(new Student(106,"firstname1","lastname1"));
    a.add(new Student(112,"firstname2","lastname2"));
    a.add(new Student(102,"firstname3","lastname2"));
    
    Collections.sort(a);
    
    for(Student st: a){  
      System.out.println(st.toString());  
      }
  }
}