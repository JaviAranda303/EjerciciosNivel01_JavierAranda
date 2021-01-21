/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel01;

/**
 *
 * @author Javia
 */
public class EjerciciosNivel01 {
    
    //declaro un array de integers para hacer pruebas
    
    int[] listaNumeros = {3, 31, 200, 20, 5, 99} ;
    
    public int maximo(int[] lista){
        int auxiliar = lista[0]; //El maximo es el primer elemento del array
        for (int i=0; i< lista.length; i++){
        if (auxiliar < lista [i]){
            auxiliar = lista[i];
        }
      }
      return auxiliar;  
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         EjerciciosNivel01 ejercicio = new EjerciciosNivel01();
         
         System.out.println("El maximo es: " + ejercicio.maximo(ejercicio.listaNumeros));
    }
   
}
