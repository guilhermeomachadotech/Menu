package menu;
import javax.swing.JDesktopPane;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
public class FundoTela extends JDesktopPane{
	Image imagemFundo;
	public FundoTela(String imagemFundo) {
		this.imagemFundo=new ImageIcon(getClass().getResource(imagemFundo)).getImage();
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(imagemFundo,0,0,getWidth(),getHeight(),this);
		
	}
	
}
