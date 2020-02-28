package assignment.beforerefactoring;

public class Americano extends CoffeeTemplate {
    @Override
    public void addIngredients() {
        System.out.println("Add more hot water");
    }

    @Override
    public void finalTouch() {
        System.out.println("Add sugar and cream");
    }
}
