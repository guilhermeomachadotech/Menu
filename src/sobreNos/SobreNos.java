package sobreNos;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class SobreNos extends JDialog{
	ImageIcon fotoGuilherme;
	ImageIcon fotoGiovanna;
	ImageIcon imgLogoEtec;
	ImageIcon imgInform;
	ImageIcon imgCriadores;
	ImageIcon imgJava;
	ImageIcon imgJavaCriadores;
	JLabel lbImgJavaCriadores;
	JLabel lbImgCriadores;
	JLabel lbImgInform;
	JLabel lbNomeGui;
	JLabel lbNomeGio;
	JLabel lbImgGui;
	JLabel lbImgGio;
	JLabel lbTitulo;
	JLabel lbImgLogoEtec;
	JLabel lbDescGui;
	JLabel lbDescGio;
	JLabel lbCriadores;
	JLabel lbImgJava;
	Font fontTitulo;
	Font fontSubtitulo;
	Font fontCriadores;
	Font fontTextBotao;
	Color colorFundo;
	Color colorText;
	Color colorFundoBotao;
	Color colorTextBotao;
	JButton btConhecaGui;
	JButton btConhecaGio;
	public SobreNos() {
		Criadores guiCriador=new Criadores();
		Criadores giovannaCriador=new Criadores();
		guiCriador.setNomeCriador("Guilherme de Oliveira Machado");
		guiCriador.setIdadeCriador(17);
		guiCriador.setCargoCriador("estudante");
		guiCriador.setDescCriador("Estudante da Etec Guianazes");
		
		giovannaCriador.setNomeCriador("Giovanna Eduarda Damasceno Reis");
		giovannaCriador.setIdadeCriador(17);
		giovannaCriador.setCargoCriador("estudante");
		giovannaCriador.setDescCriador("Estudante da Etec Guianazes");
		
		colorFundo=new Color(54,105,163);
		colorText=new Color(240,190,103);
		colorTextBotao=new Color(20,51,87);
		colorFundoBotao=new Color(240,190,103);
		
		fontTitulo=new Font("Arial-Black",Font.BOLD,30);
		fontCriadores=new Font("Arial-Black",Font.BOLD,25);
		fontSubtitulo=new Font("Arial-Black",Font.BOLD,18);
		fontTextBotao=new Font("Arial-Black", Font.BOLD, 14);
		
		imgLogoEtec=new ImageIcon(getClass().getResource("./img/logoEtec.png"));
		imgInform=new ImageIcon(getClass().getResource("./img/informacao.png"));
		imgCriadores=new ImageIcon(getClass().getResource("./img/criadores.png"));
		imgJava=new ImageIcon(getClass().getResource("./img/java.png"));
		imgJavaCriadores=new ImageIcon(getClass().getResource("./img/javaCriadores.png"));
		
		this.setTitle("Sobre Nós");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setModal(true);
		this.setResizable(false);
		this.getContentPane().setBackground(colorFundo);
		
		
		//Olá!! Aqui é o Giovanna Eduarda, tenho 17 anos e
		//sou estudante da etec de Guaianazes.
		lbImgInform=new JLabel();
		lbImgInform.setBounds(250,5,35,35);
		imgInform.setImage(imgInform.getImage().getScaledInstance(lbImgInform.getWidth(),lbImgInform.getHeight(),1));
		lbImgInform.setIcon(imgInform);
		add(lbImgInform);
		
		lbTitulo=new JLabel();
		lbTitulo.setText("Sobre Nós");
		lbTitulo.setBounds(300,5,170,30);
		lbTitulo.setForeground(colorText);
		lbTitulo.setFont(fontTitulo);
		add(lbTitulo);
		
		lbCriadores=new JLabel();
		lbCriadores.setText("Criadores");
		lbCriadores.setBounds(320,60,120,20);
		lbCriadores.setForeground(colorText);
		lbCriadores.setFont(fontCriadores);
		add(lbCriadores);
		
		lbImgCriadores=new JLabel();
		lbImgCriadores.setBounds(440,45,50,50);
		imgCriadores.setImage(imgCriadores.getImage().getScaledInstance(lbImgCriadores.getWidth(),lbImgCriadores.getHeight(),1));
		lbImgCriadores.setIcon(imgCriadores);
		add(lbImgCriadores);
		
		lbNomeGui=new JLabel();
		lbNomeGui.setBounds(50,100,300,20);
		lbNomeGui.setText("Guilherme de Oliveira Machado");
		lbNomeGui.setForeground(colorText);
		lbNomeGui.setFont(fontSubtitulo);
		add(lbNomeGui);
		
		lbImgGui=new JLabel();
		lbImgGui.setBounds(70,130,200,200);
		fotoGuilherme=new ImageIcon(getClass().getResource("./img/fotoGui.png"));
		fotoGuilherme.setImage(fotoGuilherme.getImage().getScaledInstance(lbImgGui.getWidth(),lbImgGui.getHeight(),1));
		lbImgGui.setIcon(fotoGuilherme);
		add(lbImgGui);
		
		/*lbDescGui=new JLabel();
		lbDescGui.setBounds(10,350,300,100);
		lbDescGui.setText("Olá!! Aqui é o Guilherme tenho 17 anos e sou estudante da etec de Guaianazes.");
		lbDescGui.setForeground(colorText);
		lbDescGui.setFont(fontSubtitulo);
		add(lbDescGui);*/
		
		btConhecaGui=new JButton();
		btConhecaGui.setText("Conheça Guilherme!");
		btConhecaGui.setBounds(75,350,180,30);
		btConhecaGui.setForeground(colorTextBotao);
		btConhecaGui.setFont(fontTextBotao);
		btConhecaGui.setBackground(colorFundoBotao);
		add(btConhecaGui);
				
		lbImgJavaCriadores=new JLabel();
		lbImgJavaCriadores.setBounds(290,170,150,150);
		imgJavaCriadores.setImage(imgJavaCriadores.getImage().getScaledInstance(lbImgJavaCriadores.getWidth(),lbImgJavaCriadores.getHeight(),1));
		lbImgJavaCriadores.setIcon(imgJavaCriadores);
		add(lbImgJavaCriadores);
		
		lbNomeGio=new JLabel();
		lbNomeGio.setText("Giovanna Eduarda Damasceno Reis");
		lbNomeGio.setBounds(400,100,320,20);
		lbNomeGio.setForeground(colorText);
		lbNomeGio.setFont(fontSubtitulo);
		add(lbNomeGio);
		
		lbImgGio=new JLabel();
		lbImgGio.setBounds(455,130,200,200);
		fotoGuilherme=new ImageIcon(getClass().getResource("./img/fotoGio.png"));
		fotoGuilherme.setImage(fotoGuilherme.getImage().getScaledInstance(lbImgGio.getWidth(),lbImgGio.getHeight(),1));
		lbImgGio.setIcon(fotoGuilherme);
		add(lbImgGio);
		
		/*lbDescGio=new JLabel();
		lbDescGio.setBounds(400,350,270,20);
		lbDescGio.setText("Olá!! Aqui é o Guilherme tenho 17 anos \n e sou estudante da etec de Guaianazes.");
		lbDescGio.setForeground(colorText);
		lbDescGio.setFont(fontSubtitulo);
		add(lbDescGio);*/
		
		btConhecaGio=new JButton();
		btConhecaGio.setText("Conheça Giovanna!");
		btConhecaGio.setBounds(460,350,180,30);
		btConhecaGio.setForeground(colorTextBotao);
		btConhecaGio.setFont(fontTextBotao);
		btConhecaGio.setBackground(colorFundoBotao);
		add(btConhecaGio);
		
		lbImgLogoEtec=new JLabel();
		lbImgLogoEtec.setBounds(30,430,120,120);
		
		imgLogoEtec.setImage(imgLogoEtec.getImage().getScaledInstance(lbImgLogoEtec.getWidth(),lbImgLogoEtec.getHeight(),1));
		lbImgLogoEtec.setIcon(imgLogoEtec);
		add(lbImgLogoEtec);
		
		lbImgJava=new JLabel();
		lbImgJava.setBounds(700,470,60,60);
		imgJava.setImage(imgJava.getImage().getScaledInstance(lbImgJava.getWidth(),lbImgJava.getHeight(),1));
		lbImgJava.setIcon(imgJava);
		add(lbImgJava);
		
		btConhecaGui.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Olá, meu nome é "+guiCriador.getNomeCriador()+",\n tenho "+guiCriador.getIdadeCriador()+" ano. Sou "+guiCriador.getCargoCriador()+" da Etec de Guianazes","Conheça Guilherme!", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btConhecaGio.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Olá, meu nome é "+giovannaCriador.getNomeCriador()+",\ntenho "+giovannaCriador.getIdadeCriador()+
				" anos. Sou "+giovannaCriador.getCargoCriador()+" da Etec de Guianazes", "Conheça Giovanna!", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		this.setLayout(null);
		this.setVisible(true);
	}
}
