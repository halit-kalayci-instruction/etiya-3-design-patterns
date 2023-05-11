package org.example.behavorial.iterator;

public class CustomerIterator implements Iterator{
    private String[] customers;
    int index=0;

    public CustomerIterator(String[] customers) {
        this.customers = customers;
    }

    @Override
    public boolean hasNext() {
        return index < customers.length;
    }

    @Override
    public Object getNext() {
        if(hasNext()){
            return customers[index++];
        }
        return null;
    }
}
