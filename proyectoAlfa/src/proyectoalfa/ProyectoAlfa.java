

package proyectoalfa;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ProyectoAlfa {

    
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String hola = teclado.nextLine();
        
        JOptionPane.showMessageDialog(null, hola);
        
    }
    
}
