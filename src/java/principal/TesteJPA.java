/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import vo.PessoaFisicaVO;
import vo.PessoaJuridicaVO;
import vo.PessoaVO;

/**
 *
 * @author MICHELPL
 */
public class TesteJPA {
    
    public static void main(String args[]) {
        EntityManagerFactory fabrica = null;
        EntityManager gerenciadorEntidades = null;
        
        try {        
            fabrica = Persistence.createEntityManagerFactory("TesteJPAPU");
            gerenciadorEntidades = fabrica.createEntityManager();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        /*PessoaFisicaVO pf = new PessoaFisicaVO();
        pf.setNome("Michel");
        pf.setEndereco("Rua Roma, Jardim Itália, Cuiabá");
        pf.setCpf("000.000.000-00");*/
        
        PessoaJuridicaVO pj = new PessoaJuridicaVO();
        pj.setNome("Guru S.A.");
        pj.setEndereco("Rua Lixeira, Jardim Pextilência, Cuiabá");
        pj.setCnpj("0000000000000-00");
        pj.setNomeResponsavel("Sidnééélson");
        
        gerenciadorEntidades.getTransaction().begin();
        gerenciadorEntidades.persist(pj);
        gerenciadorEntidades.getTransaction().commit();
        
        
    }
    
}
