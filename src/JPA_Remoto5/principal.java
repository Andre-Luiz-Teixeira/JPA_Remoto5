package JPA_Remoto5;

import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class principal {

    public static void main(String[] args) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Remoto5PU");

              EntityManager gerente = fabrica.createEntityManager();
        
      
       gerente.getTransaction().begin();
       MdlConta objConta;

      /*  ///inserir
        objConta.setDescricao("Teste");
        objConta.setSaldo(Double.parseDouble("100"));
        gerente.persist(objConta);

    
   
        ///Atualizar
        objConta.setSaldo(Double.parseDouble("1500"));
        
        */    objConta = gerente.find(MdlConta.class,1);
        ///remove
        gerente.remove(objConta);
        
        ///commit
        gerente.getTransaction().commit();
        fabrica.close();
    }

}
