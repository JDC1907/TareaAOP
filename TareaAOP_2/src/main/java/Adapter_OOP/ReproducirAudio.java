package Adapter_OOP;
import Adapter_OOP.MediaAdapter;
import Adapter_OOP.ReproductorMultimedia;


public class ReproducirAudio implements ReproductorMultimedia{
	private MediaAdapter mediaAdapter;

    @Override
    public void play(String tipoAudio, String nombreArchivo) {
        if (tipoAudio.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + nombreArchivo);
        } else if (tipoAudio.equalsIgnoreCase("vlc") || tipoAudio.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(tipoAudio);
            mediaAdapter.play(tipoAudio, nombreArchivo);
        } else {
            System.out.println("Invalid media type. Only MP3, VLC, and MP4 formats are supported.");
        }
    }

}
