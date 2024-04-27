package pe.edu.upc.verisoft_backend_1.dtos;

public class CirugiasByPacienteDTO {
    private int id_paciente;
    private int quantityCirugias;

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public int getQuantityCirugias() {
        return quantityCirugias;
    }

    public void setQuantityCirugias(int quantityCirugias) {
        this.quantityCirugias = quantityCirugias;
    }
}
