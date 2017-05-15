package diagram.sistema.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import diagram.sistema.dao.*;
import diagram.sistema.entity.*;

/**
 * Classe que representa a camada de negócios de TransacaoBusiness
 * 
 * @generated
 **/
@Service("TransacaoBusiness")
public class TransacaoBusiness {



  /**
   * Instância da classe TransacaoDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("TransacaoDAO")
  protected TransacaoDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Transacao post(final Transacao entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Transacao result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Transacao put(final Transacao entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Transacao result = repository.saveAndFlush(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public void delete(java.lang.String guid) throws Exception {
    Transacao entity = this.get(guid);
    // begin-user-code  
    // end-user-code
    this.repository.delete(entity);
    // begin-user-code  
    // end-user-code        
  }
  
  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public Transacao get(java.lang.String guid) throws Exception {
    // begin-user-code  
    // end-user-code
    Transacao result = repository.findOne(guid);
    // begin-user-code
    // end-user-code
    return result;
  }

  // CRUD
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Transacao> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Transacao> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key sistemas
   * @generated
   */
  public Page<Transacao> findTransacaosBySistemas(java.lang.String instanceGuid, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Transacao> result = repository.findTransacaosBySistemas(instanceGuid, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
