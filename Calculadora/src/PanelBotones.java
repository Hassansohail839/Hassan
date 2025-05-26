import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelBotones extends JPanel{
	 private JTextField campo;
	    private String operadorActual = "";
	    private double operando1 = 0;
	    private boolean nuevoNumero = true;

	    public PanelBotones(JTextField campo) {
	        this.campo = campo;
	        setLayout(new GridLayout(6, 4, 5, 5)); // 6 filas, 4 columnas, separación 5px

	        String[] botones = {
	            "^", "√", "C", "←",
	            "7", "8", "9", "÷",
	            "4", "5", "6", "×",
	            "1", "2", "3", "-",
	            "±", "0", ".", "+",
	            "", "", "=", ""
	        };

	        for (String texto : botones) {
	            if (texto.equals("")) {
	                add(new JLabel()); // espacios vacíos
	            } else {
	                JButton btn = new JButton(texto);
	                btn.setFont(new Font("Arial", Font.BOLD, 20));
	                btn.addActionListener(new BotonListener());
	                add(btn);
	            }
	        }
	    }

	    private class BotonListener implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String texto = ((JButton) e.getSource()).getText();

	            switch (texto) {
	                case "C":
	                    campo.setText("");
	                    operando1 = 0;
	                    operadorActual = "";
	                    break;
	                case "←":
	                    if (!campo.getText().isEmpty()) {
	                        campo.setText(campo.getText().substring(0, campo.getText().length() - 1));
	                    }
	                    break;
	                case "+":
	                case "-":
	                case "×":
	                case "÷":
	                case "^":
	                    operando1 = Double.parseDouble(campo.getText());
	                    operadorActual = texto;
	                    nuevoNumero = true;
	                    break;
	                case "=":
	                    double operando2 = Double.parseDouble(campo.getText());
	                    double resultado = 0;
	                    switch (operadorActual) {
	                        case "+": resultado = operando1 + operando2; break;
	                        case "-": resultado = operando1 - operando2; break;
	                        case "×": resultado = operando1 * operando2; break;
	                        case "÷": resultado = operando2 != 0 ? operando1 / operando2 : 0; break;
	                        case "^": resultado = Math.pow(operando1, operando2); break;
	                    }
	                    campo.setText(String.valueOf(resultado));
	                    nuevoNumero = true;
	                    break;
	                case "√":
	                    double valor = Double.parseDouble(campo.getText());
	                    campo.setText(String.valueOf(Math.sqrt(valor)));
	                    break;
	                case "±":
	                    if (!campo.getText().isEmpty()) {
	                        double num = Double.parseDouble(campo.getText());
	                        campo.setText(String.valueOf(-num));
	                    }
	                    break;
	                default:
	                    if (nuevoNumero) {
	                        campo.setText(texto);
	                        nuevoNumero = false;
	                    } else {
	                        campo.setText(campo.getText() + texto);
	                    }
	                    break;
	            }
	        }
	    }
	
}
