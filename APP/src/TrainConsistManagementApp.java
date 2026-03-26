import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("======================================");
        System.out.println("   Train Consist Management App   ");
        System.out.println("======================================");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Initialize with some default bogies (optional but useful)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper Coach");
        trainConsist.add("AC Coach");
        trainConsist.add("General Coach");

        // Display initialization message
        System.out.println("\nTrain initialized successfully...\n");

        // Display current consist summary
        System.out.println("Current Train Consist:");
        for (int i = 0; i < trainConsist.size(); i++) {
            System.out.println((i + 1) + ". " + trainConsist.get(i));
        }
    }
}