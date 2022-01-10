package templateMethode.exemple1.template;

public class TemplateImpl2 extends Template{
    @Override
    public int filter1(String str) {
        return str.length()*10;
    }

    @Override
    public int filter2(int level) {
        return level+level;
    }
}
