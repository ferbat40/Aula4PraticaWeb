/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.ICalculadora;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Pessoal
 */
@Named(value = "jSFCalculadora")
@RequestScoped
public class JSFCalculadora {

    @EJB
    private ICalculadora eJBCalculadora;

    
    
    public JSFCalculadora() {
    }
    
    public void somar(){
      resultado=eJBCalculadora.soma(valorA, valorB);
    }
    
    @Getter @Setter
    private int valorA;
    
    @Getter @Setter
    private int valorB;
    
    @Getter @Setter
    private int resultado;
    
    
    
    
}
