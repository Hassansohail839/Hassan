import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Saludador extends JFrame {

    private JTextField campoTexto;
    private JButton botonSaludar;

    public Saludador() {
        setTitle("Saludador");
        setSize(300, 150);
        setLocationRelativeTo(null); // Centrar ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel etiqueta = new JLabel("Quien ere?");
        campoTexto = new JTextField(15);
        botonSaludar = new JButton("Pulsa");

        add(etiqueta);
        add(campoTexto);
        add(botonSaludar);

        // Evento del botón
        botonSaludar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = campoTexto.getText();
                JOptionPane.showMessageDialog(null, "Hola " + nombre + "!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Saludador().setVisible(true);
            }
        });
    }
}
