package br.com.alura.dominio;

public class Carro {
    public String modelo;
    public double precoAtual;
    public double precoAnoPassado;
    public double precoAnoRetrasado;

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço atual: " + this.precoAtual);
        System.out.println("Precço ano passado: " + this.precoAnoPassado);
        System.out.println("Preço ano retrasado: " + this.precoAnoRetrasado);
        System.out.println("Menor preço: " + menorPreco());
        System.out.println("Maior preço: " + maiorPreco());
    }

    public double menorPreco() {
        if (precoAtual < precoAnoRetrasado && precoAtual < precoAnoPassado) {
            return precoAtual;
        }

        if (precoAnoRetrasado < precoAtual && precoAnoRetrasado < precoAnoPassado) {
            return precoAnoRetrasado;
        }

        return precoAnoPassado;
    }

    public double maiorPreco() {
        if (precoAtual > precoAnoRetrasado && precoAtual > precoAnoPassado) {
            return precoAtual;
        }

        if (precoAnoRetrasado > precoAtual && precoAnoRetrasado > precoAnoPassado) {
            return precoAnoRetrasado;
        }

        return precoAnoPassado;
    }

    public double mediaDePreco() {
        return (precoAtual + precoAnoPassado + precoAnoRetrasado) / 3;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAtual, double precoAnoPassado, double precoAnoRetrasado) {
        this.precoAnoRetrasado = precoAnoRetrasado;
        this.precoAtual = precoAtual;
        this.precoAnoPassado = precoAnoPassado;
    }
}
