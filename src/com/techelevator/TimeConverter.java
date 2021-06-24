package com.techelevator;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Create new class to hold all logic
public class TimeConverter {
    //The code is the class, and when you initialize it using new, it's an object
    //Creating instance variables of what I'll want to useget
    private List<String> pacific = new ArrayList<String>(Arrays.asList("Washington", "Oregon", "California", "Nevada"));
    private List<String> mountain = new ArrayList<String>(Arrays.asList("Montana", "Idaho", "Wyoming", "Utah", "Colorado", "Arizona", "New Mexico"));
    private List<String> central = new ArrayList<String>(Arrays.asList("North Dakota", "South Dakota", "Nebraska", "Kansas", "Oklahoma", "Texas", "Minnesota", "Iowa", "Missouri", "Arkansas", "Louisiana", "Wisconsin", "Illinois", "Kentucky", "Tennessee", "Mississippi", "Alabama"));
    private List<String> eastern = new ArrayList<String>(Arrays.asList("Michigan", "Indiana", "Ohio", "West Virginia", "Virginia", "North Carolina", "South Carolina", "Georgia", "Florida", "Pennsylvania", "New York", "Vermont", "Maine", "New Hampshire", "Rhode Island", "Massachusetts", "Connecticut", "New Jersey", "Delaware", "Maryland"));
    private String alaska = "Alaska";
    private String hawaii = "Hawaii";

    private LocalTime originTime;
    private String originState;
    private String destinationState;
    private LocalTime destinationTime;

//getters and setters for instance variables -- allows me to interact with this clas
    public LocalTime getOriginTime() {
        return originTime;
    }

    public void setOriginTime(LocalTime originTime) {
        this.originTime = originTime;
    }

    public String getOriginState() {
        return originState;
    }

    public void setOriginState(String originState) {
        this.originState = originState;
    }

    public String getDestinationState() {
        return destinationState;
    }

    public void setDestinationState(String destinationState) {
        this.destinationState = destinationState;
    }
//this is derived
    public LocalTime getDestinationTime() {
        LocalTime destinationTime = null;

        if (pacific.contains(originState) && pacific.contains(destinationState)) {
            destinationTime = originTime;
        } else if (pacific.contains(originState) && mountain.contains(destinationState)) {
            destinationTime = originTime.plusHours(1);
        } else if (pacific.contains(originState) && central.contains(destinationState)) {
            destinationTime = originTime.plusHours(2);
        } else if (pacific.contains(originState) && eastern.contains(destinationState)) {
            destinationTime = originTime.plusHours(3);
        } else if (pacific.contains(originState) && destinationState.equals("Alaska")) {
            destinationTime = originTime.minusHours(1);
        } else if (pacific.contains(originState) && destinationState.equals("Hawaii")) {
            destinationTime = originTime.minusHours(3);
        } else if (mountain.contains(originState) && mountain.contains(destinationState)) {
            destinationTime = originTime;
        } else if (mountain.contains(originState) && pacific.contains(destinationState)) {
            destinationTime = originTime.minusHours(1);
        } else if (mountain.contains(originState) && central.contains(destinationState)) {
            destinationTime = originTime.plusHours(1);
        } else if (mountain.contains(originState) && eastern.contains(destinationState)) {
            destinationTime = originTime.plusHours(2);
        } else if (mountain.contains(originState) && destinationState.equals("Alaska")) {
            destinationTime = originTime.minusHours(2);
        } else if (mountain.contains(originState) && destinationState.equals("Hawaii")) {
            destinationTime = originTime.minusHours(4);
        } else if (central.contains(originState) && central.contains(destinationState)) {
            destinationTime = originTime;
        } else if (central.contains(originState) && pacific.contains(destinationState)) {
            destinationTime = originTime.minusHours(2);
        } else if (central.contains(originState) && mountain.contains(destinationState)) {
            destinationTime = originTime.minusHours(1);
        } else if (central.contains(originState) && eastern.contains(destinationState)) {
            destinationTime = originTime.plusHours(1);
        } else if (central.contains(originState) && destinationState.equals("Alaska")) {
            destinationTime = originTime.minusHours(3);
        } else if (central.contains(originState) && destinationState.equals("Hawaii")) {
            destinationTime = originTime.minusHours(5);
        } else if (eastern.contains(originState) && eastern.contains(destinationState)) {
            destinationTime = originTime;
        } else if (eastern.contains(originState) && pacific.contains(destinationState)) {
            destinationTime = originTime.minusHours(3);
        } else if (eastern.contains(originState) && mountain.contains(destinationState)) {
            destinationTime = originTime.minusHours(2);
        } else if (eastern.contains(originState) && central.contains(destinationState)) {
            destinationTime = originTime.minusHours(1);
        } else if (eastern.contains(originState) && destinationState.equals("Alaska")) {
            destinationTime = originTime.minusHours(4);
        } else if (eastern.contains(originState) && destinationState.equals("Hawaii")) {
            destinationTime = originTime.minusHours(6);
        } else if (originState.equals("Alaska") && pacific.contains(destinationState)) {
            destinationTime = originTime.plusHours(1);
        } else if (originState.equals("Alaska") && mountain.contains(destinationState)) {
            destinationTime = originTime.plusHours(2);
        } else if (originState.equals("Alaska") && central.contains(destinationState)) {
            destinationTime = originTime.plusHours(3);
        } else if (originState.equals("Alaska") && eastern.contains(destinationState)) {
            destinationTime = originTime.plusHours(4);
        } else if (originState.equals("Alaska") && destinationState.equals("Hawaii")) {
            destinationTime = originTime.minusHours(2);
        } else if (originState.equals("Alaska") && destinationState.equals("Alaska")) {
            destinationTime = originTime;
        } else if (originState.equals("Hawaii") && destinationState.equals("Hawaii")) {
            destinationTime = originTime;
        } else if (originState.equals("Hawaii") && pacific.contains(destinationState)) {
            destinationTime = originTime.plusHours(3);
        } else if (originState.equals("Hawaii") && mountain.contains(destinationState)) {
            destinationTime = originTime.plusHours(4);
        } else if (originState.equals("Hawaii") && central.contains(destinationState)) {
            destinationTime = originTime.plusHours(5);
        } else if (originState.equals("Hawaii") && eastern.contains(destinationState)) {
            destinationTime = originTime.plusHours(6);
        } else if (originState.equals("Hawaii") && destinationState.equals("Alaska")) {
            destinationTime = originTime.plusHours(2);
        }
        return destinationTime;
    }
}
