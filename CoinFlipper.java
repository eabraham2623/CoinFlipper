import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CoinFlipper 
{
	public static void main(String[] args)
	{
				
		CoinFlipper2 coin = new CoinFlipper2();
		coin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		coin.setSize(250, 100);
		coin.setLocationRelativeTo(null);
		coin.setVisible(true);
		
	}
}
