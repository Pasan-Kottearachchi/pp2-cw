import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class PassengerQueue {

    private static ArrayList<Passenger> passengerArray = new ArrayList<>();
    private int first;
    private int last;
    private int maxStayInQueue;
    private int maxLength;


    public static void addPassengerToPassengerQueue(Passenger data){
        passengerArray.add(data);
       // AddPassengerGui();

    }


    public static void isEmpty(){
        if (passengerArray.isEmpty()){
            System.out.println("Array List is empty");
        }else{
            System.out.println("Array List contains elements");
        }
    }

    public static void ifFull(){
        boolean queueFull;
        if(passengerArray.size()==40){
            queueFull=true;
        }else{
            queueFull=false;
        }
    }

    public static void viewPassengerQueue(){
        System.out.println(passengerArray);
    }

    public static void getLength(){

    }






    //--------------------- GUI METHODS -----------------------------

    public static void AddPassengerGui(){
        Stage stage1=new Stage();
        FlowPane flowpane1=new FlowPane();
        stage1.setTitle("Adding Passengers to Denuwara Menike Passenger Queue");

        for (int i = 1; i <= 42; i++) {
            Button button = new Button("Seat " + i);
            button.setId(Integer.toString(i));
            flowpane1.getChildren().add(button);

            button.setPrefWidth(60);
            flowpane1.setHgap(20);
            flowpane1.setVgap(10);
        }

        Scene scene = new Scene(flowpane1, 400, 380);
        stage1.setScene(scene);
        //console pauses until stage closes
        stage1.showAndWait();
    }


    public static void ViewPassengerGui(){
        Stage stage1=new Stage();
        FlowPane flowpane1=new FlowPane();
        stage1.setTitle("Viewing Denuwara Menike Passenger Queue");

        for (int i = 1; i <= 42; i++) {
            Button button = new Button("Seat " + i);
            button.setId(Integer.toString(i));
            flowpane1.getChildren().add(button);

            button.setPrefWidth(60);
            flowpane1.setHgap(20);
            flowpane1.setVgap(10);
        }

        Scene scene = new Scene(flowpane1, 400, 380);
        stage1.setScene(scene);
        //console pauses until stage closes
        stage1.showAndWait();
    }
}
