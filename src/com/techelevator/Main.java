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

        List<String> pacific = new ArrayList<String>(Arrays.asList("Washington", "Oregon", "California", "Nevada"));
        List<String> mountain = new ArrayList<String>(Arrays.asList("Montana", "Idaho", "Wyoming", "Utah", "Colorado", "Arizona", "New Mexico"));
        List<String> central = new ArrayList<String>(Arrays.asList("North Dakota", "South Dakota", "Nebraska", "Kansas", "Oklahoma", "Texas", "Minnesota", "Iowa", "Missouri", "Arkansas", "Louisiana", "Wisconsin", "Illinois", "Kentucky", "Tennessee", "Mississippi", "Alabama"));
        List<String> eastern = new ArrayList<String>(Arrays.asList("Michigan", "Indiana", "Ohio", "West Virginia", "Virginia", "North Carolina", "South Carolina", "Georgia", "Florida", "Pennsylvania", "New York", "Vermont", "Maine", "New Hampshire", "Rhode Island", "Massachusetts", "Connecticut", "New Jersey", "Delaware", "Maryland"));
        String alaska = "Alaska";
        String hawaii = "Hawaii";


        System.out.println("What state are you in?");
        String originState = scanner.nextLine();
        System.out.println("What is the current local time?");
        String localTimeStr = scanner.nextLine();
        LocalTime localTime = LocalTime.parse(localTimeStr);
        System.out.println("What state would you like the time for?");
        String destinationState = scanner.nextLine();

        LocalTime destinationTime = LocalTime.of(00, 00, 00);


        if (pacific.contains(originState) && pacific.contains(destinationState)) {
            destinationTime = localTime;
        } else if (pacific.contains(originState) && mountain.contains(destinationState)) {
            destinationTime = localTime.plusHours(1);
        } else if (pacific.contains(originState) && central.contains(destinationState)) {
            destinationTime = localTime.plusHours(2);
        } else if (pacific.contains(originState) && eastern.contains(destinationState)) {
            destinationTime = localTime.plusHours(3);
        } else if (pacific.contains(originState) && destinationState.equals("Alaska")) {
            destinationTime = localTime.minusHours(1);
        } else if (pacific.contains(originState) && destinationState.equals("Hawaii")) {
            destinationTime = localTime.minusHours(3);
        } else if(mountain.contains(originState) && mountain.contains(destinationState)){
            destinationTime = localTime;
        } else if(mountain.contains(originState) && pacific.contains(destinationState)){
            destinationTime = localTime.minusHours(1);
        } else if(mountain.contains(originState) && central.contains(destinationState)){
            destinationTime = localTime.plusHours(1);
        } else if(mountain.contains(originState) && eastern.contains(destinationState)){
            destinationTime = localTime.plusHours(2);
        } else if (mountain.contains(originState) && destinationState.equals("Alaska")) {
            destinationTime = localTime.minusHours(2);
        } else if (mountain.contains(originState) && destinationState.equals("Hawaii")) {
            destinationTime = localTime.minusHours(4);
        } else if(central.contains(originState) && central.contains(destinationState)){
            destinationTime = localTime;
        } else if(central.contains(originState) && pacific.contains(destinationState)){
            destinationTime = localTime.minusHours(2);
        } else if(central.contains(originState) && mountain.contains(destinationState)){
            destinationTime = localTime.minusHours(1);
        } else if(central.contains(originState) && eastern.contains(destinationState)){
            destinationTime = localTime.plusHours(1);
        } else if (central.contains(originState) && destinationState.equals("Alaska")) {
            destinationTime = localTime.minusHours(3);
        } else if (central.contains(originState) && destinationState.equals("Hawaii")) {
            destinationTime = localTime.minusHours(5);
        } else if(eastern.contains(originState) && eastern.contains(destinationState)){
            destinationTime = localTime;
        } else if(eastern.contains(originState) && pacific.contains(destinationState)){
            destinationTime = localTime.minusHours(3);
        } else if(eastern.contains(originState) && mountain.contains(destinationState)){
            destinationTime = localTime.minusHours(2);
        } else if(eastern.contains(originState) && central.contains(destinationState)){
            destinationTime = localTime.minusHours(1);
        } else if (eastern.contains(originState) && destinationState.equals("Alaska")) {
            destinationTime = localTime.minusHours(4);
        } else if (eastern.contains(originState) && destinationState.equals("Hawaii")) {
            destinationTime = localTime.minusHours(6);
        } else if(originState.equals("Alaska") && pacific.contains(destinationState)){
            destinationTime = localTime.plusHours(1);
        } else if(originState.equals("Alaska") && mountain.contains(destinationState)){
            destinationTime = localTime.plusHours(2);
        }  else if(originState.equals("Alaska") && central.contains(destinationState)) {
            destinationTime = localTime.plusHours(3);
        } else if(originState.equals("Alaska") && eastern.contains(destinationState)) {
            destinationTime = localTime.plusHours(4);
        } else if(originState.equals("Alaska") && destinationState.equals("Hawaii")) {
            destinationTime = localTime.minusHours(2);
        }  else if(originState.equals("Alaska") && destinationState.equals("Alaska")){
            destinationTime = localTime;
        } else if (originState.equals("Hawaii") && destinationState.equals("Hawaii")){
            destinationTime = localTime;
        } else if(originState.equals("Hawaii") && pacific.contains(destinationState)){
            destinationTime = localTime.plusHours(3);
        } else if(originState.equals("Hawaii") && mountain.contains(destinationState)){
            destinationTime = localTime.plusHours(4);
        }  else if(originState.equals("Hawaii") && central.contains(destinationState)) {
            destinationTime = localTime.plusHours(5);
        } else if(originState.equals("Hawaii") && eastern.contains(destinationState)) {
            destinationTime = localTime.plusHours(6);
        } else if(originState.equals("Hawaii") && destinationState.equals("Alaska")) {
            destinationTime = localTime.plusHours(2);
        }

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

