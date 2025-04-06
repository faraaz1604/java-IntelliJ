package Enumaration;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i<=9; i++){
            var weekDay = getRandDay();
            System.out.printf("Name is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());

            if(weekDay == WeekDays.FRIDAY){
                System.out.println("weekend suhuru ..maze!!!");
            }
        }

    }

    public static WeekDays getRandDay(){

        int random = new Random().nextInt(7);
        var allDays = WeekDays.values();

        return allDays[random];
    }
}
