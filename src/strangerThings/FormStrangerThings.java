package strangerThings;
import javax.swing.JDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
public class FormStrangerThings extends JDialog{
	JLabel lbNome;
	JLabel lbPersonagens;
	JLabel lbGostosPerson;
	JLabel lbMelhoresAmigos;
	JLabel lbImgTitulo;
	JTextField txtNome;
	JComboBox cbPersonagens;
	JRadioButton rbGosto1;
	JRadioButton rbGosto2;
	JRadioButton rbGosto3;
	JRadioButton rbGosto4;
	ButtonGroup bgGostos;
	JCheckBox ckMelhoresAmigos1;
	JCheckBox ckMelhoresAmigos2;
	JCheckBox ckMelhoresAmigos3;
	JCheckBox ckMelhoresAmigos4;
	JButton btExibir;
	ImageIcon imgTitulo;
	Color corBackGround;
	Color corText;
	Color fundoBotao;
	Color txtBotao;
	Font fonteLabel;
	Font fonteInput;
	Font fonteBotao;
	
	public FormStrangerThings() {
		//Cores e fontes que serão utilizados
		corBackGround=new Color(28, 28, 28);
		fundoBotao=new Color(255, 48, 48);
		corText=new Color(255, 48, 48);
		fonteLabel=new Font("Courier New",Font.BOLD,15);
		fonteInput=new Font("Courier New",Font.BOLD,13);
		fonteBotao=new Font("Courier New", Font.BOLD,12);
		//Janela
		this.setTitle("Formulário Stranger Things");
		this.setSize(600,450);
		this.setLocationRelativeTo(null);
		this.setModal(true);
		this.setResizable(false);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(corBackGround);
		
		//Imagem
		imgTitulo=new ImageIcon(getClass().getResource("TituloSt.png"));
		lbImgTitulo=new JLabel();
		lbImgTitulo.setBounds(240,0,120,120);
		imgTitulo.setImage(imgTitulo.getImage().getScaledInstance(lbImgTitulo.getWidth(),lbImgTitulo.getHeight(),1));
		lbImgTitulo.setIcon(imgTitulo);
		add(lbImgTitulo);
		//Nome da pessoa
		
		lbNome = new JLabel();
		lbNome.setBounds(20, 110, 200, 20);
		lbNome.setText("Digite seu nome:");
		lbNome.setForeground(corText);
		lbNome.setFont(fonteLabel);
		add(lbNome);
		
		txtNome= new JTextField();
		txtNome.setBounds (180, 110, 250, 20);
		add(txtNome);
		//Seleção de personagens
		lbPersonagens = new JLabel();
		lbPersonagens.setBounds (20, 130, 300, 50);
		lbPersonagens.setText("Selecione seu Personagem favorito");
		lbPersonagens.setForeground(corText);
		lbPersonagens.setFont(fonteLabel);
		add(lbPersonagens);
		
		cbPersonagens=new JComboBox();
		cbPersonagens.setBounds(20,170, 150, 20);
		cbPersonagens.addItem("MIKE");
		cbPersonagens.addItem("ONZE");
		cbPersonagens.addItem("WILL");
		cbPersonagens.addItem("LUCAS");
		cbPersonagens.addItem("DUSTIN");
		cbPersonagens.addItem("MAX");
		add(cbPersonagens);
		//RadioButton
		lbGostosPerson = new JLabel();
		lbGostosPerson.setBounds(20, 200, 190, 20);
		lbGostosPerson.setText("Selecione seu gosto:");
		lbGostosPerson.setForeground(corText);
		lbGostosPerson.setFont(fonteLabel);
		add(lbGostosPerson);
		
		rbGosto1= new JRadioButton();
		rbGosto1.setBounds (20, 225, 135, 20);
		rbGosto1.setText("Ouvir Músicas");
		rbGosto1.setFont(fonteInput);
		rbGosto1.setForeground(corText);
		rbGosto1.setBackground(corBackGround);
		add(rbGosto1);
		
		rbGosto2= new JRadioButton();
		rbGosto2.setBounds (150, 225, 205, 20);
		rbGosto2.setText("Jogos de tabuleiro RPG");
		rbGosto2.setFont(fonteInput);
		rbGosto2.setForeground(corText);
		rbGosto2.setBackground(corBackGround);
		add(rbGosto2);
		
		rbGosto3=new JRadioButton();
		rbGosto3.setBounds(355, 225, 90, 20);
		rbGosto3.setText("Waffles");
		rbGosto3.setFont(fonteInput);
		rbGosto3.setForeground(corText);
		rbGosto3.setBackground(corBackGround);
		add(rbGosto3);
		
		rbGosto4=new JRadioButton();
		rbGosto4.setBounds(440, 225, 190, 20);
		rbGosto4.setText("Tocar guitarra");
		rbGosto4.setFont(fonteInput);
		rbGosto4.setForeground(corText);
		rbGosto4.setBackground(corBackGround);
		add(rbGosto4);
		
		bgGostos=new ButtonGroup();
		bgGostos.add(rbGosto1);
		bgGostos.add(rbGosto2);
		bgGostos.add(rbGosto3);
		bgGostos.add(rbGosto4);
		//CheckBox
		lbMelhoresAmigos=new JLabel();
		lbMelhoresAmigos.setBounds(20, 255, 300, 20);
		lbMelhoresAmigos.setText("Selecione seus melhores amigos:");
		lbMelhoresAmigos.setForeground(corText);
		lbMelhoresAmigos.setFont(fonteLabel);
		add(lbMelhoresAmigos);
		
		ckMelhoresAmigos1=new JCheckBox();
		ckMelhoresAmigos1.setBounds(20, 280, 155, 20);
		ckMelhoresAmigos1.setText("Steve Harrington");
		ckMelhoresAmigos1.setFont(fonteInput);
		ckMelhoresAmigos1.setForeground(corText);
		ckMelhoresAmigos1.setBackground(corBackGround);
		add(ckMelhoresAmigos1);
		
		ckMelhoresAmigos2=new JCheckBox();
		ckMelhoresAmigos2.setBounds(180, 280, 130, 20);
		ckMelhoresAmigos2.setText("Eddie Munsson");
		ckMelhoresAmigos2.setFont(fonteInput);
		ckMelhoresAmigos2.setForeground(corText);
		ckMelhoresAmigos2.setBackground(corBackGround);
		add(ckMelhoresAmigos2);
		
		ckMelhoresAmigos3=new JCheckBox();
		ckMelhoresAmigos3.setBounds(310, 280, 140, 20);
		ckMelhoresAmigos3.setText("Jonathan Byers");
		ckMelhoresAmigos3.setFont(fonteInput);
		ckMelhoresAmigos3.setForeground(corText);
		ckMelhoresAmigos3.setBackground(corBackGround);
		add(ckMelhoresAmigos3);
		
		ckMelhoresAmigos4=new JCheckBox();
		ckMelhoresAmigos4.setBounds(450, 280, 65, 20);
		ckMelhoresAmigos4.setText("Robin");
		ckMelhoresAmigos4.setFont(fonteInput);
		ckMelhoresAmigos4.setForeground(corText);
		ckMelhoresAmigos4.setBackground(corBackGround);
		add(ckMelhoresAmigos4);
		//Botão
		btExibir=new JButton();
		btExibir.setBounds(250,340, 100, 30);
		btExibir.setText("EXIBIR");
		btExibir.setForeground(Color.WHITE);
		btExibir.setFont(fonteBotao);
		btExibir.setBackground(fundoBotao);
		add(btExibir);
		
		//Ação do botão
		btExibir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String nome, personagemEscolhido, gosto, melhoresAmigos="";
				nome=txtNome.getText();
				personagemEscolhido=cbPersonagens.getSelectedItem().toString();
				//Pegar o radio
				if(rbGosto1.isSelected()) {
					gosto=rbGosto1.getText();
				}else if(rbGosto2.isSelected()) {
					gosto=rbGosto2.getText();
				}else if(rbGosto3.isSelected()) {
					gosto=rbGosto3.getText();
				}else {
					gosto=rbGosto4.getText();
				}
				//CheckBox
				if(ckMelhoresAmigos1.isSelected()) {
					melhoresAmigos=melhoresAmigos+" "+ckMelhoresAmigos1.getText();
				}
				if(ckMelhoresAmigos2.isSelected()) {
					melhoresAmigos=melhoresAmigos+" "+ckMelhoresAmigos2.getText();
				}
				if(ckMelhoresAmigos3.isSelected()) {
					melhoresAmigos=melhoresAmigos+" "+ckMelhoresAmigos3.getText();
				}
				if(ckMelhoresAmigos4.isSelected()) {
					melhoresAmigos=melhoresAmigos+" "+ckMelhoresAmigos4.getText();
				}
				//Exibição
				JOptionPane.showMessageDialog(null,"Nome do usuário: "+nome+"\nPersonagem escolhido: "+personagemEscolhido+"\nGosto: "+gosto+"\nMelhores amigos: "+melhoresAmigos,"Exibição", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		this.setLayout(null);
		this.setVisible(true);
	}
}
