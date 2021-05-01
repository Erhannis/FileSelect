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
public enum EnumYNU {
    Y, N, U;

    @Override
    public String toString() {
        switch (this) {
            case Y:
                return "background-color: #88FF88";
            case N:
                return "background-color: #FF8888";
            case U:
                return "background-color: #8888FF";
        }
        return "";
    }
}
