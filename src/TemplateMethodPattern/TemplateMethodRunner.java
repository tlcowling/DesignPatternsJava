package TemplateMethodPattern;

public class TemplateMethodRunner {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareRecipe();

        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();

        CaffeineBeverage caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();

        CaffeineBeverage caffeineBeverage1 = new Coffee();
        caffeineBeverage1.prepareRecipe();

        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking Tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking Coffee...");
        coffeeHook.prepareRecipe();
    }
}
