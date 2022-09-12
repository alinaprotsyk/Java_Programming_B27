package groupStudies;

import java.util.ArrayList;

public class Bed {
    String size;
    ArrayList<Pillow> pillows;

    public Bed(String size, int numOfPillows){
        this.size = size;
        pillows = new ArrayList<>();
        for (int i = 0; i < numOfPillows; i++)
        this.pillows.add(new Pillow());



        }
    }

