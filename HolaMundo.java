import java.util.Scanner;
/**
 * 
 * HolaMundo
 */
public class HolaMundo {

    public static void main(String [] args){
        System.out.print("hola mundo!");
        System.out.print(2);
        System.out.print(10.5 );
        System.out.print('1');
        
        System.out.printf("aqui va una cadena: %s%n","carlos ");
        System.out.printf("aqui va un entero:%d%n",10);
        System.out.printf("mi nombre es %s y tengo %d anios%n", "carlos",22);

        
  var entrada = new Scanner(System.in);

  System.out.print("porfavor ingrese su nombre: ");
  var entero = entrada.nextLine();
  System.out.println(entero);

  entrada.close();
}

}