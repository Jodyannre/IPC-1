package ipc1.tarea3_201115018;
import java.util.Scanner;

/**
 *
 * @author Joel Estuardo Rodríguez Santos
 */
public class IPC1Tarea3_201115018 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    boolean menu1Inicio = true; //Variable utilizada para mostrar el incio principal.
    boolean menu1Inicio2 = true; //Variable utilizada para mostrar el inicio de error.
    boolean validador = false; //Variable que validará la información de usuarios ingresados, si es falso no hay usuario ingresados y muestra un mensaje, si es verdadero muestra a los usuarios ingresados. 
    boolean validador2 = false; // Variable que validará la información de números ingresados en el menú 2.
    boolean validador3 = false; //Variable que validará la información de números ingresados en el menú 3.
    boolean menu4Inicio2 = false; // Variable utilizada para mostrar mensaje de error de ingreso de un número en el menú 2.2
    int menu3Ingreso2 = 0; //Variable que guardará el número ingresado en el menú 2.
    int contar = 0; // Variable que guarda la cantidad de dígitos del número ingresado.
    Scanner menu1Ingreso1 = new Scanner(System.in);
    int decision3 = 0; //Variable que se utilizará para que el usuario decida si quiere salir del menú 3.
    int menu1Ingreso2; //Variable para guardar el número ingresado por el usuario.
    String nombre1 = ""; //Variables para guardar el valor de un ingreso de usuario.
    String nombre2 = ""; 
    String nombre3 = ""; 
    String nombre4 = ""; 
    String nombre5 = "";  
    while (menu1Inicio == true){ //Ciclo que mostrará el menú principal hasta que el usuario presione 5.
        if (menu1Inicio2 == true){
            System.out.println("-----------------------------------"); //Separadores.
            System.out.println("--------- Menú principal ----------"); // Título del menú principal
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
                        while (menu2Inicio == true){ //Mientras sea verdadero mostrará el menú 1.1
                            if (menu2Inicio2 == true){ //Mientras sea verdadero mostrará el menú de bienvenida 1.1
                                System.out.println("-----------------------------------"); //Separadores
                                System.out.println("---------- Menú usuarios ----------"); //Título
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
                                        System.out.println("-------- Ingresar usuarios --------"); //Instrucciones.
                                        System.out.println("-----------------------------------");
                                        System.out.println("Ingrese primer usuario"); //Instrucciones.
                                        System.out.println("-----------------------------------");
                                        nombre1 = menu2Nombre.nextLine(); //Guarda el dato del primer usuario.
                                        System.out.println("-----------------------------------");
                                        System.out.println("Ingrese segundo usuario"); //Instrucciones.
                                        System.out.println("-----------------------------------");                                            
                                        do { //Solilcita el ingreso del 2do nombre antes de verificar si el dato ya existe.
                                        nombre2 = menu2Nombre.nextLine();
                                            if (nombre2.equalsIgnoreCase(nombre1)){ // Si es igual al único ingreso registrado se mostrará un error.
                                              System.out.println("-----------------------------------");  
                                              System.out.println("Error, usuario repetido, ingrese otro nombre");
                                              System.out.println("-----------------------------------"); 
                                            } else {
                                                break; //Sin segunda opción, fin.
                                            }
                                        } while (nombre2.equalsIgnoreCase(nombre1)); // Mientras sean iguales el usuario deberá ingresar otro valor.
                                        System.out.println("-----------------------------------");
                                        System.out.println("Ingrese tercer usuario");
                                        System.out.println("-----------------------------------");                                         
                                        do {
                                        nombre3 = menu2Nombre.nextLine();
                                            if (nombre3.equalsIgnoreCase(nombre1) || nombre3.equalsIgnoreCase(nombre2)){ //Misma instrucción que en primer caso, cada paso comparará, con un o, los valores ingresados con los solicitados.
                                              System.out.println("-----------------------------------");  
                                              System.out.println("Error, usuario repetido, ingrese otro nombre");
                                              System.out.println("-----------------------------------"); 
                                            } else {
                                                break;
                                            }
                                        } while (nombre3.equalsIgnoreCase(nombre1) || nombre3.equalsIgnoreCase(nombre2));  // Lo mismo que los anteriores usuarios.                                      
                                        System.out.println("-----------------------------------");
                                        System.out.println("Ingrese cuarto usuario");
                                        System.out.println("-----------------------------------");
                                        do {
                                        nombre4 = menu2Nombre.nextLine();
                                            if (nombre4.equalsIgnoreCase(nombre1) || nombre4.equalsIgnoreCase(nombre2) || nombre4.equalsIgnoreCase(nombre3)){
                                              System.out.println("-----------------------------------");  
                                              System.out.println("Error, usuario repetido, ingrese otro nombre");
                                              System.out.println("-----------------------------------"); 
                                            } else {
                                                break;
                                            }
                                        } while (nombre4.equalsIgnoreCase(nombre1) || nombre4.equalsIgnoreCase(nombre2) || nombre4.equalsIgnoreCase(nombre3)); 
                                        System.out.println("-----------------------------------");
                                        System.out.println("Ingrese quinto usuario");
                                        System.out.println("-----------------------------------");                                       
                                        do {
                                        nombre5 = menu2Nombre.nextLine();
                                            if (nombre5.equalsIgnoreCase(nombre1) || nombre5.equalsIgnoreCase(nombre2) || nombre5.equalsIgnoreCase(nombre3) || nombre5.equalsIgnoreCase(nombre4)){
                                              System.out.println("-----------------------------------");  
                                              System.out.println("Error, usuario repetido, ingrese otro nombre");
                                              System.out.println("-----------------------------------"); 
                                            } else {
                                                break;
                                            }
                                        } while (nombre5.equalsIgnoreCase(nombre1) || nombre5.equalsIgnoreCase(nombre2) || nombre5.equalsIgnoreCase(nombre3) || nombre5.equalsIgnoreCase(nombre4));
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
                                  System.out.println(nombre1+"\n"+nombre2+"\n"+nombre3+"\n"+nombre4+"\n"+nombre5); //Muestra en orden ascendente los nombres de los usuario ingresados.
                                  System.out.println("-----------------------------------");
                                } else {
                                    System.out.println("No hay usuarios registrados"); //Sí el validador es falso, el usuario no ingreso datos.
                                System.out.println("-----------------------------------");                                    
                                }                             
                                menu2Inicio2 = true;
                                System.out.println("¿Desea regresar al menú anterior o salir del programa?"); //Opción para regresar al menú anterior o finalizar el programa.
                                System.out.println("-----------------------------------");
                                System.out.println("Pulse 1 para salir del programa.\nPulse 2 para regresar al menú.");
                                System.out.println("-----------------------------------");
                                decision = decisionyn.nextInt(); //Solicitud de decisión.
                                        while (decision > 0 && decision != -1 ){ // El while aceptará cualquier valor pero el switch solo tiene programado aceptar 2 valores, todos los demás enteros mayores a 0 serán tomados como incorrectos.
                                            switch (decision){
                                                case 1:
                                                    menu2Inicio = false;
                                                    menu1Inicio2 = true;
                                                    menu1Inicio = false;
                                                    decision = -1;    //Variable que termina la ejecución del programa.                                                
                                                    break;
                                                case 2:
                                                    menu2Inicio = true;
                                                    decision = -1; //Cancela el while pero regresa al menú anterior.
                                                    break;
                                                default:
                                                    System.out.println("-----------------------------------");                                                   
                                                    System.out.println("Error, ingrese un número válido");
                                                    System.out.println("-----------------------------------");                                                    
                                                    decision = decisionyn.nextInt(); //Niega todo valor diferente de 1 y 2, y mayor a 0.
                                            }                                           
                                        }   
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
                                System.out.println("-----------------------------------");                                    
                                }  
                                menu2Inicio2 = true;
                                System.out.println("¿Desea regresar al menú anterior o salir del programa?");
                                System.out.println("-----------------------------------");
                                System.out.println("Pulse 1 para salir del programa.\nPulse 2 para regresar al menú.");
                                System.out.println("-----------------------------------");
                                decision = decisionyn.nextInt();                             
                                        while (decision > 0 && decision != -1 ){
                                            switch (decision){
                                                case 1:
                                                    menu2Inicio = false;
                                                    menu1Inicio2 = true;
                                                    menu1Inicio = false;
                                                    decision = -1;                                                    
                                                    break;
                                                case 2:                                                   
                                                    menu2Inicio = true;
                                                    decision = -1;
                                                    break;
                                                default:
                                                    System.out.println("-----------------------------------");                                                   
                                                    System.out.println("Error, ingrese un número válido");
                                                    System.out.println("-----------------------------------");                                                    
                                                    decision = decisionyn.nextInt();
                                            }                                           
                                        }                            
                            }                            
                        }         
                    break; //Finalización de ciclo.
                case 2:
                        boolean menu3Inicio = true; //Variable de validación para el menú 2.1
                        boolean menu3Inicio2 = true; //Variable de validación para el menú 2.1                         
                        Scanner menu3Ingreso1 = new Scanner(System.in); //Scanner para ingreso de un dato.
                        Scanner menu3Numero = new Scanner(System.in); //Variable que solicitara el ingreso de nombres en el meno ingresar usuarios.
                        Scanner decision3i = new Scanner(System.in); // Escanea la decisión de salir o permanecer en el menú.
                        while (menu3Inicio == true){ //Mientras sea verdadero mostrará el menú 2.1
                            if (menu3Inicio2 == true){ //Mientras sea verdadero mostrará el menú de bienvenida 2.1
                                System.out.println("-----------------------------------"); //Separadores
                                System.out.println("------- Contador de dígitos -------"); //Título
                                System.out.println("-----------------------------------");
                                System.out.println("1. Ingresar número\n2. Mostrar número de dígitos\n3. Menú principal"); //Opciones
                                System.out.println("-----------------------------------");
                                System.out.println("Ingrese un número"); //Instrucciones
                                System.out.println("-----------------------------------");
                                menu3Inicio2 = false; // Mientras sea falso evitara que el usuario vea de nuevo la pantalla de bienvenida al menú 2.1
                                menu3Ingreso2 = menu3Ingreso1.nextInt(); //Solicita el ingreso de un dato para proseguir.
                            } else {
                                System.out.println("-----------------------------------");
                                System.out.println("Incorrecto, ingrese otro número"); 
                                System.out.println("-----------------------------------");
                                menu3Ingreso2 = menu3Ingreso1.nextInt();
                                menu3Inicio2 = false; // Mientras sea falso el usuario no regresará al menú principal, hasta que ingrese un valor correcto.
                            }
                            if (menu3Ingreso2 > 3){ // Si es mayor a 3 lanzará un error y volvera a la sección de "Incorrecto, ingrese otro número".
                                menu3Inicio = true; // El while volverá a ejecutarse.
                                menu3Inicio2 = false; // Mientras sea falso el usuario regresará a la opción de "Incorrecto".
                            } else { 
                                ;
                            }  
                            if (menu3Ingreso2 == 3){ // Si es 4 menu2Inicio niega la ejecución del while y regresará al menú principal.    
                                menu3Inicio = false;
                                menu3Inicio2 = true; // Activa de nuevo el while del menú principal.
                            } else {
                                ;
                            }
                            switch (menu3Ingreso2){
                                case 1: 
                                        System.out.println("-----------------------------------");
                                        System.out.println("Ingrese un número mayor a 0 y menor a 100000"); //Instrucciones.
                                        System.out.println("-----------------------------------");
                                        
                                        do { //Solilcita el ingreso del 2do nombre antes de verificar si el dato ya existe.                                        
                                            menu3Ingreso2 = menu3Ingreso1.nextInt();
                                            if (menu3Ingreso2 > 100000){ // Si es igual al único ingreso registrado se mostrará un error.
                                              System.out.println("-----------------------------------");  
                                              System.out.println("Error, número mayor a 100000\nIngrese otro número");
                                              System.out.println("-----------------------------------");                                              
                                            } else {
                                                ; //Sin segunda opción, fin.
                                            }
                                        } while (menu3Ingreso2 > 100000); // Mientras sean iguales el usuario deberá ingresar otro valor.
                                        if (menu3Ingreso2 == 0){
                                            contar = 1;
                                        } else{
                                            ;
                                        }                                          
                                        while (menu3Ingreso2 != 0){ // Mientras el dígito sea diferente de 0 lo dividira dentro de 10 restando una cifra en cada ciclo.
                                            menu3Ingreso2 = menu3Ingreso2/10;
                                            contar = contar + 1; //Contador de dígitos
                                        } 
                                      
                                        menu3Inicio2 = true; // Activa pantalla inicial del menú 3.
                                        menu4Inicio2 = true; // Activa pantalla inicial del menú 2.2                                         
                                        break;
                                case 2:
                                        if (menu4Inicio2 == true){
                                        System.out.println("-----------------------------------");
                                        System.out.println("La cantidad de dígitos del número es"); //Instrucciones.
                                        System.out.println("-----------------------------------");    
                                        System.out.println(+contar); // Puclica la variable con el número de dígitos.
                                        contar = 0; //Reinicio de variable.
                                        System.out.println("-----------------------------------");
                                        System.out.println("¿Desea regresar al menú anterior o salir del programa?");
                                        System.out.println("-----------------------------------");
                                        System.out.println("Pulse 1 para salir del programa.\nPulse 2 para regresar al menú.");
                                        System.out.println("-----------------------------------");
                                         decision3 = decision3i.nextInt(); //Solicitud de decisión.
                                        } else {
                                        System.out.println("-----------------------------------");                                             
                                        System.out.println("Aún no ha ingresado ningún valor");                                             
                                        }
                                        menu4Inicio2 = false; //Deshabilida la publicación del número de dígitos anterior, es neceario ingrear uno nuevo.                                        
                                        menu3Inicio2 = true; // Habilita la pantalla inicial del menú 3.
                                        break;    
                            }
                                        while (decision3 > 0 && decision3 != -1 ){ //While determinado con 2 condicionales.
                                            switch (decision3){
                                                case 1:
                                                    menu3Inicio = false;
                                                    menu1Inicio2 = true;
                                                    menu1Inicio = false;
                                                    decision3 = -1;    //Cancela el while actual y el también el while principal, por lo que termina la ejecución del programa.                                              
                                                    break;
                                                case 2:
                                                    menu3Inicio = true;
                                                    menu3Inicio2 = true;
                                                    decision3 = -1; //
                                                    break;
                                                default:
                                                    System.out.println("-----------------------------------");                                                   
                                                    System.out.println("Error, ingrese un número válido");
                                                    System.out.println("-----------------------------------");                                                    
                                                    decision3 = decision3i.nextInt();
                                            }                                           
                                        }                             
                        }              
                    menu1Inicio2 = true;
                    break;             
                case 3:
                        boolean menu4Inicio = true; //Variable de validación para el menú 2.1
                        boolean menu5Inicio2 = true; //Variable de validación para el menú 2.1                         
                        Scanner menu4Ingreso1 = new Scanner(System.in); //Scanner para ingreso de un dato.
                        Scanner menu4Numero = new Scanner(System.in); //Variable que solicitara el ingreso de nombres en el meno ingresar usuarios.
                        int menu4Ingreso2; //Variable que guardara los ingresos del scanner.
                        int numero1; //Variables que guardaran los números ingresados en el scanner.
                        int numero2;
                        int numero3;
                        int mayor = 0; //Variables que guardaran los valores mayores, medios y menores, determinados por comparaciones.
                        int medio = 0;
                        int menor = 0;
                        while (menu4Inicio == true){ //Mientras sea verdadero mostrará el menú 2.1
                            if (menu5Inicio2 == true){ //Mientras sea verdadero mostrará el menú de bienvenida 2.1
                                System.out.println("-----------------------------------"); //Separadores
                                System.out.println("-- Tres número de mayor a menor  --"); //Título
                                System.out.println("-----------------------------------");
                                System.out.println("1. Ingresar números\n2. Mostrar ordenados\n3. Menú principal"); //Opciones
                                System.out.println("-----------------------------------");
                                System.out.println("Ingrese un número"); //Instrucciones
                                System.out.println("-----------------------------------");
                                menu5Inicio2 = false; // Mientras sea falso evitara que el usuario vea de nuevo la pantalla de bienvenida al menú 2.1
                                menu4Ingreso2 = menu4Ingreso1.nextInt(); //Solicita el ingreso de un dato para proseguir.
                            } else {
                                System.out.println("-----------------------------------");
                                System.out.println("Incorrecto, ingrese otro número"); 
                                System.out.println("-----------------------------------");
                                menu4Ingreso2 = menu4Ingreso1.nextInt();
                                menu4Inicio2 = false; // Mientras sea falso el usuario no regresará al menú principal, hasta que ingrese un valor correcto.
                            }
                            if (menu4Ingreso2 > 3){ // Si es mayor a 3 lanzará un error y volvera a la sección de "Incorrecto, ingrese otro número".
                                menu4Inicio = true; // El while volverá a ejecutarse.
                                menu5Inicio2 = false; // Mientras sea falso el usuario regresará a la opción de "Incorrecto".
                            } else { 
                                ;
                            }  
                            if (menu4Ingreso2 == 3){ // Si es 4 menu2Inicio niega la ejecución del while y regresará al menú principal.    
                                menu4Inicio = false;
                                menu1Inicio2 = true; // Activa de nuevo el while del menú principal.
                            } else {
                                ;
                            }
                            switch (menu4Ingreso2){
                                case 1: 
                                        System.out.println("-----------------------------------");
                                        System.out.println("-------- Ingrese 3 número  --------"); //Instrucciones.
                                        System.out.println("-----------------------------------");
                                        System.out.println("Ingrese primer número"); //Instrucciones.
                                        System.out.println("-----------------------------------");
                                        numero1 = menu4Numero.nextInt(); //Guarda el dato del primer usuario.
                                        System.out.println("-----------------------------------");
                                        System.out.println("Ingrese segundo número"); //Instrucciones.
                                        System.out.println("-----------------------------------");
                                        numero2 = menu4Numero.nextInt(); //Guarda el dato del primer usuario.
                                        System.out.println("-----------------------------------");
                                        System.out.println("Ingrese tercer número"); //Instrucciones.
                                        System.out.println("-----------------------------------");
                                        numero3 = menu4Numero.nextInt(); //Guarda el dato del primer usuario.
                                        if (numero1 > numero2){ //Sentencias if para definar el número mayor, medio y menor.
                                            if (numero1 > numero3){
                                                mayor = numero1;
                                            } else {
                                                mayor = numero3;
                                                medio = numero1;
                                                menor = numero2;
                                            }
                                            if (mayor == numero3){
                                                mayor = numero3;
                                                medio = numero1;
                                                menor = numero2;                                            
                                            } else if (numero3 > numero2){
                                                medio = numero3;
                                                menor = numero2;
                                                mayor = numero1;
                                            } else {
                                                medio = numero2;
                                                menor = numero3;
                                                mayor = numero1;
                                            }
                                        } else if (numero2 > numero3){
                                            mayor = numero2;
                                            if (numero3 > numero1){
                                                medio = numero3; 
                                                menor = numero1;
                                            } else{
                                                medio = numero1;
                                                menor = numero3;
                                            }
                                        } else {
                                            menor = numero1;
                                            medio = numero2;
                                            mayor = numero3;
                                        }
                                        menu5Inicio2 = true; //Activa la pantalla principal del menú.
                                        validador3 = true; //Activa validación de la opción 2 del menú.
                                        break;
                                case 2:
                                        int decision;
                                        Scanner decisionyn = new Scanner (System.in); //Escaner que servirá para pedirle al usuario que ingrese un "si" o un "no", para salir del programa o ir a otra sección.
                                        System.out.println("-----------------------------------");
                                        System.out.println("Mostrar números ordenados");
                                        System.out.println("-----------------------------------");
                                        if (validador3 == true){ //Validador que determina si el usuario ingreso datos.
                                            System.out.println(mayor+" "+medio+" "+menor+"\n"); //Escribir números de mayor a menor.
                                            System.out.println("-----------------------------------");
                                        } else {
                                            System.out.println("No ha ingresado ningún número");
                                            System.out.println("-----------------------------------");                                    
                                        }  
                                        menu5Inicio2 = true;
                                        validador3 = false;
                                        System.out.println("¿Desea regresar al menú anterior o salir del programa?");
                                        System.out.println("-----------------------------------");
                                        System.out.println("Pulse 1 para regresar al menú.\nPulse 2 para salir del programa.");
                                        System.out.println("-----------------------------------");
                                        decision = decisionyn.nextInt();
                                        while (decision > 0 && decision != -1 ){ // 2 condiciones para seguir ejecutando el while.
                                            switch (decision){
                                                case 1:
                                                    menu4Inicio = true;
                                                    decision = -1; //Cancela el while y regresa al menú principal.
                                                    break;
                                                case 2:
                                                    menu4Inicio = false; //Cancela el while principal y termina la ejecución del programa.
                                                    menu1Inicio2 = true;
                                                    menu1Inicio = false;
                                                    decision = -1;
                                                    break;
                                                default:
                                                    System.out.println("-----------------------------------");                                                   
                                                    System.out.println("Error, ingrese un número válido");
                                                    System.out.println("-----------------------------------");                                                    
                                                    decision = decisionyn.nextInt();
                                            }                                           
                                        }
                                        break;    
                            }                            
                        }              
                    menu1Inicio2 = true;
                    break;
                case 4:
                    System.out.println("-----------------------------------");
                    System.out.println("Calcular promedio de 4 estudiantes");
                    System.out.println("-----------------------------------");
                            int matriz[][] = new int [6][6];
        Scanner ingreso = new Scanner(System.in); // Variable para escanear las notas y el id de los estudiantes.
        int fila = 0; //Variable para almacenar los datos de las filas en la matriz.
        int columna = 0; //Variable para almacenar los datos de las columnas en la matriz.
        int alumnos; //Variable para almacenar los datos del escaner.
        int promedio1 = 0; //Variable que almacenara los promedios de cada alumno.
        
        for (fila=0; fila < matriz.length; fila++) { //Mientras fila sea menor a la extensión de la matriz.
            for (columna=0; columna < matriz[fila].length-1; columna++) { //Mientras columnas sea menor a la extensión de fila -1 de la matriz, ya que esta última mostrará los promedios.
                if (columna == 0){
                    System.out.println("-----------------------------------");
                    System.out.println("Introduzca Id del estudiante"); // Si es 0 la columna, solicita el id.
                    System.out.println("-----------------------------------");
                } else{
                    System.out.println("-----------------------------------");
                    System.out.println("Introduzca la nota "+columna+" del estudiante "+matriz[fila][0]); //Si es diferente de 0, solicita las notas del estudiante.
                    System.out.println("-----------------------------------");
                }
                matriz[fila][columna] = ingreso.nextInt(); //Lee el dato ingresado y lo guarda en el lugar correspondiente de la matriz.
            }            
        }        
        for (fila = 0; fila<matriz.length;fila++){ //Mientras fila sea menor a la extensión de la matriz, hará el promedio de cada fila.
                columna = 1; //Inicia desde columna 1 para no tomar en cuenta el id.
                promedio1 = 0; //Reinicia el promedio para cada fila en cada ciclo.
            while (columna < 5){ //Mientras sea menor a columnas de la matriz - 1.
                promedio1 = promedio1+matriz [fila][columna]; //El promedio sumara el valor de cada columna en cada ciclo.
                columna++;               
            }    
            promedio1 = promedio1/4; // La suma de los datos dividido la cantidad de datos de la matriz.
            matriz [fila][5] = promedio1; //Asignación del valor del promedio a la última columna de cada fila.        
        }
        System.out.println("-----------------------------------");
        System.out.println("Resultados");
        System.out.println("-----------------------------------");
        for(fila = 0; fila<matriz.length; fila++){ //Mientras fila sea menor a la extensión de la matriz.
             
            for(columna = 0; columna<matriz[fila].length; columna++){ //Mientras columna sea menor a la extensión de la fila de la matriz.
                System.out.print("\t"+matriz[fila][columna]+" "); //Imprime el dato almacenado en cierta fila y cierta columna, contados por el for.
            }
             System.out.println(""); //Salto de línea.
        }
        System.out.println("-----------------------------------");
                                        int decision;
                                        Scanner decisionyn = new Scanner (System.in); //Escaner que servirá para pedirle al usuario que ingrese un "si" o un "no", para salir del programa o ir a otra sección.
                                        System.out.println("¿Desea regresar al menú anterior o salir del programa?");
                                        System.out.println("-----------------------------------");
                                        System.out.println("Pulse 1 para regresar al menú.\nPulse 2 para salir del programa.");
                                        System.out.println("-----------------------------------");
                                        decision = decisionyn.nextInt();
                                        while (decision > 0 && decision != -1 ){ //Decisión con 2 condicionales, mientras sea mayor a 0 y mientras decisión sea diferente de -1 para validar la respuesta del usuario.
                                            switch (decision){
                                                case 1:
                                                    decision = -1; //Cancela el while y regresa al menú.
                                                    break;
                                                case 2:
                                                    menu1Inicio2 = true; //Cancela el while principal y termina el programa.
                                                    menu1Inicio = false;
                                                    decision = -1;
                                                    break;
                                                default:
                                                    System.out.println("-----------------------------------");                                                   
                                                    System.out.println("Error, ingrese un número válido");
                                                    System.out.println("-----------------------------------");                                                    
                                                    decision = decisionyn.nextInt();
                                            }                                           
                                        }            
                    menu1Inicio2 = true; //Regresa al menú inicial.
                    break;
            }
        }
    }
    } 
}
