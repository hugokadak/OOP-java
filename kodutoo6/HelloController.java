package org.example.kodutoo6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Text winnerchickendinner;

    private int kelleKord = 0;

    ArrayList<Button> dabuttons;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dabuttons = new ArrayList<>(Arrays.asList(button1, button2, button3, button4, button5, button6, button7, button8, button9));
        dabuttons.forEach(button ->{algusnupp(button); button.setFocusTraversable(false);});

    }
    @FXML
    void restart(ActionEvent event) {
        dabuttons.forEach(this::resetnupp);
        winnerchickendinner.setText("TIC-TAC-TOE");
    }

    public void resetnupp(Button nupp) {
        nupp.setDisable(false);
        nupp.setText("");
    }

    private void algusnupp(Button nupp) {
        nupp.setOnMouseClicked(mouseEvent -> { kelleKaikOn(nupp); nupp.setDisable(true); kasVoitKaes();});
    }

    public void kelleKaikOn(Button button) {
        if (kelleKord % 2 == 0) {

        }
    }

    public void kasVoitKaes() {
        for (int i = 0; i < 8; i++) {
            String voit = switch (i) {
                case 0 -> button1.getText() + button2.getText() + button3.getText();
                case 1 -> button4.getText() + button5.getText() + button6.getText();
                case 2 -> button7.getText() + button8.getText() + button9.getText();
                case 3 -> button1.getText() + button4.getText() + button7.getText();
                case 4 -> button2.getText() + button5.getText() + button8.getText();
                case 5 -> button3.getText() + button6.getText() + button9.getText();
                case 6 -> button2.getText() + button5.getText() + button9.getText();
                case 7 -> button7.getText() + button5.getText() + button3.getText();
                default -> null;
            };
            if (voit.equals("XXX")) {
                winnerchickendinner.setText("mängija võitis");
            } else if(voit.equals("000")) {
                winnerchickendinner.setText("arvuti võitis");
            }
        }
    }
}