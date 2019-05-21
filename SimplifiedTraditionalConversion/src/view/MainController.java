package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import wsclient.Conversion;

public class MainController {

    @FXML
    public TextField inputName;
    @FXML
    public TextField resultName;
    @FXML
    public TextArea input;
    @FXML
    public TextArea result;
    @FXML
    public ImageView changeImg;
    @FXML
    public Button conversionBtn;

    // Web service proxy
    private Conversion conversion;

    public void initialize() {
        Image image = new Image("http://image.littlegreenmouse.cn//ico/distributedComputing/conversion.png");
        changeImg.setImage(image);
    }

    /**
     * Set conversion object
     * @param conversion conversion object
     */
    public void setConversion(Conversion conversion) {
        this.conversion = conversion;
    }

    /**
     * Change conversion mode
     */
    @FXML
    public void changeMode() {
        // Change name
        String inName = inputName.getText();
        String retName = resultName.getText();
        inputName.setText(retName);
        resultName.setText(inName);

        // Change text
        String tmp = result.getText();
        result.setText("");
        input.setText(tmp);
    }

    /**
     * Conversion input string to result and show it
     */
    @FXML
    public void doConversion() {
        String ret = "";

        // Get input text
        String in = input.getText();
        // Get conversion mode
        String mode = inputName.getText();


        //Conversion
        if(mode.equals("简体中文")) {
            ret = conversion.toTraditional(in);
        } else if(mode.equals("繁体中文")) {
            ret = conversion.toSimplified(in);
        }

        // Set result text
        result.setText(ret);
    }
}
