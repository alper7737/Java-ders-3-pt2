
package javaapplication2;
 import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class JavaApplication2 {

    public static void main(String[] args) {
   JFrame ref = new JFrame();
   ref.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   JLabel l1 = new JLabel("Java");
   JPanel panel1 = new JPanel();
   JPanel panel2 = new JPanel();
   JPanel panel3 = new JPanel();
   JPanel panel4 = new JPanel();
   JTabbedPane pane = new JTabbedPane(JTabbedPane.BOTTOM);
   panel2.add(l1);
   pane.addTab("1",panel1);
   pane.addTab("2",panel2);
   pane.addTab("3",panel3);
   pane.addTab("4",panel4);
   ref.add(pane);
   ref.setSize(200,200);
   ref.setVisible(true);
   
   
    }
    
}
