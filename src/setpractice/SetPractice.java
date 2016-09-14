/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setpractice;

/**
 *This is a simple project to practice Set function including
 * HashSet, TreeSet and LinkedSet
 * @author Shaojie
 */
import java.util.*; //I guess set function must be in java.util package..whatever
public class SetPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] a = {1,2,3,6,5,4,7,8,9}; //I will fisrt created a collection
       HashSet<Integer> set = new HashSet<Integer>(); // Then I created HashSet and refer it as set
        // Now I'm gonna put items from a[] to my set using add function
        //Watch out the cool enhanced for loop I'm using below
       for(int x:a) {
       set.add(x);
       }
      //What's the result? Try it.
      System.out.println(set); //The order has changed
      System.out.println(set.size()); // Show the size of the set
      // Now I'll test iterator method
      Iterator iterator = set.iterator();
     //check value
       while(iterator.hasNext()){
       System.out.println("The value from set.iterator is: "+iterator.next());
       }
    //other metheds tests
    System.out.println("The set contains 9: "+set.contains(9) );
    System.out.println("The set contains 14: "+set.contains(14) );
    
    Set<Integer> temp = new HashSet<Integer>();
    temp.add(2);temp.add(3);temp.add(5);
    System.out.println("The set contains 2,3 and 5: "+set.containsAll(temp));
   
    //boolean isremoved = set.remove(2);
    //System.out.println(isremoved+" "+set);
    set.remove(2); System.out.println(set); //remove method returns a boolean value
    
      set.clear(); System.out.println(set); // Try clear() method
     
    }
    
}
