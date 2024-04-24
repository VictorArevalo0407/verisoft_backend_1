package pe.edu.upc.verisoft_backend_1.dtos;

public class UsersByGradoDTO {
        private String gradoPaciente;

        private int totalUsuarios;

    public String getGradoPaciente() {
        return gradoPaciente;
    }

    public void setGradoPaciente(String gradoPaciente) {
        this.gradoPaciente = gradoPaciente;
    }

    public int getTotalUsuarios() {
        return totalUsuarios;
    }

    public void setTotalUsuarios(int totalUsuarios) {
        this.totalUsuarios = totalUsuarios;
    }
}
