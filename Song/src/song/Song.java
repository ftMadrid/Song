package song;

import javax.swing.ImageIcon;

public class Song {
        
        private int codigo;
        private String nombre;
        private double precio;
        private int sumaEstrellas = 0;
        private int totalReviews = 0;
        
        ImageIcon imagenDisco = null;
        
        public Song(int codigo, String nombre, double precio, ImageIcon imagenDisco){
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
            this.imagenDisco = imagenDisco;
        }
        
        public int getCodigo(){
            return codigo;
        }
        
        public String getNombre(){
            return nombre;
        }
        
        public double getPrecio(){
            return precio;
        }
        
        public ImageIcon getDisco(){
            return imagenDisco;
        }
        
        public void addStars(int stars){
            if(stars >= 0 && stars <= 5){
                sumaEstrellas += stars;
                totalReviews++;
            }
        }
        
        public int sonRating(){
            return sumaEstrellas / totalReviews;
        }
        
        
        
        
        
        
       
    
}
