/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade4;

/**
 *
 * @author ProgramaçãoComDaniel
 */
public class PIS implements Impostos {
    private float debito;
    private float credito;

    public PIS(float debito, float credito) {
        this.debito = debito;
        this.credito = credito;
    }

    public float getDebito() {
        return debito;
    }

    public float getCredito() {
        return credito;
    }

    public void setDebito(float debito) {
        this.debito = debito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
    
    @Override
    public float calculoImposto() {
        return (debito-credito) * (1.65f/100);
    }

    @Override
    public void descricaoImposto() {
        System.out.println("Programa de Interação Social (PSI)");
        System.out.println("R$ " + calculoImposto());
    }
    
}
