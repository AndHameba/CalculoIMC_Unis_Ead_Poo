package newpackage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Anderson
 */
public class CalculoFrame extends JFrame {
    
    private JTextField pesoField;
    private JTextField alturaField;

    
    public CalculoFrame(){
        
        super("Calculo IMC Java");
        Formularios();
    }
    
    private void Formularios(){
        
        setLayout(new BorderLayout());
        
        CalcularAction calcularAction = new CalcularAction();
        LimparAction limparAction = new LimparAction();
        
        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new FlowLayout());
        
        JLabel titulo = new JLabel("Calculo IMC");
        titulo.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelTitulo.add(titulo);
        
        JPanel panelForms = new JPanel();
        panelForms.setLayout(new FlowLayout());
        
        JLabel pesoLabel = new JLabel("Peso:");
        
        pesoField = new JTextField(10);
        
        JLabel alturaLabel = new JLabel("Altura:");
        
        alturaField = new JTextField(10);
        
        panelForms.add(pesoLabel);
        panelForms.add(pesoField);
        panelForms.add(alturaLabel);
        panelForms.add(alturaField);
        
        JPanel panelBotoes = new JPanel();
        panelBotoes.setLayout(new FlowLayout());
        
        JButton botaoCalcular = new JButton("Calcular");
        botaoCalcular.addActionListener(calcularAction);
          
        JButton botaoLimpar = new JButton("Limpar");
        botaoLimpar.addActionListener(limparAction);
        
        panelBotoes.add(botaoCalcular);
        panelBotoes.add(botaoLimpar);
        
        add(panelTitulo, BorderLayout.NORTH);
        add(panelForms, BorderLayout.CENTER);
        add(panelBotoes, BorderLayout.SOUTH);
    }
    
    
    private class CalcularAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            
            float num1 = Float.valueOf(pesoField.getText());
            float num2 = Float.valueOf(alturaField.getText());
            
            float res = num1/(num2*num2);
            
            if(res < 18){
                
                JOptionPane.showMessageDialog(null, "Seu IMC = " + res + " Você está abaixo do peso!");
            }
            
            else if(res >= 18 && res <= 25){
                
                JOptionPane.showMessageDialog(null, "Seu IMC = " + res + " Você está no peso ideal!");
            }
            
            else if(res >= 26 && res <= 35){
                
                JOptionPane.showMessageDialog(null, "Seu IMC = " + res + " Você está acima do peso!");
            }
            
            else if(res >= 36 && res <= 39){
                
                JOptionPane.showMessageDialog(null, "Seu IMC = " + res + " Você está muito acima do peso!");
            }
            
            else if(res >= 40){
                
                JOptionPane.showMessageDialog(null, "Seu IMC = " + res + " Você está num grau de obesidade morbida!");
            }
            
        }
    }   
    private class LimparAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            
            pesoField.setText("");
            alturaField.setText("");
            
        }
    }
    
}
