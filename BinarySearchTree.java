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
public class BinarySearchTree {
  //Variable Island
    TreeNode root;
  
//Construction zone  (sets an empty tree)
public BinarySearchTree(){
    root = null;
    
}  

//insert method which is void and accepts a string 
public void insert(String a){
    if (root == null) {
            // first node
            root = new TreeNode(a);
        } else {
            root.insert(a);
        }
}
public boolean contains(String a){
  // check for an empty tree
        if (root == null) {
            // empty
            return false;
        } else {
            return root.contains(a);
        }   
}
 public void remove(String a) {
        if (root != null) {
            root = root.remove(a);
        }
    }
 // Traversals
    public String inOrder() {
        // check if root is null
        if (root != null) {
           return root.inOrder("");
        }else{
            return null;
        }
    }
    public String preOrder() {
        // check if root is null
        if (root != null) {
           return root.preOrder("");
        }else{
            return null;
        }
    }
    public String postOrder() {
        // check if root is null
        if (root != null) {
           return root.postOrder("");
        }else{
            return null;
        }
    }

}
