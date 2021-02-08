/*
 * This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package gal.teis.aaa_pgr.enumarados.array;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_Enum {

    public enum Dias {
        DOMINGO, LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO};

    public static void main(String[] args) {
        comparar();
    }

    static void verAlguno() {
        //Almacenar el valor de un enum en una variable
        Dias actual = Dias.LUNES;
        Dias festivo = Dias.DOMINGO;

        //Mostrar el valor de una vble enum
        System.out.println("Hoy es " + actual);
        System.out.println("El festivo es " + festivo);
    }

    static void verTodos() {
        //Los tipos enum pueden ser convertidos a arrays Dias.values()
        System.out.println("Los días de la semana son: ");
        for (int i = 1; i < Dias.values().length; i++) {
            System.out.print(Dias.values()[i] + " ");
        }
        System.out.println();
        System.out.println(Dias.valueOf("Jueves"));
    }
    
    static void comparar(){
        
        //Podríamos haber obtenido los valores de las variables de otros procesos
        Dias citaMedico=Dias.MARTES;
        Dias diaTrabajo=Dias.MARTES;
        
        //Puedo comparar con equal()
        if (diaTrabajo.equals(citaMedico)){
            System.out.println("Son iguales");
        }
        //Puedo comparar con ==
        if (diaTrabajo==citaMedico){
            System.out.println("Son iguales");
        }
     
    }
            

    static void usarSwitch() {
        Scanner miScanner = new Scanner(System.in);
        Dias dia;
        byte diaB=0;
        String diaS;
        boolean correcto;

        /*Control de introdución de datos
        Pedir el dato hasta que se introduzca un nº del rango requerido
        */
        do {
            correcto=true;
            System.out.println("Introduce el dia de la semana (0:Domingo..6: Sábado) ");
            diaS = miScanner.nextLine();
            try {
                diaB = Byte.valueOf(diaS);
                if (diaB < 0 || diaB > 6) {
                    //Si el dato no está en el rango correcto
                    correcto = false;
                }
            } catch (Exception e) {
                //Si el dato no es del tipo Byte
                correcto = false;
            }
            if (!correcto) {
                System.out.println("Valor no correcto. Vuelva a intentarlo");
            }

        } while (!correcto);

        /*Dar valor al enum a partir del índice del array
        que se correcponde con el nº del día introducido
        */
        dia = Dias.values()[diaB];
        //Según el valor del enum mostrar información por pantalla
        switch (dia) {
            case DOMINGO:
                System.out.println("Festivo");
                break;
            case SABADO:
                System.out.println("Festivo");
                break;
            default:
                System.out.println("Dia");
                break;
        }
    }

}
