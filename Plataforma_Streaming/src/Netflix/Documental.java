package Netflix;

public class Documental extends ContenidoMultimedia implements Descargable{

    public Documental(String titulo){
        super(titulo);
    }
    @Override
    public void descargar() {
        System.out.println("Ha iniciado la descarga" +getTitulo());
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo Documental: "+ getTitulo());
    }
}
