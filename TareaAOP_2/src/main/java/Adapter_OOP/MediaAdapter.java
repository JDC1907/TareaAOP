package Adapter_OOP;
import Adapter_OOP.ReproductorMultimedia;

public class MediaAdapter implements ReproductorMultimedia {
	
	private ReproductorAvanzado reproductorAvanzado;

    public MediaAdapter(String tipoAudio) {
        if (tipoAudio.equalsIgnoreCase("vlc")) {
        	reproductorAvanzado = new ReproductorAvanzado();
        }else
            reproductorAvanzado = new ReproductorAvanzado();
    }

    @Override
    public void play(String tipoAudio, String nombreArchivo) {
        if (tipoAudio.equalsIgnoreCase("vlc")) {
        	reproductorAvanzado.playVlc(nombreArchivo);
        } else if (tipoAudio.equalsIgnoreCase("mp4")) {
        	reproductorAvanzado.playMp4(nombreArchivo);
        }
    }

}
