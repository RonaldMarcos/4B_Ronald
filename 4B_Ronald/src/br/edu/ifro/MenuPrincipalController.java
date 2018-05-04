package br.edu.ifro;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MenuPrincipalController implements Initializable {
    
   
    @FXML
    private JFXTextField txt1;
    @FXML
    private JFXTextField txt2;
    @FXML
    private JFXTextField txtResultado;
    @FXML
    private JFXButton btnsoma;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    

    @FXML
    private void soma(ActionEvent event) {
       double n1,n2,Resultado;
       n1=Double.parseDouble(txt1.getText());
       n2=Double.parseDouble(txt2.getText());
       Resultado=n1+n2;
       txtResultado.setText(""+Resultado);
    }

    @FXML
    private void abrirCadstroAluno(ActionEvent event) {
    

try{
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),900,682);
    Stage stage = new Stage();
    stage.setTitle("Cadastrar Aluno");
    stage.setScene(scene);
    stage.show();
}
catch(IOException e){

}
    }

    @FXML
    private void Fechar(ActionEvent event) {
    }
    
}
