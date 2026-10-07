/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed3s6_proyectointegrador;


public class ED3S6_ProyectoIntegrador {

 
    public static void main(String[] args) {
      


 
        if (args.length == 0) {
            System.out.println("No se recibió ningún argumento.");
            return;
        }

        String valor = args[0].trim();

        if (valor.equalsIgnoreCase("true") || valor.equalsIgnoreCase("false")) {
            System.out.println("\"" + valor + "\" es un booleano");
        } else if (esEntero(valor)) {
            System.out.println("\"" + valor + "\" es un entero"); 
        } else if (esFlotante(valor)) {
            System.out.println("\"" + valor + "\" es un flotante");
        } else {
            System.out.println("\"" + valor + "\" es una cadena");
        }
    }

    static boolean esEntero(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static boolean esFlotante(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
    
    

