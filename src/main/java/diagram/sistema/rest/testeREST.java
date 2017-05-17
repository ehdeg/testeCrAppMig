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
 * Controller para expor serviços REST de teste
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/diagram/sistema/teste")
public class testeREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("testeBusiness")
  private testeBusiness testeBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public teste post(@Validated @RequestBody final teste entity) throws Exception {
    return testeBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public teste put(@Validated @RequestBody final teste entity) throws Exception {
    return testeBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{testeId}")
  public teste put(@Validated @RequestBody final teste entity, @PathVariable("testeId") java.lang.String testeId) throws Exception {
    return testeBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{testeId}")
  public void delete(@PathVariable("testeId") java.lang.String testeId) throws Exception {
    testeBusiness.delete(testeId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<teste>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(testeBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * NamedQuery listByAttribute_01
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/listByAttribute_01/{attribute_01}")
  public HttpEntity<PagedResources<teste>> listByAttribute_01Params(@PathVariable("attribute_01") java.lang.String attribute_01, Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(testeBusiness.listByAttribute_01(attribute_01, pageable)), HttpStatus.OK);    
  }

  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/generalSearch")
  public HttpEntity<PagedResources<teste>> generalSearch(java.lang.String search, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(testeBusiness.generalSearch(search, pageable)), HttpStatus.OK);
  }
  
  /**
   * Searchable fields - Specific search
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/specificSearch")
  public HttpEntity<PagedResources<teste>> specificSearch(java.lang.String attribute_01, java.lang.String attribute_02, java.lang.String attribute_03, java.lang.String attribute_04, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(testeBusiness.specificSearch(attribute_01, attribute_02, attribute_03, attribute_04, pageable)), HttpStatus.OK);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{testeId}")
  public teste get(@PathVariable("testeId") java.lang.String testeId) throws Exception {
    return testeBusiness.get(testeId);
  }
}
