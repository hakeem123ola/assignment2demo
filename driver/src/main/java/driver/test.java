package driver;

import studentreg.Course;
import studentreg.module;
import studentreg.Student;
import java.util.ArrayList;
import org.joda.time.LocalDate;

public class test {
    
    public static void main(String args[]){
       
        Student stu = new Student("john cena",21,"11/10/1988","CSIT");
        Student stu1 = new Student("lebron james",18,"11/05/1978","CSIT");
        Student stu2 = new Student("Jack wilshere",53,"24/05/1953","BP");
        Student stu3 = new Student("james harden",34,"22/03/1982","BP");
        Student stu4 = new Student("james jones",49,"10/07/1967","EE");
        Student stu5 = new Student("Tim Fosu-Mensah",20,"06/10/2004","EE");
        
        
        ArrayList<Student> group1 = new ArrayList<Student>();
        group1.add(stu);
        group1.add(stu1);
        group1.add(stu2);
        group1.add(stu3);
        group1.add(stu4);
        group1.add(stu5);
        
       
        ArrayList<Student> group2 = new ArrayList<Student>();
        group2.add(stu1);
        group2.add(stu2);
        group2.add(stu3);
        group2.add(stu4);
        
        
        ArrayList<Student> group3 = new ArrayList<Student>();
        group3.add(stu3);
        group3.add(stu4);
        group3.add(stu5);
        group3.add(stu1);
        
        
        module CT417 = new module("Software Eng. 3","CT417",group1);
        module CT401 = new module("Machine Learning","CT401",group2);
        module EE445 = new module("DSP","EE445",group3);
        module EE451 = new module("System on Chip 1","EE451",group3);
        
        
        ArrayList<module> CSmodules = new ArrayList<module>();
        CSmodules.add(CT417);
        CSmodules.add(CT401);
        LocalDate start = new LocalDate(2016,9,5);
        LocalDate end = new LocalDate(2017,5,31);
        Course CSIT = new Course("CSIT",CSmodules,start,end);
        
       
        ArrayList<module> BPmodules = new ArrayList<module>();
        BPmodules.add(EE445);
        BPmodules.add(CT417);
        BPmodules.add(CT401);
        BPmodules.add(EE451);
        Course BP = new Course("BP",BPmodules,start,end);
        
       
        ArrayList<module> EEmodules = new ArrayList<module>();
        EEmodules.add(EE451);
        EEmodules.add(EE445);
        EEmodules.add(CT401);
        Course EE = new Course("EE",EEmodules,start,end);
        
        
        CSIT.printStudents();
        BP.printStudents();
        EE.printStudents();
    
       
        
    }
    
}