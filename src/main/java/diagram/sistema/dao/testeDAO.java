package diagram.sistema.dao;

import diagram.sistema.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("testeDAO")
@Transactional(transactionManager="diagram.sistema-TransactionManager")
public interface testeDAO extends JpaRepository<teste, java.lang.String> {

  /**
   * Obtém a instância de teste utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM teste entity WHERE entity.id = :id")
  public teste findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de teste utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM teste entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from teste c")
  public Page<teste> list(Pageable pageable);
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from teste c where c.attribute_01 LIKE CONCAT('%', COALESCE(:attribute_01, c.attribute_01),'%')")
  public Page<teste> listByAttribute_01(@Param(value="attribute_01") java.lang.String attribute_01, Pageable pageable);
  


  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM teste entity WHERE entity.attribute_01 like concat('%',coalesce(:search,''),'%') OR entity.attribute_02 like concat('%',coalesce(:search,''),'%') OR entity.attribute_03 like concat('%',coalesce(:search,''),'%') OR entity.attribute_04 like concat('%',coalesce(:search,''),'%')")
  public Page<teste> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM teste entity WHERE (:attribute_01 is null OR entity.attribute_01 like concat('%',:attribute_01,'%')) AND (:attribute_02 is null OR entity.attribute_02 like concat('%',:attribute_02,'%')) AND (:attribute_03 is null OR entity.attribute_03 like concat('%',:attribute_03,'%')) AND (:attribute_04 is null OR entity.attribute_04 like concat('%',:attribute_04,'%'))")
  public Page<teste> specificSearch(@Param(value="attribute_01") java.lang.String attribute_01, @Param(value="attribute_02") java.lang.String attribute_02, @Param(value="attribute_03") java.lang.String attribute_03, @Param(value="attribute_04") java.lang.String attribute_04, Pageable pageable);
  
}
