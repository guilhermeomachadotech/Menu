package jogoDaVelha;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AppJogoDaVelha extends JDialog{
	ImageIcon imgX;
	ImageIcon imgMiles;
	ImageIcon imgGwen;
	ImageIcon imgPeter;
	ImageIcon imgMiguel;
	ImageIcon imgO;
	ImageIcon imgMilesPerfil;
	ImageIcon imgGwenPerfil;
	ImageIcon imgPeterPerfil;
	ImageIcon imgMiguelPerfil;
	
	JLabel lbNomeJogador1;
	JLabel lbNomeJogador2;
	
	JLabel lbEscolheOpcao1;
	JLabel lbEscolheOpcao2;
	
	JLabel lbEscolheFotoJ1;
	JLabel lbEscolheFotoJ2;
	
	JLabel lbImgJ1;
	JLabel lbImgJ2;
	
	JLabel lbImagemPefilJ1;
	JLabel lbImagemPefilJ2;
	
	JLabel lbImgVencedor;
	
	JLabel lbNomeJogador1JogoVelha;
	JLabel lbNomeJogador2JogoVelha;
	
	JLabel lbPontuacaoJ1;
	JLabel lbPontuacaoJ2;
	
	JLabel lbSuaVezJ1;
	JLabel lbSuaVezJ2;
	
	JLabel lbVencedor;
	JLabel lbPontuacaoVencedor;
	
	JComboBox cbLinha;
	JComboBox cbColuna;
	
	JTextField txNomeJogador1;
	JTextField txNomeJogador2;
	
	JRadioButton rdXJogador1;
	JRadioButton rdOJogador1;
	JRadioButton rdXJogador2;
	JRadioButton rdOJogador2;
	
	JRadioButton rdimgMiles1;
	JRadioButton rdimgGwen1;
	JRadioButton rdimgPeter1;
	JRadioButton rdimgMiguel1;
	
	JRadioButton rdimgMiles2;
	JRadioButton rdimgGwen2;
	JRadioButton rdimgPeter2;
	JRadioButton rdimgMiguel2;
	
	ButtonGroup bgOpcoesXOJ1;
	ButtonGroup bgFotoJ1;
	ButtonGroup bgFotoJ2;
	
	JButton btConfirmar1;
	JButton btConfirmar2;
	
	JButton btJogada11;
	JButton btJogada12;
	JButton btJogada13;
	JButton btJogada21;
	JButton btJogada22;
	JButton btJogada23;
	JButton btJogada31;
	JButton btJogada32;
	JButton btJogada33;
	
	JButton btResetarJogo;
	
	JButton btFinalizarJogo;
	JButton matrizBotoesJogada[][]=new JButton[3][3];
	
	Color corFundo;
	Color corTexto;
	Color corFundoBotao;
	Color corTextoBotao;
	Font fontBotao;
	Font fontLabel;
	Font fontCorpo;
	Font fontXO;
	
	Jogador jogador1;
	Jogador jogador2;
	JogoVelha jogoVelha;
	
	public AppJogoDaVelha() {
		//Instanciamento de classes para fazer o jogo
		jogador1=new Jogador();
		jogador2=new Jogador();
		jogoVelha=new JogoVelha();
		
		imgX=new ImageIcon(getClass().getResource("./imagens/iconeX.png"));
		imgO=new ImageIcon(getClass().getResource("./imagens/iconeO.png"));
		imgMiles=new ImageIcon(getClass().getResource("./imagens/iconMiles.png"));
		imgGwen=new ImageIcon(getClass().getResource("./imagens/iconGwen.png"));
		imgPeter=new ImageIcon(getClass().getResource("./imagens/iconPeter.png"));
		imgMiguel=new ImageIcon(getClass().getResource("./imagens/iconMiguelOhara.png"));
		
		imgMilesPerfil=new ImageIcon(getClass().getResource("./imagens/iconMiles.png"));
		imgGwenPerfil=new ImageIcon(getClass().getResource("./imagens/iconGwen.png"));
		imgPeterPerfil=new ImageIcon(getClass().getResource("./imagens/iconPeter.png"));
		imgMiguelPerfil=new ImageIcon(getClass().getResource("./imagens/iconMiguelOhara.png"));;
		
		corFundo=new Color(20,146,179);
		corFundoBotao=new Color(88,18,10);
		corTexto=new Color(88,18,10);
		corTextoBotao=new Color(20,146,179);
		
		fontLabel=new Font("Arial-Black",Font.BOLD,20);
		fontCorpo=new Font("Arial-Black",Font.BOLD,15);
		fontBotao=new Font("Arial-Black",Font.BOLD,18);
		fontXO=new Font("Arial-Black",Font.BOLD,30);
		
		
		//Janela
		this.setTitle("Jogo da velha");
		this.setSize(800,600);
		this.setModal(true);
		this.setResizable(false);
		
		Container janelacalc=this.getContentPane();
		setLocationRelativeTo(janelacalc);
		janelacalc.setLayout(null);
		
		JTabbedPane tabbledpane=new JTabbedPane();
		tabbledpane.setBounds(0,0,800,600);
		
		//Painel do jogador 1:
		JPanel painelJogador1=new JPanel();
		painelJogador1.setBackground(corFundo);
		lbNomeJogador1=new JLabel("Nome:");
		lbNomeJogador1.setBounds(10,15,100,20);
		lbNomeJogador1.setForeground(corTexto);
		lbNomeJogador1.setFont(fontLabel);
		painelJogador1.add(lbNomeJogador1);
		
		txNomeJogador1=new JTextField();
		txNomeJogador1.setBounds(80,15,120,20);
		txNomeJogador1.setForeground(corTexto);
		
		painelJogador1.add(txNomeJogador1);
		
		lbEscolheOpcao1=new JLabel();
		lbEscolheOpcao1.setText("Escolha sua opção:");
		lbEscolheOpcao1.setForeground(corTexto);
		lbEscolheOpcao1.setFont(fontLabel);
		lbEscolheOpcao1.setBounds(10,60, 190, 20);
		
		painelJogador1.add(lbEscolheOpcao1);
		
		rdXJogador1=new JRadioButton();
		rdXJogador1.setBounds(10, 90, 50, 50);
		imgX.setImage(imgX.getImage().getScaledInstance(rdXJogador1.getWidth(),rdXJogador1.getHeight(),1));
		rdXJogador1.setText("X");
		rdXJogador1.setForeground(Color.RED);
		rdXJogador1.setFont(fontXO);
		rdXJogador1.setBackground(corFundo);
		painelJogador1.add(rdXJogador1);
		
		rdOJogador1=new JRadioButton();
		rdOJogador1.setBounds(90, 90, 50, 50);
		imgO.setImage(imgO.getImage().getScaledInstance(rdOJogador1.getWidth(),rdOJogador1.getHeight(),1));
		rdOJogador1.setText("O");
		rdOJogador1.setForeground(Color.RED);
		rdOJogador1.setFont(fontXO);
		rdOJogador1.setBackground(corFundo);
		painelJogador1.add(rdOJogador1);
		
		bgOpcoesXOJ1=new ButtonGroup();
		bgOpcoesXOJ1.add(rdXJogador1);
		bgOpcoesXOJ1.add(rdOJogador1);
		
		lbEscolheFotoJ1=new JLabel();
		lbEscolheFotoJ1.setText("Escolhe sua foto de perfil:");
		lbEscolheFotoJ1.setForeground(corTexto);
		lbEscolheFotoJ1.setFont(fontLabel);
		lbEscolheFotoJ1.setBounds(10, 160, 250, 20);
		painelJogador1.add(lbEscolheFotoJ1);
		
		lbImagemPefilJ1=new JLabel();
		lbImagemPefilJ1.setBounds(400, 120, 300, 300);
		painelJogador1.add(lbImagemPefilJ1);
		
		BotaoEscolherFoto btFotoMiles1=new BotaoEscolherFoto(1);
		rdimgMiles1=new JRadioButton();
		rdimgMiles1.setBounds(10,190,130,20);
		rdimgMiles1.setBackground(corFundo);
		rdimgMiles1.setForeground(corTexto);
		rdimgMiles1.setFont(fontCorpo);
		rdimgMiles1.setText("Miles Morales");
		rdimgMiles1.addActionListener(btFotoMiles1);
		painelJogador1.add(rdimgMiles1);
		
		BotaoEscolherFoto btFotoGwen1=new BotaoEscolherFoto(1);
		rdimgGwen1=new JRadioButton();
		rdimgGwen1.setBounds(140,190,130,20);
		rdimgGwen1.setForeground(corTexto);
		rdimgGwen1.setFont(fontCorpo);
		rdimgGwen1.setBackground(corFundo);
		rdimgGwen1.setText("Gwen Stancy");
		rdimgGwen1.addActionListener(btFotoGwen1);
		painelJogador1.add(rdimgGwen1);
		
		BotaoEscolherFoto btFotoMiguel1=new BotaoEscolherFoto(1);
		rdimgMiguel1=new JRadioButton();
		rdimgMiguel1.setBounds(10,210,130,20);
		rdimgMiguel1.setForeground(corTexto);
		rdimgMiguel1.setFont(fontCorpo);
		rdimgMiguel1.setBackground(corFundo);
		rdimgMiguel1.setText("Miguel O'Hara");
		rdimgMiguel1.addActionListener(btFotoMiguel1);
		painelJogador1.add(rdimgMiguel1);
		
		BotaoEscolherFoto btFotoPeter1=new BotaoEscolherFoto(1);
		rdimgPeter1=new JRadioButton();
		rdimgPeter1.setBounds(140,210,140,20);
		rdimgPeter1.setForeground(corTexto);
		rdimgPeter1.setFont(fontCorpo);
		rdimgPeter1.setBackground(corFundo);
		rdimgPeter1.setText("Peter B.Parker");
		rdimgPeter1.addActionListener(btFotoPeter1);
		painelJogador1.add(rdimgPeter1);
		
		bgFotoJ1=new ButtonGroup();
		bgFotoJ1.add(rdimgMiles1);
		bgFotoJ1.add(rdimgMiguel1);
		bgFotoJ1.add(rdimgGwen1);
		bgFotoJ1.add(rdimgPeter1);
		
		BotaoCadastrarJogador btCadastrarJog1=new BotaoCadastrarJogador(1);
		btConfirmar1=new JButton();
		btConfirmar1.setText("Confirmar");
		btConfirmar1.setForeground(Color.WHITE);
		btConfirmar1.setFont(fontBotao);
		btConfirmar1.setBackground(corFundoBotao);
		btConfirmar1.setBounds(20,250,150,40);
		btConfirmar1.addActionListener(btCadastrarJog1);
		painelJogador1.add(btConfirmar1);
		
		painelJogador1.setLayout(null);
		tabbledpane.addTab("Jogador 1",null, painelJogador1, "Insere o Jogador 1");
		
		//Painel 2
		
		JPanel painelJogador2=new JPanel();
		painelJogador2.setLayout(null);
		painelJogador2.setBackground(corFundo);
		lbNomeJogador2=new JLabel("Nome:");
		lbNomeJogador2.setBounds(10,15,100,20);
		lbNomeJogador2.setForeground(corTexto);
		lbNomeJogador2.setFont(fontLabel);
		painelJogador2.add(lbNomeJogador2);
		
		txNomeJogador2=new JTextField();
		txNomeJogador2.setBounds(80,15,120,20);
		txNomeJogador2.setForeground(corTexto);
		
		painelJogador2.add(txNomeJogador2);
		
		lbEscolheOpcao2=new JLabel();
		lbEscolheOpcao2.setText("Escolha sua opção:");
		lbEscolheOpcao2.setForeground(corTexto);
		lbEscolheOpcao2.setFont(fontLabel);
		lbEscolheOpcao2.setBounds(10,60, 190, 20);
		
		painelJogador2.add(lbEscolheOpcao2);
		
		rdXJogador2=new JRadioButton();
		rdXJogador2.setBounds(10, 90, 50, 50);
		rdXJogador2.setFont(fontXO);
		rdXJogador2.setForeground(Color.RED);
		rdXJogador2.setText("X");
		rdXJogador2.setBackground(corFundo);
		painelJogador2.add(rdXJogador2);
		
		rdOJogador2=new JRadioButton();
		rdOJogador2.setBounds(90, 90, 50, 50);
		rdOJogador2.setFont(fontXO);
		rdOJogador2.setForeground(Color.RED);
		rdOJogador2.setText("O");
		rdOJogador2.setBackground(corFundo);
		painelJogador2.add(rdOJogador2);
		
		bgOpcoesXOJ1=new ButtonGroup();
		bgOpcoesXOJ1.add(rdXJogador2);
		bgOpcoesXOJ1.add(rdOJogador2);
		
		lbEscolheFotoJ2=new JLabel();
		lbEscolheFotoJ2.setText("Escolhe sua foto de perfil:");
		lbEscolheFotoJ2.setForeground(corTexto);
		lbEscolheFotoJ2.setFont(fontLabel);
		lbEscolheFotoJ2.setBounds(10, 160, 250, 20);
		painelJogador2.add(lbEscolheFotoJ2);
		
		lbImagemPefilJ2=new JLabel();
		lbImagemPefilJ2.setBounds(400, 120, 300, 300);
		painelJogador2.add(lbImagemPefilJ2);
		
		BotaoEscolherFoto btFotoMiles2=new BotaoEscolherFoto(2);
		rdimgMiles2=new JRadioButton();
		rdimgMiles2.setBounds(10,190,130,20);
		rdimgMiles2.setBackground(corFundo);
		rdimgMiles2.setForeground(corTexto);
		rdimgMiles2.setFont(fontCorpo);
		rdimgMiles2.setText("Miles Morales");
		rdimgMiles2.addActionListener(btFotoMiles2);
		painelJogador2.add(rdimgMiles2);
		
		BotaoEscolherFoto btFotoGwen2=new BotaoEscolherFoto(2);
		rdimgGwen2=new JRadioButton();
		rdimgGwen2.setBounds(140,190,130,20);
		rdimgGwen2.setForeground(corTexto);
		rdimgGwen2.setFont(fontCorpo);
		rdimgGwen2.setBackground(corFundo);
		rdimgGwen2.setText("Gwen Stancy");
		rdimgGwen2.addActionListener(btFotoGwen2);
		painelJogador2.add(rdimgGwen2);
		
		BotaoEscolherFoto btFotoMiguel2=new BotaoEscolherFoto(2);
		rdimgMiguel2=new JRadioButton();
		rdimgMiguel2.setBounds(10,210,130,20);
		rdimgMiguel2.setForeground(corTexto);
		rdimgMiguel2.setFont(fontCorpo);
		rdimgMiguel2.setBackground(corFundo);
		rdimgMiguel2.setText("Miguel O'Hara");
		rdimgMiguel2.addActionListener(btFotoMiguel2);
		painelJogador2.add(rdimgMiguel2);
		
		BotaoEscolherFoto btFotoPeter2=new BotaoEscolherFoto(2);
		rdimgPeter2=new JRadioButton();
		rdimgPeter2.setBounds(140,210,140,20);
		rdimgPeter2.setForeground(corTexto);
		rdimgPeter2.setFont(fontCorpo);
		rdimgPeter2.setBackground(corFundo);
		rdimgPeter2.setText("Peter B.Parker");
		rdimgPeter2.addActionListener(btFotoPeter2);
		painelJogador2.add(rdimgPeter2);
		
		bgFotoJ2=new ButtonGroup();
		bgFotoJ2.add(rdimgMiles2);
		bgFotoJ2.add(rdimgMiguel2);
		bgFotoJ2.add(rdimgGwen2);
		bgFotoJ2.add(rdimgPeter2);
		
		BotaoCadastrarJogador btCadastrarJog2=new BotaoCadastrarJogador(2);
		btConfirmar2=new JButton();
		btConfirmar2.setText("Confirmar");
		btConfirmar2.setForeground(Color.WHITE);
		btConfirmar2.setFont(fontBotao);
		btConfirmar2.setBackground(corFundoBotao);
		btConfirmar2.setBounds(20,250,150,40);
		btConfirmar2.addActionListener(btCadastrarJog2);
		painelJogador2.add(btConfirmar2);
		
		tabbledpane.addTab("Jogador 2",null, painelJogador2, "Insere o Jogador 2");
		//Painel 3
		JPanel painelJogoDaVelha=new JPanel();
		painelJogoDaVelha.setLayout(null);
		painelJogoDaVelha.setBackground(corFundo);
		
		btJogada11=new JButton();
		btJogada11.setBounds(10,10,70,70);
		btJogada11.setBackground(Color.WHITE);
		BotaoJogada btJog11=new BotaoJogada(0,0);
		btJogada11.addActionListener(btJog11);
		painelJogoDaVelha.add(btJogada11);
		matrizBotoesJogada[0][0]=btJogada11;
		
		
		btJogada12=new JButton();
		btJogada12.setBounds(90,10,70,70);
		BotaoJogada btJog12=new BotaoJogada(0,1);
		btJogada12.addActionListener(btJog12);
		painelJogoDaVelha.add(btJogada12);
		matrizBotoesJogada[0][1]=btJogada12;
		
		btJogada13=new JButton();
		btJogada13.setBounds(170,10,70,70);
		BotaoJogada btJog13=new BotaoJogada(0,2);
		btJogada13.addActionListener(btJog13);
		matrizBotoesJogada[0][2]=btJogada13;
		painelJogoDaVelha.add(btJogada13);
		
		btJogada21=new JButton();
		btJogada21.setBounds(10,90,70,70);
		BotaoJogada btJog21=new BotaoJogada(1,0);
		btJogada21.addActionListener(btJog21);
		matrizBotoesJogada[1][0]=btJogada21;
		painelJogoDaVelha.add(btJogada21);
		
		btJogada22=new JButton();
		btJogada22.setBounds(90,90,70,70);
		BotaoJogada btJog22=new BotaoJogada(1,1);
		btJogada22.addActionListener(btJog22);
		matrizBotoesJogada[1][1]=btJogada22;
		painelJogoDaVelha.add(btJogada22);
		
		btJogada23=new JButton();
		btJogada23.setBounds(170,90,70,70);
		BotaoJogada btJog23=new BotaoJogada(1,2);
		btJogada23.addActionListener(btJog23);
		matrizBotoesJogada[1][2]=btJogada23;
		painelJogoDaVelha.add(btJogada23);
		
		btJogada31=new JButton();
		btJogada31.setBounds(10,170,70,70);
		BotaoJogada btJog31=new BotaoJogada(2,0);
		btJogada31.addActionListener(btJog31);
		matrizBotoesJogada[2][0]=btJogada31;
		painelJogoDaVelha.add(btJogada31);
		
		btJogada32=new JButton();
		btJogada32.setBounds(90,170,70,70);
		BotaoJogada btJog32=new BotaoJogada(2,1);
		btJogada32.addActionListener(btJog32);
		matrizBotoesJogada[2][1]=btJogada32;
		painelJogoDaVelha.add(btJogada32);
		
		btJogada33=new JButton();
		btJogada33.setBounds(170,170,70,70);
		BotaoJogada btJog33=new BotaoJogada(2,2);
		btJogada33.addActionListener(btJog33);
		matrizBotoesJogada[2][2]=btJogada33;
		painelJogoDaVelha.add(btJogada33);
		
		lbNomeJogador1JogoVelha=new JLabel();
		lbNomeJogador1JogoVelha.setBounds(270, 40, 300,20);
		lbNomeJogador1JogoVelha.setForeground(corTexto);
		lbNomeJogador1JogoVelha.setFont(fontLabel);
		lbNomeJogador1JogoVelha.setVisible(true);
		
		painelJogoDaVelha.add(lbNomeJogador1JogoVelha);
		
		lbPontuacaoJ1=new JLabel();
		lbPontuacaoJ1.setBounds(270,80,300,20);
		lbPontuacaoJ1.setForeground(corTexto);
		lbPontuacaoJ1.setFont(fontLabel);
		lbPontuacaoJ1.setText("Pontuacao: "+jogoVelha.getPontuacaoJogador1());
		painelJogoDaVelha.add(lbPontuacaoJ1);
		
		lbImgJ1=new JLabel();
		lbImgJ1.setBounds(500, 50, 100,100);
		painelJogoDaVelha.add(lbImgJ1);
		
		lbSuaVezJ1=new JLabel();
		lbSuaVezJ1.setBounds(300, 130, 200,20);
		lbSuaVezJ1.setForeground(corTexto);
		lbSuaVezJ1.setFont(fontLabel);
		painelJogoDaVelha.add(lbSuaVezJ1);
		
		lbNomeJogador2JogoVelha=new JLabel();
		lbNomeJogador2JogoVelha.setBounds(270, 220, 300,20);
		lbNomeJogador2JogoVelha.setForeground(corTexto);
		lbNomeJogador2JogoVelha.setFont(fontLabel);
		painelJogoDaVelha.add(lbNomeJogador2JogoVelha);
		
		lbPontuacaoJ2=new JLabel();
		lbPontuacaoJ2.setBounds(270,260,300,20);
		lbPontuacaoJ2.setText("Pontuacao: "+jogoVelha.getPontuacaoJogador2());
		lbPontuacaoJ2.setFont(fontLabel);
		lbPontuacaoJ2.setForeground(corTexto);
		painelJogoDaVelha.add(lbPontuacaoJ2);
		
		lbImgJ2=new JLabel();
		lbImgJ2.setBounds(500, 200, 100,100);
		painelJogoDaVelha.add(lbImgJ2);
		
		lbSuaVezJ2=new JLabel();
		lbSuaVezJ2.setBounds(300, 300, 200,20);
		lbSuaVezJ2.setVisible(false);
		lbSuaVezJ2.setFont(fontLabel);
		lbSuaVezJ2.setForeground(corTexto);
		painelJogoDaVelha.add(lbSuaVezJ2);
		
		BotaoFinalizarJogo btFJ=new BotaoFinalizarJogo();
		btFinalizarJogo=new JButton();
		btFinalizarJogo.setBounds(30, 260, 200,40);
		btFinalizarJogo.setText("Finalizar Jogo");
		btFinalizarJogo.setFont(fontBotao);
		btFinalizarJogo.setForeground(Color.WHITE);
		btFinalizarJogo.setBackground(corFundoBotao);
		btFinalizarJogo.addActionListener(btFJ);
		painelJogoDaVelha.add(btFinalizarJogo);
		
		BotaoResetarJogo btResetar=new BotaoResetarJogo();
		btResetarJogo=new JButton();
		btResetarJogo.setBounds(30,320,200,40);
		btResetarJogo.setText("Resetar Rodada");
		btResetarJogo.setFont(fontBotao);
		btResetarJogo.setForeground(Color.WHITE);
		btResetarJogo.setBackground(corFundoBotao);
		btResetarJogo.addActionListener(btResetar);
		painelJogoDaVelha.add(btResetarJogo);
		
		lbVencedor =new JLabel();
		lbVencedor.setBounds(250, 400, 300, 20);
		lbVencedor.setFont(fontLabel);
		lbVencedor.setForeground(corTexto);
		lbVencedor.setVisible(false);
		painelJogoDaVelha.add(lbVencedor);
		
		lbImgVencedor=new JLabel();
		lbImgVencedor.setBounds(180, 400, 100, 100);
		lbImgVencedor.setVisible(false);
		painelJogoDaVelha.add(lbImgVencedor);
		
		lbPontuacaoVencedor =new JLabel();
		lbPontuacaoVencedor.setBounds(240, 430, 200, 20);
		lbPontuacaoVencedor.setFont(fontLabel);
		lbPontuacaoVencedor.setForeground(corTexto);
		lbPontuacaoVencedor.setVisible(false);
		
		painelJogoDaVelha.add(lbPontuacaoVencedor);
		tabbledpane.addTab("Jogo da Velha",null, painelJogoDaVelha, "Execusão do jogo");
		janelacalc.add(tabbledpane);
	}
	private class BotaoEscolherFoto implements ActionListener{
		int numJogador;
		public BotaoEscolherFoto(int numJogador) {
			this.numJogador=numJogador;
		}
		public void actionPerformed (ActionEvent e) {
			if(numJogador==1) {
				if (rdimgMiles1.isSelected()) {
					imgMilesPerfil.setImage(imgMilesPerfil.getImage().getScaledInstance(lbImagemPefilJ1.getWidth(),lbImagemPefilJ1.getHeight(),1));
					lbImagemPefilJ1.setIcon(imgMilesPerfil);
				}else if(rdimgGwen1.isSelected()){
					imgGwenPerfil.setImage(imgGwenPerfil.getImage().getScaledInstance(lbImagemPefilJ1.getWidth(),lbImagemPefilJ1.getHeight(),1));
					lbImagemPefilJ1.setIcon(imgGwenPerfil);
				}else if(rdimgMiguel1.isSelected()) {
					imgMiguelPerfil.setImage(imgMiguelPerfil.getImage().getScaledInstance(lbImagemPefilJ1.getWidth(),lbImagemPefilJ1.getHeight(),1));
					lbImagemPefilJ1.setIcon(imgMiguelPerfil);					
				}else {
					imgPeterPerfil.setImage(imgPeterPerfil.getImage().getScaledInstance(lbImagemPefilJ1.getWidth(),lbImagemPefilJ1.getHeight(),1));
					lbImagemPefilJ1.setIcon(imgPeterPerfil);	
				}
			}else {
				if (rdimgMiles2.isSelected()) {
					imgMilesPerfil.setImage(imgMilesPerfil.getImage().getScaledInstance(lbImagemPefilJ2.getWidth(),lbImagemPefilJ2.getHeight(),1));
					lbImagemPefilJ2.setIcon(imgMilesPerfil);
				}else if(rdimgGwen2.isSelected()){
					imgGwenPerfil.setImage(imgGwenPerfil.getImage().getScaledInstance(lbImagemPefilJ2.getWidth(),lbImagemPefilJ2.getHeight(),1));
					lbImagemPefilJ2.setIcon(imgGwenPerfil);
				}else if(rdimgMiguel2.isSelected()) {
					imgMiguelPerfil.setImage(imgMiguelPerfil.getImage().getScaledInstance(lbImagemPefilJ2.getWidth(),lbImagemPefilJ2.getHeight(),1));
					lbImagemPefilJ2.setIcon(imgMiguelPerfil);
				}else {
					imgPeterPerfil.setImage(imgPeterPerfil.getImage().getScaledInstance(lbImagemPefilJ2.getWidth(),lbImagemPefilJ2.getHeight(),1));
					lbImagemPefilJ2.setIcon(imgPeterPerfil);
				}
			}
		}
	}
	private class BotaoCadastrarJogador implements ActionListener{
		int numJogador;
		String fotoJogador;
		public BotaoCadastrarJogador(int numJogador) {
			this.numJogador=numJogador;
		}
		public void actionPerformed (ActionEvent evento) {
			if(numJogador==1) {
				jogador1.setNomeJogador(txNomeJogador1.getText());
				jogoVelha.setNomeJogador1(jogador1.getNomeJogador());
				lbNomeJogador1JogoVelha.setText("Jogador N°1: "+jogador1.getNomeJogador());
				lbSuaVezJ1.setText("Sua vez, "+jogador1.getNomeJogador());
				if(rdXJogador1.isSelected()) {
					jogador1.setOpcaoJogador("X");
					jogoVelha.setOpcaoJ1(jogador1.getOpcaoJogador());
					rdXJogador1.setEnabled(false);
					rdXJogador2.setEnabled(false);
					rdOJogador2.setEnabled(true);
					rdOJogador1.setEnabled(true);
					
				}else {
					jogador1.setOpcaoJogador("O");
					jogoVelha.setOpcaoJ1(jogador1.getOpcaoJogador());
					rdOJogador1.setEnabled(false);
					rdOJogador2.setEnabled(false);
					rdXJogador2.setEnabled(true);
					rdXJogador1.setEnabled(true);
				}
				if(rdimgMiles1.isSelected()) {
					fotoJogador="Miles Morales";
					rdimgMiles1.setEnabled(false);
					rdimgMiles2.setEnabled(false);
					rdimgMiguel1.setEnabled(true);
					rdimgPeter1.setEnabled(true);
					rdimgGwen1.setEnabled(true);
					imgMiles.setImage(imgMiles.getImage().getScaledInstance(lbImgJ1.getWidth(),lbImgJ1.getHeight(),1));
					lbImgJ1.setIcon(imgMiles);
				}else if(rdimgGwen1.isSelected()) {
					fotoJogador="Gwen Stancy";
					rdimgGwen1.setEnabled(false);
					rdimgGwen2.setEnabled(false);
					rdimgMiguel1.setEnabled(true);
					rdimgPeter1.setEnabled(true);
					rdimgMiles1.setEnabled(true);
					imgGwen.setImage(imgGwen.getImage().getScaledInstance(lbImgJ1.getWidth(),lbImgJ1.getHeight(),1));
					lbImgJ1.setIcon(imgGwen);
				}else if(rdimgMiguel1.isSelected()) {
					fotoJogador="Miguel O'Hara";
					rdimgMiguel1.setEnabled(false);
					rdimgMiguel2.setEnabled(false);
					rdimgGwen1.setEnabled(true);
					rdimgPeter1.setEnabled(true);
					rdimgMiles1.setEnabled(true);
					imgMiguel.setImage(imgMiguel.getImage().getScaledInstance(lbImgJ1.getWidth(),lbImgJ1.getHeight(),1));
					lbImgJ1.setIcon(imgMiguel);
				}else {
					fotoJogador="Peter B.Paker";
					rdimgPeter1.setEnabled(false);
					rdimgPeter2.setEnabled(false);
					rdimgGwen1.setEnabled(true);
					rdimgMiguel1.setEnabled(true);
					rdimgMiles1.setEnabled(true);
					imgPeter.setImage(imgPeter.getImage().getScaledInstance(lbImgJ1.getWidth(),lbImgJ1.getHeight(),1));
					lbImgJ1.setIcon(imgPeter);
				}
				JOptionPane.showMessageDialog(null,"Nome do Jogador N° 1: "+jogador1.getNomeJogador()+"\nEscolha feita: "+jogador1.getOpcaoJogador()+"\nFoto do Jogador: "+fotoJogador,"Jogador N° 1",JOptionPane.INFORMATION_MESSAGE);
			}else {
				jogador2.setNomeJogador(txNomeJogador2.getText());
				jogoVelha.setNomeJogador2(jogador2.getNomeJogador());
				lbNomeJogador2JogoVelha.setText("Jogador N°2: "+jogador2.getNomeJogador());
				lbSuaVezJ2.setText("Sua vez, "+jogador2.getNomeJogador());
				if(rdXJogador2.isSelected()) {
					jogador2.setOpcaoJogador("X");
					jogoVelha.setOpcaoJ2(jogador2.getOpcaoJogador());
					rdXJogador2.setEnabled(false);
					rdXJogador1.setEnabled(false);
					rdOJogador1.setEnabled(true);
					rdOJogador2.setEnabled(true);
					
				}else {
					jogador2.setOpcaoJogador("O");
					jogoVelha.setOpcaoJ2(jogador2.getOpcaoJogador());
					rdOJogador2.setEnabled(false);
					rdOJogador1.setEnabled(false);
					rdXJogador1.setEnabled(true);
					rdXJogador2.setEnabled(true);
				}
				if(rdimgMiles2.isSelected()) {
					fotoJogador="Miles Morales";
					rdimgMiles1.setEnabled(false);
					rdimgMiles2.setEnabled(false);
					rdimgMiguel2.setEnabled(true);
					rdimgPeter2.setEnabled(true);
					rdimgGwen2.setEnabled(true);
					imgMiles.setImage(imgMiles.getImage().getScaledInstance(lbImgJ2.getWidth(),lbImgJ2.getHeight(),1));
					lbImgJ2.setIcon(imgMiles);
				}else if(rdimgGwen2.isSelected()) {
					fotoJogador="Gwen Stancy";
					rdimgGwen1.setEnabled(false);
					rdimgGwen2.setEnabled(false);
					rdimgMiguel2.setEnabled(true);
					rdimgPeter2.setEnabled(true);
					rdimgMiles2.setEnabled(true);
					imgGwen.setImage(imgGwen.getImage().getScaledInstance(lbImgJ2.getWidth(),lbImgJ2.getHeight(),1));
					lbImgJ2.setIcon(imgGwen);
				}else if(rdimgMiguel2.isSelected()) {
					fotoJogador="Miguel O'Hara";
					rdimgMiguel1.setEnabled(false);
					rdimgMiguel2.setEnabled(false);
					rdimgGwen2.setEnabled(true);
					rdimgPeter2.setEnabled(true);
					rdimgMiles2.setEnabled(true);
					imgMiguel.setImage(imgMiguel.getImage().getScaledInstance(lbImgJ2.getWidth(),lbImgJ2.getHeight(),1));
					lbImgJ2.setIcon(imgMiguel);
				}else {
					fotoJogador="Peter B.Paker";
					rdimgPeter1.setEnabled(false);
					rdimgPeter2.setEnabled(false);
					rdimgGwen2.setEnabled(true);
					rdimgMiguel2.setEnabled(true);
					rdimgMiles2.setEnabled(true);
					imgPeter.setImage(imgPeter.getImage().getScaledInstance(lbImgJ2.getWidth(),lbImgJ2.getHeight(),1));
					lbImgJ2.setIcon(imgPeter);
				}
				JOptionPane.showMessageDialog(null,"Nome do Jogador N° 2: "+jogador2.getNomeJogador()+"\nEscolha feita: "+jogador2.getOpcaoJogador()+"\nFoto do Jogador: "+fotoJogador,"Jogador N° 2",JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
	}
	private class BotaoJogada implements ActionListener{
		int linha, coluna, numJogadas;
		String validarOpcaoJogador, resultado;
		public BotaoJogada(int linha, int coluna) {
			this.linha=linha;
			this.coluna=coluna;
		}
		public void actionPerformed (ActionEvent evento) {
			numJogadas=jogoVelha.getContagemJogo();
			if(numJogadas==1) {
				jogoVelha.resetarJogo();
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						matrizBotoesJogada[i][j].setIcon(null);
					}
				}
				lbSuaVezJ1.setVisible(true);
				lbSuaVezJ2.setVisible(false);
				
			}
			validarOpcaoJogador=jogoVelha.fazerJogada(linha, coluna);
			
			
			if(numJogadas%2!=0) {
				lbSuaVezJ1.setVisible(true);
				lbSuaVezJ2.setVisible(false);
			}else {
				lbSuaVezJ2.setVisible(true);
				lbSuaVezJ1.setVisible(false);
			}
			
			for(int i=0; i<3; i++) {
				for (int j=0;j<3;j++) {
					if (i==linha && j==coluna) {
						if(validarOpcaoJogador==jogoVelha.getOpcaoJ1()) {
							imgX.setImage(imgX.getImage().getScaledInstance(matrizBotoesJogada[linha][coluna].getWidth(),matrizBotoesJogada[linha][coluna].getHeight(),1));
							matrizBotoesJogada[linha][coluna].setIcon(imgX);
							matrizBotoesJogada[linha][coluna].setEnabled(false);
						}else {
							imgO.setImage(imgO.getImage().getScaledInstance(matrizBotoesJogada[linha][coluna].getWidth(),matrizBotoesJogada[linha][coluna].getHeight(),1));
							matrizBotoesJogada[linha][coluna].setIcon(imgO);
							matrizBotoesJogada[linha][coluna].setEnabled(false);
						}	
					}
				}
			}
			
				
			resultado=jogoVelha.verificarVencedor();
			if(resultado==jogoVelha.getNomeJogador1()||resultado==jogoVelha.getNomeJogador2()) {
				JOptionPane.showMessageDialog(null,resultado+" ganhou essa partida!!!","Resultado", JOptionPane.INFORMATION_MESSAGE);
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						matrizBotoesJogada[i][j].setEnabled(true);
					}
				}
				lbSuaVezJ1.setVisible(true);
				lbSuaVezJ2.setVisible(false);
				lbPontuacaoJ1.setText("Pontuação: "+jogoVelha.getPontuacaoJogador1());
				lbPontuacaoJ2.setText("Pontuação: "+jogoVelha.getPontuacaoJogador2());
			}else{
				if(jogoVelha.getContagemJogo()==10) {
					JOptionPane.showMessageDialog(null,"Deu empate","Resultado",JOptionPane.INFORMATION_MESSAGE);
					lbSuaVezJ1.setVisible(true);
					lbSuaVezJ2.setVisible(false);
				}
			}
				
			
			
			
		}
	}
	private class BotaoFinalizarJogo implements ActionListener {
		String verificarVitoria;
		public void actionPerformed(ActionEvent e) {
			verificarVitoria=jogoVelha.fimJogo();
			if(verificarVitoria=="J1") {
				lbVencedor.setText(jogador1.getNomeJogador()+" Ganhou o jogo!!!");
				lbVencedor.setVisible(true);
				lbPontuacaoVencedor.setText("Pontuacao atingida: "+jogoVelha.getPontuacaoJogador1());
				lbPontuacaoVencedor.setVisible(true);
				lbImgVencedor.setIcon(lbImgJ1.getIcon());
				lbImgVencedor.setVisible(true);
			}else if(verificarVitoria=="J2"){
				lbVencedor.setText(jogador2.getNomeJogador()+" Ganhou o jogo!!!");
				lbVencedor.setVisible(true);
				lbPontuacaoVencedor.setText("Pontuacao atingida: "+jogoVelha.getPontuacaoJogador1());
				lbPontuacaoVencedor.setVisible(true);
				lbImgVencedor.setIcon(lbImgJ2.getIcon());
				lbImgVencedor.setVisible(true);
			}else {
				lbVencedor.setText("Houve Empate!!!");
				lbVencedor.setVisible(true);
			}
			lbSuaVezJ1.setVisible(true);
			lbSuaVezJ2.setVisible(false);
			jogoVelha.setPontuacaoJogador1(0);
			jogoVelha.setPontuacaoJogador2(0);
			lbPontuacaoJ1.setText("Pontuação: "+jogoVelha.getPontuacaoJogador1());
			lbPontuacaoJ2.setText("Pontuação: "+jogoVelha.getPontuacaoJogador2());
		}
	}
	private class BotaoResetarJogo implements ActionListener{
		public void actionPerformed (ActionEvent e) {
			jogoVelha.resetarJogo();
			for (int i=0;i<3;i++) {
				for (int j=0;j<3;j++) {
					matrizBotoesJogada[i][j].setIcon(null);
					matrizBotoesJogada[i][j].setEnabled(true);
				}
			}
			lbSuaVezJ1.setVisible(true);
			lbSuaVezJ2.setVisible(false);
		}
	}
}
