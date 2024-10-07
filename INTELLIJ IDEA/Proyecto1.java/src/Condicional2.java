import javax.swing.*;

public class Condicional2 {
    public static void main(String[] args) {

        int menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Cafe con tortita \n 2 - Cafe con medialuna \n 3 - Gaseosa con sandwich \n Elija opcion"));
        switch (menu) {
            case 1:
                JOptionPane.showMessageDialog(null, "Son 1000 pesos");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Son 1500 pesos");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Son 3000 pesos");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion erronea");
        }
    }
}
