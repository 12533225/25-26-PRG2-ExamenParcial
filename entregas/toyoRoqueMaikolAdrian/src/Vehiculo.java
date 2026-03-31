class Vehiculo{
    private String placa;
    private String tipo;
    private String modelo;

    public Vehiculo(String placa, String tipo, String modelo){
        this.placa = placa;
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public String mostrarTipo(){
        return this.tipo;
    }

    public String mostrarPlaca(){
        return this.placa;
    }

    public String mostrarModelo(){
        return this.modelo;
    }
}