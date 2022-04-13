/*
 * jjx
 */
package pizzashop;

import java.util.ArrayList;

/**
 * A class that represents a basic pizza
 * @author dancye
 */
public class Pizza 
{
   
    public int bakeTemp = 100;//temp to bake at
    private ArrayList<String> ingredients = new ArrayList();
    public void bake(int temp){
        bakeTemp = temp;
        
    }
    
    /**
     *  A method to add toppings to the ingredients
     * list
     * @param topping 
     */
    public void addTopping(String topping)
    {
        ingredients.add(topping);
        System.out.println("ingredients inlcude "+ingredients); //add byjjx
//        System.out.println("backing temperature is "+bakeTemp+". Baking time is 10 mins");//add byjjx
    }

//    public ArrayList<String> getIngredients() {
//        return ingredients;
//    }
    
}
