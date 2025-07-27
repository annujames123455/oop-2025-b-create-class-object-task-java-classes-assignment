// TODO: Create a class called Student with name, rollNumber, and grade // TODO: Create a method to display student details 
class Student{ String name; int rollNumber; String grade; 
     public Student(String name, int rollNumber, String grade){
     this.name=name; 
     this.rollNumber=rollNumber; 
     this.grade=grade;
     } public void displayDetails(){
     System.out.println("Name : " +name); 
     System.out.println("Roll No: " +rollNumber); 
     System.out.println("Grade: " +grade);
     }
} public class Main{
public static void main(String[] args){ 
     Student student1 = new Student("Annu James", 25
, "A+"); student1.displayDetails();
 } }
