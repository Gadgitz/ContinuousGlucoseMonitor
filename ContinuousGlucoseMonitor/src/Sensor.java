import java.util.*;
public class Sensor {
public int getSensor(){
    Scanner input = new Scanner(System.in);
    System.out.println("Is the CGM sensor installed properly and is it turned on? (Please enter 1 for yes and 2 for no)");
    int answer = input.nextInt();
    if(answer == 1){
        System.out.println("You are clear to proceed with testing.");
    } else if (answer == 2){
        System.out.println("Please install the CGM as instructed or replace if CGM is installed, but you are getting no readings and then try again.");
    }
return answer;
}
}
