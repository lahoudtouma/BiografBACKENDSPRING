package com.example.biografbackendspring;

public class Salon {
    private int id;
    private int theaterId;
    private String location;
    private String theaterSeats;

    public Salon(int id, int theaterId, String location, String theaterSeats){
        this.id = id;
        this.theaterId = theaterId;
        this.location = location;
        this.theaterSeats = theaterSeats;


    }

    public int getId() {return id;}

    public void setId(int id) {
        this.id =id;
    }

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTheaterseats() {
        return theaterSeats;
    }

    public void setTheaterseats(String theaterseats) {

        this.theaterSeats = theaterseats;
    }

    @Override
    public String toString(){
        return "Salong{" +
                "ID" + id +
                ", TheaterID" + theaterId +
                ", Location" + location + '\'' +
                ", TheaterSeats" + theaterSeats + '\'' +
                '}';

    }

}
