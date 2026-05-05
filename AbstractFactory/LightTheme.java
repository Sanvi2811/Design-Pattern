package AbstractFactory;

public class LightTheme  extends Factory{

    @Override
    Button createButton() {
       return new LightThemeButton();
    }

    @Override
    CheckBox creatCheckBox() {
       return new LightThemeCheckBox();
    }
    
}
