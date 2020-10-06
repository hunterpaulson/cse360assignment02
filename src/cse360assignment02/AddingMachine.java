/** Assignment 1 for CSE360 Fall 2020
* @author Hunter Paulson
*/
package cse360assignment02;

/** Methods will be implemented on the next commit
*/
public class AddingMachine {
  private int total;
  private String history;
  
  /** Main function for testing
  */
  public static void main(String args[]) {

    // initiate the calculator
    AddingMachine myCalculator = new AddingMachine();

    // test add, subtract, getTotal, and toString
    myCalculator.add(4); 
    myCalculator.subtract(2); 
    myCalculator.add(5);
    
    System.out.println("Result: " + myCalculator.getTotal());
    System.out.println("History: " + myCalculator.toString());

    // test clear
    myCalculator.clear();
    System.out.println("--Cleared Memory--");

    System.out.println("Result: " + myCalculator.toString());
    System.out.println("History: " + myCalculator.toString());
  }
  
  /** AddingMachine Constructor
  */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0"; 
  }
  
  /**  Returns the current total
  * @return The total
  */
  public int getTotal () {
    return total;
  }
  
  /** Adds the param to the total variable and puts operation in history
  * @param value the value being added to total
  */
  public void add (int value) {
    total += value;
    history += " + " + String.valueOf(value);
  }
  
  /** subtracts param from the total variable and puts operation in history
  * @param value the value being subtracted from total
  */
  public void subtract (int value) {
    total -= value;
    history += " - " + String.valueOf(value);
  }
  
  /** Prints the sequence of numbers and operators
  * @return A string of the numbers and their operators
  */
  public String toString () {
    return history;
  }
  
  /** Clears the "memory" by setting the total to zero and clearing the history
  */
  public void clear() {
    total = 0;
    history = "0";
  }

}