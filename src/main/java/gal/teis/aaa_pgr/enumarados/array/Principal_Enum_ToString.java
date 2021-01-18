/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.aaa_pgr.enumarados.array;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_Enum_ToString {

    public enum Color {
        ROJO,
        VERDE,
        AZUL;

        public String toString() {
            return "El color " + super.toString();
        }
    }

    public static void main(String[] args) {
        Color miColor=Color.AZUL;
        System.out.println(miColor);
    }

}
