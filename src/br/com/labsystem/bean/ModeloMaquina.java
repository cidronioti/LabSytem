
package br.com.labsystem.bean;

/**
 *
 * @author CIDRONIO
 */
public class ModeloMaquina {
    private String codigo;
    private String marca;
    private String modelo;
    private int  num_identfic;
    private String so;
    private String processador;
    private String hd;
    private String memoriaRam;
    private String memoriaDedicada;
    private String monitor;
    private String statusFuncionamento;
    private String statusUso;
    private String obs;

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNum_identfic() {
        return num_identfic;
    }

    public void setNum_identfic(int num_identfic) {
        this.num_identfic = num_identfic;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getMemoriaDedicada() {
        return memoriaDedicada;
    }

    public void setMemoriaDedicada(String memoriaDedicada) {
        this.memoriaDedicada = memoriaDedicada;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getStatusFuncionamento() {
        return statusFuncionamento;
    }

    public void setStatusFuncionamento(String statusFuncionamento) {
        this.statusFuncionamento = statusFuncionamento;
    }

    public String getStatusUso() {
        return statusUso;
    }

    public void setStatusUso(String statusUso) {
        this.statusUso = statusUso;
    }
    
}
