package org.example.structural.adapter;

import org.example.structural.adapter.adapters.AbcSmsAdapter;
import org.example.structural.adapter.adapters.VatanSmsAdapter;
import org.example.structural.adapter.services.CustomerManager;
import org.example.structural.adapter.services.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerManager(new VatanSmsAdapter());
        customerService.register();

        CustomerService customerService1 = new CustomerManager(new AbcSmsAdapter());
        customerService1.register();
    }
}
