package com.demo;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Student implements java.io.Serializable{
    int id;
    String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class SerializationDemo {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(211, "kavi");
            FileOutputStream fout = new FileOutputStream("C:\\Java prgms\\CaseStudy\\f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("success");
        }catch(java.lang.Exception e){System.out.println();

        }
    }
}
