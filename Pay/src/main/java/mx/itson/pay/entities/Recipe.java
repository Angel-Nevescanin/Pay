/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pay.entities;

import java.util.ArrayList;
import java.util.List;
import mx.itson.pay.enums.Difficulty;

/**
 *
 * @author angel
 */
public class Recipe {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the ingredients
     */
    public List<String> getIngredients() {
        return ingredients;
    }

    /**
     * @param ingredients the ingredients to set
     */
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * @return the directions
     */
    public List<Direction> getDirections() {
        return directions;
    }

    /**
     * @param directions the directions to set
     */
    public void setDirections(List<Direction> directions) {
        this.directions = directions;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * @return the servings
     */
    public int getServings() {
        return servings;
    }

    /**
     * @param servings the servings to set
     */
    public void setServings(int servings) {
        this.servings = servings;
    }

    /**
     * @return the difficulty
     */
    public Difficulty getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
    
    public List<NutritionFact> getNutritionFacts() {
        return nutritionFacts;
    }

    public void setNutritionFacts(List<NutritionFact> nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }
    public Recipe() {
        // Inicializa la lista de NutritionFact
        nutritionFacts = new ArrayList<>();
    }
    
    
    
    private String name;
    private String description;
    private User user;
    private List<String> ingredients;
    private List<Direction> directions;
    private int time;
    private int servings;
    private Difficulty difficulty;
    // Declarar una lista de NutritionFact e inicializarla en el constructor
    private List<NutritionFact> nutritionFacts = new ArrayList<>();
    //private List<NutritionFact> nutritionFacts;

    

    
    
}
