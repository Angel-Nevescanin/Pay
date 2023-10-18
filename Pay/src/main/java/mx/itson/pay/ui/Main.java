/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.pay.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.pay.entities.Direction;
import mx.itson.pay.entities.NutritionFact;
import mx.itson.pay.entities.Recipe;
import mx.itson.pay.entities.User;
import mx.itson.pay.enums.Difficulty;

/**
 *
 * @author angel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Se crea el usuario
        User user = new User();
        user.setName("Luis Daniel");
        user.setEmail("luis.daniel19@gamil.com");
        user.setPassword("maizorito2023");

        //Se guardan los ingredientes
        List<String> ingredients = new ArrayList<>();
        ingredients.add("1 Cucharada de Jugo MAGGI®");
        ingredients.add("1/2 Taza de concentrado de jamaica");
        ingredients.add("4 Cucharadas de chile con limón, en polvo");

        //Guardar el proceso de preparacion de la receta
        Direction d1 = new Direction();
        d1.setStep(1);
        d1.setDescription("1.Para la salsa, mezcla el Jugo MAGGI®, el concentrado de jamaica y el chile con limón.");

        Direction d2 = new Direction();
        d2.setStep(2);
        d2.setDescription("2.Mezcla la piña con el mango, la bolsa de NATURE'S HEART® Salsa Negra y los camarones. Rellena los pepinos.");

        Direction d3 = new Direction();
        d3.setStep(3);
        d3.setDescription("3.Sirve con la salsa. Ofrece.");

        List<Direction> directions = new ArrayList<>();
        directions.add(d1);
        directions.add(d2);
        directions.add(d3);
        
        //Se listan todos los datos de la receta
        Recipe recipe1 = new Recipe();
        recipe1.setName("Pepinos Locos con Camarones");
        recipe1.setDescription("Una RICA, SALUDABLE y sobre todo ALTA EN FIBRA, es esta RECETA para preparar un SNACK o BOTANA ideal para cocinarla en menos de 15 min.");
        recipe1.setUser(user);
        recipe1.setIngredients(ingredients);
        recipe1.setDirections(directions);
        recipe1.setTime(20);
        recipe1.setServings(4);
        recipe1.setDifficulty(Difficulty.EASY);

        //Lista para los valores energeticos
        List<NutritionFact> nutritionsFact = new ArrayList<>();

        NutritionFact n1 = new NutritionFact();
        n1.setName("Carbohidratos");
        n1.setValue("72.9 g");

        NutritionFact n2 = new NutritionFact();
        n2.setName("Energía");
        n2.setValue("379.9 kcal");

        NutritionFact n3 = new NutritionFact();
        n3.setName("Grasas");
        n3.setValue("2.7 g");

        NutritionFact n4 = new NutritionFact();
        n4.setName("Fibra");
        n4.setValue("2.7 g");

        NutritionFact n5 = new NutritionFact();
        n5.setName("Proteína");
        n5.setValue("18.4 g");

        NutritionFact n6 = new NutritionFact();
        n6.setName("Grasas saturadas");
        n6.setValue("0.4 g");

        NutritionFact n7 = new NutritionFact();
        n7.setName("Sodio");
        n7.setValue("2094.4 mg");

        // Agrega los objetos NutritionFact a la lista
        nutritionsFact.add(n1);
        nutritionsFact.add(n2);
        nutritionsFact.add(n3);
        nutritionsFact.add(n4);
        nutritionsFact.add(n5);
        nutritionsFact.add(n6);
        nutritionsFact.add(n7);


        // Crear una lista para almacenar las recetas
        List<Recipe> recipes = new ArrayList<>();
        // Agregar la receta creada a la lista
        recipes.add(recipe1);

        //Obtener los valores de la primera receta de la lista
        Recipe recipeToShow = recipes.get(0); 

        //Imprimir la Recta como todos sus datos
        System.out.println("Nombre de la receta: " + recipeToShow.getName());
        System.out.println("Descripción: " + recipeToShow.getDescription());
        System.out.println("Dificultad: " + recipeToShow.getDifficulty());

        System.out.println("Ingredientes:");
        for (String ingredient : recipeToShow.getIngredients()) {
            System.out.println("- " + ingredient);
        }

        System.out.println("Pasos de dirección:");
        for (Direction direction : recipeToShow.getDirections()) {
            System.out.println("Paso " + direction.getStep() + ": " + direction.getDescription());
        }

        System.out.println("Información nutricional:");
        for (NutritionFact nutritionFact : nutritionsFact) {
            System.out.println(nutritionFact.getName() + ": " + nutritionFact.getValue());
            System.out.println("Nombre: " + nutritionFact.getName());
            System.out.println("Valor: " + nutritionFact.getValue());
            
        }
    }

}
