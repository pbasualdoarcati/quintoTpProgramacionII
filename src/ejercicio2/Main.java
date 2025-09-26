package ejercicio2;

public class Main {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos Mendoza", "45123678");
        Bateria bateria = new Bateria("LI-ION-3500", 3500);
        Celular celular = new Celular("987654321098765", "Xiaomi", "Redmi Note 12", bateria);
        usuario.setCelular(celular);
        System.out.println("Usuario: " + celular.getUsuario().getNombre());
        System.out.println("Batería: " + celular.getBateria().getModelo());
    }
    
}
