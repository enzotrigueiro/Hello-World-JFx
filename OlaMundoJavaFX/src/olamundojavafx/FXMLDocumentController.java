/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundojavafx;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Enzo Trigueiro
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMessage1;
    private Button btnClick;
    
    private boolean swap;
    
    
    @FXML
    private void btnClick(ActionEvent event) {
        swap = !swap;
        System.out.print("Teste");
        lblMessage1.setText(swap ? "Hello World" : "Maldição do Olá Mundo, clique embaixo:" );  
    }
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
