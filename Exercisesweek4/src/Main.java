import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		//exercise1();
		//exercise2("nope");
		//System.out.println(exercise3(3,2));		
		//System.out.print(exercise4(10));
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temp frame = new temp();
					frame.setVisible(true);
					} catch (Exception e) {
					e.printStackTrace();
					}
				}
			});
	}

}
