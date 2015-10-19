/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author MICHELPL
 */

@Entity
@PrimaryKeyJoinColumn(name = "cod_pessoa")
@Table(name = "pessoa_fisica")
@DiscriminatorValue(value = "PF")
public class PessoaFisicaVO extends PessoaVO {
    
    @Column(name = "cpf", length = 15)
    private String cpf;
    
    public PessoaFisicaVO() {
        
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
