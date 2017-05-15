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
  @Column(name = "guid", nullable = false, length=50, insertable=true, updatable=true)
  private java.lang.String guid = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "FLEX_CAMPO_01", nullable = true, unique = false, length=2000, insertable=true, updatable=true)
  private java.lang.String flexCampo01;
  
  /**
  * @generated
  */
  @Column(name = "FLEX_CAMPO_02", nullable = true, unique = false, length=2000, insertable=true, updatable=true)
  private java.lang.String flexCampo02;
  
  /**
  * @generated
  */
  @Column(name = "FLEX_CAMPO_03", nullable = true, unique = false, length=2000, insertable=true, updatable=true)
  private java.lang.String flexCampo03;
  
  /**
  * @generated
  */
  @Column(name = "FLEX_CAMPO_04", nullable = true, unique = false, length=2000, insertable=true, updatable=true)
  private java.lang.String flexCampo04;
  
  /**
  * @generated
  */
  @Column(name = "FLEX_CAMPO_05", nullable = true, unique = false, length=2000, insertable=true, updatable=true)
  private java.lang.String flexCampo05;
  
  /**
  * @generated
  */
  @Column(name = "FLEX_CAMPO_06", nullable = true, unique = false, length=2000, insertable=true, updatable=true)
  private java.lang.String flexCampo06;
  
  /**
  * @generated
  */
  @Column(name = "FLEX_CAMPO_07", nullable = true, unique = false, length=2000, insertable=true, updatable=true)
  private java.lang.String flexCampo07;
  
  /**
  * @generated
  */
  @Column(name = "FLEX_CAMPO_08", nullable = true, unique = false, length=2000, insertable=true, updatable=true)
  private java.lang.String flexCampo08;
  
  /**
  * @generated
  */
  @Column(name = "FLEX_CAMPO_09", nullable = true, unique = false, length=2000, insertable=true, updatable=true)
  private java.lang.String flexCampo09;
  
  /**
  * @generated
  */
  @Column(name = "FLEX_CAMPO_10", nullable = true, unique = false, length=2000, insertable=true, updatable=true)
  private java.lang.String flexCampo10;
  
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
   * Obtém flexCampo01
   * return flexCampo01
   * @generated
   */
  public java.lang.String getFlexCampo01(){
    return this.flexCampo01;
  }
  
  /**
   * Define flexCampo01
   * @param flexCampo01 flexCampo01
   * @generated
   */
  public Sistemas setFlexCampo01(java.lang.String flexCampo01){
    this.flexCampo01 = flexCampo01;
    return this;
  }
  
  /**
   * Obtém flexCampo02
   * return flexCampo02
   * @generated
   */
  public java.lang.String getFlexCampo02(){
    return this.flexCampo02;
  }
  
  /**
   * Define flexCampo02
   * @param flexCampo02 flexCampo02
   * @generated
   */
  public Sistemas setFlexCampo02(java.lang.String flexCampo02){
    this.flexCampo02 = flexCampo02;
    return this;
  }
  
  /**
   * Obtém flexCampo03
   * return flexCampo03
   * @generated
   */
  public java.lang.String getFlexCampo03(){
    return this.flexCampo03;
  }
  
  /**
   * Define flexCampo03
   * @param flexCampo03 flexCampo03
   * @generated
   */
  public Sistemas setFlexCampo03(java.lang.String flexCampo03){
    this.flexCampo03 = flexCampo03;
    return this;
  }
  
  /**
   * Obtém flexCampo04
   * return flexCampo04
   * @generated
   */
  public java.lang.String getFlexCampo04(){
    return this.flexCampo04;
  }
  
  /**
   * Define flexCampo04
   * @param flexCampo04 flexCampo04
   * @generated
   */
  public Sistemas setFlexCampo04(java.lang.String flexCampo04){
    this.flexCampo04 = flexCampo04;
    return this;
  }
  
  /**
   * Obtém flexCampo05
   * return flexCampo05
   * @generated
   */
  public java.lang.String getFlexCampo05(){
    return this.flexCampo05;
  }
  
  /**
   * Define flexCampo05
   * @param flexCampo05 flexCampo05
   * @generated
   */
  public Sistemas setFlexCampo05(java.lang.String flexCampo05){
    this.flexCampo05 = flexCampo05;
    return this;
  }
  
  /**
   * Obtém flexCampo06
   * return flexCampo06
   * @generated
   */
  public java.lang.String getFlexCampo06(){
    return this.flexCampo06;
  }
  
  /**
   * Define flexCampo06
   * @param flexCampo06 flexCampo06
   * @generated
   */
  public Sistemas setFlexCampo06(java.lang.String flexCampo06){
    this.flexCampo06 = flexCampo06;
    return this;
  }
  
  /**
   * Obtém flexCampo07
   * return flexCampo07
   * @generated
   */
  public java.lang.String getFlexCampo07(){
    return this.flexCampo07;
  }
  
  /**
   * Define flexCampo07
   * @param flexCampo07 flexCampo07
   * @generated
   */
  public Sistemas setFlexCampo07(java.lang.String flexCampo07){
    this.flexCampo07 = flexCampo07;
    return this;
  }
  
  /**
   * Obtém flexCampo08
   * return flexCampo08
   * @generated
   */
  public java.lang.String getFlexCampo08(){
    return this.flexCampo08;
  }
  
  /**
   * Define flexCampo08
   * @param flexCampo08 flexCampo08
   * @generated
   */
  public Sistemas setFlexCampo08(java.lang.String flexCampo08){
    this.flexCampo08 = flexCampo08;
    return this;
  }
  
  /**
   * Obtém flexCampo09
   * return flexCampo09
   * @generated
   */
  public java.lang.String getFlexCampo09(){
    return this.flexCampo09;
  }
  
  /**
   * Define flexCampo09
   * @param flexCampo09 flexCampo09
   * @generated
   */
  public Sistemas setFlexCampo09(java.lang.String flexCampo09){
    this.flexCampo09 = flexCampo09;
    return this;
  }
  
  /**
   * Obtém flexCampo10
   * return flexCampo10
   * @generated
   */
  public java.lang.String getFlexCampo10(){
    return this.flexCampo10;
  }
  
  /**
   * Define flexCampo10
   * @param flexCampo10 flexCampo10
   * @generated
   */
  public Sistemas setFlexCampo10(java.lang.String flexCampo10){
    this.flexCampo10 = flexCampo10;
    return this;
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