package equipo.dinamita;

import java.io.IOException;
import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PrimaryController {

    @FXML
    private Button btnsalir;

    @FXML
    private Button primaryButton;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private TextField txtusuario;

    String darUsuario() {
        return txtusuario.getText();
    }

    String darContraseña() {
        return txtpassword.getText();
    }

    @FXML
    void confirmacion() throws IOException {
        String condicional = "admin";
        String clave = "123";
        if (darUsuario().equals(condicional) && darContraseña().equals(clave)) {
            switchToSecondary();//abrir pantalla 2
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Los campos son erroneós o están vacios");
            alert.showAndWait();
        }

    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void botonSalir() { //boton salir de pantalla 1
        System.exit(0);
    }
}
