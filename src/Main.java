import java.util.ArrayList;

public class Main {

    //ArrayList<Student>allStudents = new ArrayList<>();



    void main (){
    Student student1=new Student ("Vester", 1);
    Student student2=new Student ("Iben", 3);
    Student student3=new Student("Hans", 2);
    Student student4=new Student("Ebba", 4);

    Student [] allStudents = {student1, student2 ,student3 ,student4};

//student1.printInfo(student1);

//        allStudents.add(student1);
//        allStudents.add(student2);
//        allStudents.add(student3);
//        allStudents.add(student4);

//        printInfo(student1);
//        printInfo(student2);
//        printInfo(student3);
//        printInfo(student4);

        printInfo(allStudents);

     Student oldStudent=oldestStudent(allStudents);

        System.out.println(oldStudent.studentName+" is the oldest");

    }

    Student oldestStudent (Student[] allStudents){
        Student maxAge = allStudents[0];
        for (Student s:allStudents) {
        if (s.studentAge > maxAge.studentAge){
            maxAge=s;
            }
        }
        return maxAge;
        }

    void printInfo (Student[] allStudents){
//        System.out.println("Student name: "+student.studentName);
//        System.out.println("Student age: "+student.studentAge);

        for (Student s:allStudents) {
            System.out.println(s.studentName);
            System.out.println(s.studentAge);

        }


    }

    }


