/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auElemDuplicados;

import java.util.Scanner;

/**
 *
 * @author Felix Castro
 */
public class arElmDuplic {
    public static void main(String[] args) {
        //leemos por teclado y mostramos por consola
        Scanner entrada = new Scanner(System.in);
        
        //definimos variables y vectores
        String [] nombres;
        int numNombre;
        String res;
        
        //titulo
        System.out.println("MOSTRAR NOMBRES REPETIDOS");
        
        //salto de linea
        System.out.println();
        
        //ingresar cuantos nombres se van a registrar
        System.out.println("Digite cuantos nombres requiere registrar");
        numNombre = entrada.nextInt();
        
        //inicializamos el vector nombre
        nombres = new String[numNombre];
        
        //salto de linea
        System.out.println();
        
        //llenamos el vector
        System.out.println("Registro de usuarios");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i+1)+".Digite un nombre");
            nombres[i] = entrada.next();
        }
        
        //salto de linea
        System.out.println();
        
        //imprimimos el vector
        System.out.println("Los usuarios son :");
        for (int j = 0; j < nombres.length; j++) {
            System.out.println(nombres[j]);
        }
        
        //inicializamos la variable
        res = "";
        
        //salto de linea
        System.out.println();
        
        //imprimir los repetidos
        for (int k = 0; k < nombres.length - 1; k++) {
            int l = k + 1;
            while (l < nombres.length && !nombres[k].equals(nombres[l])) {                
                l++;
            }
            if (l < nombres.length) {
                res += nombres[k] + " duplicado en: " + k + " y " + l + "\n";
            }
        }
        System.out.println(res);
    }
}
