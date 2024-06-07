package _06_Network;


public class Client {
	public static void main(String[] args) {
		SoundPlayer sp = new SoundPlayer();
		sp.setPlayInter(new Wav());
		sp.play();
		
		sp.setPlayInter(new Mp3());
		sp.play();
		
	

	}

}
