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
@Repository("TransacaoDAO")
@Transactional(transactionManager="diagram.sistema-TransactionManager")
public interface TransacaoDAO extends JpaRepository<Transacao, java.lang.String> {

  /**
   * Obtém a instância de Transacao utilizando os identificadores
   * 
   * @param guid
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Transacao entity WHERE entity.guid = :guid")
  public Transacao findOne(@Param(value="guid") java.lang.String guid);

  /**
   * Remove a instância de Transacao utilizando os identificadores
   * 
   * @param guid
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Transacao entity WHERE entity.guid = :guid")
  public void delete(@Param(value="guid") java.lang.String guid);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from Transacao t")
  public Page<Transacao> list(Pageable pageable);
  


  /**
   * Foreign Key sistemas
   * @generated
   */
  @Query("SELECT entity FROM Transacao entity WHERE entity.sistemas.guid = :guid")
  public Page<Transacao> findTransacaosBySistemas(@Param(value="guid") java.lang.String guid, Pageable pageable);

}
