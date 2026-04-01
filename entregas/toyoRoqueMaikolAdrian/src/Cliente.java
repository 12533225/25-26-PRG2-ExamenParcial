class Cliente {
    public static void main(String[] args) {
        
        System.out.println("=== INICIANDO SISTEMA DE APARCAMIENTO ===");

        Aparcamiento nuevoAparcamiento = new Aparcamiento(50);
        Aparcamiento aparcamientoVacio = new Aparcamiento();
        System.out.println("Aparcamientos inicializados correctamente.");

        Vehiculo nuevoVehiculo = new Vehiculo("1274ABC", "Coche", "Seat");
        Horario horarioPlazaElectrica = new Horario(1, 24);
        Horario horarioPlazaMoto = new Horario(8, 20);

        Plaza plazaElectrica = new Plaza("Electrica", horarioPlazaElectrica, "Disponible");
        Plaza plazaMoto = new Plaza("Moto", horarioPlazaMoto, "Disponible");

        System.out.println("\n---AGREGAR Y MOSTRAR PLAZAS ---");
        nuevoAparcamiento.agregarPlaza(0, plazaElectrica);
        nuevoAparcamiento.agregarPlaza(1, plazaMoto);
        System.out.println("Plazas agregadas en los índices 0 y 1.");

        Plaza plazaObtenida = nuevoAparcamiento.mostrarPlaza(0);
        System.out.println("Mostrando plaza en índice 0. Tipo recuperado: " + plazaObtenida.mostrarTipo());

        System.out.println("\n---ESTADO Y DISPONIBILIDAD INICIAL ---");
        System.out.println("Espacios disponibles totales: " + nuevoAparcamiento.consultarEspaciosDisponibles());
        
        System.out.println("Estado de la plaza eléctrica: " + nuevoAparcamiento.consultarEstado(plazaElectrica));

        System.out.println("\n---REGISTRAR ENTRADA ---");
        nuevoAparcamiento.registrarEntrada(plazaElectrica, 10);

        System.out.println("Nuevo estado de la plaza eléctrica: " + nuevoAparcamiento.consultarEstado(plazaElectrica));
        System.out.println("Espacios disponibles actualizados: " + nuevoAparcamiento.consultarEspaciosDisponibles());
        System.out.println("\n---EXPEDIR TARIFA ---");
        
        int tarifaPlazaElectrica = nuevoAparcamiento.expedirTarifa(10, 15, plazaElectrica);
        System.out.println("Vehículo sale a las 15:00. Tarifa a pagar (Eléctrica): " + tarifaPlazaElectrica + "€");
        
        int tarifaPlazaMoto = nuevoAparcamiento.expedirTarifa(10, 15, plazaMoto);
        System.out.println("Tarifa si hubiera sido una Moto el mismo tiempo: " + tarifaPlazaMoto + "€");
    }
}