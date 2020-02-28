package assignment.beforerefactoring;

public abstract class CoffeeTemplate {


    public void prepareCoffee() {
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    public abstract void addIngredients();

    public abstract void finalTouch();

}
