package org.ilyasse.Java_OPP.Interfaces;

// Defining an interface for braking functionality
interface Brake {
    void brake(); // Method to simulate braking
}

// Defining an interface for engine functionality
 interface Engine {
    void start(); // Method to start the engine
    void stop();  // Method to stop the engine
    void acc();   // Method to accelerate
}

// Defining an interface for media control (like music systems)
 interface Media {
    void start(); // Method to start media
    void stop();  // Method to stop media
}

// Implementing Engine and Brake interfaces in a Car class
 class Car implements Engine, Brake {
    @Override
    public void brake() {
        System.out.println("Car braking");
    }

    @Override
    public void start() {
        System.out.println("Car starting");
    }

    @Override
    public void stop() {
        System.out.println("Car stopping");
    }

    @Override
    public void acc() {
        System.out.println("Car accelerating");
    }
}

// Implementing Media interface in CDPlayer class
 class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("CDPlayer is starting...");
    }

    @Override
    public void stop() {
        System.out.println("CDPlayer is stopping...");
    }
}

// Implementing Engine interface in ElectricEngine class
 class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting Electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Electric Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating Electric Engine");
    }
}

// Implementing Engine interface in PowerEngine class
 class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("PowerEngine Start");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine Stop");
    }

    @Override
    public void acc() {
        System.out.println("PowerEngine Accelerating");
    }
}

// MyCar class uses an Engine and a Media player
 class MyCar {
    private Engine engine;  // Engine instance
    private Media player = new CDPlayer(); // Default media player

    // Constructor initializes the default engine as PowerEngine
    public MyCar() {
        engine = new PowerEngine();
    }

    // Constructor allows changing the engine type dynamically
    public MyCar(Engine engine) {
        this.engine = engine;
    }

    // Start the car engine
    public void start() {
        engine.start();
    }

    // Stop the car engine
    public void stop() {
        engine.stop();
    }

    // Accelerate the car
    public void accelerate() {
        engine.acc();
    }

    // Start music player
    public void startMusic() {
        player.start();
    }

    // Pause music player
    public void pauseMusic() {
        player.stop();
    }

    // Upgrade engine to Electric Engine
    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating MyCar instance with default PowerEngine
        MyCar car1 = new MyCar();
        car1.start();      // Starts PowerEngine
        car1.stop();       // Stops PowerEngine
        car1.accelerate(); // Accelerates PowerEngine
        car1.startMusic(); // Starts CD Player
        car1.pauseMusic(); // Stops CD Player

        // Upgrading to ElectricEngine
        car1.upgradeEngine();
        car1.start(); // Starts Electric Engine
        car1.stop();  // Stops Electric Engine
    }
}




