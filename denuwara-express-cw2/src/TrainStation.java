import javafx.application.Application;;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TrainStation extends Application {
    public static HashMap<Integer, String> ColomboToBadullaWaitingListHashmap = new HashMap<>();
    public static ArrayList<Passenger> waitingQueue = new ArrayList<Passenger>();

    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println(" ----------------------------------");
        System.out.println("|   Colombo Fort Railway Station   |");
        System.out.println(" ----------------------------------");

        Scanner in = new Scanner(System.in);
        String userinput = "";
        while (!userinput.equalsIgnoreCase("Q")) {
            System.out.println("");
            System.out.println("Enter 'A' to add a passenger to a seat");
            System.out.println("Enter 'V' to view all seats");
            System.out.println("Enter 'D' to delete a passenger from a booked seat");
            System.out.println("Enter 'S' to store program data into a file ");
            System.out.println("Enter 'Q' to quit the program");
            System.out.println("");
            System.out.println("Enter the option you want to continue with :  ");
            userinput = in.nextLine().toUpperCase();
            switch (userinput) {
                case "A":
                    System.out.println("Adding a passenger");
                    loadSeatDataToWaitingList();
                    int i=0;
                    for (Map.Entry<Integer, String> entry : ColomboToBadullaWaitingListHashmap.entrySet()) {
                        String name = (entry.getValue());
                        int seat = (entry.getKey());
                        String strValue=Integer.toString(i);
                        Passenger strValue = new Passenger(name,seat);
                       // System.out.println(passengerObject);
                        //waitingQueue.add(passengerObject);

                    }
                    i++;
                    System.out.println(ColomboToBadullaWaitingListHashmap);
                    System.out.println(waitingQueue);
                    //passengerObj();
                    //PassengerQueue.addPassengerToPassengerQueue(passengerObject);
                    break;

                case "V":
                    PassengerQueue.viewPassengerQueue();

                    break;
                case "D":
                    System.out.println("Delete Seat");
                case "S":
                    System.out.println("Storing the program data into the file");
                    break;
                case "Q":
                    System.exit(0);
                default:
                    System.out.println("Enter a valid input!!");
                    break;
            }
        }

    }


    private void loadSeatDataToWaitingList() throws IOException {
        String filePath = "G:/First Year(L4)/Semester 2/Programming Principle 1/Text Reader/src/week 5.txt";

        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(":", 2);
            if (parts.length >= 2) {
                String key = parts[0];
                String value = parts[1];
                ColomboToBadullaWaitingListHashmap.put(Integer.valueOf(key), value);
            } else {
                System.out.println("ignoring line: " + line);
            }
        }

        reader.close();
        System.out.println("The program data has been successfully loaded from the file");
    }

    public void passengerObj() {
        /*for (Map.Entry<Integer, String> entry : ColomboToBadullaWaitingListHashmap.entrySet()) {
            String name = (entry.getValue());
            int seat = (entry.getKey());
            Passenger passengerObject = new Passenger(name, seat);
            System.out.println(passengerObject);
            PassengerQueue.addPassengerToPassengerQueue(passengerObject);
        }*/

    }

}

