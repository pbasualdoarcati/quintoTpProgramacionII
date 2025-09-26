package ejercicio9;

public class Main {
    public static void main(String[] args) {
       
        Paciente paciente = new Paciente("Juan Perez", "OSDE");
        Profesional profesional = new Profesional("Dra. Maria Gomez", "Cardiologia");

        CitaMedica cita = new CitaMedica("2024-07-15", "10:30 AM");
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);

        System.out.println("Cita Medica:");
        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Hora: " + cita.getHora());
        System.out.println("Paciente: " + cita.getPaciente().getNombre() + " (Obra Social: " + cita.getPaciente().getObraSocial() + ")");
        System.out.println("Profesional: " + cita.getProfesional().getNombre() + " (Especialidad: " + cita.getProfesional().getEspecialidad() + ")");
    }
}
