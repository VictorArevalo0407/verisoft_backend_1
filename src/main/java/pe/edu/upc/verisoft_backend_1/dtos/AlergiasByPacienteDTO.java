package pe.edu.upc.verisoft_backend_1.dtos;

public class AlergiasByPacienteDTO {
    private int id_paciente;
    private int quantityAlergias;

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public int getQuantityAlergias() {
        return quantityAlergias;
    }

    public void setQuantityAlergias(int quantityAlergias) {
        this.quantityAlergias = quantityAlergias;
    }
}
