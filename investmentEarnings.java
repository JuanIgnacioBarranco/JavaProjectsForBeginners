//it says java.text is never used but what about *1
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * investmentEarnings
 */
public class investmentEarnings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("enter your buying price per share : ");
        double buyingPrice = scan.nextDouble();
        int  day= 1;
        double closingPrice= 0.1; 
        DecimalFormat df = new DecimalFormat("0.00"); 


        while (true ){
            System.out.println("Enter the closing price for day : " + day+ "(any negative value to leave :)");
            closingPrice = scan.nextDouble();
            if (closingPrice < 0.0) break; //this is what it does make the code to leave...
            double earnings =closingPrice -buyingPrice; 
            if (earnings > 0.0){
                System.out.println("After day  "+ day + ", you earned " + df.format(earnings) + " per share."); // *1 
            }
            else if (earnings < 0 ){
                System.out.println("After day  "+ day + ", you lost " + df.format(-earnings) + " per share.");
            }
            else {
                System.out.println("After day " + day + ", you have " + "no earnings per share");
            }
            day += 1; 
        }
        scan.close();
    }
    
}