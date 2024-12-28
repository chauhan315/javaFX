package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MyGame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 5474966999882640928L;
	
	private JLabel heading, clockLabel;
	private Font font = new Font("", Font.BOLD, 40);
	private JPanel mainPanel;
	private JButton[] btns = new JButton[9];
	
	private int gameChances[] = {2,2,2,2,2,2,2,2,2};
	private int activePlayer = 0;
	
	private int wps[][] = {
				{0,1,2},
				{3,4,5},
				{6,7,8},
				{0,3,6},
				{1,4,7},
				{2,5,8},
				{0,4,8},
				{2,4,6}
	};
	private int winner = 2;
	private Boolean gameOver = false;
	
	public MyGame() {
		setTitle("Tic-Tac-Toe");
		setSize(700, 700);
		
		//setting icon image
		ImageIcon icon = new ImageIcon("src/img/xo.jpg");
		setIconImage(icon.getImage());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createGUI();
		setVisible(true);
		
	}
	
	private void createGUI() {
		this.getContentPane().setBackground(Color.decode("#2196f3"));
		this.setLayout(new BorderLayout());
		heading = new JLabel("Tic-Tac-Toe");
		heading.setFont(font);
		heading.setForeground(Color.WHITE);
//		heading.setIcon(new ImageIcon("src/img/xo.jpg"));
		heading.setHorizontalTextPosition(SwingConstants.CENTER);
		heading.setVerticalTextPosition(SwingConstants.BOTTOM);
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(heading, BorderLayout.NORTH);
		
		clockLabel = new JLabel("Clock");
		clockLabel.setFont(font);
		clockLabel.setForeground(Color.WHITE);
		clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(clockLabel, BorderLayout.SOUTH);
		
		Thread t = new Thread() {
			public void run() {
				
					try {
						while(true) {
							String dateTime = new Date().toLocaleString();
							clockLabel.setText(dateTime);
							Thread.sleep(1000);
						}	
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
		};
		t.start();
		
		///////////JPanel Section
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3, 3));
		
		for(int i = 1; i<=9; i++) {
			JButton btn = new JButton();
//			btn.setIcon(new ImageIcon("src/img/o.jpg"));
			btn.setBackground(Color.decode("#90caf9"));
			btn.setFont(font);
			mainPanel.add(btn);
			btns[i - 1] = btn;
			btn.addActionListener(this);
			btn.setName(i-1 + "");
		}
		
		this.add(mainPanel, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton currentButton = (JButton)e.getSource();
		String btnName = currentButton.getName();
//		System.out.println(btnName);
		
		int name = Integer.parseInt(btnName.trim());
		
		if(gameOver) {
			JOptionPane.showMessageDialog(this, "Game Already Over");
			return;
		}
		
		if(gameChances[name]==2) {
			if(activePlayer == 0) {
				currentButton.setIcon(new ImageIcon("src/img/x.jpg"));
				gameChances[name] = activePlayer;
				activePlayer = 1;
			}
			else {
				currentButton.setIcon(new ImageIcon("src/img/o.jpg"));
				gameChances[name] = activePlayer;
				activePlayer = 0;
			}
			
			for(int []temp:wps) {
				if((gameChances[temp[0]] == gameChances[temp[1]]) && (gameChances[temp[1]] == gameChances[temp[2]]) && (gameChances[temp[0]] !=2)) {
					winner = gameChances[temp[0]];
					gameOver = true;
					
					JOptionPane.showMessageDialog(null, "Player " + winner + " has won the game");
					
					int i = JOptionPane.showConfirmDialog(this, "Do yoy want to play more??");
					if(i==0) {
						this.setVisible(false);
						new MyGame();
					}
					else if(i==1) {
						System.exit(0000);
					}
					System.out.println(i);
					break;
				}
				
			}
			
			//draw login
			int c = 0;
			
			for(int x:gameChances) {
				if(x==2) {
					c++;
					break;
				}
			}
			
			if(c==0 && gameOver==false) {
				JOptionPane.showMessageDialog(null, "Match Drawn");
				int i = JOptionPane.showConfirmDialog(this, "Play More???");
				if(i==0) {
					this.setVisible(false);
					new MyGame();
				}else if(i==1) {
					System.exit(0000);
				}
				gameOver=true;
			}
		}
		else {
			JOptionPane.showMessageDialog(this, "Position already occupied");		
		}
		
	}
}
