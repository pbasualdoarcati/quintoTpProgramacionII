package ejercicio8;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Andrea Castillo", "a.castillo@empresa.com");
        Documento doc = new Documento("Acuerdo de Confidencialidad", "Este documento establece las condiciones de confidencialidad...", "hash456def", "2025-10-15", usuario);

        System.out.println("Título: " + doc.getTitulo());
        System.out.println("Contenido: " + doc.getContenido());
        System.out.println("Firmado por: " + doc.getFirma().getUsuario().getNombre());
        System.out.println("Email: " + doc.getFirma().getUsuario().getEmail());
        System.out.println("Código Hash: " + doc.getFirma().getCodigoHash());
        System.out.println("Fecha de firma: " + doc.getFirma().getFecha());
    }
}
