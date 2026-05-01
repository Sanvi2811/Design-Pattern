package AbstractFactory;

public class WindowFactory extends Factory {

    @Override
    Button createButton() {
       return new WindowsButton();
    }

    @Override
    CheckBox creatCheckBox() {
        return new WindowCheckBox();
    }
    
}
