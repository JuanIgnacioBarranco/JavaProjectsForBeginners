package gradePointAverageSystem;

public class gradePointAverage {
   public static void main(String[] args) {
    Student andy = new Student("Andy");
    andy.add("Math", 'C');
    andy.add("English", 'D');
    andy.add("Geography", 'D'); 
    System.out.println(andy.getName()+ 
        " has a GPA of " + andy.getGPA());
    System.out.println("It's obtained " + 
        " from these subjects : ");
    for (String str : andy.getSubjects()){
        System.out.println(str);
    }
   } 
}
