/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pdvcongelados.model.entities.util;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Murilo Gritti
 * 
 */

public class CodeGenerator implements Serializable {
    private final static long serialVersionUID = 1L;
    
    private String classType;

    private Long lastCode;
    
    public CodeGenerator() {}
    
    public CodeGenerator(String classType, Long lastCode) {
        this.classType = classType;
        this.lastCode = lastCode;
    }

    public String getClassType() {
        return classType;
    }
    
    public Class getObjClass() {
        return this.getClass();
    }

    public Long getLastCode() {
        return lastCode;
    }

    public void setLastCode(Long lastCode) {
        this.lastCode = lastCode;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.classType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CodeGenerator other = (CodeGenerator) obj;
        if (!Objects.equals(this.classType, other.classType)) {
            return false;
        }
        return true;
    }

}
