package builder;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 24 Oct 2024
 */
public abstract class MealBuilder {
    public abstract void addBiriyani();
    public  abstract  void  addBread();
    public abstract void  addColdDrink();
    public abstract void addCurry();
    public abstract Meal build();
}
