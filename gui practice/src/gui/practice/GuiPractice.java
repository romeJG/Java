
package gui.practice;
import javax.swing.JOptionPane;
public class GuiPractice {

    public static void main(String[] args) {
        String fn = JOptionPane.showInputDialog("Enter First number");
        String sn = JOptionPane.showInputDialog("Enter Second number");
        int num1=Integer.parseInt(fn);
        int num2=Integer.parseInt(sn);
        
        int sum = num1+num2;
        JOptionPane.showMessageDialog(null,"the answer is: "+sum,"the title",JOptionPane.PLAIN_MESSAGE);
    }
    
}
