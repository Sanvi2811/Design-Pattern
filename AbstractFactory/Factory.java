package AbstractFactory;

public abstract class Factory {
   abstract  Button createButton();
   abstract CheckBox creatCheckBox();

   void install(){
    Button b = createButton();
    b.button();
    CheckBox c = creatCheckBox();
    c.checkbox();
   }
}
