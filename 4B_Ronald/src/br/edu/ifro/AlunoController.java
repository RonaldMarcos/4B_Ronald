package br.edu.ifro;

import br.edu.ifro.Modelo.aluno;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlunoController implements Initializable {

    @FXML
    private JFXTextField txtNome;
    @FXML
    private JFXButton btnSalvar;
    @FXML
    private JFXButton btnCancelar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    

    @FXML
    private void Salvar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetosistemaDS");
            EntityManager em = emf.createEntityManager();

            aluno c = new aluno();
            c.setNome(txtNome.getText());
            
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
    }

    @FXML
    private void Fechar(ActionEvent event) {
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }
    
}
