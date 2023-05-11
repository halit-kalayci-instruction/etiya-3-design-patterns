package org.example.behavorial.iterator;

public class ConcreteCustomerRepository implements CustomerRepository {

    private String customers[] = {"Halit","Musa","Serhat","Filiz"};
    @Override
    public Iterator getIterator() {
        return new CustomerIterator(customers);
    }
}
