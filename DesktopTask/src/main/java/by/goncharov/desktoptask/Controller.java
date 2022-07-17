package by.goncharov.desktoptask;

import by.goncharov.desktoptask.entities.Counter;
import by.goncharov.desktoptask.entities.ListUsr;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Locale;
import java.util.ResourceBundle;

public class Controller {

    private ResourceBundle resourceBundle;
    private ListUsr list = new ListUsr();
    @FXML
    private TextField listElement;
    @FXML
    private Label addText;
    @FXML
    private TextArea listAll;
    @FXML
    private Label welcomeText;
    @FXML
    private Label countText;
    @FXML
    private Label classCount;
    @FXML
    private Label counter;
    @FXML
    private Label sizeText;
    @FXML
    private Label sizeLabel;
    @FXML
    private Label listUsrLabel;
    @FXML
    private TextArea changedText;
    @FXML
    private Button selectButton;
    @FXML
    private Button counterButton;
    @FXML
    private Button listusrButton;
    @FXML
    private Button listenerOn;
    @FXML
    private Button listenerOff;
    @FXML
    private Menu menu;

    @FXML
    private MenuItem englishItem;

    @FXML
    private MenuItem russianItem;


    @FXML
    void initialize() {
        loadLang("en");
    }
    @FXML
    private void setRussianLang() {
        loadLang("ru");
    }

    @FXML
    private void setEnglishLang() {
        loadLang("en");
    }

    @FXML
    private void welcome() {
        welcomeText.setText(resourceBundle.getString("welcome.message"));
    }
    @FXML
    private void counter() {
        new Counter();
    classCount.setText(String.valueOf(Counter.getClassCount()));
    }
    @FXML
    private void addList() {
        changedText.setText(list.add(listElement.getText()));
        sizeLabel.setText(String.valueOf(list.getSize()));
        listAll.setText(list.show());
    }

    private void loadLang(String lang) {
        Locale locale = new Locale(lang);
        resourceBundle = ResourceBundle.getBundle("messages", locale);
        welcomeText.setText("");
        initializeElements();
    }
    @FXML
    private void addListener() {
        list.addChangedListener();
    }
    @FXML
    private void removeListener() {
        list.removeChangedListener();
    }
    private void initializeElements() {
        selectButton.setText(resourceBundle.getString("select"));
        menu.setText(resourceBundle.getString("language.change"));
        englishItem.setText(resourceBundle.getString("lang.eng"));
        russianItem.setText(resourceBundle.getString("lang.ru"));
        counterButton.setText(resourceBundle.getString("back"));
        listusrButton.setText(resourceBundle.getString("back"));
        counter.setText(resourceBundle.getString("counter"));
        addText.setText(resourceBundle.getString("count.add"));
        countText.setText(resourceBundle.getString("count"));
        sizeText.setText(resourceBundle.getString("list.size"));
        listUsrLabel.setText(resourceBundle.getString("listusr"));
        listenerOn.setText(resourceBundle.getString("listener.add"));
        listenerOff.setText(resourceBundle.getString("listener.remove"));
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}