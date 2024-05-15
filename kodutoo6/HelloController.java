package org.example.kodutoo6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class HelloController implements Initializable {

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
    private Button button10;
    @FXML
    private Button button11;
    @FXML
    private Button button12;
    @FXML
    private Button button13;
    @FXML
    private Button button14;
    @FXML
    private Button button15;
    @FXML
    private Button button16;                // 4x4 tic tac toe tag vajab 16 nuppu
    @FXML
    private Text winnerchickendinner;       // võitja text dispaly
    private int kelleKord = 0;              // et saaks kasutaja ja arvuti vahel mangida

    ArrayList<Button> dabuttons;            // nuppude array
    ArrayList<Integer> numbrid;             // tulevikus kasulik AI nupu valimisel

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dabuttons = new ArrayList<>(Arrays.asList(
                button1, button2, button3, button4,
                button5, button6, button7, button8,
                button9, button10, button11, button12,
                button13, button14, button15, button16));   // nupud arraylisti
        dabuttons.forEach(button ->{
            algusnupp(button);
            button.setFocusTraversable(false);              // peseb nupud puhtaks
        });
        numbrid = new ArrayList<>();                        // AI-l oleks väike array oma nuppudeks
        for (int i = 0; i< 16; i++) {
            numbrid.add(i);
        }
    }
    @FXML
    void restart(ActionEvent event) {
        dabuttons.forEach(this::resetnupp);         // üldine func et restartida mängunuppe
        winnerchickendinner.setText("TIC-TAC-TOE-TAG"); // vahetab alumise teksti ka tagasi
    }

    public void resetnupp(Button nupp) {
        nupp.setDisable(false);         // func et restart() restardiks koik nupud
        nupp.setText("");               // koikidele nuppudele teeb
    }
    public void disablenupud(Button nupp) {
        nupp.setDisable(true);              // lõpus vajalik et kõik nupud disableida (keegi võitis, pole vaja rohkem mängida)
    }
    private void algusnupp(Button nupp) {
        nupp.setOnMouseClicked(mouseEvent ->{   // kui hiireklõps mingile nupule
            kelleKaikOn(nupp);                  // esiteks determine kelle kord
            if (kelleKord == 1) {               // arvuti kord
                arvutiKord(dabuttons);          // func AI jaoks
                kelleKord = 0;                  // sea see tagasi kasutaja jaoks
                kasVoitKaes();
            }
            nupp.setDisable(true);              // disablei nupp further vajutamast
            kasVoitKaes();});                   // kontrolli kas read matchivad
    }

    public void kelleKaikOn(Button button) {
        if (kelleKord % 2 == 0) {               // kui paaris arv ss kasutaja kord
            button.setText("X");                // muuda nupupealne kiri X
            button.setDisable(true);
            kelleKord = 1;                      // muuda arvuti korraks järgmine
            System.out.println("kasutajal käidud, numbriseis: " + numbrid + "   suurus: "+numbrid.size());
        } else {
            //arvutiKord(button, dabuttons);                 // kui on juba 1 siis on arvuti kord
            //kelleKord = 0;                      // tagasi kasutaja korda
        }
    }
    public void arvutiKord(ArrayList<Button> nupud) {
        Random rand = new Random();                 // taktikaline on random kasutada
        int uusTaktKaik = rand.nextInt(dabuttons.size());  // numbrite valiku seas valib
        if (nupud.get(uusTaktKaik).getText().matches("")) {   // kui tühi ss tee asju
            nupud.get(uusTaktKaik).setText("0");                    // arvuti on 0
            nupud.get(uusTaktKaik).setDisable(true);
        } else {
            System.out.println("miskipärast polnud võimalik käia.");
        }
    }
    /*
        1  2  3  4
        5  6  7  8          GRID
        9  10 11 12         FOR
        13 14 15 16         GAME
     */
    public boolean onHalvatud(Button button) {
        if (button.isDisabled()) {
            return true;
        } else {
            return false;
        }
    }
    public void kasVoitKaes() {
        AtomicInteger removableNupp = new AtomicInteger();      // idk intellij soovitas
        dabuttons.forEach(button -> {                           // teoorias iga nupu kohta kontrolli kas juba disabled
            if (onHalvatud(button)) {                           // kui on ss removeda numbrite arrayst
                dabuttons.remove(button);
            }
            removableNupp.getAndIncrement();
        });
        removableNupp.set(0);
        System.out.println("numbritejada peale arvutikäiku: " + numbrid + "     suurus: " + numbrid.size());
        for (int i = 0; i < 10; i++) {
            String voit = switch (i) {
                case 0 -> button1.getText() + button2.getText() + button3.getText() + button4.getText();    // XXXX
                case 1 -> button5.getText() + button6.getText() + button7.getText() + button8.getText();    // XXXX
                case 2 -> button9.getText() + button10.getText() + button11.getText() + button12.getText(); // XXXX
                case 3 -> button13.getText() + button14.getText() + button15.getText() + button16.getText();// XXXX
                case 4 -> button1.getText() + button5.getText() + button9.getText() + button13.getText(); // horisont XXXX
                case 5 -> button2.getText() + button6.getText() + button10.getText() + button14.getText();// horisont XXXX
                case 6 -> button3.getText() + button7.getText() + button11.getText() + button15.getText();// horisont XXXX
                case 7 -> button4.getText() + button8.getText() + button12.getText() + button16.getText();// horisont XXXX
                case 8 -> button1.getText() + button6.getText() + button11.getText() + button16.getText();// diagonal XXXX
                case 9 -> button13.getText() + button10.getText() + button7.getText() + button4.getText();// diagonal XXXX
                default -> null;
            };
            if (voit.equals("XXXX")) {
                winnerchickendinner.setText("Võitsid reisi Palmisaarele");  // võitja tekst
                dabuttons.forEach(this::disablenupud);          // disable all other buttons
            } else if(voit.equals("0000")) {
                winnerchickendinner.setText("ja me pappi ei saagi");   // voitja tekst
                dabuttons.forEach(this::disablenupud);          // disable all butons
            }
        }
    }
}