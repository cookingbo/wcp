package music;

public class Main {

	public static void main(String[] args) {
		MusicPlayer[] players = {new CdPlayer(), new Mp3Player(), new CdPlayer()};
		for (MusicPlayer player : players) {
			System.out.println(player.play());
		}

	}

}
