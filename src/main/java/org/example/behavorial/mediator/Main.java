package org.example.behavorial.mediator;

public class Main {
    public static void main(String[] args) {
            Plane plane1 = new Plane("1A1");
            Plane plane2 = new Plane("1A2");
            Plane plane3 = new Plane("1A3");
            Plane plane4 = new Plane("1A4");
            Plane plane5 = new Plane("1A5");
            Plane plane6 = new Plane("1A6");

             //for, for
            plane1.requestDeparture();
            plane2.requestLanding();
            plane3.requestLanding();
            plane4.requestDeparture();
            plane5.requestLanding();
            plane6.requestLanding();
    }
}
