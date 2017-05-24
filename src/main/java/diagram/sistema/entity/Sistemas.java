package diagram.sistema.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SISTEMAS
 * @generated
 */
@Entity
@Table(name = "\"SISTEMAS\"")
@XmlRootElement
public class Sistemas implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @Column(name = "guid", nullable = false, length=50, insertable=true, updatable=false)
  private java.lang.String guid = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "habilsis", nullable = true, unique = false, length=12, insertable=true, updatable=true)
  private java.lang.String habilsis;
  
  /**
  * @generated
  */
  @Column(name = "nomesis", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  private java.lang.String nomesis;
  
  /**
  * @generated
  */
  @Column(name = "sis", nullable = false, unique = false, length=10, insertable=true, updatable=true)
  private java.lang.String sis;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "take", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  private java.util.Date take;
  
  /**
  * @generated
  */
  @Column(name = "tenantid", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Long tenantid;
  
  /**
  * @generated
  */
  @Column(name = "versao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String versao;
  
  /**
   * Construtor
   * @generated
   */
  public Sistemas(){
  }

  
  /**
   * Obtém guid
   * return guid
   * @generated
   */
  public java.lang.String getGuid(){
    return this.guid;
  }
  
  /**
   * Define guid
   * @param guid guid
   * @generated
   */
  public Sistemas setGuid(java.lang.String guid){
    this.guid = guid;
    return this;
  }
  
  /**
   * Obtém habilsis
   * return habilsis
   * @generated
   */
  public java.lang.String getHabilsis(){
    return this.habilsis;
  }
  
  /**
   * Define habilsis
   * @param habilsis habilsis
   * @generated
   */
  public Sistemas setHabilsis(java.lang.String habilsis){
    this.habilsis = habilsis;
    return this;
  }
  
  /**
   * Obtém nomesis
   * return nomesis
   * @generated
   */
  public java.lang.String getNomesis(){
    return this.nomesis;
  }
  
  /**
   * Define nomesis
   * @param nomesis nomesis
   * @generated
   */
  public Sistemas setNomesis(java.lang.String nomesis){
    this.nomesis = nomesis;
    return this;
  }
  
  /**
   * Obtém sis
   * return sis
   * @generated
   */
  public java.lang.String getSis(){
    return this.sis;
  }
  
  /**
   * Define sis
   * @param sis sis
   * @generated
   */
  public Sistemas setSis(java.lang.String sis){
    this.sis = sis;
    return this;
  }
  
  /**
   * Obtém take
   * return take
   * @generated
   */
  public java.util.Date getTake(){
    return this.take;
  }
  
  /**
   * Define take
   * @param take take
   * @generated
   */
  public Sistemas setTake(java.util.Date take){
    this.take = take;
    return this;
  }
  
  /**
   * Obtém tenantid
   * return tenantid
   * @generated
   */
  public java.lang.Long getTenantid(){
    return this.tenantid;
  }
  
  /**
   * Define tenantid
   * @param tenantid tenantid
   * @generated
   */
  public Sistemas setTenantid(java.lang.Long tenantid){
    this.tenantid = tenantid;
    return this;
  }
  
  /**
   * Obtém versao
   * return versao
   * @generated
   */
  public java.lang.String getVersao(){
    return this.versao;
  }
  
  /**
   * Define versao
   * @param versao versao
   * @generated
   */
  public Sistemas setVersao(java.lang.String versao){
    this.versao = versao;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Sistemas object = (Sistemas)obj;
    if (guid != null ? !guid.equals(object.guid) : object.guid != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((guid == null) ? 0 : guid.hashCode());
    return result;
  }
  
}