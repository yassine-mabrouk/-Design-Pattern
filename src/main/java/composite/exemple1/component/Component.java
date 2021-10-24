package composite.exemple1.component;

public abstract class Component {
    protected String name ;
    protected int level =0;
    public Component( String name){
        this.name=name;
    }
    public  abstract void operation();
    public String tab (){
        String tab="";
        for (int i=0;i<level;i++){
             tab+="\t";
        }
        return tab;
    }
}
