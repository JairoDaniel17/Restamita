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
        String usuario = "admin";
        String clave = "123";
        String m = "";
        boolean bandera = true;
        if (darUsuario().equals(usuario)) {
            if (darContraseña().equals(clave)) {
                switchToSecondary();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("La contraseña es incorrecta, vuelva insertarlo");
                alert.showAndWait();
            }
        } else if (darUsuario().equals(m) & darContraseña().equals(m)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("El usuario y la contraseña estan vacios");
            alert.showAndWait();
        } else if (darUsuario().equals(m)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("El usuario esta vacio,inserte un usuario");
            alert.showAndWait();
        } else if (darContraseña().equals(m)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("La contrseña esta vacia, inserte una contraseña");
            alert.showAndWait();
        } else {
            if (darUsuario().equals(usuario)) {
            } else {
                if (darContraseña().equals(clave)) {
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("El usuario y la contraseña son incorrectos, vuelva ingresarlos");
                    alert.showAndWait();
                    bandera = false;
                }
            }
            if (bandera == false) {
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("El nombre del usuario es incorrecto, vuelva a insertarlo");
                alert.showAndWait();
            }
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
