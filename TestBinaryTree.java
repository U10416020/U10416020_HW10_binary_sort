//U10416020
package binarytree;

import static java.lang.Math.abs;
import java.security.SecureRandom;

public class TestBinaryTree {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int number[] = new int[20];
        for(int i = 0;i<20;i++){
            number[i] = i+1;                        
        }
        for(int i = 0;i<20;i++){
            int temp = abs(random.nextInt() )% 10;
            int change = number[temp];
            number[temp] = number[i];
            number[i] = change;
        }
        
        System.out.println("Before binary tree: ");
        for(int i =0;i<20;i++){
            System.out.println(number[i]+"");
        }
        
        BinaryTree test = new BinaryTree(number);
    }
}
