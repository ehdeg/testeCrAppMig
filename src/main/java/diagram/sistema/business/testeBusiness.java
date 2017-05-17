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
 * Classe que representa a camada de negócios de testeBusiness
 * 
 * @generated
 **/
@Service("testeBusiness")
public class testeBusiness {



  /**
   * Instância da classe testeDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("testeDAO")
  protected testeDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public teste post(final teste entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    teste result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public teste put(final teste entity) throws Exception {
    // begin-user-code  
    // end-user-code
    teste result = repository.saveAndFlush(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public void delete(java.lang.String id) throws Exception {
    teste entity = this.get(id);
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
  public teste get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    teste result = repository.findOne(id);
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
  public Page<teste> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<teste> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<teste> listByAttribute_01( java.lang.String attribute_01, Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<teste> result = repository.listByAttribute_01( attribute_01, pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  public Page<teste> generalSearch(java.lang.String search, Pageable pageable) {
    return repository.generalSearch(search, pageable);
  }
  
  /**
   * Searchable fields - Specific search
   * @generated
   */
  public Page<teste> specificSearch(java.lang.String attribute_01, java.lang.String attribute_02, java.lang.String attribute_03, java.lang.String attribute_04, Pageable pageable) {
    return repository.specificSearch(attribute_01, attribute_02, attribute_03, attribute_04, pageable);
  }
  
}
