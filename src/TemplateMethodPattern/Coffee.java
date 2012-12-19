package TemplateMethodPattern;

public class Coffee extends CaffeineBeverage {

    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    public void brew() {
        System.out.println("Dripping Coffee Through Filter");
    }
}
