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
@Repository("SistemasDAO")
@Transactional(transactionManager="diagram.sistema-TransactionManager")
public interface SistemasDAO extends JpaRepository<Sistemas, java.lang.String> {

  /**
   * Obtém a instância de Sistemas utilizando os identificadores
   * 
   * @param guid
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Sistemas entity WHERE entity.guid = :guid")
  public Sistemas findOne(@Param(value="guid") java.lang.String guid);

  /**
   * Remove a instância de Sistemas utilizando os identificadores
   * 
   * @param guid
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Sistemas entity WHERE entity.guid = :guid")
  public void delete(@Param(value="guid") java.lang.String guid);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select s from Sistemas s")
  public Page<Sistemas> list(Pageable pageable);
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select s from Sistemas s where s.nomesis LIKE CONCAT('%', COALESCE(:nomesis, s.nomesis),'%')")
  public Page<Sistemas> listByNomesis(@Param(value="nomesis") java.lang.String nomesis, Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Transacao entity WHERE entity.sistemas.guid = :guid")
  public Page<Transacao> findTransacao(@Param(value="guid") java.lang.String guid, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Sistemas entity WHERE entity.nomesis like concat('%',coalesce(:search,''),'%') OR entity.sis like concat('%',coalesce(:search,''),'%') OR entity.versao like concat('%',coalesce(:search,''),'%')")
  public Page<Sistemas> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Sistemas entity WHERE (:nomesis is null OR entity.nomesis like concat('%',:nomesis,'%')) AND (:sis is null OR entity.sis like concat('%',:sis,'%')) AND (:versao is null OR entity.versao like concat('%',:versao,'%'))")
  public Page<Sistemas> specificSearch(@Param(value="nomesis") java.lang.String nomesis, @Param(value="sis") java.lang.String sis, @Param(value="versao") java.lang.String versao, Pageable pageable);
  
}
