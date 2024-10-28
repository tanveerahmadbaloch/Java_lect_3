import javax.swing.*;

public class InputOutpt {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter Number");
        int number = Integer.parseInt(input);
        int square = number * number;
        System.out.println("Square: " + square);
        JOptionPane.showMessageDialog(null, "Square: " + square);
        System.exit(0);
    }
}
