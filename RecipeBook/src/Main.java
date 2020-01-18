import java.util.Scanner;

import static java.lang.System.out;


public class Main {
    private static Recipe recipeObject = new Recipe();

    private static Scanner scanner = new Scanner(System.in);

    public static void Menu() {
        out.println("******MENU*******");
        out.println(" 1-Add Recipe");
        out.println(" 2-Edit Recipe");
        out.println(" 3-Remove Recipe");
        out.println(" 4-Search Recipe");
        out.println(" 5-Recipe List ");
        out.println(" 6-Quit ");
        out.println("*****************");

    }

    public static void showRecipeName() {

        recipeObject.writeRecipeName();
    }

    public static void addRecipe(){

        out.println("PLEASE WRITE RECIPE NAME:");
        String recipeName = scanner.nextLine();
        out.println("PLEASE WRITE RECIPE:");
        String recipeIn = scanner.nextLine();

        recipeObject.addRecipe(recipeIn, recipeName);

    }
    public static void editRecipe() {
        showRecipeName();
        out.println("WRITE THE RECIPE NUMBER WHICH WOULD YOU LIKE TO EDIT...");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.println("THE RECIPE HAS FOUND. YO CAN CHANGE THE RECIPE...");
        String recipeIn = scanner.nextLine();
        recipeObject.editRecipe( recipeIn,position-1 );

    }

    public static void removeRecipe() {
        showRecipeName();
        out.println("THE NUMBER OF RECIPE, WOULD YOU LIKE TO REMOVE(1,2,3....)");

        int position = scanner.nextInt();

        recipeObject.removeRecipe(position-1);


    }
    public static void searchRecipe() {
        showRecipeName();
        out.println("THE NUMBER OF RECIPE WHICH WOULD YOU LIKE TO SEARCH:");
        int position = scanner.nextInt();

        recipeObject.searchRecipe(position-1);


    }
    public static void main(String[] args) {

        out.println(" WELCOME TO RECIPE BOOK");



        boolean exit = false;

        int choose;

        while(!exit) {
            Menu();
            out.println("PLEASE CHOOSE AN OPTION:");


            choose = scanner.nextInt();

            scanner.nextLine();

            switch(choose) {

                case 1:
                    addRecipe();
                    break;
                case 2:
                    editRecipe();
                    break;
                case 3:
                    removeRecipe();
                    break;
                case 4:
                    searchRecipe();
                    break;
                case 5:
                    showRecipeName();
                    break;
                case 6:
                    exit = true;
                    out.println("PROGRAM HAS FINISHED...");
                    break;



            }


        }


    }

}
