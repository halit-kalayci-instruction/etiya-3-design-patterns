package org.example.structural.proxy.services;

public class ExampleManager implements ExampleService{
    @Override
    public int getData(int number) {
        int total = 0;
        for (int i=0; i<number; i++){
            total+=i;
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
        return total;
    }
}
