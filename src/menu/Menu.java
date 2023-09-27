package menu;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import calculadoraBasica.Calculadora;
import orçamento.LojaMultimarcas;
import strangerThings.FormStrangerThings;
import sobreNos.SobreNos;
import jogoDaVelha.AppJogoDaVelha;
import java.awt.GridLayout;
public class Menu extends JFrame{
	FundoTela tela;
	public Menu() {
		
		this.setSize(800,600);
		this.setTitle("Menu");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setExtendedState(MAXIMIZED_BOTH);
		tela=new FundoTela("./Imagens/fundoOuro.jpg");
		this.getContentPane().add(tela);
	
		JMenu arq=new JMenu("Arquivo");
		JMenu aju=new JMenu ("Ajuda");
		JMenu form=new JMenu ("Formulário");
		JMenu math =new JMenu ("Matemática");
		JMenu loja=new JMenu ("Loja");
		JMenu jogo=new JMenu ("Jogo");
		
		JMenuItem sair = new JMenuItem ("Sair");
		JMenuItem sobre = new JMenuItem ("Sobre");
		JMenuItem strangerThings = new JMenuItem ("Stranger Things");
		JMenuItem calc = new JMenuItem("Calculadora");
		JMenuItem lojaOrc= new JMenuItem("Orçamento do Carro");
		JMenuItem jogoDaVelha= new JMenuItem("Jogo da Velha");
		
		arq.add(sair);
		aju.add(sobre);
		math.add(calc);
		form.add(strangerThings);
		loja.add(lojaOrc);
		jogo.add(jogoDaVelha);
		
		JMenuBar bar=new JMenuBar();
		this.setJMenuBar(bar);
		bar.add(arq);
		bar.add(form);
		bar.add(math);
		bar.add(loja);
		bar.add(aju);
		bar.add(jogo);
		
		//Ações do botões
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		calc.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				Calculadora calculadora=new Calculadora ();
			}
		});
		
		strangerThings.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				FormStrangerThings sT=new FormStrangerThings();
			}
		});
		
		lojaOrc.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				LojaMultimarcas lojaOrc=new LojaMultimarcas();
			}
		});
		sobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SobreNos sobreNos=new SobreNos();
				//sobreNos.setVisible(true);
			}
		});
		jogoDaVelha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppJogoDaVelha appJGV=new AppJogoDaVelha();
				appJGV.setVisible(true);
			}
		});
		this.setLayout(new GridLayout());
		this.setVisible(true);
		
	}
}
