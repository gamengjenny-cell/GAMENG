/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implement;

/**
 *
 * @author PC
 */
public class Implementing {

    private int[] array; // This is the actual storage space for the numbers.

    private int size; // This keeps track of how many items are currently in the list.

    
    public Implementing (int capacity){
    array = new int [capacity]; // Create an array with the given capacity.

    size = 0; // Start with an empty list.

    }
    
    public void add(int data){
         // If the list is already full, we can't add more.
    if (size == array.length){
        System.out.println("List is full.");
        return;
    }
    array[size] = data; // Place the new number at the next empty spot
    size++; // Increase the count of items.

    }
    
    // Removes and returns the first item in the list (like taking a ticket from the front of a queue).
    public Integer poll(){
    if (size == 0){
    return null;
    }
    int data = array[0];  // Save the first item to return later.
    
// Shift all the remaining items one spot to the left.
    for (int i = 1; i < size; i++){
    array[i - 1] = array[i];
    }
      size--;
    return data;
    }
    
    
    // Just looks at the first item without removing it.
    public Integer peek(){
    if (size == 0){
    return null;
    }
    return array [0];
    }
    
    // Removes and returns the last item in the list (like popping the top item off a stack).
    public Integer pop(){
    if (size == 0){
    return null;
    }
    int data = array [size - 1];
    size --;
    return data;
    }
    
    
    public static void main(String[] args) {
        Implementing list = new Implementing (3);
        list.add(1);
        list.add(2);
        list.add(3);
        
        System.out.println("Peek: "+ list.peek());
        System.out.println("Poll: "+ list.poll());
        System.out.println("Pop: "+ list.pop());
        
    }
    
}
