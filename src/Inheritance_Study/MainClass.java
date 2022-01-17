package Inheritance_Study;

public class MainClass {
    public static void main(String[] args) {
        ParentClass []childs = new ParentClass[2];
        childs[0] = new ChildClass1();
        childs[1] = new ChildClass2();
        for(int i =0; i < childs.length ; i++){
            childs[i].makeOverride();
        }
    }
}
