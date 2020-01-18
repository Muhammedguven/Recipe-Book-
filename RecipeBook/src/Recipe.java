import java.util.ArrayList;


public class Recipe {
    private ArrayList<String> Recipe = new ArrayList<String>();
    private ArrayList<String> rName = new ArrayList<String>();

    public void writeRecipeName() {

        System.out.println("THERE ARE " + rName.size() + " RECIPES FOUND.");

        for (int i = 0; i < rName.size();i++) {

            System.out.println((i+1) +"-" + rName.get(i));

        }
    }

    public void addRecipe(String recipeIn, String recipeName) {
        rName.add(recipeName);
        Recipe.add(recipeIn);
        System.out.println("THE RECIPE HAS ADDED...");
    }

    public void editRecipe(String recipeName, int position) {

        Recipe.set(position, recipeName);
        System.out.println("THE RECIPE HAS FOUND...");
    }


    public void removeRecipe(int position) {

        String recipeName = rName.get(position);

        rName.remove(position);
        Recipe.remove(position);

        System.out.println(recipeName + " NAMED RECIPE HAS REMOVED...");

    }
    public void searchRecipe(int position) {
        String recipeInfo = Recipe.get(position);

        if (position >= 0 ){
            System.out.println("RECIPE HAS FOUND...");

            System.out.println(recipeInfo);
        }
        else {
            System.out.println("RECIPE HAS NOT FOUND.");
        }
    }
}
