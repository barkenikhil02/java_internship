package com.techlab.student.comparator;

public class Student implements
Comparable<Student>{
private int rollNo;
private String fName,lName;
public Student(int rollNo, 
String fName, String lName) {
super();
this.rollNo = rollNo;
this.fName = fName;
this.lName = lName;
}
@Override
public String toString() {
return "Student [rollNo=" + rollNo + ","
+ " fName=" + fName + ", lName=" + lName + "]";
}
public int getRollNo() {
return rollNo;
}
public String getfName() {
return fName;
}
public String getlName() {
return lName;
}
@Override
public int compareTo(Student arg0) {
return rollNo-arg0.rollNo;
}
}
