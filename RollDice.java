/*
* Zach Black
*
*
* Sean Batzel and Andrew helped me
*
*
* Explained in depth the properties of the program, 
* design of it, and how/best way to start.
*
*/

/*
* NOTE:  Only place code in the class constructor and methods:
* RollDice, set, getSum, roll, results
*/
import java.util.*;

public class RollDice
{
   
   
   
   /*
   * Attribute: An array to hold 
   */
   private Integer[] stats;
   
   
   /*
   * Attribute to hold an instance of a pair of dice
   */
   private Dice Pair;
   
   /*
   * Constructor:  Initialize the object
   * Specifically initialze the stats and Pair attributes
   */
   public RollDice(){

   }
   
   /*
   * Perform the action of rolling a the pair of dice
   */
   public void set()
   {
      Pair = new Dice();
      Pair.roll();
   }
   
   /*
   * Return the sum of the pair of dice
   */
   public Integer getSum()
   {
      for (int i = 0 ; i < stats.length;)
   }
   
   /*
   * Rolls the object's pair of dice the prescribed number
   * of times and records the results in the stats array
   */
   public void roll(Integer Num)
   {

   }      
   
 }
   
   /*
   * return the stats array.
   */
   public Integer[] results(){

   }   

}