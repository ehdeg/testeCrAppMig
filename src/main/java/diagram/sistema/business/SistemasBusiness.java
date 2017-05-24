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
 * Classe que representa a camada de negócios de SistemasBusiness
 * 
 * @generated
 **/
@Service("SistemasBusiness")
public class SistemasBusiness {



  /**
   * Instância da classe SistemasDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("SistemasDAO")
  protected SistemasDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Sistemas post(final Sistemas entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Sistemas result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Sistemas put(final Sistemas entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Sistemas result = repository.saveAndFlush(entity);
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
    Sistemas entity = this.get(guid);
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
  public Sistemas get(java.lang.String guid) throws Exception {
    // begin-user-code  
    // end-user-code
    Sistemas result = repository.findOne(guid);
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
  public Page<Sistemas> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Sistemas> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Sistemas> listByNomesis( java.lang.String nomesis, Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Sistemas> result = repository.listByNomesis( nomesis, pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Transacao> findTransacao(java.lang.String guid, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Transacao> result = repository.findTransacao(guid, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  public Page<Sistemas> generalSearch(java.lang.String search, Pageable pageable) {
    return repository.generalSearch(search, pageable);
  }
  
  /**
   * Searchable fields - Specific search
   * @generated
   */
  public Page<Sistemas> specificSearch(java.lang.String nomesis, java.lang.String sis, java.lang.String versao, Pageable pageable) {
    return repository.specificSearch(nomesis, sis, versao, pageable);
  }
  
}
