/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author MICHELPL
 */
@Entity
@Table(name = "pessoa_juridica")
@DiscriminatorValue(value = "PJ")
public class PessoaJuridicaVO extends PessoaVO {
    
    @Column(name = "cnpj", length = 20)
    private String cnpj;
    
    @Column(name = "nome_responsavel", length = 100)
    private String nomeResponsavel;
    
    public PessoaJuridicaVO() {
        
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }   
    
}
