package org.example.behavorial.mediator;

public class Plane {
    public String flightCode;

    public Plane(String flightCode) {
        this.flightCode = flightCode;
    }

    public void requestLanding(){
        Airport.landingRequest(this);
    }
    public void requestDeparture(){
        Airport.departureRequest(this);
    }
}
