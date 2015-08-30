/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package godai;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


/**
 *
 * @author 0147477 - Fer
 */

/*2) Desenvolva ainda outra interface extendendo um JFrame, que deverá simular 
uma espécie de "calculadora" simples.  Esta calculadora deverá ser composta de 
dois campos texto (JTextField), um ao lado do outro, separados por um JComboBox.
Cada um dos campos de texto representam os operandos de expressões matemáticas, 
enquanto que o JComboBox conterá as operações matemáticas que deverão ser realizadas.  
Quando o usuário pressionar um botão "executar", também adicionado à calculadora, 
o resultado da operação cuja descrição encontra-se exibida no combo box, 
realizada sobre os dois operadores, deverá ser exibido em um JLabel que vc vai 
adicionar à interface para este propósito.  Para fazer isto, você deverá criar 
uma classe para cada operação que você quiser implementar e estas classes é que 
devem ser adicionadas ao combo box (à exemplo dos 'Animais' adicionados no combo 
box do exemplo anexo).  Quando o usuário pressionar o botão "executar", 
os dois operandos deverão ser adicionados ao objeto selecionado no combo box,
que então executará a operação entre eles, e devolverá o resultado que será exibido no JLabel.*/

public class Calculadora extends JFrame{
    
    private Calculadora(){
        setTitle("Calculadora");
        setBounds(37, 75, 800, 450);

        setLayout(null);
        Container container = getContentPane();
        container.setBackground(new Color(255, 255, 255));
        
        //Textfield
        JTextField op1 = new JTextField();
        op1.setBounds(4, 10, 100, 27);
        getContentPane().add(op1);
        
        //JComboBox <opc> = new JComboBox();
                
        
        JTextField op2 = new JTextField();
        op2.setBounds(110, 10, 100, 27);
        getContentPane().add(op2);
        //finais
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        
    }    
    /*public static void main(String[] args) {
        new Calculadora();
    }*/

    
}



