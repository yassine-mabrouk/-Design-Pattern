package composite.exemple1.component;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{
    private List<Component> components = new ArrayList<>();
    public Folder(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(tab()+"Folder"+name);
        for(Component composant:components) {
            composant.operation();
        }
    }

    public Component addComponent(Component component){
        component.level=super.level+1;
        this.components.add(component);
        return component;
    }
    public Component removeComponent(Component component){
        this.components.add(component);
        return component;
    }
}
