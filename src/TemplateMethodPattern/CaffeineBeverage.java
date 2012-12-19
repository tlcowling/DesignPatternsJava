package TemplateMethodPattern;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    void boilWater() {
        System.out.println("boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
