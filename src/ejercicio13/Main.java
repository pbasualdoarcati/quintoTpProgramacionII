package ejercicio13;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Rodrigo Fernández", "r.fernandez@empresa.com");
        GeneradorQR generador = new GeneradorQR();
        
        System.out.println("=== Sistema Generador de Códigos QR ===");
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println();
        generador.generar("XYZ-789-DEF", usuario);
    }
}
