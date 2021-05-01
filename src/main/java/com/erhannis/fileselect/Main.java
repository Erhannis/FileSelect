/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erhannis.fileselect;

/**
 *
 * @author erhannis
 */
public class Main {
    public static enum Enm {
        A, B;
    }
    
    public static void main(String[] args) {
        Enm e = Enm.A;
        if (e instanceof Enum) {
            System.out.println("e instanceof Enum");
        }
        Class c = Enm.class;
        Selection<String, Enm> s;
        System.out.println("");
        //c.getDeclaredMethod("values").invoke(null)
    }
}
