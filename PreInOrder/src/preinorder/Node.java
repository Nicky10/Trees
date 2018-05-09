/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preinorder;

/**
 *
 * @author Estudiante
 */
public class Node {
    
    char value;
    Node right = null;
    Node left = null;

    public Node(char value) {
        this.value = value;
    }
    
    public String toString()
    {
        return this.value + "";
    }
    
    public Node clone()
    {
        return new Node(this.value);
    }
}
