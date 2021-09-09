/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.JSType;
/**
 *
 * @author Cetecom
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int caption;
        Scanner teclado = new Scanner(System.in);
        
        //Ejemplo clasificacion
        System.out.println("Por favor escriba edad para ver la clasificacion: ");
        caption = Integer.parseInt(teclado.next()) ;
        
        String clasificacion= "";
        int edad=caption;
        if(edad >0 && edad < 7){
            clasificacion = "TE";
        }else if(edad>=7 && edad<14){
            clasificacion = "TE+7";
        }
        System.out.println("La clasificacion elegida es: "+clasificacion);
                
        //Ejemplo Switch case
        int numero=0;
        System.out.println("Ingrese el curso de forma numerica: ");
        caption = Integer.parseInt(teclado.next()) ;
        numero = caption;
        String curso;
        switch(numero){
            case 1:
                curso = "Primero básico";
                break;
            case 2:
                curso = "Segundo básico";
                break;
            case 3:
                curso = "Tercero básico";
                break;
            default:
                curso = "El curso no existe";
        }
        System.out.println(curso);
        
        
        //Ejemplo try catch
        
        try{
            System.out.println("Ingrese un numero: ");
            caption = Integer.parseInt(teclado.next()) ;
            System.out.println("El numero es: "+caption);
        }catch (Exception err){
                System.out.println("Error, solo ingresar numeros: "+ err);
                }
        
        
        while(!JSType.isNumber(edad)){
            System.out.println("Error, ingrese nuevamente la edad:  ");
            edad =  Integer.parseInt(teclado.next());
        
        }
        
        
        //Ejemplo while
        int longitud;
        System.out.println("Ingrese longitud del arreglo:  ");
        longitud = Integer.parseInt(teclado.next());
        int contador = 0, largo = longitud, mujeres = 0;
        while(contador<largo){
            mujeres += 1; //mujeres = mujeres + 1;
            
            contador +=+1;
        }
        System.out.println("Existen " + mujeres + " mujeres");
        
        
        //Ejemplo Do-While
        
        int opcion;
        int contPollo =0, contCarne = 0, contCazuela = 0, contFideos = 0;
        
        do{
        System.out.println("    Menu");
        System.out.println("................");
        System.out.println("1.- Pollo con Arroz");
        System.out.println("2.- Carne mechada con Puré");
        System.out.println("3.- Cazuela de Ave");
        System.out.println("4.- Fideos con salsa");
        System.out.println("5.- Salir");
        
        opcion = teclado.nextInt();
        
        switch(opcion){
            case 1:
                contPollo ++/*contPollo = contPollo+1*/; break;
            case 2:
                contCarne ++;break;
            case 3:
                contCazuela ++;break;
            case 4:
                contFideos ++; break;
            case 5:
                System.out.println(contPollo+" Pollo con Arroz");
                System.out.println(contCarne+" Carne mechada con puré");
                System.out.println(contCazuela+" Cazuela de Ave");
                System.out.println(contFideos+" Fideos con salsa");
                break;
            default:
                System.out.println("Opción invalida");  
        }
        }while(opcion !=5);
        
        
        //Ejemplo FOR
        
        int cantidadTotal, contadorAdultos = 0, contadorNinos=0, edades=0;
        System.out.println("Ingrese el total de asistentes: ");
        cantidadTotal=teclado.nextInt();
        
        for(int i=1;i<=cantidadTotal;i++){
            System.out.println("Ingrese su edad: ");
            edades = teclado.nextInt();
            
            if(edades>12){
                contadorAdultos++;
            }else{
                contadorNinos++;
            }
        }

        System.out.println("La cantidad de adultos es: "+contadorAdultos);
        System.out.println("La cantidad de niños es: "+contadorNinos);

        //Ejemplos de String
        String nombreEj = "Ejemplo de String";
        int longg;
        char posicion;
        longg = nombreEj.length();
        posicion = nombreEj.charAt(4);
        if(nombreEj.equals("Ejemplo de Long")){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");  
        }
        
        if(nombreEj.equalsIgnoreCase("ejemplo de string")){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");  
        }
        
        if(nombreEj.startsWith("E") && nombreEj.endsWith("g")){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");  
        }
        //Reemplazar
        nombreEj.replace("Ejemplo","A");
        
        //Todo minuscula o todo mayuscula
        nombreEj.toLowerCase();
        nombreEj.toUpperCase();

        //Devuelve lo que está escrito entre la posicion 8 y 11 del arreglo
        nombreEj.substring(8,11);
        
        //Devuelve el arreglo sin espacios iniciales ni finales
        nombreEj.trim();
        
        
        
    }
    
    
}
