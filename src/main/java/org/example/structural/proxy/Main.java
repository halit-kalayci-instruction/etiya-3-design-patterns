package org.example.structural.proxy;

import org.example.structural.proxy.proxies.ExampleServiceProxy;
import org.example.structural.proxy.services.ExampleManager;
import org.example.structural.proxy.services.ExampleService;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ExampleService exampleService = new ExampleServiceProxy(new ExampleManager());
        System.out.println("Method çağırıldı: " + LocalDateTime.now());
        System.out.println(exampleService.getData(15));
        System.out.println("Cevap alındı: " + LocalDateTime.now());

        System.out.println("2. Method çağırıldı: " + LocalDateTime.now());
        System.out.println(exampleService.getData(15));
        System.out.println("2. Cevap alındı: " + LocalDateTime.now());

        System.out.println("3. Method çağırıldı: " + LocalDateTime.now());
        System.out.println(exampleService.getData(10));
        System.out.println("3. Cevap alındı: " + LocalDateTime.now());
    }
}
