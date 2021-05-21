/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw04;

import java.util.Random;

/**
 *
 * @author jonl5
 */
public class TreeNode {
   String v;
   TreeNode left = null;
   TreeNode right = null;
   //construction zone
   public TreeNode(String value){
       v = value;
   }
   
   //method madness
   public void insert(String a){
        if (a.compareTo(v) <= 0) {
            // goes in left subtree
            if (left == null) {
                // No left child -- create new node
                left = new TreeNode(a);
            } else {
                // Delegate to left child
                left.insert(a);
            }
        } else {
            // goes in right subtree        
            if (right == null) {
                // No right child -- create new node
                right = new TreeNode(a);
            } else {
                // Delegate to right child
                right.insert(a);
            
        }
            }
   }
            public boolean contains(String a) {
        if (a.contains(v)) {
            // Value found in the current node
            return true;
        } else if (a.compareTo(v) <= 0) {
            // Value could be in left subtree
            if (left == null) {
                // No left child
                return false;
            } else {
                // Delegate to left child
                return left.contains(a);
            }
        } else {
            // Value could be in the right subtree
            if (right == null) {

                // No right child
                return false;
            } else {

                // Delegate to right child
                return right.contains(a);
            }
        }
    }
             public TreeNode remove(String a) {
        // check the subtrees
        if (a.compareTo(v) <= -1) {
            // Value must be in the left subtree
            if (left != null) {
                // ask left child to remove value
                left = left.remove(a);
            }
        } else if (a.compareTo(v) >= 1) {
            // Value must be in the right subtree
            if (right != null) {
                // ask right child to remove value
                right = right.remove(a);
            }
        } else if(a.compareTo(v)== 0){ 
            // Current node getting removed -- OUCH!
            if (left == null && right == null) {
                // Case 1 : no children
                return null;
            } else if (left != null && right == null) {
                // Case 2 - promote left child
                return left;
            } else if (left == null && right != null) {
                // Case 2 - promote right child
                return right;
            } else {
                // Case 3 -- Node with two children
                Random r = new Random();  // Random value generator

                //  (1) Identify a new vlaue, then (2) remove the duplicate
                if (r.nextBoolean()) {
                    // get maximum value from left
                    v = left.rightMost();
                    // remove duplicate from the left
                    left = left.remove(v);
                } else {
                    // get minimum value from right
                    v = right.leftMost();
                    // remove duplicate from the right
                    right = right.remove(a);
                }

            }
        }
        // Return current reference (may have a new value)        
        return this;
    }
             String leftMost() {
        // returns the left most value
        if (left == null) {
            // no more left children
            return v;
        } else {
            return left.leftMost();
        }
    }
             String rightMost() {
        // returns the right most value
        if (right == null) {
            // no more right children
            return v;
        } else {
            return right.rightMost();
        }
    }
             // Traversals
    public String inOrder(String a) {
        // Go left
        if (left != null) {
           a = left.inOrder(a);
        }

        // Visit
        a += "[" + v + "]";

        // Go right
        if (right != null) {
           a = right.inOrder(a);
        }
        return a;
    }
public String preOrder(String a){
    //this is represents the root of the sub-tree
    a += "[" + v + "]";
    
    //Goleft
     if (left != null) {
           a = left.preOrder(a);
        }
// Go right
        if (right != null) {
           a = right.preOrder(a);
        }
        //by returning string a we can use it to add to our tree string (return passes value to parent)
        return a;
}

public String postOrder(String a){
    //Goleft
     if (left != null) {
           a = left.postOrder(a);
        }
     // Go right
        if (right != null) {
           a = right.postOrder(a);
        }
         a += "[" + v + "]";
         
         return a;
}
             
    }

   
   

