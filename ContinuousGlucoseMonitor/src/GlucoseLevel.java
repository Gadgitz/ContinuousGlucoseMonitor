import java.util.*;
public class GlucoseLevel{ 
    private Random reading = new Random();
    private int newRead;
    public int getReading(){
        newRead = reading.nextInt(190);
        return newRead;
    }
}
