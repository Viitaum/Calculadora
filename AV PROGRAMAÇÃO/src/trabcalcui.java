import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Window.Type;
import javax.swing.JTextField;

public class trabcalcui extends JFrame {

	private JPanel contentPane;
	private JTextField txtTela;
	
	//private EditText edtNumero1, edtNumero2,edtResultados;
	//private double n1, n2, resultado;
	
	
	
	
	//valor1 = Double.parseDouble(txtTela.getText().toString());
	//valor2 = Double.parseDouble(txtTela.getText().toString());
	//resultado = valor1, valor2;
	
	//String sinal;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trabcalcui frame = new trabcalcui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public trabcalcui() {
		
		
		
		
		
		
		setTitle("Calculadora Brabona");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int b7 = 0;
					txtTela.setText(txtTela.getText()+"7");
					//JOptionPane.showMessageDialog(contentPane, "7");
			}
		});
		btn7.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn7.setBounds(10, 82, 69, 60);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int b8 = 0;
					txtTela.setText(txtTela.getText()+"8");
			}
		});
		btn8.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn8.setBounds(89, 82, 69, 60);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int b9 = 0;
					txtTela.setText(txtTela.getText()+"9");
			}
		});
		btn9.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn9.setBounds(168, 82, 69, 60);
		contentPane.add(btn9);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtTela.setText(txtTela.getText()+"+");
				// valor1 = Double.parseDouble(txtTela.getText().toString());
				
				
				
				
				
				//VARIAVEL PRA SOMAR
				//String x = txtTela.getText
				//String a = txtTela.getText
				//String y = txtTela.getText
				//string Resultado
				//string Operação
				//string.valueOf = x
				//string.valueOf = y
				//x (a) y = resultado
				
			}
		});
		btnSoma.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSoma.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btnSoma.setBounds(247, 82, 69, 60);
		contentPane.add(btnSoma);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int b4 = 0;
					txtTela.setText(txtTela.getText()+"4");
			}
		});
		btn4.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn4.setBounds(10, 151, 69, 60);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int b5 = 0;
					txtTela.setText(txtTela.getText()+"5");
			}
		});
		btn5.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn5.setBounds(89, 153, 69, 60);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int b6 = 0;
					txtTela.setText(txtTela.getText()+"6");
			}
		});
		btn6.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn6.setBounds(168, 153, 69, 60);
		contentPane.add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTela.setText(txtTela.getText()+"-");
					//SUBTRAIR
			}
		});
		btnSub.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btnSub.setBounds(247, 153, 69, 60);
		contentPane.add(btnSub);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int b1 = 0;
					txtTela.setText(txtTela.getText()+"1");
			}
		});
		btn1.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn1.setBounds(10, 222, 69, 62);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int b2 = 0;
					txtTela.setText(txtTela.getText()+"2");
			}
		});
		btn2.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn2.setBounds(89, 223, 69, 60);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int b3 = 0;
					txtTela.setText(txtTela.getText()+"3");
			}
		});
		btn3.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn3.setBounds(168, 224, 69, 60);
		contentPane.add(btn3);
		
		JButton btnX = new JButton("*");
		btnX.setVerticalAlignment(SwingConstants.TOP);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTela.setText(txtTela.getText()+"*");
					//MULTIPLICAR
			}
		});
		btnX.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btnX.setBounds(247, 224, 69, 60);
		contentPane.add(btnX);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b0 = 0;
				txtTela.setText(txtTela.getText()+"0");
			}
		});
		btn0.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn0.setBounds(10, 295, 69, 60);
		contentPane.add(btn0);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTela.setText(txtTela.getText()+".");
					//VIRGULA
			}
		});
		btnPonto.setVerticalAlignment(SwingConstants.BOTTOM);
		btnPonto.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btnPonto.setBounds(168, 295, 69, 60);
		contentPane.add(btnPonto);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTela.setText(txtTela.getText()+"=");
					//DIVISAO
			}
		});
		btnIgual.setVerticalAlignment(SwingConstants.BOTTOM);
		btnIgual.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btnIgual.setBounds(89, 294, 69, 60);
		contentPane.add(btnIgual);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setVerticalAlignment(SwingConstants.BOTTOM);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTela.setText(txtTela.getText()+"/");
				
				
			}
		});
		btnDiv.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btnDiv.setBounds(247, 295, 69, 61);
		contentPane.add(btnDiv);
		
		txtTela = new JTextField();
		txtTela.setFont(new Font("Times New Roman", Font.PLAIN, 70));
		txtTela.setBounds(12, 11, 225, 60);
		contentPane.add(txtTela);
		txtTela.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTela.setText(null);
			}
		});
		btnC.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC.setFont(new Font("Yu Gothic UI", Font.BOLD, 40));
		btnC.setBounds(247, 11, 69, 60);
		contentPane.add(btnC);
	}
	
	public static float soma(float x, float y)
	{return x + y;}
	
	public static float subtracao(float x, float y)
	{return x - y;}
	
	public static float multiplicacao(float x, float y)
	{return x * y;}
	
	public static float divisao(float x, float y)
	{return x / y;}
}
