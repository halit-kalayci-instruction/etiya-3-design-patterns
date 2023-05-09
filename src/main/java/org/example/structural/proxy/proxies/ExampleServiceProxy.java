package org.example.structural.proxy.proxies;

import org.example.structural.proxy.services.ExampleService;

import java.util.HashMap;

public class ExampleServiceProxy implements ExampleService{
    private ExampleService exampleService;

    private HashMap<Integer,Integer> storedDatas =new HashMap();

    public ExampleServiceProxy(ExampleService exampleService) {
        this.exampleService = exampleService;
    }


    @Override
    public int getData(int number) {
        if(!storedDatas.containsKey(number)){
            int result = exampleService.getData(number);
            storedDatas.put(number,result);
        }
        return storedDatas.get(number);
    }
}
