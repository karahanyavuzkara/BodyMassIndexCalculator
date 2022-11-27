package patika;
import java.util.Scanner;
public class BodyMassIndexCalculator {

public static void main(String[]args) {
	//mass
	System.out.print("Write your body mass : ");
	Scanner input = new Scanner(System.in);
	double mass;
	mass = input.nextDouble();
   
	//height
    System.out.print("Write your height in m : ");
    Scanner secondinput = new Scanner(System.in);
    double height;
    height = secondinput.nextDouble();
   
    //index
    double index;
    index = mass / (height * height);
    System.out.println("This is your body mass index = " + index );
    
     //decision
     if (index <= 20) {
     System.out.println("You are underweighted");
     }
     else if (index < 25) {
     System.out.println("You have normal weight");
     }
     else if (index < 30) {
    	 System.out.println("You are overweighted");
    	 
     }
     else if (index < 40) {
    	 System.out.println("You are obese");   
     }
     else if (index > 40 ) {
    	 System.out.println("You are extremely obese");
    	 
     }
}

}
