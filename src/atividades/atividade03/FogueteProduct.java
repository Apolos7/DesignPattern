package atividades.atividade03;

public class FogueteProduct {

    private String modelo;
    private String tipoMotor;
    private double capacidadeTanque;
    private int qtdAssentos;
    private int qtdMotores;

    public String getModelo() {
        return modelo;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }

    public int getQtdMotores() {
        return qtdMotores;
    }

    public void setQtdMotores(int qtdMotores) {
        this.qtdMotores = qtdMotores;
    }

    public String toString() {
        return "Foguete: " + modelo + "\nMotor: " + tipoMotor + "\nQuantidade Assentos: " +
                +qtdAssentos + "\nCapacidade do tanque: " + capacidadeTanque + "\nQuantidade de motores: " + qtdMotores;
    }

}
