//        Add a main method and inside the method...
//        1) instantiate a Dish object and assign to a variable called dish1
//        2) assign creative values for each of the properties
//        3) test the printSummary() method by invoking it and checking if all instance values are correctly printed

public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();

        dish1.nameOfDish = "miso ramen";
        dish1.costInCents = 1100;
        dish1.wouldRecommend = true;

        dish1.printSummary();
        dish1.printSummary();
        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommendation(dish1);

        System.out.printf("Recommendation after flip: %s", dish1.wouldRecommend);
    }
}