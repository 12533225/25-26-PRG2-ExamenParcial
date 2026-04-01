class Cliente {
    public static void main(String[] args) {
        Aparcamiento nuevoAparcamiento = new Aparcamiento(50);
        Aparcamiento aparcamientoVacio = new Aparcamiento();
        System.out.println("Aparcamientos inicializados correctamente.");

        Vehiculo nuevoVehiculo = new Vehiculo("1274ABC", "Coche", "Seat");
        Horario horarioPlazaElectrica = new Horario(1, 24);
        Horario horarioPlazaMoto = new Horario(8, 20);

        Plaza plazaElectrica = new Plaza("Electrica", horarioPlazaElectrica, "Disponible");
        Plaza plazaMoto = new Plaza("Moto", horarioPlazaMoto, "Disponible");

        nuevoAparcamiento.agregarPlaza(0, plazaElectrica);
        nuevoAparcamiento.agregarPlaza(1, plazaMoto);

        Plaza plazaObtenida = nuevoAparcamiento.mostrarPlaza(0);
        plazaObtenida.mostrarTipo();
        nuevoAparcamiento.consultarEspaciosDisponibles();
        
        nuevoAparcamiento.consultarEstado(plazaElectrica);

        nuevoAparcamiento.registrarEntrada(plazaElectrica, 10);

        nuevoAparcamiento.consultarEstado(plazaElectrica);
        nuevoAparcamiento.consultarEspaciosDisponibles();
        
        int tarifaPlazaElectrica = nuevoAparcamiento.expedirTarifa(10, 15, plazaElectrica);        
        int tarifaPlazaMoto = nuevoAparcamiento.expedirTarifa(10, 15, plazaMoto);
    }
}