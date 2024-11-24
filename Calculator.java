import java.awt.Frame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;

class close extends WindowAdapter {

    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Cal implements ActionListener {

    TextField tf;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20,
            b21, b22, b23, b24,b25,b26,b27,b28;
    String fv, sv, op;
    Double fdv, sdv, tot;
//    double fact = 1;

    Cal() {
        Frame f = new Frame();
        f.addWindowListener(new close());
        f.setBackground(Color.LIGHT_GRAY);
        f.setTitle("My Calculator");
        f.setResizable(false);
        f.setSize(500, 650);
        f.setLocationRelativeTo(null);

        Font f1 = new Font("Poppins", Font.BOLD, 30);
        Font f2 = new Font("Quicksand", Font.BOLD, 30);
        Font f3 = new Font("Quicksand", Font.BOLD, 40);
        Font f4 = new Font("Poppins", Font.PLAIN,30);

        MenuBar mb = new MenuBar();

        Menu m1 = new Menu("View");
        MenuItem mi = new MenuItem("Standard");
        m1.add(mi);

        Menu m2 = new Menu("Edit");
        MenuItem mi2 = new MenuItem("Copy");
        MenuItem mi3 = new MenuItem("Cut");
        m2.add(mi2);
        m2.add(mi3);

        mb.add(m1);
        mb.add(m2);

        f.setMenuBar(mb);

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        GridLayout g1 = new GridLayout(7, 4, 10, 8);
        p2.setLayout(g1);
        p2.setBackground(Color.darkGray);

        tf = new TextField(16);
        tf.setFont(f3);
        tf.setEditable(true);
        tf.setForeground(Color.BLACK);
        tf.setBackground(Color.WHITE);
        tf.setText("0");

        p1.add(tf);

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("+");
        b11 = new Button("-");
        b12 = new Button("\u00D7");
        b13 = new Button("\u00F7");
        b16 = new Button("%");
        b17 = new Button(".");
        b19 = new Button("C");
        b21 = new Button("+/-");
        b22 = new Button("0");
        b23 = new Button("CE");
        b24 = new Button("=");
        b14 = new Button("1/x");
        b15 = new Button("x^2");
        b18 = new Button("n!");
        b20 = new Button("\u221A");
        b25 = new Button("Sin");
        b26 = new Button("Cos");
        b27 = new Button("Tan");
        b28 = new Button("Log");
        
        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        b5.setBackground(Color.WHITE);
        b6.setBackground(Color.WHITE);
        b7.setBackground(Color.WHITE);
        b8.setBackground(Color.WHITE);
        b9.setBackground(Color.WHITE);
        b10.setBackground(Color.WHITE);
        b11.setBackground(Color.WHITE);
        b12.setBackground(Color.WHITE);
        b13.setBackground(Color.WHITE);
        b14.setBackground(Color.WHITE);
        b15.setBackground(Color.WHITE);
        b16.setBackground(Color.WHITE);
        b17.setBackground(Color.WHITE);
        b18.setBackground(Color.WHITE);
        b19.setBackground(Color.WHITE);
        b20.setBackground(Color.WHITE);
        b21.setBackground(Color.WHITE);
        b22.setBackground(Color.WHITE);
        b23.setBackground(Color.GRAY);
        b24.setBackground(Color.GREEN);
        b24.setForeground(Color.BLACK);
        b25.setBackground(Color.WHITE);
        b26.setBackground(Color.WHITE);
        b27.setBackground(Color.WHITE);
        b28.setBackground(Color.WHITE);


        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        b4.setFont(f1);
        b5.setFont(f1);
        b6.setFont(f1);
        b7.setFont(f1);
        b8.setFont(f1);
        b9.setFont(f1);
        b10.setFont(f3);
        b11.setFont(f3);
        b12.setFont(f3);
        b13.setFont(f3);
        b14.setFont(f4);
        b15.setFont(f4);
        b16.setFont(f1);
        b17.setFont(f3);
        b18.setFont(f4);
        b19.setFont(f1);
        b20.setFont(f1);
        b21.setFont(f1);
        b22.setFont(f1);
        b23.setFont(f2);
        b24.setFont(f2);
        b25.setFont(f4);
        b26.setFont(f4);
        b27.setFont(f4);
        b28.setFont(f4);


        p2.add(b16);
        p2.add(b23);
        p2.add(b19);
        p2.add(b18);
        p2.add(b25);
        p2.add(b26);
        p2.add(b27);
        p2.add(b28);
        p2.add(b15);
        p2.add(b14);
        p2.add(b20);
        p2.add(b13);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b12);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b11);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b10);
        p2.add(b21);
        p2.add(b22);
        p2.add(b17);
        p2.add(b24);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);


        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.SOUTH);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent d) {
        
        if (tf.getText().equals("0")) {
            tf.setText("");
        }

        Object o = d.getSource();

        if (o.equals(b1)) {
            tf.setText(tf.getText() + b1.getLabel());
            
        } else if (o.equals(b2)) {
            tf.setText(tf.getText() + b2.getLabel());
            
        } else if (o.equals(b3)) {
            tf.setText(tf.getText() + b3.getLabel());
            
        } else if (o.equals(b4)) {
            tf.setText(tf.getText() + b4.getLabel());
            
        } else if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());
            
        } else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());
            
        } else if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());
            
        } else if (o.equals(b8)) {
            tf.setText(tf.getText() + b8.getLabel());
            
        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
            
        } else if (o.equals(b17)) { // .
            tf.setText(tf.getText()+ b17.getLabel());
            
        } else if (o.equals(b22)) {  // 0
            tf.setText(tf.getText() + b22.getLabel());
            
        } else if (o.equals(b23)){    // CE
            tf.setText("");
            
        }else if(o.equals(b19)){         // C
            String string = tf.getText();
            tf.setText("");
            for(int i = 0; i<string.length()-1; i++){
                tf.setText(tf.getText()+string.charAt(i));
            }
            
        }else if(o.equals(b21)) {     // +/-
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot =  fdv * (-1);
            tf.setText(String.valueOf(tot));
            
        }else if(o.equals(b14)) { //  1/X
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot = 1 / fdv;
            tf.setText(String.valueOf(tot));
            
        }else if (o.equals(b15)) {   // X^2
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot = fdv * fdv;
            tf.setText(String.valueOf(tot));
            
        }else if(o.equals(b20)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot = Math.sqrt(fdv);
            tf.setText(String.valueOf(tot));
            
        }else if(o.equals(b25)) { //sin
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot = Math.sin(fdv);
            tf.setText(String.valueOf(tot));
            
        }else if(o.equals(b26)) {  //cos
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot = Math.cos(fdv);
            tf.setText(String.valueOf(tot));
            
        }else if(o.equals(b27)) {  //Tan
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot = Math.tan(fdv);
            tf.setText(String.valueOf(tot));
            
        }else if(o.equals(b28)) {  //log
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot = Math.log(fdv);
            tf.setText(String.valueOf(tot));
            
        }else if (o.equals(b16)) { // %
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot = fdv / (100);
            tf.setText(String.valueOf(tot));
            
        }else if(o.equals(b18)){         // n!
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            double fact = 1;

            while(fdv!=0) {
                fact = fact*fdv;
                fdv--;
            }

            tf.setText(tf.getText()+fact);

        } else if (o.equals(b10)) {   // +

            fv = tf.getText();
            op = b10.getLabel();
            tf.setText("");

        } else if (o.equals(b11)) {   // -

            fv = tf.getText();
            op = b11.getLabel();
            tf.setText("");

        } else if (o.equals(b12)) {  //  *

            fv = tf.getText();
            op = b12.getLabel();
            tf.setText("");

        } else if (o.equals(b13)) {  //  / 

            fv = tf.getText();
            op = b13.getLabel();
            tf.setText("");
            
        } else if (o.equals(b24)) {   // =

            sv = tf.getText();

            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);
            tf.setText("");

            if (op.equals("+")) {
                tot = fdv + sdv;
                tf.setText(tot + "");
                
            } else if (op.equals("-")) {
                tot = fdv - sdv;
                tf.setText(tot + "");

            } else if (op.equals("\u00D7")) {
                tot = fdv * sdv;
                tf.setText(tot + "");

            } else if (op.equals("\u00F7")) {
                tot = fdv / sdv;
                tf.setText(tot + "");
            }

        }
        
    }
}

public class Calculator {

    public static void main(String[] args) {
        new Cal();
    }
}
