/*
 */
package pp.dodero.david;

public class Podcast extends Contenido implements Publicitable{
    private TipoPodcast tipoPodcast;

    public Podcast(TipoPodcast tipoPodcast, Artista artista, String titulo, int duracion) {
        super(artista, titulo, duracion);
        this.tipoPodcast = tipoPodcast;
    }
    
    @Override
    public int getDuracionConPublicidad(){
        if(tipoPodcast == TipoPodcast.TECNOLOGIA){
            return duracion + 60;
        }else if(tipoPodcast == TipoPodcast.ENTRTENIMIENTO){
            return duracion + 45;
        }else { 
            return duracion + 20;
        }
    }

    @Override
    public String toString() {
        return  super.toString() + "Podcast{" + "tipoPodcast=" + tipoPodcast + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if((!super.equals(obj))) return false;
        if(!(obj instanceof Podcast)) return false;
        Podcast p = (Podcast)obj;
        return this.tipoPodcast == p.tipoPodcast;
    }
    
    
}
