package song;

import javax.swing.ImageIcon;

public class JTunes {

    public static Song[] canciones;
    public static int cantidadCanciones = 0;

    public JTunes(int capacidad) {
        canciones = new Song[capacidad];
    }

    public boolean addSong(int codigo, String nombre, double precio, ImageIcon imagenDisco) {
        if (searchSong(codigo) == null) {
            for (int i = 0; i < canciones.length; i++) {
                if (canciones[i] == null) {
                    canciones[i] = new Song(codigo, nombre, precio, imagenDisco);
                    return true;
                }
            }
        }
        return false;
    }

    public Song searchSong(int codigo) {
        for (Song cancion : canciones) {
            if (cancion != null && codigo == cancion.getCodigo()) {
                return cancion;
            }
        }
        return null;
    }

    public Song rateSong(int codigo, int star) {
        for (Song cancion : canciones) {
            if (cancion != null && cancion.getCodigo() == codigo) {
                cancion.addStars(star);
                return cancion;
            }
        }
        return null;
    }

    public Song[] getAllSongs() {
        return canciones;
    }
}
