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
public class MisPrecios {
    enum Precio {
        CARO(100, 1000),
        MEDIO(10, 100),
        BARATO(0, 10);

        private int precioMinimo;
        private int precioMaximo;

        private Precio(int minimo, int maximo) {
            precioMinimo = minimo;
            precioMaximo = maximo;
        }

        public int getPrecioMaximo() {
            return precioMaximo;
        }

        public int getPrecioMinimo() {
            return precioMinimo;
        }
    }
}
