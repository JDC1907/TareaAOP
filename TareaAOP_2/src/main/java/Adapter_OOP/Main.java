package Adapter_OOP;

public class Main {

	public static void main(String[] args) {
		ReproducirAudio reproducirAudio = new ReproducirAudio();

		reproducirAudio.play("mp3", "song.mp3");
		reproducirAudio.play("vlc", "movie.vlc");
		reproducirAudio.play("mp4", "video.mp4");
		reproducirAudio.play("avi", "video.avi");
    }

	}


