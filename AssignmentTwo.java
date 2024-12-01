package src;

import src.comparator.RideComparator;
import src.pojo.Employee;
import src.pojo.Ride;
import src.pojo.Visitor;

// AssignmentTwo.java
public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        System.out.println("=== Part 3: Queue Interface ===");
        assignment.partThree();
        System.out.println("\n=== Part 4A: Collection Class (LinkedList) ===");
        assignment.partFourA();
        System.out.println("\n=== Part 4B: Sorting the Collection ===");
        assignment.partFourB();
        System.out.println("\n=== Part 5: Run a Ride Cycle ===");
        assignment.partFive();
        System.out.println("\n=== Part 6: Writing to a File ===");
        assignment.partSix();
        System.out.println("\n=== Part 7: Reading from a File ===");
        assignment.partSeven();
    }

    public void partThree(){
        // Create a new Ride object
        Employee operator = new Employee("John Doe", 30, "Florida", "E001", "Operator");
        Ride ride = new Ride("Roller Coaster", 5, operator);

        // Add 5 Visitors to the Queue
        Visitor v1 = new Visitor("Jack", 25, "Michigan", "V001", true);
        Visitor v2 = new Visitor("Tony", 22, "Michigan", "V002", false);
        Visitor v3 = new Visitor("Charlie", 28, "Montana", "V003", true);
        Visitor v4 = new Visitor("Diana", 24, "Michigan", "V004", false);
        Visitor v5 = new Visitor("Ethan", 27, "Michigan", "V005", true);

        ride.addVisitorToQueue(v1);
        ride.addVisitorToQueue(v2);
        ride.addVisitorToQueue(v3);
        ride.addVisitorToQueue(v4);
        ride.addVisitorToQueue(v5);

        // Remove a Visitor from the Queue
        ride.removeVisitorFromQueue();

        // Print all Visitors in the Queue
        ride.printQueue();
    }

    public void partFourA(){
        // Create a new Ride object
        Employee operator = new Employee("Jane Smith", 28, "Oregon", "E002", "Operator");
        Ride ride = new Ride("Water Rider", 3, operator);

        // Add 5 Visitors to the Ride History
        Visitor v1 = new Visitor("Frank", 30, "Florida", "V006", true);
        Visitor v2 = new Visitor("Grace", 26, "Oregon", "V007", false);
        Visitor v3 = new Visitor("Hannah", 23, "Oregon", "V008", true);
        Visitor v4 = new Visitor("Ian", 29, "Florida", "V009", false);
        Visitor v5 = new Visitor("Jack", 31, "Michigan", "V010", true);

        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);

        // Check if a Visitor is in the collection
        Visitor checkVisitor = new Visitor("Grace", 26, "Oregon", "V007", false);
        ride.checkVisitorFromHistory(checkVisitor);

        // Print the number of Visitors in the collection
        ride.numberOfVisitors();

        // Print all Visitors in the collection
        ride.printRideHistory();
    }

    public void partFourB(){
        // Create a new Ride object
        Employee operator = new Employee("Mike Brown", 35, "Michigan", "E003", "Operator");
        Ride ride = new Ride("Ferris Wheel", 4, operator);

        // Add 5 Visitors to the Ride History
        Visitor v1 = new Visitor("Lily", 20, "Oregon", "V011", true);
        Visitor v2 = new Visitor("Mike", 32, "Michigan", "V012", false);
        Visitor v3 = new Visitor("Nina", 27, "Oregon", "V013", true);
        Visitor v4 = new Visitor("Oscar", 24, "Florida", "V014", false);
        Visitor v5 = new Visitor("Paul", 29, "Florida", "V015", true);

        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);

        // Print all Visitors before sorting
        System.out.println("Before Sorting:");
        ride.printRideHistory();

        // Sort the collection
        java.util.Collections.sort(ride.getRideHistory(), new RideComparator());

        // Print all Visitors after sorting
        System.out.println("After Sorting:");
        ride.printRideHistory();
    }

    public void partFive(){
        // Create a new Ride object
        Employee operator = new Employee("Sarah Lee", 27, "Oregon", "E004", "Operator");
        Ride ride = new Ride("Haunted House", 2, operator);

        // Add 10 Visitors to the Queue
        for(int i=1; i<=10; i++) {
            Visitor visitor = new Visitor("Visitor" + i, 20 + i, "Florida", "V100" + i, i%2 == 0);
            ride.addVisitorToQueue(visitor);
        }

        // Print all Visitors in the queue
        System.out.println("Queue before running cycle:");
        ride.printQueue();

        // Run one cycle
        ride.runOneCycle();

        // Print all Visitors in the queue after one cycle
        System.out.println("Queue after running cycle:");
        ride.printQueue();

        // Print all Visitors in the collection (ride history)
        System.out.println("Ride History after running cycle:");
        ride.printRideHistory();
    }

    public void partSix(){
        // Create a new Ride object
        Employee operator = new Employee("Tom Harris", 40, "Florida", "E005", "Operator");
        Ride ride = new Ride("Bumper Cars", 4, operator);

        // Add 5 Visitors to the Ride History
        Visitor v1 = new Visitor("Uma", 22, "Oregon", "V016", true);
        Visitor v2 = new Visitor("Victor", 25, "Michigan", "V017", false);
        Visitor v3 = new Visitor("Wendy", 28, "Oregon", "V018", true);
        Visitor v4 = new Visitor("Xander", 24, "Michigan", "V019", false);
        Visitor v5 = new Visitor("Yara", 26, "Oregon", "V020", true);

        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);

        // Export the Visitors to a file
        ride.exportRideHistory("rideHistory.csv");
    }

    public void partSeven(){
        // Create a new Ride object
        Employee operator = new Employee("Zack Turner", 33, "Michigan", "E006", "Operator");
        Ride ride = new Ride("Swing Ride", 3, operator);

        // Import the file created in partSix
        ride.importRideHistory("rideHistory.csv");

        // Print the number of Visitors in the LinkedList to confirm
        ride.numberOfVisitors();

        // Print all Visitors in the LinkedList to confirm details
        ride.printRideHistory();
    }
}

