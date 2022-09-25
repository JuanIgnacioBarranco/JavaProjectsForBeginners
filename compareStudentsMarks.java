
import java.util.ArrayList;

public class compareStudentsMarks implements Comparable<compareStudentsMarks>{

    private int totalMark;
    private String name;
    private ArrayList<String> subjects;
    private ArrayList<Integer> marks;
    public String getName(){
        return name;
    }
    public compareStudentsMarks(String name){
        this.name= name;
        subjects= new ArrayList<String>();
        marks = new ArrayList<Integer>();

    }
    public void addMarks(String subject, int mark){
        subjects.add(subject);
        marks.add(mark); //autoboxing done for us 
        totalMark += mark;
    }
    public int compareTo(compareStudentsMarks other){
        if (this.totalMark > other.totalMark) return 1;
        else if (this.totalMark == other.totalMark) return 0;
        else return -1;
    }
    
}
