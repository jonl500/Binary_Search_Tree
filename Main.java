/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw04;

/**
 *
 * @author jonl5
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     // Create an empty tree
        BinarySearchTree bst1 = new BinarySearchTree();
        
        // Insert some values
        bst1.insert("Jerry");
        bst1.insert("Elaine");
        bst1.insert("Ralph");
        bst1.insert("Alice");
        bst1.insert("George");
        bst1.insert("Susan");
        bst1.insert("Norton");
        bst1.insert("Trixie");
        
        // In Order traversal
        System.out.println(bst1.inOrder());
        
        // Remove value(s)
        bst1.remove("Susan");
        //System.out.println("After removing Susan");
        System.out.println(bst1.inOrder());
        
    
        
       // if (bst1.contains("Susan")) {
            //System.out.println("Susan is in the tree");
       // } else {
           // System.out.println("Susan is not in the tree");
       // }
        
        System.out.println(bst1.preOrder());
        System.out.println(bst1.postOrder());

        
    }   
}
