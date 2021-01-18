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
public class Principal_Enum_Clase {

    

    public static void main(String[] args) {
        MisPrecios.Precio precio = MisPrecios.Precio.CARO;
        System.out.println("un precio " + precio + " esta entre "
                + precio.getPrecioMaximo() + " y "
                + precio.getPrecioMaximo());
    }

}
