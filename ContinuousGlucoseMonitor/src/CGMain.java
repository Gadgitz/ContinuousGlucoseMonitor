import java.util.*;
public class CGMain {
    public static void main(String[] args) {
        Sensor check = new Sensor();
        int sensorStatus = check.getSensor(); 
        Scanner input = new Scanner(System.in);
        System.out.println("Start Monitoring Test? (Type 1 for yes and 2 for no) "); // checks for proper sensor instalation and ready for readings. 
        int response = input.nextInt();
        while(response == 1){
            
            GlucoseLevel Reading1 = new GlucoseLevel(); // creates new object to obtain reading from hardware
            int currentReading = Reading1.getReading(); // gets the read from the object. 

            if (currentReading < 70) { // lines 5 - 11 check reading levels and either sends out an alert to notify the user their sugar is either too high or too low, or its gives them the ok that their reading is fine.
                System.out.println("ALERT!!! Your Current Glucose reading is: " + currentReading + " YOUR SUGAR IS DANGEROUSLY LOW! Please take steps to increase your glucose.");
            } else if (currentReading >= 70 && currentReading <= 180){
                System.out.println("Your current Glucose reading is: " + currentReading + " Great Job!");
            } else if (currentReading > 180){
                System.out.println("ALERT!!! Your current Glucose reading is: " + currentReading + " YOUR SUGAR IS TOO HIGH! Please go for a walk as soon as possible to lower current levels.");
            }
            System.out.println("Would you like another reading? (type 1 for yes and 2 for no) ");
            response = input.nextInt();
        }
        BatteryLevel battery = new BatteryLevel();
        int currentPercent = battery.getBatteryLevel();
        if(currentPercent <= 20){
            System.out.println("Your current charge level is: " + currentPercent + " Please plug device in for charge. ");
        } else if (currentPercent > 20){
            System.out.println("Your current battery level is: " + currentPercent);
        }
    }
}
