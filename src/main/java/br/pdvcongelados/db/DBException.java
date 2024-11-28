/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pdvcongelados.db;

/**
 *
 * @author murilo gritti
 */

public class DBException extends RuntimeException {
    
    public DBException(String msg) {
        super(msg);
    }
}
