package pe.edu.upc.verisoft_backend_1.dtos;

public class RespuestasByStatusDTO {
    private String estadoPaciente;
    private int quantityRespuestasByStatus;

    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    public int getQuantityRespuestasByStatus() {
        return quantityRespuestasByStatus;
    }

    public void setQuantityRespuestasByStatus(int quantityRespuestasByStatus) {
        this.quantityRespuestasByStatus = quantityRespuestasByStatus;
    }
}
