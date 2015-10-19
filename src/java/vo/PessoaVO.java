/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author MICHELPL
 */
@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_pessoa")
public class PessoaVO {
    
    @Id
    @SequenceGenerator(name = "cod_pessoa", sequenceName = "spk_pessoa", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cod_pessoa")   
    @Column(name = "cod_pessoa")
    private int id;
    
    @Column(name = "nome", length = 100)
    private String nome;
    
    @Column(name = "endereco", length = 200)
    private String endereco;
    
    public PessoaVO() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }  
    
}
