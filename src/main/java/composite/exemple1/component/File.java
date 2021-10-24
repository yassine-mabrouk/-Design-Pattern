package composite.exemple1.component;

public class File extends Component {

    public File(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(tab()+"File"+name);

    }
}
