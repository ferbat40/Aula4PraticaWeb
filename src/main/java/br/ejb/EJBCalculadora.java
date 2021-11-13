/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author Pessoal
 */
@Stateless
public class EJBCalculadora implements br.ICalculadora{

    @Override
    public int soma(int A, int B) {
  
        return A+B;
    
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
