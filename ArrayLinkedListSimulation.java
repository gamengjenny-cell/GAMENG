/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementing;

import java.util.*;


// 1. creating the class
public class ArrayLinkedListSimulation {
    private int [] array; //array to store elements
    private int size; //keep track of the current number of elements
    
    
    
    
    public ArrayLinkedListSimulation(int capacity){
        array = new int [capacity];
        size = 0;
    
    
    }
    
    
//Implement the Methods
//add(int value)
    public void add (int value){
        if (size == array.length){
            //creates a larger array and copy the elements
            int[] newArray = new int [array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length); //copies
            array = newArray;
        }
        array[size] = value; //add element at the end of the array
        size++; //increase the size of the array
    }
    
    
    
    //removes the first element from the array and returns its value
    //if the array is empty, it returns -1
    public int poll(){
        if (size == 0){
            return -1;
        }
        int removed = array[0];
        System.arraycopy(array, 1, array, 0, size - 1);
        size--;
        return removed;
    }


    
    //
    public int peek(){
        if (size == 0){
            return -1;
        }
        return array[0];
    }
    
    
    
    
    public  int pop(){
    if (size == 0){
    return -1;
    }
    int removed = array [size -1];
    size --;
    return removed;
    }
    
    
    
    
    public void printArray(){
        System.out.println("Array: ");
        for (int i = 0; i < size; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println();
    } 
   
    


//this is the main method
    public static void main (String[]args){
ArrayLinkedListSimulation list = new ArrayLinkedListSimulation(5);
Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 5 elements: ");
        for (int i = 0; i < 5; i++){
            while(true){
            System.out.print("Enter element" + (i + 1) + ": " );
            
            if (sc.hasNextInt()){
            int value = sc.nextInt();
            list.add(value);
            list.printArray();
            break;
        }else{
                System.out.println("Invalid input NIGGA, try again using only numbers.");
                sc.next();
            }
            }
        }
        System.out.println("Peek: "+ list.peek());
         System.out.println("Poll: "+ list.poll());
         list.printArray();
         System.out.println("Poll: "+ list.poll());
         list.printArray();
         
         System.out.println("Peek: "+ list.peek());
         list.printArray();
         System.out.println("Pop: "+ list.pop());
         list.printArray();
         System.out.println("Pop: "+ list.pop());
         list.printArray();
         System.out.println("Peek: "+ list.peek());
         list.printArray();
    }
}
