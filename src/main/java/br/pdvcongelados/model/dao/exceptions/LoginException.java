/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pdvcongelados.model.dao.exceptions;

/**
 *
 * @author silas
 */
public class LoginException extends RuntimeException {
    
    public LoginException(String msg) {
        super(msg);
    }
}
