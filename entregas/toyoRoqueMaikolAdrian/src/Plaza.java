class Plaza{
    private String tipo;
    private Horario horario;
    private String estado;

    public Plaza(String tipo, Horario horario, String estado){
        this.tipo = tipo;
        this.horario = horario;
        this.estado = estado;
    }

    public String mostrarTipo(){
        return this.tipo;
    }

    public Horario mostrarHorario(){
        return this.horario;
    }

    public String mostrarEstado(){
        return this.estado;
    }
}