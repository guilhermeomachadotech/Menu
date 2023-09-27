package orçamento;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
public class LojaMultimarcas extends JDialog{

	JLabel Nome, lbMarca, lbModelo, Celular, Email, lbImagemMarca, lbImagemCarro, lbCores, lbOpcionais, lbImgLogo; 
	JTextField txNome, txCelular, txEmail;
	JComboBox cbMarca, cbModelo;
	JRadioButton rbCor1, rbCor2, rbCor3;
	JCheckBox ckOpcional1, ckOpcional2, ckOpcional3, ckOpcional4;
	ButtonGroup bgCores;
	JButton btEnviar, btCancelar;
	ImageIcon imgCarroPadrao, imgLogo;
	Color colorFundo, colorFonteLabel, colorFonteInput, colorFundoBotao, colorFonteBotao;
	Font fontInput, fontLabel, fontTitulo, fontBotao;
	//double[][]valorCarro={{1.25,2.44,2.45},{2.22,2.34,2.55},{2.22,2.22,2.32}};
	private double totalOrcamento; 
	
	public LojaMultimarcas() {
		//Instanciamento de objetos do tipo Marca e Carro
		Carro nissanSentra = new Carro();
		Carro nissanKicks = new Carro();
		Carro nissanLeaf= new Carro();
		Carro camaro= new Carro();
		Carro cruze=new Carro();
		Carro tracker= new Carro();
		Carro porsche911=new Carro();
		Carro macanT=new Carro();
		Carro panamera=new Carro();
		
		MarcaCarro nissan=new MarcaCarro();
		MarcaCarro chevrolet= new MarcaCarro();
		MarcaCarro porsche=new MarcaCarro();
		//Pasando valores para o objeto;
		//Nomes das marcas
		nissan.setNomeMarca("Nissan");
		chevrolet.setNomeMarca("Chevrolet");
		porsche.setNomeMarca("Porsche");
		//Nomes dos modelos
		nissanSentra.setNomeCarro("Sentra");
		nissanSentra.setValorCarro(148490.00);
		nissanSentra.setNomeMarca(nissan.getNomeMarca());
		
		nissanLeaf.setNomeCarro("Leaf");
		nissanLeaf.setValorCarro(293790.00);
		nissanLeaf.setNomeMarca(nissan.getNomeMarca());
		
		nissanKicks.setNomeCarro("Kicks");
		nissanKicks.setValorCarro(112990.00);
		nissanKicks.setNomeMarca(nissan.getNomeMarca());
		
		camaro.setNomeCarro("Camaro");
		camaro.setValorCarro(521390.00);
		camaro.setNomeMarca(chevrolet.getNomeMarca());
		
		cruze.setNomeCarro("Cruze");
		cruze.setValorCarro(149390.00);
		cruze.setNomeMarca(chevrolet.getNomeMarca());
		
		tracker.setNomeCarro("Tracker");
		tracker.setValorCarro(128350.00);
		tracker.setNomeMarca(chevrolet.getNomeMarca());
		
		porsche911.setNomeCarro("911 Turbo");
		porsche911.setValorCarro(1679000.00);
		porsche911.setNomeMarca(porsche.getNomeMarca());
		
		macanT.setNomeCarro("Macan-T");
		macanT.setValorCarro(479000.00);
		macanT.setNomeMarca(porsche.getNomeMarca());
		
		panamera.setNomeCarro("Panamera Turbo S E-Hybrid");
		panamera.setValorCarro(1269000.00);
		panamera.setNomeMarca(porsche.getNomeMarca());
		//Cores
		colorFundo=new Color(17,129,153);
		colorFonteLabel=new Color (242,245,247);
		colorFonteInput=new Color (242,245,247);
		colorFonteBotao=new Color (71,89,86);
		colorFundoBotao=new Color (242,242,242);
		//Fonte
		fontTitulo=new Font("Arial-Black",Font.BOLD,30);
		fontInput=new Font("Arial-Black",Font.BOLD,13);
		fontLabel=new Font("Arial-Black",Font.BOLD,15);
		fontBotao=new Font("Arial-Black",Font.BOLD,15);
		this.setTitle("Orçamento");
		this.setSize(600,500);
		this.setLocationRelativeTo(null);
		this.setModal(true);
		this.setResizable(false);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(colorFundo);
		
		imgLogo=new ImageIcon(getClass().getResource("./Img/logoCarro.png"));
		imgCarroPadrao=new ImageIcon(getClass().getResource("./Img/carro-padrao.png"));
		
		lbImagemMarca=new JLabel();
		lbImagemMarca.setBounds(390,120,80,80);
		lbImagemMarca.setText("Marca aqui");
		add(lbImagemMarca);
		
		lbImagemCarro=new JLabel ();
		lbImagemCarro.setBounds(340, 200, 170, 170);
		imgCarroPadrao.setImage(imgCarroPadrao.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
		lbImagemCarro.setIcon(imgCarroPadrao);
		add(lbImagemCarro);
		
		
		lbImgLogo=new JLabel();
		lbImgLogo.setBounds(200,0,170,80);
		imgLogo.setImage(imgLogo.getImage().getScaledInstance(lbImgLogo.getWidth(),lbImgLogo.getHeight(),1));
		lbImgLogo.setIcon(imgLogo);
		add(lbImgLogo);
		
		Nome=new JLabel ();
		Nome.setBounds(10, 90, 100, 20);
		Nome.setText("Nome:");
		Nome.setForeground(colorFonteLabel);
		Nome.setFont(fontLabel);
		add(Nome);
		
		txNome=new JTextField();
		txNome.setBounds (60, 90, 140, 20);
		txNome.setText("Coloque seu nome:");
		add(txNome);
		
		Celular=new JLabel ();
		Celular.setBounds(210, 90, 90, 20);
		Celular.setText("Celular:");
		Celular.setFont(fontLabel);
		Celular.setForeground(colorFonteLabel);
		add(Celular);
		
		txCelular=new JTextField();
		txCelular.setBounds (270, 90, 100, 20);
		add(txCelular);
	
		Email=new JLabel ();
		Email.setBounds(380, 90, 90, 20);
		Email.setText("Email:");
		Email.setFont(fontLabel);
		Email.setForeground(colorFonteLabel);
		add(Email);
		
		txEmail=new JTextField();
		txEmail.setBounds (430, 90, 130, 20);
		add(txEmail);
		
		//Combo
		lbMarca=new JLabel ();
		lbMarca.setBounds(15, 120, 70, 20);
		lbMarca.setText("Marca:");
		lbMarca.setFont(fontLabel);
		lbMarca.setForeground(colorFonteLabel);
		add(lbMarca);
		
		cbMarca=new JComboBox();
		cbMarca.setBounds (15, 145, 170, 20);
		/*cbMarca.addItem("Nissan");
		cbMarca.addItem("Chevrolet");
		cbMarca.addItem("Porsche");*/
		cbMarca.addItem(nissan.getNomeMarca());
		cbMarca.addItem(chevrolet.getNomeMarca());
		cbMarca.addItem(porsche.getNomeMarca());
		add(cbMarca);
		
		lbModelo=new JLabel ();
		lbModelo.setBounds(15, 170, 60, 20);
		lbModelo.setText("Modelo:");
		lbModelo.setForeground(colorFonteLabel);
		lbModelo.setFont(fontLabel);
		add(lbModelo);
		
		cbModelo=new JComboBox();
		cbModelo.setBounds (15, 195, 170, 20);
		add(cbModelo);
		//Radio Button
		lbCores=new JLabel();
		lbCores.setBounds(15,230,100,20);
		lbCores.setText("Cor do carro: ");
		lbCores.setForeground(colorFonteLabel);
		lbCores.setFont(fontLabel);
		add(lbCores);
		
		rbCor1=new JRadioButton();
		rbCor1.setBounds(15, 250, 60, 20);
		rbCor1.setText("Prata");
		rbCor1.setForeground(colorFonteInput);
		rbCor1.setFont(fontInput);
		rbCor1.setBackground(colorFundo);
		add(rbCor1);
		
		rbCor2=new JRadioButton();
		rbCor2.setBounds(80, 250, 60, 20);
		rbCor2.setText("Preto");
		rbCor2.setForeground(colorFonteInput);
		rbCor2.setFont(fontInput);
		rbCor2.setBackground(colorFundo);
		add(rbCor2);
		
		rbCor3=new JRadioButton();
		rbCor3.setBounds(145, 250, 70, 20);
		rbCor3.setText("Branco");
		rbCor3.setForeground(colorFonteInput);
		rbCor3.setFont(fontInput);
		rbCor3.setBackground(colorFundo);
		add(rbCor3);
		
		bgCores=new ButtonGroup();
		bgCores.add(rbCor1);
		bgCores.add(rbCor2);
		bgCores.add(rbCor3);
		
		//CheckBox
		lbOpcionais=new JLabel();
		lbOpcionais.setBounds(15, 280, 80, 20);
		lbOpcionais.setText("Opcionais:");
		lbOpcionais.setForeground(colorFonteLabel);
		lbOpcionais.setFont(fontLabel);
		add(lbOpcionais);
		
		ckOpcional1=new JCheckBox();
		ckOpcional1.setBounds(15, 305, 135, 20);
		ckOpcional1.setText("Ar Condicionado");
		ckOpcional1.setForeground(colorFonteInput);
		ckOpcional1.setFont(fontInput);
		ckOpcional1.setBackground(colorFundo);
		add(ckOpcional1);
		
		ckOpcional2=new JCheckBox();
		ckOpcional2.setBounds(15, 330, 145, 20);
		ckOpcional2.setText("Direção Hidráulica");
		ckOpcional2.setForeground(colorFonteInput);
		ckOpcional2.setFont(fontInput);
		ckOpcional2.setBackground(colorFundo);
		add(ckOpcional2);
		
		ckOpcional3=new JCheckBox();
		ckOpcional3.setBounds(160, 305, 135, 20);
		ckOpcional3.setText("Rodas Liga Leve");
		ckOpcional3.setForeground(colorFonteInput);
		ckOpcional3.setFont(fontInput);
		ckOpcional3.setBackground(colorFundo);
		add(ckOpcional3);
		
		ckOpcional4=new JCheckBox();
		ckOpcional4.setBounds(160, 330, 130, 20);
		ckOpcional4.setText("Kit Multimídia");
		ckOpcional4.setForeground(colorFonteInput);
		ckOpcional4.setFont(fontInput);
		ckOpcional4.setBackground(colorFundo);
		add(ckOpcional4);
		
		//Botões
		btEnviar=new JButton();
		btEnviar.setBounds(150, 400, 120, 30);
		btEnviar.setText("ENVIAR");
		btEnviar.setBackground(colorFundoBotao);
		btEnviar.setForeground(colorFonteBotao);
		btEnviar.setFont(fontBotao);
		add(btEnviar);
		
		btCancelar=new JButton();
		btCancelar.setBounds(300, 400, 120, 30);
		btCancelar.setText("CANCELAR");
		btCancelar.setBackground(colorFundoBotao);
		btCancelar.setForeground(colorFonteBotao);
		btCancelar.setFont(fontBotao);
		add(btCancelar);
		//Action Listener
		cbMarca.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String marcaCarro;
				marcaCarro=cbMarca.getSelectedItem().toString();
				if (marcaCarro=="Nissan") {
					cbModelo.removeAllItems();
					cbModelo.addItem(nissanSentra.getNomeCarro());
					cbModelo.addItem(nissanKicks.getNomeCarro());
					cbModelo.addItem(nissanLeaf.getNomeCarro());
					ImageIcon imgNissanLogo=new ImageIcon(getClass().getResource("./Img/Nissan/nissan logo.png"));
					imgNissanLogo.setImage(imgNissanLogo.getImage().getScaledInstance(lbImagemMarca.getWidth(),lbImagemMarca.getHeight(),1));
					lbImagemMarca.setIcon(imgNissanLogo);
				}else if (marcaCarro=="Chevrolet") {
					cbModelo.removeAllItems();
					cbModelo.addItem(tracker.getNomeCarro());
					cbModelo.addItem(cruze.getNomeCarro());
					cbModelo.addItem(camaro.getNomeCarro());
					ImageIcon imgChevroletLogo=new ImageIcon(getClass().getResource("./Img/Chevrolet/chevroleteLogo.png"));
					imgChevroletLogo.setImage(imgChevroletLogo.getImage().getScaledInstance(lbImagemMarca.getWidth(),lbImagemMarca.getHeight(),1));
					lbImagemMarca.setIcon(imgChevroletLogo);
				}else {
					cbModelo.removeAllItems();
					cbModelo.addItem(porsche911.getNomeCarro());
					cbModelo.addItem(macanT.getNomeCarro());
					cbModelo.addItem(panamera.getNomeCarro());
					ImageIcon imgPorscheLogo=new ImageIcon(getClass().getResource("./Img/Porsche/porscheLogo.png"));
					imgPorscheLogo.setImage(imgPorscheLogo.getImage().getScaledInstance(lbImagemMarca.getWidth(),lbImagemMarca.getHeight(),1));
					lbImagemMarca.setIcon(imgPorscheLogo);
				}
				
			}
		});
		
		rbCor1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int marca=-1, modelo=-1;
				marca=cbMarca.getSelectedIndex();
				modelo=cbModelo.getSelectedIndex();
				if(modelo==-1) {
					JOptionPane.showMessageDialog(null,"Voce não escolheu o modelo do carro!","Erro",JOptionPane.ERROR_MESSAGE);
				}else {
					if(marca==0) {
						if(modelo==0) {
							ImageIcon imgNissanSentraPrata=new ImageIcon(getClass().getResource("./Img/Nissan/Nissan sentra prata.jpg"));
							imgNissanSentraPrata.setImage(imgNissanSentraPrata.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgNissanSentraPrata);
						}else if(modelo==1) {
							ImageIcon imgNissanKicksPrata=new ImageIcon(getClass().getResource("./Img/Nissan/Nissan kicks prata.png"));
							imgNissanKicksPrata.setImage(imgNissanKicksPrata.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgNissanKicksPrata);
						}else {
							ImageIcon imgNissanLeafPrata=new ImageIcon(getClass().getResource("./Img/Nissan/nissan leaf prata.png"));
							imgNissanLeafPrata.setImage(imgNissanLeafPrata.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgNissanLeafPrata);
						}
					}else if(marca==1) {
						if(modelo==0) {
							ImageIcon imgChevroletTrackerPrata=new ImageIcon(getClass().getResource("./Img/Chevrolet/tracker-prata.png"));
							imgChevroletTrackerPrata.setImage(imgChevroletTrackerPrata.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgChevroletTrackerPrata);
						}else if(modelo==1) {
							ImageIcon imgChevroletCruzePrata=new ImageIcon(getClass().getResource("./Img/Chevrolet/cruze-prata.png"));
							imgChevroletCruzePrata.setImage(imgChevroletCruzePrata.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgChevroletCruzePrata);
						}else {
							ImageIcon imgChevroletCamaroPrata=new ImageIcon(getClass().getResource("./Img/Chevrolet/camaro-prata.png"));
							imgChevroletCamaroPrata.setImage(imgChevroletCamaroPrata.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgChevroletCamaroPrata);
						}
					}else {
						if(modelo==0) {
							ImageIcon imgPorsche991Prata=new ImageIcon(getClass().getResource("./Img/Porsche/991-turbo-prata.png"));
							imgPorsche991Prata.setImage(imgPorsche991Prata.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgPorsche991Prata);
						}else if(modelo==1) {
							ImageIcon imgPorscheMacanTPrata=new ImageIcon(getClass().getResource("./Img/Porsche/macan-t-prata.png"));
							imgPorscheMacanTPrata.setImage(imgPorscheMacanTPrata.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgPorscheMacanTPrata);
						}else {
							ImageIcon imgPorschePanameraPrata=new ImageIcon(getClass().getResource("./Img/Porsche/panamera-prata.png"));
							imgPorschePanameraPrata.setImage(imgPorschePanameraPrata.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgPorschePanameraPrata);
						}
					}
				}
				
			}
		});
		rbCor2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int marca, modelo=-1;
				marca=cbMarca.getSelectedIndex();
				modelo=cbModelo.getSelectedIndex();
				if(modelo==-1) {
					JOptionPane.showMessageDialog(null,"Voce não escolheu o modelo do carro!","Erro",JOptionPane.ERROR_MESSAGE);
				}else {
					if(marca==0) {
						if(modelo==0) {
							ImageIcon imgNissanSentraPreto=new ImageIcon(getClass().getResource("./Img/Nissan/Nissan sentra.jpg"));
							imgNissanSentraPreto.setImage(imgNissanSentraPreto.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgNissanSentraPreto);
						}else if(modelo==1) {
							ImageIcon imgNissanKicksPreto=new ImageIcon(getClass().getResource("./Img/Nissan/Nissan kicks preto.png"));
							imgNissanKicksPreto.setImage(imgNissanKicksPreto.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgNissanKicksPreto);
						}else {
							ImageIcon imgNissanLeafPreto=new ImageIcon(getClass().getResource("./Img/Nissan/nissan leaf preto.png"));
							imgNissanLeafPreto.setImage(imgNissanLeafPreto.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgNissanLeafPreto);
						}
					}else if(marca==1) {
						if(modelo==0) {
							ImageIcon imgChevroletTrackerPreto=new ImageIcon(getClass().getResource("./Img/Chevrolet/tracker-preto.png"));
							imgChevroletTrackerPreto.setImage(imgChevroletTrackerPreto.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgChevroletTrackerPreto);
						}else if(modelo==1) {
							ImageIcon imgChevroletCruzePreto=new ImageIcon(getClass().getResource("./Img/Chevrolet/cruze-preto.png"));
							imgChevroletCruzePreto.setImage(imgChevroletCruzePreto.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgChevroletCruzePreto);
						}else {
							ImageIcon imgChevroletCamaroPreto=new ImageIcon(getClass().getResource("./Img/Chevrolet/camaro-preto.png"));
							imgChevroletCamaroPreto.setImage(imgChevroletCamaroPreto.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgChevroletCamaroPreto);
						}
					}else {
						if(modelo==0) {
							ImageIcon imgPorsche991Preto=new ImageIcon(getClass().getResource("./Img/Porsche/991-turbo-preto.png"));
							imgPorsche991Preto.setImage(imgPorsche991Preto.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgPorsche991Preto);
						}else if(modelo==1) {
							ImageIcon imgPorscheMacanTPreto=new ImageIcon(getClass().getResource("./Img/Porsche/macan-t-preto.png"));
							imgPorscheMacanTPreto.setImage(imgPorscheMacanTPreto.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgPorscheMacanTPreto);
						}else {
							ImageIcon imgPorschePanameraPreto=new ImageIcon(getClass().getResource("./Img/Porsche/panamera-preto.png"));
							imgPorschePanameraPreto.setImage(imgPorschePanameraPreto.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgPorschePanameraPreto);
						}
					}
				}
				
			}
		});
		
		rbCor3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int marca, modelo=-1;
				marca=cbMarca.getSelectedIndex();
				modelo=cbModelo.getSelectedIndex();
				if (modelo==-1){
					JOptionPane.showMessageDialog(null,"Voce não escolheu o modelo do carro!","Erro",JOptionPane.ERROR_MESSAGE);
				}else {
					if(marca==0) {
						if(modelo==0) {
							ImageIcon imgNissanSentraBranco=new ImageIcon(getClass().getResource("./Img/Nissan/Nissan sentra branco.png"));
							imgNissanSentraBranco.setImage(imgNissanSentraBranco.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgNissanSentraBranco);
						}else if(modelo==1) {
							ImageIcon imgNissanKicksBranco=new ImageIcon(getClass().getResource("./Img/Nissan/nissan kicks branco.png"));
							imgNissanKicksBranco.setImage(imgNissanKicksBranco.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgNissanKicksBranco);
						}else {
							ImageIcon imgNissanLeafBranco=new ImageIcon(getClass().getResource("./Img/Nissan/nissan leaf branco.png"));
							imgNissanLeafBranco.setImage(imgNissanLeafBranco.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgNissanLeafBranco);
						}
					}else if(marca==1) {
						if(modelo==0) {
							ImageIcon imgChevroletTrackerBranco=new ImageIcon(getClass().getResource("./Img/Chevrolet/tracker-branco.png"));
							imgChevroletTrackerBranco.setImage(imgChevroletTrackerBranco.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgChevroletTrackerBranco);
						}else if(modelo==1) {
							ImageIcon imgChevroletCruzeBranco=new ImageIcon(getClass().getResource("./Img/Chevrolet/cruze-branco.png"));
							imgChevroletCruzeBranco.setImage(imgChevroletCruzeBranco.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgChevroletCruzeBranco);
						}else {
							ImageIcon imgChevroletCamaroBranco=new ImageIcon(getClass().getResource("./Img/Chevrolet/camaro-branco.png"));
							imgChevroletCamaroBranco.setImage(imgChevroletCamaroBranco.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgChevroletCamaroBranco);
						}
					}else {
						if(modelo==0) {
							ImageIcon imgPorsche991Branco=new ImageIcon(getClass().getResource("./Img/Porsche/991-turbo-branco.png"));
							imgPorsche991Branco.setImage(imgPorsche991Branco.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgPorsche991Branco);
						}else if(modelo==1) {
							ImageIcon imgPorscheMacanTBranco=new ImageIcon(getClass().getResource("./Img/Porsche/macan-t-branco.png"));
							imgPorscheMacanTBranco.setImage(imgPorscheMacanTBranco.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgPorscheMacanTBranco);
						}else {
							ImageIcon imgPorschePanameraBranco=new ImageIcon(getClass().getResource("./Img/Porsche/panamera-branco.png"));
							imgPorschePanameraBranco.setImage(imgPorschePanameraBranco.getImage().getScaledInstance(lbImagemCarro.getWidth(),lbImagemCarro.getHeight(),1));
							lbImagemCarro.setIcon(imgPorschePanameraBranco);
						}
					}
				}
				
			}
		});
		
		btEnviar.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				String nome, email, celular, modelo, marca="", cor, opcional="";
				nome=txNome.getText();
				email=txEmail.getText();
				celular=txCelular.getText();
				modelo=cbModelo.getSelectedItem().toString();
				marca=cbMarca.getSelectedItem().toString();
				if(modelo=="Sentra") {
					totalOrcamento=nissanSentra.getValorCarro();
				}else if(modelo=="Kicks"){
					totalOrcamento=nissanKicks.getValorCarro();
				}else if(modelo=="Leaf") {
					totalOrcamento=nissanLeaf.getValorCarro();
				}else if(modelo=="Tracker") {
					totalOrcamento=tracker.getValorCarro();
				}else if(modelo=="Camaro") {
					totalOrcamento=camaro.getValorCarro();
				}else if(modelo=="Cruze") {
					totalOrcamento=cruze.getValorCarro();
				}else if(modelo=="911 Turbo") {
					totalOrcamento=porsche911.getValorCarro();
				}else if (modelo=="Macan-T") {
					totalOrcamento=macanT.getValorCarro();
				}else {
					totalOrcamento=panamera.getValorCarro();
				}
					if(rbCor1.isSelected()) {
						cor=rbCor1.getText();
					}else if(rbCor2.isSelected()){
						cor=rbCor2.getText();
					}else {
						cor=rbCor3.getText();
					}
					if(ckOpcional1.isSelected()) {
						opcional=opcional+" "+ckOpcional1.getText();
						totalOrcamento=totalOrcamento+20.00;
					}
					if(ckOpcional2.isSelected()) {
						opcional=opcional+" "+ckOpcional2.getText();
						totalOrcamento=totalOrcamento+30.00;
					}
					if(ckOpcional3.isSelected()) {
						opcional=opcional+" "+ckOpcional3.getText();
						totalOrcamento=totalOrcamento+15.00;
					}
					if(ckOpcional4.isSelected()){
						opcional=opcional+" "+ckOpcional4.getText();
						totalOrcamento=totalOrcamento+25.00;
					}
					JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nCelular: "+celular+"\nEmail: "+email+"\nMarca do carro: "+marca+"\nModelo: "+modelo+"\nCor: "+cor+"\nOpcionais: "+opcional+"\nTotal do orçamento: R$ "+totalOrcamento, "Resultado do Orçamento", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbModelo.removeAllItems();
			}
		});
				
		this.setLayout(null);
		this.setVisible(true);
		
	}
	public void setTotalOrcamento(double totalOrcamento) {
		this.totalOrcamento=totalOrcamento;
	}
	public double getTotalOrcamento() {
		return totalOrcamento;
	}
}