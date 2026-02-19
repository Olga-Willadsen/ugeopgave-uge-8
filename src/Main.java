import java.util.ArrayList;

public class Main {

    ArrayList<Student>allStudents = new ArrayList<>();

    void main (){
    Student student1=new Student ("Vester", 1);
    Student student2=new Student ("Iben", 3);
    Student student3=new Student("Hans", 2);
    Student student4=new Student("Ebba", 4);

//student1.printInfo(student1);

        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
        allStudents.add(student4);

     Student oldStudent=oldestStudent(allStudents);

        System.out.println(oldStudent);

    }

    public static Student oldestStudent (ArrayList<Student> allStudents){
        Student maxAge = allStudents[0];
        for (Student s:allStudents) {
        if (s.studentAge > maxAge.studentAge){
            s=maxAge;
            }
            }
        return maxAge;
        }

    }


