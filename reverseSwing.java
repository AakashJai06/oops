import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class reverse extends JFrame implements ActionListener{
    JTextField tf1,tf2;
    JLabel l1,l2;
    JButton b1;
    Container c;
    reverse(){
        c = getContentPane();
        c.setLayout(new FlowLayout());
        setSize(300,250);
        l1 = new JLabel("Enter String");
        c.add(l1);
        tf1 = new JTextField(20);
        c.add(tf1);
        l2 = new JLabel("Reversed");
        c.add(l2);
        tf2 = new JTextField(20);
        tf2.setEditable(false);
        c.add(tf2);
        b1 = new JButton("REVERSE");
        c.add(b1);
        b1.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();
        if(str.equals("REVERSE")){
            String s = tf1.getText();
            String[] words = s.split(" ");
            String reverseString = "";
            String reverseWord="";
            for(int i=0;i<words.length;i++){
                String word = words[i];
                for(int j=word.length()-1;j>=0;j--){
                    char c = word.charAt(j);
                    reverseWord = reverseWord+c;
                }
                reverseString = reverseString+" "+reverseWord;
                reverseWord = "";
            }
            tf2.setText(reverseString);
        }

    }
    public static void main(String[] args){
        reverse r = new reverse();
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
