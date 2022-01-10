package templateMethode.exemple1;

import templateMethode.exemple1.template.Template;
import templateMethode.exemple1.template.TemplateImpl1;
import templateMethode.exemple1.template.TemplateImpl2;

public class Demo {
    public static void main(String[] args) {
        Template template= new TemplateImpl1();
        System.out.println(template.operationTemplate("tets"));
        Template template2= new TemplateImpl2();
        System.out.println(template2.operationTemplate("tets"));
    }
}
