package composite.exemple1;

import composite.exemple1.component.File;
import composite.exemple1.component.Folder;

public class Demo {
    public static void main(String[] args) {
        Folder root =new Folder("Design pattern");
        Folder folder1=(Folder) root.addComponent(new Folder("Comportement"));
        Folder folder2=(Folder)root.addComponent(new Folder("Structure"));
        Folder folder3=(Folder) root.addComponent(new Folder("Creation"));
        folder1.addComponent(new File("Strategy"));
        folder1.addComponent(new File("Observer"));
        folder2.addComponent(new File("Decorator"));
        folder2.addComponent(new File("Adapter"));
        folder3.addComponent(new File("Singleton"));
        folder3.addComponent(new File("Builder"));
        root.operation();
    }
}
