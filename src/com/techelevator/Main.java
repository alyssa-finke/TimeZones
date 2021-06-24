package com.techelevator;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Main can't do conversion but can interact with user and KNOWS how to use TimeConverter

//This can stay bc application can read in input from user
        //Then use input to set origin state for example

        System.out.println("What state are you in?");
        String originState = scanner.nextLine();
        System.out.println("What is the current local time?");
        String localTimeStr = scanner.nextLine();
        LocalTime localTime = LocalTime.parse(localTimeStr);
        System.out.println("What state would you like the time for?");
        String destinationState = scanner.nextLine();

        //LocalTime destinationTime = LocalTime.of(00, 00, 00);
//I'm initializing an instance of TimeConverter. This is how I use an instance of the object
        TimeConverter timeConverter = new TimeConverter();

        timeConverter.setOriginTime(localTime);
        timeConverter.setOriginState(originState);
        timeConverter.setDestinationState(destinationState);

        LocalTime destinationTime = timeConverter.getDestinationTime();


        System.out.println(destinationTime.format((DateTimeFormatter.ofPattern("hh:mm"))));
    }
}


//What else do I want to do?
//Could split those states w multiple time zone
//Would need to add another question, such as...what is your area code? And if it matches or is greater, etc. could do that way
//Oregon: If your zipcode is between 97901 and 97920, you're in mountaintime
//Idaho:Benewah County
//Bonner County
//Boundary County
//Clearwater County
//Kootenai County (includes Coeur d'Alene)
//Latah County (includes Moscow)
//Lewis County
//Nez Perce County (includes Lewiston)
//Shoshone County
//Portion of Idaho County north of the Salmon River
//The towns of Burgdorf and Warren

