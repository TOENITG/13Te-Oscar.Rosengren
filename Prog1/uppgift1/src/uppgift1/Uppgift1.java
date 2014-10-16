/**
 * @author Oscar Rosengren
 */
package uppgift1;
import javax.swing.JOptionPane;

public class Uppgift1 {

   
    public static void main(String[] args) {
       
        //* Här har kodat så användaren kan skriva in sina uppgifter. *//
        String Name = JOptionPane.showInputDialog("Skriv ditt namn", "Namn");
        
        String IdNumber = JOptionPane.showInputDialog("Skriv ditt personnumer", "xxxxxx-xxxx");
        
        String Adress = JOptionPane.showInputDialog("Skriv din adress", "Exempelvägen Nr");
        
        //* Här har jag så att bara man tar ut dag och månad ur IdNumber.*//
        String dag;
        dag = IdNumber.substring(4, 6);
        
        String monad;
        monad = IdNumber.substring(2, 4);
        
        //* Här har jag kodat så jag får upp allt användaren har skrivit in i rutona till en ruta i slutet. *//
        
        JOptionPane.showMessageDialog(null, "Hej " + Name + " den " + dag + "/" + monad + " kommer vi till " + Adress + " och firar dig på din födelsedag." );
    }
    
}

/*
Tack!

Snyggt och bra kommenterat!

*/

