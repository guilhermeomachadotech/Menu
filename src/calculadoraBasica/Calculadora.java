package calculadoraBasica;
import javax.swing.JDialog;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Calculadora extends JDialog{
	ImageIcon imgFundo;
	ImageIcon imgEmpresa;
	Color fundoBotao;
	//Color corFundo;
	JLabel lbNumero1;
	JLabel lbImgFundo;
	JLabel lbImgEmpresa;
	JLabel lbNumero2;
	JTextField txNum1;
	JTextField txNum2;
	JButton btSoma;
	JButton btSubr;
	JButton btMult;
	JButton btDiv;
	public Calculadora() {
		
		//Janela
		//corFundo = new Color(219, 112, 147);
		this.setTitle("Calculadora Básica");
		this.setSize(500,350);
		this.setLocationRelativeTo(null);
		this.setModal(true);
		this.setResizable(false);
		
		//this.getContentPane().setBackground(corFundo);
		
		
		/*lbImgFundo=new JLabel();
		lbImgFundo.setIcon(imgFundo);
		add(lbImgFundo);*/
		
		//Label dos números
		lbNumero1=new JLabel();
		lbNumero2=new JLabel();
		lbNumero1.setBounds(20,20,100,25);
		lbNumero1.setText("Número 1:");
		lbNumero1.setForeground(Color.BLACK);
		add(lbNumero1);
		lbNumero2.setBounds(20,70,100,25);
		lbNumero2.setText("Número 2:");
		lbNumero2.setForeground(Color.BLACK);
		add(lbNumero2);
		//iNPUTS
		txNum1=new JTextField();
		txNum2=new JTextField();
		txNum1.setBounds(90,20,300,25);
		add(txNum1);
		txNum2.setBounds(90,70,300,25);
		add(txNum2);
		//Botões
		fundoBotao = new Color(255, 192, 203);
		
		btSoma=new JButton();
		btSoma.setBounds(20,150,100,30);
		btSoma.setText("Soma");
		btSoma.setBackground(fundoBotao);
		btSoma.setForeground(Color.BLACK);
		add(btSoma);
		
		btSubr=new JButton();
		
		btSubr.setBounds(130,150,100,30);
		btSubr.setText("Subtração");
		btSubr.setBackground(fundoBotao);
		btSubr.setForeground(Color.BLACK);
		add(btSubr);
		
		btMult=new JButton();
		btMult.setBounds(240,150,120,30);
		btMult.setText("Multiplicação");
		btMult.setBackground(fundoBotao);
		btMult.setForeground(Color.BLACK);
		add(btMult);
		
		btDiv=new JButton();
		btDiv.setBounds(370,150,100,30);
		btDiv.setText("Divisão");
		btDiv.setBackground(fundoBotao);
		btDiv.setForeground(Color.BLACK);
		add(btDiv);
		//Label para a imagem da empresa
		
		lbImgEmpresa=new JLabel();
		lbImgEmpresa.setBounds(20,200,100,100);
		//Imagem da label
		imgEmpresa=new ImageIcon(getClass().getResource("Titulo nome da empresa.png"));
		imgEmpresa.setImage(imgEmpresa.getImage().getScaledInstance(lbImgEmpresa.getWidth(),lbImgEmpresa.getHeight(),1));
		lbImgEmpresa.setIcon(imgEmpresa);
		add(lbImgEmpresa);
		//Ações dos botões
		btSoma.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				double num1=Double.parseDouble(txNum1.getText());
				double num2=Double.parseDouble(txNum2.getText());
				double resultado=num1+num2;
				JOptionPane.showMessageDialog(null,"A soma de "+num1+" + "+num2+" é igual à "+resultado,"Resultado da soma",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btSubr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1=Double.parseDouble(txNum1.getText());
				double num2=Double.parseDouble(txNum2.getText());
				double resultado=num1-num2;
				JOptionPane.showMessageDialog(null,"A subtração de "+num1+" - "+num2+" é igual à "+resultado,"Resultado da subtração",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1=Double.parseDouble(txNum1.getText());
				double num2=Double.parseDouble(txNum2.getText());
				double resultado=num1*num2;
				JOptionPane.showMessageDialog(null,"A multiplicação de "+num1+" * "+num2+" é igual à "+resultado,"Resultado da multiplicação",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1=Double.parseDouble(txNum1.getText());
				double num2=Double.parseDouble(txNum2.getText());
				if (num1==0 || num2==0) {
					JOptionPane.showMessageDialog(null,"Não existe divisão por 0","Resultado da divisão",JOptionPane.ERROR_MESSAGE);
				}else {
					double resultado=num1/num2;
					JOptionPane.showMessageDialog(null,"A divisão de "+num1+" : "+num2+" é igual à "+resultado,"Resultado da divisão",JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		//Label para o fundo
		//Imagem de Fundo
		imgFundo=new ImageIcon(getClass().getResource("imagem de fundo.jpg"));
		imgFundo.setImage(imgFundo.getImage().getScaledInstance(this.getWidth(),this.getHeight(),1));
		lbImgFundo=new JLabel();
		lbImgFundo.setIcon(imgFundo);
		lbImgFundo.setSize(this.getWidth(),this.getHeight());
		add(lbImgFundo);
		this.setLayout(null);
		this.setVisible(true);
	}
}
