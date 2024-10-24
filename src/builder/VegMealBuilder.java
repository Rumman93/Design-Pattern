package builder;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 24 Oct 2024
 */
public class VegMealBuilder extends MealBuilder {
    private Meal meal;

    public VegMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void addBiriyani() {
        this.meal.setBriyani("Veg");
    }

    @Override
    public void addBread() {
        this.meal.setBread("Naan");

    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("Sprite");

    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
