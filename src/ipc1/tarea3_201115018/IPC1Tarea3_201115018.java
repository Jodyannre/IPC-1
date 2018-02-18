/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.tarea3_201115018;
import java.util.Scanner;

/**
 *
 * @author Jo
 */
public class IPC1Tarea3_201115018 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    boolean menu1Inicio = true; //Variable utilizada para mostrar el incio principal.
    boolean menu1Inicio2 = true; //Variable utilizada para mostrar el inicio de error.
    Scanner menu1Ingreso1 = new Scanner(System.in);
    int menu1Ingreso2; //Variable para guardar el número ingresado por el usuario.
    String nombre1 = ""; //Variables para guardar el valor de un ingreso de usuario.
    String nombre2 = ""; 
    String nombre3 = ""; 
    String nombre4 = ""; 
    String nombre5 = "";  
    while (menu1Inicio == true){ //Ciclo que mostrará el menú principal hasta que el usuario presione 5.
         
        if (menu1Inicio2 == true){
            System.out.println("-----------------------------------"); //Separadores.
            System.out.println("Menú principal"); // Título del menú principal
            System.out.println("-----------------------------------");
            System.out.println("1. Usuarios\n2. Contador de dígitos\n3. Tres números de mayor a menor\n4. Calcular promedio\n5. Salir"); //Opciones del menú principal.
            System.out.println("-----------------------------------");
            System.out.println("Ingrese un número"); //Instrucciones.
            System.out.println("-----------------------------------");
            menu1Inicio2 = false; //Negación de la variable para que la próxima vuelta oculte el mensaje de bienbenida al menú.
            menu1Ingreso2 = menu1Ingreso1.nextInt(); //Ingreso de un número.
        } else {
            System.out.println("-----------------------------------");
            System.out.println("Incorrecto, ingrese otro número");
            System.out.println("-----------------------------------");
            menu1Ingreso2 = menu1Ingreso1.nextInt();
            menu1Inicio2 = false; // Niega que se muestre de nuevo el mensaje de bienvenida principal del menú.
        }
        if (menu1Ingreso2 > 5){ //Sentencia if que hará que al usuario se le solicite otro número dentro del rango.
            menu1Inicio = true; 
        } else if (menu1Ingreso2 == 5) { //Sentencia if que hará que el while princiipal finalice cambiando su condición a false.
            menu1Inicio = false;
        } else {
            switch (menu1Ingreso2){ //Opciones para el menú principal.
                case 1:
                        boolean menu2Inicio = true; //Variable de validación para el menú 1.1
                        boolean menu2Inicio2 = true; //Variable de validación para el menú 1.1                         
                        Scanner menu2Ingreso1 = new Scanner(System.in); //Scanner para ingreso de un dato.
                        int menu2Ingreso2; //Variable que guardará el dato ingresado.
                        Scanner menu2Nombre = new Scanner(System.in); //Variable que solicitara el ingreso de nombres en el meno ingresar usuarios.
                        boolean validador = false; //Variable que validará la información de usuarios ingresados, si es falso no hay usuario ingresados y muestra un mensaje, si es verdadero muestra a los usuarios ingresados.
                        while (menu2Inicio == true){ //Mientras sea verdadero mostrará el menú 1.1
                            if (menu2Inicio2 == true){ //Mientras sea verdadero mostrará el menú de bienvenida 1.1
                                System.out.println("-----------------------------------"); //Separadores
                                System.out.println("Menú usuarios"); //Título
                                System.out.println("-----------------------------------");
                                System.out.println("1. Ingresar usuarios\n2. Mostrar usuarios ascendente\n3. Mostrar Usuarios descendente\n4. Menú Principal"); //Opciones
                                System.out.println("-----------------------------------");
                                System.out.println("Ingrese un número"); //Instrucciones
                                System.out.println("-----------------------------------");
                                menu2Inicio2 = false; // Mientras sea falso evitara que el usuario vea de nuevo la pantalla de bienvenida al menú 1.1
                                menu2Ingreso2 = menu2Ingreso1.nextInt(); //Solicita el ingreso de un dato para proseguir.
                            } else {
                                System.out.println("-----------------------------------");
                                System.out.println("Incorrecto, ingrese otro número"); 
                                System.out.println("-----------------------------------");
                                menu2Ingreso2 = menu2Ingreso1.nextInt();
                                menu2Inicio2 = false; // Mientras sea falso el usuario no regresará al menú principal, hasta que ingrese un valor correcto.
                            }
                            if (menu2Ingreso2 > 4){ // Si es mayor a 4 lanzará un error y volvera a la sección de "Incorrecto, ingrese otro número".
                                menu2Inicio = true; // El while volverá a ejecutarse.
                                menu2Inicio2 = false; // Mientras sea falso el usuario regresará a la opción de "Incorrecto".
                            } else {
                                ;
                            }
                            if (menu2Ingreso2 == 4){ // Si es 4 menu2Inicio niega la ejecución del while y regresará al menú principal.    
                                menu2Inicio = false;
                                menu1Inicio2 = true; // Activa de nuevo el while del menú principal.
                            } else {
                                ;
                            }
                            if (menu2Ingreso2 == 1){
                                validador = true; // El validador cambia a verdadero, el programa ya sabe que el usuario ingreso datos.
                                menu2Inicio = true; // Cuando termine el ingreso de datos el while volverá a ejecutarse.
                                menu2Inicio2 = true; //Mostrará el menú inicial.
                                        System.out.println("-----------------------------------");
                                        System.out.println("Ingresar usuarios"); //Instrucciones.
                                        System.out.println("-----------------------------------");
                                        System.out.println("Ingrese primer usuario"); //Instrucciones.
                                        System.out.println("-----------------------------------");
                                        nombre1 = menu2Nombre.nextLine(); //Guarda el dato del primer usuario.
                                        System.out.println("-----------------------------------");
                                        System.out.println("Ingrese segundo usuario"); //Instrucciones.
                                        System.out.println("-----------------------------------");                                            
                                        do { //Solilcita el ingreso del 2do nombre antes de verificar si el dato ya existe.
                                        nombre2 = menu2Nombre.nextLine();
                                            if (nombre2.equals(nombre1)){ // Si es igual al único ingreso registrado se mostrará un error.
                                              System.out.println("-----------------------------------");  
                                              System.out.println("Error, usuario repetido, ingrese otro nombre");
                                              System.out.println("-----------------------------------"); 
                                            } else {
                                                break; //Sin segunda opción, fin.
                                            }
                                        } while (nombre2.equals(nombre1)); // Mientras sean iguales el usuario deberá ingresar otro valor.
                                        System.out.println("-----------------------------------");
                                        System.out.println("Ingrese tercer usuario");
                                        System.out.println("-----------------------------------");                                         
                                        do {
                                        nombre3 = menu2Nombre.nextLine();
                                            if (nombre3.equals(nombre1) || nombre3.equals(nombre2)){ //Misma instrucción que en primer caso, cada paso comparará, con un o, los valores ingresados con los solicitados.
                                              System.out.println("-----------------------------------");  
                                              System.out.println("Error, usuario repetido, ingrese otro nombre");
                                              System.out.println("-----------------------------------"); 
                                            } else {
                                                break;
                                            }
                                        } while (nombre3.equals(nombre1) || nombre3.equals(nombre2));                                        
                                        System.out.println("-----------------------------------");
                                        System.out.println("Ingrese cuarto usuario");
                                        System.out.println("-----------------------------------");
                                        do {
                                        nombre4 = menu2Nombre.nextLine();
                                            if (nombre4.equals(nombre1) || nombre4.equals(nombre2) || nombre4.equals(nombre3)){
                                              System.out.println("-----------------------------------");  
                                              System.out.println("Error, usuario repetido, ingrese otro nombre");
                                              System.out.println("-----------------------------------"); 
                                            } else {
                                                break;
                                            }
                                        } while (nombre4.equals(nombre1) || nombre4.equals(nombre2) || nombre4.equals(nombre3)); 
                                        System.out.println("-----------------------------------");
                                        System.out.println("Ingrese quinto usuario");
                                        System.out.println("-----------------------------------");                                       
                                        do {
                                        nombre5 = menu2Nombre.nextLine();
                                            if (nombre5.equals(nombre1) || nombre5.equals(nombre2) || nombre5.equals(nombre3) || nombre5.equals(nombre4)){
                                              System.out.println("-----------------------------------");  
                                              System.out.println("Error, usuario repetido, ingrese otro nombre");
                                              System.out.println("-----------------------------------"); 
                                            } else {
                                                break;
                                            }
                                        } while (nombre5.equals(nombre1) || nombre5.equals(nombre2) || nombre5.equals(nombre3) || nombre5.equals(nombre4));
                                        menu2Inicio2 = true; // Activa el menú 1.1.
                            } else{
                                ;
                            }
                            if (menu2Ingreso2 == 2){ // Opción 2 del menú activada.
                                menu2Inicio = true; //Se activa el menú 1.1
                                Scanner decisionyn = new Scanner (System.in); //Escaner que servirá para pedirle al usuario que ingrese un "si" o un "no", para salir del programa o ir a otra sección.
                                int decision; //Variable que guardará la decisión de salir o no del programa.
                                System.out.println("-----------------------------------");                                
                                System.out.println("Mostrar usuarios ascendentes");
                                System.out.println("-----------------------------------"); 
                                if (validador == true){ //Sí el validador es verdadero mostrará los datos ingresados por el usuario.
                                  System.out.println(nombre5+"\n"+nombre4+"\n"+nombre3+"\n"+nombre2+"\n"+nombre1); //Muestra en orden ascendente los nombres de los usuario ingresados.
                                  System.out.println("-----------------------------------");
                                } else {
                                    System.out.println("No hay usuarios registrados"); //Sí el validador es falso, el usuario no ingreso datos.
                                }                             
                                menu2Inicio2 = true;
                                System.out.println("-----------------------------------");
                                System.out.println("¿Desea regresar al menú principal o salir del programa?");
                                System.out.println("-----------------------------------");
                                System.out.println("Pulse 1 para regresar al menú.\nPulse 0 para salir del programa.");
                                System.out.println("-----------------------------------");
                                decision = decisionyn.nextInt(); //Solicitud de decisión.
                                if (decision == 1){ //Si es 1 se desactiva el while del menú 1.1 y se activa del while del menú principal, mostrando de nuevo el menú principal.
                                    menu2Inicio = false;
                                    menu1Inicio2 = true;
                                } else if (decision == 0) { //Termina el while del menú 1.1 y del menú principal, finalizando el programa.
                                    menu2Inicio = false;
                                    menu1Inicio2 = true;
                                    menu1Inicio = false;
                                }
                            } else{
                                ;
                            }
                            if (menu2Ingreso2 == 3){
                                menu2Inicio = true; //Activa el menú 1.1
                                Scanner decisionyn = new Scanner (System.in); //Escaner que servirá para pedirle al usuario que ingrese un "si" o un "no", para salir del programa o ir a otra sección.
                                int decision; //Variable que guardará la decisión de salir o no del programa.
                                System.out.println("-----------------------------------");
                                System.out.println("Mostrar usuarios descendentes");
                                System.out.println("-----------------------------------");
                                if (validador == true){ //Validador que determina si el usuario ingreso datos.
                                  System.out.println(nombre5+"\n"+nombre4+"\n"+nombre3+"\n"+nombre2+"\n"+nombre1); 
                                  System.out.println("-----------------------------------");
                                } else {
                                    System.out.println("No hay usuarios registrados");
                                }  
                                menu2Inicio2 = true;
                                System.out.println("-----------------------------------");
                                System.out.println("¿Desea regresar al menú principal o salir del programa?");
                                System.out.println("-----------------------------------");
                                System.out.println("Pulse 1 para regresar al menú.\nPulse 0 para salir del programa.");
                                System.out.println("-----------------------------------");
                                decision = decisionyn.nextInt();
                                if (decision == 1){
                                    menu2Inicio = false;
                                    menu1Inicio2 = true;
                                } else if (decision == 0) {
                                    menu2Inicio = false;
                                    menu1Inicio2 = true;
                                    menu1Inicio = false;
                                }
                            } else{
                                ; //No es necesario.
                            }                            
                        }         
                    break; //Finalización de ciclo.
                case 2:
                    System.out.println("Menú 2");
                    menu1Inicio2 = true;
                    break;
                case 3:
                    System.out.println("Menú 3");
                    menu1Inicio2 = true;                    
                    break;
                case 4:
                    System.out.println("Menú 4");
                    menu1Inicio2 = true;
                    break;
            }
        }
                      
        
    }

    }
    
}
