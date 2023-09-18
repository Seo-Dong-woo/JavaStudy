import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GameMain extends JFrame implements KeyListener{
	GameView gv=new GameView();
	public GameMain()
	{
		add("Center", gv);
		setSize(1024, 768);
		setVisible(true);
		addKeyListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameMain();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
