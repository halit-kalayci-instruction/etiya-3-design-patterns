package org.example.behavorial.mediator;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private static List<Plane> landingPlanes = new ArrayList<>();
    private static List<Plane> departurePlanes = new ArrayList<>();

    public static void landingRequest(Plane plane){
        landingPlanes.add(plane);
        System.out.println(plane.flightCode + " kodlu uçağın iniş isteği alındı. İniş sırası: " + landingPlanes.size());
    }
    public static void departureRequest(Plane plane){
        departurePlanes.add(plane);
        System.out.println(plane.flightCode + " kodlu uçağın kalkış isteği alındı. Kalkış sırası: " + departurePlanes.size());
    }
}
