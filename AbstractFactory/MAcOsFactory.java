package AbstractFactory;

public class MAcOsFactory extends Factory {

    @Override
    Button createButton() {
       return new MacOsButton();
    }

    @Override
    CheckBox creatCheckBox() {
       return new MacOsCheckbox();
    }
    
}
