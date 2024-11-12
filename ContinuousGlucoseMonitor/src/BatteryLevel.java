import java.util.*;
public class BatteryLevel {
        private Random batteryLevel = new Random();
        private int newlevel;
        public int getBatteryLevel(){
            newlevel = batteryLevel.nextInt(100);
            return newlevel;
    }
}