package templateMethode.exemple1.template;

public  abstract class Template {
     final int  level=4;
    public double operationTemplate(String str){
        double result=0;
        for(int i=0;i<str.length();i++){
            result = i* filter1(str);
            result=filter2(level);
        }
         return result;
    }
    public  abstract int filter1(String str);
    public  abstract int filter2(int level);

}
