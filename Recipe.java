import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
/**
 * Write a description of class Recipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recipe extends RecipeBook{
    private String title;
    private int servings;
    private List<String> ingredients;
    private List<String> steps;
    private Set<String> tags;
    private double ratingSum;
    private int ratingCount;
}

public abstract class Recipe {
    public static final Set<String> Predetermined_TAGS= 
    new HashSet<>(Arrays.asList("Vegan" , "Paestries", "Sea food"));
    
    
public Recipe() {
this.title = "Untitled Recipe";
this.servings = 1;
this.ingredients = new ArrayList<>();
this.steps = new ArrayList<>();
this.tags = new HashSet<>();
this.ratingSum = 0.0;
this.ratingCount = 0;

}

        
    

