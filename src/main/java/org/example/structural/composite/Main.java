package org.example.structural.composite;

public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("Serhat","Dalçiçek",500);
        Employee headOfSoftware = new Employee("Cem","Gündüz",200);
        Employee headOfSales = new Employee("Ayşe","Leke",200);

        Employee softwareDeveloper = new Employee("Ceylin","Doğan",100);
        Employee sales = new Employee("Furkan","Yağcı",100);

        CEO.add(headOfSoftware);
        CEO.add(headOfSales);

        headOfSoftware.add(softwareDeveloper);
        headOfSales.add(sales);

        System.out.println(CEO.toString());
        for(Employee head:CEO.subordinates){
            System.out.println(head.toString());
            for(Employee employee:head.subordinates){
                System.out.println(employee.toString());
            }
        }
    }
}
