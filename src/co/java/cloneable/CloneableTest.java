package co.java.cloneable;

import java.util.Arrays;

/***
 * Clase ejecutable para verificar la implementacion de
 * Cloneable
 * @author carlos
 */
public class CloneableTest {

    public static void main(String[] args) {
       Persona personaOriginal = new Persona("Carlos", "Mendoza", "Masculino", Arrays.asList("Juan","Carmen"));
//       Persona personaGemela = personaOriginal.clone();
//       personaGemela.setApellidos("Torres");
         Persona personaGemela = new Persona(personaOriginal);
       
        System.out.println(personaOriginal.toString());
        System.out.println(personaGemela.toString());
        System.out.println(personaOriginal.equals(personaGemela));
    }
    
}
