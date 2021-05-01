/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erhannis.fileselect;

import java.util.Random;

/**
 *
 * @author erhannis
 */
public class Selection<T, E extends Enum> {
    private final Random RANDOM = new Random();
    public final T val;
    public final String name;
    public E state;

    public Selection(T val, String name) {
        this.val = val;
        this.name = name;
    }

    public Selection(T val, String name, E state) {
        this(val, name);
        this.state = state;
    }
    
    @Override
    public String toString() {
        //String color = String.format("%06x", RANDOM.nextInt(0x1000000));
        return "<html><p style='width: 100%; " + state + "'>" + name + "</p></html>";
    }
}
