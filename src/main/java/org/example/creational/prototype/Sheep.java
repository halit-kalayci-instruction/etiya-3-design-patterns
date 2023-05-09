package org.example.creational.prototype;

public class Sheep implements Animal{
    public String name;

    public Sheep(String name) {
        this.name = name;
    }

    @Override
    public Animal makeCopy() {
        System.out.println("İlgili class kopyalanıyor..");
        Sheep sheepObject = null;

        try{
            sheepObject = (Sheep) super.clone();
        }catch(CloneNotSupportedException exception){
            System.out.println("İlgili class kopyalanamadı.");
        }

        return sheepObject;
    }
}
