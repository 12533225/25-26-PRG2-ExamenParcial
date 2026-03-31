class Aparcamiento{
    private Plaza[] listadoDePlazas;

    public Aparcamiento(int numeroDePlazas){
        this.listadoDePlazas = new Plaza[numeroDePlazas];
    };

    public Aparcamiento(){
        this.listadoDePlazas = new Plaza[10];
    };

    public void agregarPlaza(int numeroDePlaza, Plaza plaza){
        this.listadoDePlazas[numeroDePlaza] = plaza;
    };

    public Plaza mostrarPlaza(int numeroDePlaza){
        return this.listadoDePlazas[numeroDePlaza];
    }

    public int expedirTarifa(int horaDeEntrada, int horaDeSalida, Plaza plaza){
        String tipo = plaza.mostrarTipo();
        int horasAparcado = horaDeSalida - horaDeEntrada;
        
        return switch (tipo) {
            case "Electrica" -> horasAparcado * 3;
            case "Normal"    -> horasAparcado * 2;
            case "Moto"      -> horasAparcado * 1;
            default          -> 0;
        }; 
    }

    public int consultarEspaciosDisponibles(){
        int disponibles = 0;
        for (Plaza plaza : this.listadoDePlazas) {
            if (plaza == null) {
                disponibles++;
            }
        }
        return disponibles;
    }

    public void registrarEntrada(Plaza plaza, int horaDeEntrada){};
    public String consultarEstado(Plaza plaza){};
}