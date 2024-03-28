/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author bjuan
 */
public class Lab_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] uno = new int[10];
        
        int[] uno = new int[10];
        int[] dos = new int[10];
        int[] producto = new int[10];
        int[] resta = new int[10];
        int[] parimpar = new int[10];
        int[][] matriz = new int[5][10];
        
        boolean unoexist = false;
        boolean dosexist = false;
        boolean productoexist = false;
        boolean restaexist = false;
        boolean parimparexist = false;
        
        boolean bandera = true;
        Random aleatorio = new Random();
        Scanner leer = new Scanner(System.in);
        
        while (bandera==true) {
            
            System.out.println("(1) Generar 'uno'"
                    + "\n(2) Generar 'dos'"
                    + "\n(3) Generar 'producto'"
                    + "\n(4) Generar 'resta'"
                    + "\n(5) Generar 'parimpar"
                    + "\n(6) Generar 'matriz'");
            
            int opcion = leer.nextInt();
            
            switch(opcion) {
                
                case 1:

                    for (int i=0;i<10;i++) {
                        uno[i] = aleatorio.nextInt(20)+1;
                        //System.out.println(i);
                        System.out.println("Espacio "+(i+1)+": "+uno[i]);
                    }
                    unoexist=true;
                    
                case 2:
                    
                    int contador = 0;
                    while(dos[9]==0){
                        System.out.println("Ingrese el numero "+(contador+1));
                        int nuevo = leer.nextInt();
                        if (nuevo>5 && nuevo<10){
                            dos[contador] = nuevo;
                            contador++;
                        }
                        if (nuevo<5 || nuevo>10){
                            System.out.println("DATO FUERA DE RANGO");
                        }
                        //System.out.println(dos[contador-1]);
                        //System.out.println(contador);
                        
                    }
                    dosexist=true;
                    
                case 3:

                    if (uno[9]!=0 && dos[9]!=0){
                        for (int i=0;i<10;i++){
                            producto[i] = uno[i]*dos[i];
                            //System.out.println(producto[i]);
                        }
                    }
                    productoexist=true;
                    
                case 4:
                    
                    if (uno[9]!=0 && dos[9]!=0){
                        for (int i=0;i<10;i++){
                            resta[i] = uno[i]-dos[i];
                            //System.out.println(resta[i]);
                        }
                    }
                    restaexist=true;
                    
                case 5:
                    
                    if (uno[9]!=0 && dos[9]!=0){
                        for (int i=0;i<10;i++){
                            if ((uno[i]+dos[i]) % 2 == 0){
                                parimpar[i] = 1;
                            }
                            if ((uno[i]+dos[i]) % 2 != 0){
                                parimpar[i] = 0;
                            }
                            
                            //System.out.println(parimpar[i]);
                        }
                    }
                    parimparexist=true;
                    
                case 6:
                    
                    if (unoexist == true 
                            && dosexist == true 
                            && productoexist == true 
                            && restaexist == true 
                            && parimparexist==true){
                        for (int i=0;i<10;i++){
                            matriz[0][i]=uno[i];
                            //System.out.println(matriz[0][i]);
                        }
                        for (int i=0;i<10;i++){
                            matriz[1][i]=dos[i];
                            //System.out.println(matriz[1][i]);
                        }
                        for (int i=0;i<10;i++){
                            matriz[2][i]=producto[i];
                            //System.out.println(matriz[1][i]);
                        }
                        for (int i=0;i<10;i++){
                            matriz[3][i]=resta[i];
                            //System.out.println(matriz[1][i]);
                        }
                        for (int i=0;i<10;i++){
                            matriz[4][i]=parimpar[i];
                            //System.out.println(matriz[1][i]);
                        }
                    }
                    
                default:
                    
                    System.out.println("OPCION INVALIDA");
                    
            }
        }
    }
}
