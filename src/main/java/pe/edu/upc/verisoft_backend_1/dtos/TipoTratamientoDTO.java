package pe.edu.upc.verisoft_backend_1.dtos;



public class TipoTratamientoDTO {

    private int id;
    private String nombreTratamiento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreTratamiento() {
        return nombreTratamiento;
    }

    public void setNombreTratamiento(String nombreTratamiento) {
        this.nombreTratamiento = nombreTratamiento;
    }
}
