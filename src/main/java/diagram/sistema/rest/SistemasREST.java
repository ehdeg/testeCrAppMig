package diagram.sistema.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import diagram.sistema.entity.*;
import diagram.sistema.business.*;

/**
 * Controller para expor serviços REST de Sistemas
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/diagram/sistema/Sistemas")
public class SistemasREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("SistemasBusiness")
  private SistemasBusiness sistemasBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("TransacaoBusiness")
  private TransacaoBusiness transacaoBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Sistemas post(@Validated @RequestBody final Sistemas entity) throws Exception {
    return sistemasBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Sistemas put(@Validated @RequestBody final Sistemas entity) throws Exception {
    return sistemasBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{sistemasGuid}")
  public Sistemas put(@Validated @RequestBody final Sistemas entity, @PathVariable("sistemasGuid") java.lang.String sistemasGuid) throws Exception {
    return sistemasBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{sistemasGuid}")
  public void delete(@PathVariable("sistemasGuid") java.lang.String sistemasGuid) throws Exception {
    sistemasBusiness.delete(sistemasGuid);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Sistemas>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(sistemasBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * NamedQuery listByNomesis
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/listByNomesis/{nomesis}")
  public HttpEntity<PagedResources<Sistemas>> listByNomesisParams(@PathVariable("nomesis") java.lang.String nomesis, Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(sistemasBusiness.listByNomesis(nomesis, pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{sistemasGuid}/Transacao")    
  public HttpEntity<PagedResources<Transacao>> findTransacao(@PathVariable("sistemasGuid") java.lang.String sistemasGuid, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(sistemasBusiness.findTransacao(sistemasGuid, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{sistemasGuid}/Transacao/{transacaoGuid}")    
  public void deleteTransacao(@PathVariable("transacaoGuid") java.lang.String transacaoGuid) throws Exception {
    this.transacaoBusiness.delete(transacaoGuid);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{sistemasGuid}/Transacao")
  public Transacao putTransacao(@Validated @RequestBody final Transacao entity, @PathVariable("sistemasGuid") java.lang.String sistemasGuid) throws Exception {
    return this.transacaoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{sistemasGuid}/Transacao")
  public Transacao postTransacao(@Validated @RequestBody final Transacao entity, @PathVariable("sistemasGuid") java.lang.String sistemasGuid) throws Exception {
    Sistemas sistemas = this.sistemasBusiness.get(sistemasGuid);
    entity.setSistemas(sistemas);
    return this.transacaoBusiness.post(entity);
  }

  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/generalSearch")
  public HttpEntity<PagedResources<Sistemas>> generalSearch(java.lang.String search, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(sistemasBusiness.generalSearch(search, pageable)), HttpStatus.OK);
  }
  
  /**
   * Searchable fields - Specific search
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/specificSearch")
  public HttpEntity<PagedResources<Sistemas>> specificSearch(java.lang.String nomesis, java.lang.String sis, java.lang.String versao, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(sistemasBusiness.specificSearch(nomesis, sis, versao, pageable)), HttpStatus.OK);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{sistemasGuid}")
  public Sistemas get(@PathVariable("sistemasGuid") java.lang.String sistemasGuid) throws Exception {
    return sistemasBusiness.get(sistemasGuid);
  }
}
