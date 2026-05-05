package AbstractFactory;

public class DarkTheme extends Factory{

    @Override
    Button createButton() {
        return new DarkThemeButton();
    }

    @Override
    CheckBox creatCheckBox() {
       return new DarkThemeCheckBox();
    }
    
}
