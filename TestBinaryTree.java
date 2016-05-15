//U10416020
package binarytree;

import static java.lang.Math.abs;
import java.security.SecureRandom;

public class TestBinaryTree {
    //Main method
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Integer number[] = new Integer[20];
        
        //Add number from 1 to 20
        for(int i = 0;i<20;i++){
            number[i] = i+1;                        
        }
        
        //Use random to swap the number
        for(int i = 0;i<20;i++){
            int temp = abs(random.nextInt() )% 10;
            int change = number[temp];
            number[temp] = number[i];
            number[i] = change;
        }
        
        //Output the numbers before binary sort
        System.out.println("Before binary sort: ");
        for(int i =0;i<20;i++){
            System.out.print(number[i]+" ");
        }
        
        //Create a BinaryTree
        BinaryTree test = new BinaryTree(number);
        
        //Call the method to output the numbers after binary sort
        System.out.println("\nAfter binary sort:\n" + test.toString());
        
    }
}
