public class Student {

    String studentName;
    int studentAge;

Student (String studentName, int studentAge){
    this.studentName=studentName;
    this.studentAge=studentAge;
}

void printInfo (Student student){
    System.out.println("Student name: "+student.studentName);
    System.out.println("Student age: "+student.studentAge);

}


}
