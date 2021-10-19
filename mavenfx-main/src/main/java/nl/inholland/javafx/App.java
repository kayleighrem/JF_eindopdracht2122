package nl.inholland.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import nl.inholland.javafx.model.*;

public class App extends Application {

    public final static Cinema fabulousCinema = new Cinema();

    public final static Movie noTimeToLie = new Movie();
    public final static Movie theAddamsFamily19 = new Movie();

    public final static Room room1 = new Room();
    public final static Room room2 = new Room();

    public final static User admin = new User();
    public final static User user = new User();

    public final static Showing noTimeToLie_Room1_Start09102021_2000_End10102021_22205 = new Showing();
    public final static Showing theAddamsFamily19_Room1_Start09102021_2230_End10102021_0002 = new Showing();
    public final static Showing theAddamsFamily19_Room2_Start09102021_2000_End09102021_2132 = new Showing();
    public final static Showing noTimeToLie_Room2_Start09102021_2200_End10102021_0005 = new Showing();

    @Override
    public void start(Stage window) throws Exception {
        init();
        window.setHeight(600);
        window.setWidth(800);
        window.setTitle(fabulousCinema.name);

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        Label userLabel = new Label("Username: ");
        GridPane.setConstraints(userLabel, 0, 0);

        TextField userInput = new TextField();
        System.out.println(userInput.getText());
        userInput.setPromptText("username");
        GridPane.setConstraints(userInput, 1, 0);

        Label passwordLabel = new Label("Password: ");
        GridPane.setConstraints(passwordLabel, 0,1);
        TextField passwordInput = new PasswordField();
        System.out.println(passwordInput.getText());
        GridPane.setConstraints(passwordInput, 1, 1);

        Button loginButton = new Button("Log in");
        GridPane.setConstraints(loginButton, 0,3);

        gridPane.getChildren().addAll(userLabel, userInput, passwordLabel, passwordInput, loginButton);

        Scene scene = new Scene(gridPane);
        window.setScene(scene);
        window.show();
    }

    public void init() {
        initializeCinema();
        initializeRooms();
        initializeMovies();
        initializeShowings();
        initializeUsers();
    }

    public void initializeCinema() {
        fabulousCinema.id = 1;
        fabulousCinema.name = "Fabulous Cinema";
    }

    public void initializeRooms() {
        room1.id = 1;
        room1.roomName = "Room 1";
        room1.seats = 200;

        room2.id = 2;
        room2.roomName = "Room 2";
        room2.seats = 100;
    }

    public void initializeMovies() {
        noTimeToLie.id = 1;
        noTimeToLie.movieTitle = "No time to lie";
        noTimeToLie.movieDescription = "Nie ";
        noTimeToLie.price = 12.00;

        theAddamsFamily19.id = 2;
        theAddamsFamily19.movieTitle = "The Addams Family 19";
        theAddamsFamily19.price = 9.00;
    }

    public void initializeShowings() {
        noTimeToLie_Room1_Start09102021_2000_End10102021_22205.id = 1;
        noTimeToLie_Room1_Start09102021_2000_End10102021_22205.room = room1;
        noTimeToLie_Room1_Start09102021_2000_End10102021_22205.availableSeats = room1.seats;
        noTimeToLie_Room1_Start09102021_2000_End10102021_22205.movie = noTimeToLie;
//        noTimeToLie_Room1_Start09102021_2000_End10102021_22205.start =
//        noTimeToLie_Room1_Start09102021_2000_End10102021_22205.end =

        theAddamsFamily19_Room1_Start09102021_2230_End10102021_0002.id = 2;
        theAddamsFamily19_Room1_Start09102021_2230_End10102021_0002.room = room1;
        theAddamsFamily19_Room1_Start09102021_2230_End10102021_0002.movie = theAddamsFamily19;
        theAddamsFamily19_Room1_Start09102021_2230_End10102021_0002.availableSeats = room1.seats;
//        theAddamsFamily19_Room1_Start09102021_2230_End10102021_0002.start =
//        theAddamsFamily19_Room1_Start09102021_2230_End10102021_0002.end =

        theAddamsFamily19_Room2_Start09102021_2000_End09102021_2132.id = 3;
        theAddamsFamily19_Room2_Start09102021_2000_End09102021_2132.room = room2;
        theAddamsFamily19_Room2_Start09102021_2000_End09102021_2132.movie = theAddamsFamily19;
        theAddamsFamily19_Room2_Start09102021_2000_End09102021_2132.availableSeats = room2.seats;
//        theAddamsFamily19_Room2_Start09102021_2000_End09102021_2132.start =
//        theAddamsFamily19_Room2_Start09102021_2000_End09102021_2132.end =

        noTimeToLie_Room2_Start09102021_2200_End10102021_0005.id = 4;
        noTimeToLie_Room2_Start09102021_2200_End10102021_0005.room = room2;
        noTimeToLie_Room2_Start09102021_2200_End10102021_0005.movie = noTimeToLie;
        noTimeToLie_Room2_Start09102021_2200_End10102021_0005.availableSeats = room2.seats;
//        noTimeToLie_Room2_Start09102021_2200_End10102021_0005.start =
//        noTimeToLie_Room2_Start09102021_2200_End10102021_0005.end =
    }

    public void initializeUsers() {
        admin.id = 1;
        admin.username = "admin";
        admin.password = "p@ssw0rt";
        admin.role = UserRole.ROLE_ADMIN;

        user.id = 2;
        user.username = "user";
        user.password = "p@ssw0rt";
        user.role = UserRole.ROLE_USER;
    }
}
