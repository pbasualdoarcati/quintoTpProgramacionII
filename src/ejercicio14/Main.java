package ejercicio14;

public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Documental de Naturaleza", 45);
        EditorVideo editor = new EditorVideo("Adobe Premiere", proyecto);
        
        System.out.println("=== Sistema de Edición de Video ===");
        System.out.println("Editor: " + editor.getNombre());
        System.out.println("Proyecto: " + proyecto.getNombre());
        System.out.println("Duración: " + proyecto.getDuracionMin() + " minutos");
        System.out.println();
        editor.exportar("AVI", proyecto);
    }
}
