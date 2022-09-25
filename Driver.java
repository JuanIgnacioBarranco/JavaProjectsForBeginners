public class Driver {
    public static void main(String[] args) {
        compareStudentsMarks helen = new compareStudentsMarks("Helen");
        helen.addMarks("Math", 7);
        helen.addMarks("Coding", 6);
        helen.addMarks("History", 10);
        //------
        compareStudentsMarks leslie = new compareStudentsMarks("Leslie");
        leslie.addMarks("Math", 10);
        leslie.addMarks("History", 10);
        leslie.addMarks("Coding", 9);

        if (helen.compareTo(leslie)> 0){ //1
           System.out.println(helen.getName()+ 
           " gets a higher total mark"); 
        }
        else if (helen.compareTo(leslie) < 0){ //-1
            System.out.println(leslie.getName() + 
            " gets a higher total mark");
        }
        else { // cero
            System.out.println("Both students have the same mark");
        }
    }
}
