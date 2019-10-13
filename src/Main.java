import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{

public static void main(String args[]){
    
    Teacher stacy = new Teacher(1, "Stacy", 500);
    Teacher brad = new Teacher(2, "Brad", 700);
    Teacher steph = new Teacher(3, "Stephan", 800);

    List<Teacher> teachers= new ArrayList<>();
    teachers.add(stacy);
    teachers.add(brad);
    teachers.add(steph);

    Student laura = new Student(4, "Laura", 4);
    Student mike = new Student(5, "Mike", 6);

    List<Student> students= new ArrayList<>();
    students.add(laura);
    students.add(mike);

    School mySchool = new School(teachers, students);
    System.out.println("the school has earned " + mySchool.getTotalMoneyEarned() + " € "); 
    System.out.println("The list of students is:"+ students);
  
System.out.println("The list of teachers is:");
for(int i=0; i< teachers.size();i++){
        System.out.println(teachers.get(i).getName());
        
} 
System.out.println("The list of Students is:");
for ( Student e : students){
    System.out.println(e.getName());
}
}

}