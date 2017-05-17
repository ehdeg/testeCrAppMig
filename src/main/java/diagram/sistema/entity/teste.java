package diagram.sistema.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela TESTE
 * @generated
 */
@Entity
@Table(name = "\"TESTE\"")
@XmlRootElement
public class teste implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  // diferença de um arquivo
  // diferença de um arquivo
  // diferença de um arquivo
  // diferença de um arquivo
  // diferença de um arquivo
  // diferença de um arquivo
  // diferença de um arquivo
  // diferença de um arquivo
  
  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "attribute_01", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String attribute_01;
  
  /**
  * @generated
  */
  @Column(name = "attribute_02", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String attribute_02;
  
  /**
  * @generated
  */
  @Column(name = "attribute_03", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String attribute_03;
  
  /**
  * @generated
  */
  @Column(name = "attribute_04", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String attribute_04;
  
  /**
  * @generated
  */
  @Column(name = "flex_campo_01", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String flex01;
  
  /**
   * Construtor
   * @generated
   */
  public teste(){
  }

  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public teste setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém attribute_01
   * return attribute_01
   * @generated
   */
  public java.lang.String getAttribute_01(){
    return this.attribute_01;
  }
  
  /**
   * Define attribute_01
   * @param attribute_01 attribute_01
   * @generated
   */
  public teste setAttribute_01(java.lang.String attribute_01){
    this.attribute_01 = attribute_01;
    return this;
  }
  
  /**
   * Obtém attribute_02
   * return attribute_02
   * @generated
   */
  public java.lang.String getAttribute_02(){
    return this.attribute_02;
  }
  
  /**
   * Define attribute_02
   * @param attribute_02 attribute_02
   * @generated
   */
  public teste setAttribute_02(java.lang.String attribute_02){
    this.attribute_02 = attribute_02;
    return this;
  }
  
  /**
   * Obtém attribute_03
   * return attribute_03
   * @generated
   */
  public java.lang.String getAttribute_03(){
    return this.attribute_03;
  }
  
  /**
   * Define attribute_03
   * @param attribute_03 attribute_03
   * @generated
   */
  public teste setAttribute_03(java.lang.String attribute_03){
    this.attribute_03 = attribute_03;
    return this;
  }
  
  /**
   * Obtém attribute_04
   * return attribute_04
   * @generated
   */
  public java.lang.String getAttribute_04(){
    return this.attribute_04;
  }
  
  /**
   * Define attribute_04
   * @param attribute_04 attribute_04
   * @generated
   */
  public teste setAttribute_04(java.lang.String attribute_04){
    this.attribute_04 = attribute_04;
    return this;
  }
  
  /**
   * Obtém flex01
   * return flex01
   * @generated
   */
  public java.lang.String getFlex01(){
    return this.flex01;
  }
  
  /**
   * Define flex01
   * @param flex01 flex01
   * @generated
   */
  public teste setFlex01(java.lang.String flex01){
    this.flex01 = flex01;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    teste object = (teste)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}