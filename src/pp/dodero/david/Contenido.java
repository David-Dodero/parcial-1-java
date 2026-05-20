/*
 */
package pp.dodero.david;

import java.util.Random;

import java.util.Random;

public abstract class Contenido implements Comparable<Contenido>{
    protected Artista artista;
    protected String titulo; 
    protected int duracion;
    protected int likes;
    protected static Random generadorlikes;
    
    static {
        generadorlikes = new Random();
    }
    
    public Contenido(Artista artista, String titulo, int duracion) {
        this.artista = artista;
        this.titulo = titulo;
        this.duracion = duracion;
    }
    
   
    public int getLikes() {
        if(likes == 0){
            likes = generadorlikes.nextInt(1000000) + 1;
        }
        return likes;
    }
    
    private static String mostrar(Contenido c){
        return "Titulo: " + c.titulo + " Artista: "+ c.artista.getArtista() + " Likes: " + c.getLikes();
    }
    
    public static boolean sonIguales(Contenido c1, Contenido c2){
        return c1.titulo.equals(c2.titulo) && Artista.sonIguales(c1.artista, c2.artista);
        
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Contenido)) return false;
        Contenido c = (Contenido) obj;
        return sonIguales(this, c);
    }

    @Override
    public String toString() {
        return "Contenido{" + "artista=" + artista + ", titulo=" + titulo + ", likes=" + likes + '}';
    }

    @Override
    public int compareTo(Contenido otro){
        String apellido1 = this.artista.getApellido() + this.artista.getNombre();
        String apellido2 = otro.artista.getApellido() + otro.artista.getNombre();
        int resultado = apellido1.compareTo(apellido2);
        if(resultado == 0){
            return this.titulo.compareTo(otro.titulo);
        }
        return resultado;
    }
    
    





}
