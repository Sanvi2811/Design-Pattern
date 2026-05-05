package AbstractFactory;

public abstract class Factory {
    abstract Button createButton();
    abstract CheckBox creatCheckBox();

    void install(){
        Button b = createButton();
        CheckBox c = creatCheckBox();
        b.OnbuttonClick();
        c.OncheckboxClick();
    }
}
