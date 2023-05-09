package org.example.creational.singleton;

public class DatabaseLogging implements ILogging{
    private static DatabaseLogging instance;
    private String message;
    public DatabaseLogging(String message) {
        this.message = message;
    }

    @Override
    public void log() {
        System.out.println(message);
    }

    public static DatabaseLogging getInstance(String message){
        // uygulamada bir instance üretilmiş ise bunu return et
        // üretilmemiş ise bir instance üret, hafızada tut ve return et
        DatabaseLogging logging = instance;
        if(logging != null) return logging;
        // C#=>lock
        synchronized (DatabaseLogging.class)
        {
            if(instance==null)
                instance= new DatabaseLogging(message);
            return instance;
        }
    }
}
