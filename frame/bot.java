import javax.swing.JFrame;
class bot{
	bot(){
		JFrame frame=new JFrame();
		//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(600, 600);
	}
	public static void main(String[] args) {
		new bot();
	}
}