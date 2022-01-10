package templateMethode.exemple1.template;

public class TemplateImpl1 extends Template{
    @Override
    public int filter1(String str) {
        return str.length();
    }

    @Override
    public int filter2(int level) {
        return level*level;
    }
}
