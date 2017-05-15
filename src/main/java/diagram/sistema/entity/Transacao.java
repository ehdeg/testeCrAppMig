package diagram.sistema.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela TRANSACAO
 * @generated
 */
@Entity
@Table(name = "\"TRANSACAO\"")
@XmlRootElement
public class Transacao implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @Column(name = "guid", nullable = false, length=100, insertable=true, updatable=true)
  private java.lang.String guid = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "chave", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  private java.lang.String chave;
  
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
  @Column(name = "formtrans", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  private java.lang.String formtrans;
  
  /**
  * @generated
  */
  @Column(name = "formtranscust", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  private java.lang.String formtranscust;
  
  /**
  * @generated
  */
  @Column(name = "itemmenu", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  private java.lang.String itemmenu;
  
  /**
  * @generated
  */
  @Column(name = "logging", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  private java.lang.String logging;
  
  /**
  * @generated
  */
  @Column(name = "nomenomenu", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  private java.lang.String nomenomenu;
  
  /**
  * @generated
  */
  @Column(name = "nomereduzido", nullable = true, unique = false, length=70, insertable=true, updatable=true)
  private java.lang.String nomereduzido;
  
  /**
  * @generated
  */
  @Column(name = "nometrans", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  private java.lang.String nometrans;
  
  /**
  * @generated
  */
  @Column(name = "publicatrans", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  private java.lang.String publicatrans;
  
  /**
  * @generated
  */
  @Column(name = "QRY_POS_ROLLBACK", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  private java.lang.String qryPosRollback;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="SIS", nullable = true, referencedColumnName = "guid", insertable=true, updatable=true)
  private Sistemas sistemas;
  
  /**
  * @generated
  */
  @Column(name = "tenantid", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Long tenantid;
  
  /**
  * @generated
  */
  @Column(name = "trans", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String trans;
  
  /**
   * Construtor
   * @generated
   */
  public Transacao(){
  }

  
  /**
   * Obtém chave
   * return chave
   * @generated
   */
  public java.lang.String getChave(){
    return this.chave;
  }
  
  /**
   * Define chave
   * @param chave chave
   * @generated
   */
  public Transacao setChave(java.lang.String chave){
    this.chave = chave;
    return this;
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
  public Transacao setFlexCampo01(java.lang.String flexCampo01){
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
  public Transacao setFlexCampo02(java.lang.String flexCampo02){
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
  public Transacao setFlexCampo03(java.lang.String flexCampo03){
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
  public Transacao setFlexCampo04(java.lang.String flexCampo04){
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
  public Transacao setFlexCampo05(java.lang.String flexCampo05){
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
  public Transacao setFlexCampo06(java.lang.String flexCampo06){
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
  public Transacao setFlexCampo07(java.lang.String flexCampo07){
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
  public Transacao setFlexCampo08(java.lang.String flexCampo08){
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
  public Transacao setFlexCampo09(java.lang.String flexCampo09){
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
  public Transacao setFlexCampo10(java.lang.String flexCampo10){
    this.flexCampo10 = flexCampo10;
    return this;
  }
  
  /**
   * Obtém formtrans
   * return formtrans
   * @generated
   */
  public java.lang.String getFormtrans(){
    return this.formtrans;
  }
  
  /**
   * Define formtrans
   * @param formtrans formtrans
   * @generated
   */
  public Transacao setFormtrans(java.lang.String formtrans){
    this.formtrans = formtrans;
    return this;
  }
  
  /**
   * Obtém formtranscust
   * return formtranscust
   * @generated
   */
  public java.lang.String getFormtranscust(){
    return this.formtranscust;
  }
  
  /**
   * Define formtranscust
   * @param formtranscust formtranscust
   * @generated
   */
  public Transacao setFormtranscust(java.lang.String formtranscust){
    this.formtranscust = formtranscust;
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
  public Transacao setGuid(java.lang.String guid){
    this.guid = guid;
    return this;
  }
  
  /**
   * Obtém itemmenu
   * return itemmenu
   * @generated
   */
  public java.lang.String getItemmenu(){
    return this.itemmenu;
  }
  
  /**
   * Define itemmenu
   * @param itemmenu itemmenu
   * @generated
   */
  public Transacao setItemmenu(java.lang.String itemmenu){
    this.itemmenu = itemmenu;
    return this;
  }
  
  /**
   * Obtém logging
   * return logging
   * @generated
   */
  public java.lang.String getLogging(){
    return this.logging;
  }
  
  /**
   * Define logging
   * @param logging logging
   * @generated
   */
  public Transacao setLogging(java.lang.String logging){
    this.logging = logging;
    return this;
  }
  
  /**
   * Obtém nomenomenu
   * return nomenomenu
   * @generated
   */
  public java.lang.String getNomenomenu(){
    return this.nomenomenu;
  }
  
  /**
   * Define nomenomenu
   * @param nomenomenu nomenomenu
   * @generated
   */
  public Transacao setNomenomenu(java.lang.String nomenomenu){
    this.nomenomenu = nomenomenu;
    return this;
  }
  
  /**
   * Obtém nomereduzido
   * return nomereduzido
   * @generated
   */
  public java.lang.String getNomereduzido(){
    return this.nomereduzido;
  }
  
  /**
   * Define nomereduzido
   * @param nomereduzido nomereduzido
   * @generated
   */
  public Transacao setNomereduzido(java.lang.String nomereduzido){
    this.nomereduzido = nomereduzido;
    return this;
  }
  
  /**
   * Obtém nometrans
   * return nometrans
   * @generated
   */
  public java.lang.String getNometrans(){
    return this.nometrans;
  }
  
  /**
   * Define nometrans
   * @param nometrans nometrans
   * @generated
   */
  public Transacao setNometrans(java.lang.String nometrans){
    this.nometrans = nometrans;
    return this;
  }
  
  /**
   * Obtém publicatrans
   * return publicatrans
   * @generated
   */
  public java.lang.String getPublicatrans(){
    return this.publicatrans;
  }
  
  /**
   * Define publicatrans
   * @param publicatrans publicatrans
   * @generated
   */
  public Transacao setPublicatrans(java.lang.String publicatrans){
    this.publicatrans = publicatrans;
    return this;
  }
  
  /**
   * Obtém qryPosRollback
   * return qryPosRollback
   * @generated
   */
  public java.lang.String getQryPosRollback(){
    return this.qryPosRollback;
  }
  
  /**
   * Define qryPosRollback
   * @param qryPosRollback qryPosRollback
   * @generated
   */
  public Transacao setQryPosRollback(java.lang.String qryPosRollback){
    this.qryPosRollback = qryPosRollback;
    return this;
  }
  
  /**
   * Obtém sistemas
   * return sistemas
   * @generated
   */
  public Sistemas getSistemas(){
    return this.sistemas;
  }
  
  /**
   * Define sistemas
   * @param sistemas sistemas
   * @generated
   */
  public Transacao setSistemas(Sistemas sistemas){
    this.sistemas = sistemas;
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
  public Transacao setTenantid(java.lang.Long tenantid){
    this.tenantid = tenantid;
    return this;
  }
  
  /**
   * Obtém trans
   * return trans
   * @generated
   */
  public java.lang.String getTrans(){
    return this.trans;
  }
  
  /**
   * Define trans
   * @param trans trans
   * @generated
   */
  public Transacao setTrans(java.lang.String trans){
    this.trans = trans;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Transacao object = (Transacao)obj;
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