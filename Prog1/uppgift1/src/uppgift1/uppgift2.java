package uppgift1;
import javax.swing.JOptionPane;

//* här har jag kodat så man ser alla ord när man har skrivit in dom. *//
public class uppgift2 {
    public static void main(String[] args) {
        String First = JOptionPane.showInputDialog("First word");
        String Second = JOptionPane.showInputDialog (First);
        String Third = JOptionPane.showInputDialog (First + " " + Second);
        String Fourth = JOptionPane.showInputDialog (First + " " + Second + " " + Third);
        String Fifth = JOptionPane.showInputDialog (First + " " + Second + " " + Third + " " + Fourth);
   
        //* Den här koden är för att se hur alla ord blir som resultat. *//
        String words = First + " " + Second + " " + Third + " " + Fourth + " " + Fifth;
        JOptionPane.showMessageDialog(null, words);
        System.exit(0);
    }
}