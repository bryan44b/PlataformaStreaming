package Netflix;

public abstract class ContenidoMultimedia {
    private String titulo;

    public ContenidoMultimedia(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    // Metodo abstracto: no tiene cuerpo los hijos deben programarlo
    public abstract void reproducir();
}
