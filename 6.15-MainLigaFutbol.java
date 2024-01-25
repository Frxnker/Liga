import java.io.*;

class LigaFutbol {
    
    private static String nombreEq;
    private static int partJug;
    private static int partGan;
    private static int partEmp;
    private static int partPer;
    private static int puntos;


    public static void main(String[] args) {

        int opcion = 0;
        System.out.println("Bienvenido a la Liga de fútbol");
        do {
            System.out.println("1. Añadir un equipo");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Ordenar equipos");
            System.out.println("4. Buscar un equipo");
            System.out.println("5. Borrar un equipo");
            System.out.println("6. Modificar un equipo");
            System.out.println("0. Salir");

            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1: añadirEquipos();
                    break;
                case 2: mostrarEquipos();
                    break;
                case 3: ordenarEquipos();
                    break;
                case 4: buscarEquipos();
                    break;
                case 5: borrarEquipos();
                    break;
                case 6: modificarEquipos();
                    break;
                case 0: System.out.println("Hasta la próxima");
                    break;
                default: System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 0);

    }

    public static void añadirEquipos() {
            System.out.println("Introduce los datos del nuevo equipo");
            System.out.println("Nombre del equipo: ");
            String nombreEq = System.console().readLine();
            System.out.println("Los partidos jugados:");
            int partJug = Integer.parseInt(System.console().readLine());
            System.out.println("Los partidos ganados:");
            int partGan = Integer.parseInt(System.console().readLine());
            System.out.println("Los partidos empatados:");
            int partEmp = Integer.parseInt(System.console().readLine());
            System.out.println("Los partidos perdidos:");
            int partPer = Integer.parseInt(System.console().readLine());

            // Puntos = partGanados * 3 + partEmpatados
            int puntos = partGan * 3 + partEmp;
            FicheroFutbol fb = new FicheroFutbol();
            int result = fb.guardar(nombreEq, partJug, partGan, partEmp, partPer, puntos);
            if (result == 0) {
                System.out.println("El equipo se ha añadido correctamente");
            }
            else {
                System.out.println("Ha habido un error al añadir el equipo");
            }
        }


    public static void mostrarEquipos() {
        System.out.println("Actualmente la tabla de equipos se encuentra asi:");
        FicheroFutbol fb = new FicheroFutbol();
        System.out.println("Equipos               PartidosJug               PartidosGan               PartidosEmp               PartidosPer               Puntos");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        int result = fb.mostrar(nombreEq, partJug, partGan, partEmp, partPer, puntos);
    }

    public static void ordenarEquipos() {
        System.out.println("Introduce el nombre del equipo que quieres buscar");
        String nombre = System.console().readLine();
        FicheroFutbol fb = new FicheroFutbol();
        int result = fb.ordenar(nombre);
    }

    public static void buscarEquipos() {
        System.out.println("Introduce el nombre del equipo que quieres buscar");
        String nombre = System.console().readLine();
        FicheroFutbol fb = new FicheroFutbol();
    }

    public static void borrarEquipos() {
        System.out.println("Introduce el nombre del equipo que quieres borrar");
        String nombre = System.console().readLine();
        FicheroFutbol fb = new FicheroFutbol();
        fb.borrar(nombre);
    }

    public static void modificarEquipos() {
        System.out.println("Introduce el nombre del equipo que quieres modificar");
        String nombre = System.console().readLine();
        FicheroFutbol fb = new FicheroFutbol();
        fb.modificar(nombre);
    }
}
