class Horario{
    private int horaDeInicio;
    private int horaDeFin;

    public Horario(int horaDeInicio, int horaDeFin){
        this.horaDeInicio = horaDeInicio;
        this.horaDeFin = horaDeFin;
    }

    public int mostrarInicio(){
        return this.horaDeInicio;
    }

    public int mostrarFin(){
        return this.horaDeFin;
    }
}