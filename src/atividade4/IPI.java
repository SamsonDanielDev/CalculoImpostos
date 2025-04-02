package atividade4;

import java.util.Scanner;

public class IPI implements Impostos {

    private float valorAliquota;
    private float valorProduto;
    private float frete;
    private float seguro;
    private float totalDespesas;

    public float calculoBaseCalculo() {
        return valorProduto + frete + seguro + totalDespesas;
    }

    public IPI(float valorAliquota, float valorProduto, float frete, float seguro, float totalDespesas) {
        this.valorAliquota = valorAliquota;
        this.valorProduto = valorProduto;
        this.frete = frete;
        this.seguro = seguro;
        this.totalDespesas = totalDespesas;
    }

    @Override
    public float calculoImposto() {
        return calculoBaseCalculo() * (valorAliquota / 100);
    }

    @Override
    public void descricaoImposto() {
        System.out.println("Imposto sobre Produtos Indutrializados (IPI)");
        System.out.println("R$ " + calculoImposto());
    }

    public float getValorAliquota() {
        return valorAliquota;
    }

    public void setValorAliquota(float valorAliquota) {
        this.valorAliquota = valorAliquota;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }

    public float getFrete() {
        return frete;
    }

    public void setFrete(float frete) {
        this.frete = frete;
    }

    public float getSeguro() {
        return seguro;
    }

    public void setSeguro(float seguro) {
        this.seguro = seguro;
    }

    public float getTotalDespesas() {
        return totalDespesas;
    }
}