/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

/**
 * A class to model pizzas that have cheese and 
 * pepperoni
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 * @author dancye
 */
public class PepperoniPizza extends CheesePizza 
{
    public PepperoniPizza()
    {       
        super();
        super.addTopping("pepperoni");
        
    }
  //prof modify change piza bake method and delete cheezepizza and pepperonion pizza  
//    public void bake(int temp)
//    {
//       System.out.println("backing pepperoni temperature is "+temp+". Time is 12 mins");
//        //do some baking here, code not implemented yet
//        //not necessary for the review
//    }
}
