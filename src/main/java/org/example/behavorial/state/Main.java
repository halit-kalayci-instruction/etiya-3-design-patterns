package org.example.behavorial.state;

public class Main {
    public static void main(String[] args) {
        // Singleton-Observer-State
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        if(context.getState().toString() == "StartState"){
            System.out.println("Çalan müzik: The Dragborn Comes");
        }

        EndState endState = new EndState();
        endState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
