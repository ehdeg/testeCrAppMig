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
 * Controller para expor serviços REST de Transacao
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/diagram/sistema/Transacao")
public class TransacaoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
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
  public Transacao post(@Validated @RequestBody final Transacao entity) throws Exception {
    return transacaoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Transacao put(@Validated @RequestBody final Transacao entity) throws Exception {
    return transacaoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{transacaoGuid}")
  public Transacao put(@Validated @RequestBody final Transacao entity, @PathVariable("transacaoGuid") java.lang.String transacaoGuid) throws Exception {
    return transacaoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{transacaoGuid}")
  public void delete(@PathVariable("transacaoGuid") java.lang.String transacaoGuid) throws Exception {
    transacaoBusiness.delete(transacaoGuid);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Transacao>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(transacaoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{transacaoGuid}")
  public Transacao get(@PathVariable("transacaoGuid") java.lang.String transacaoGuid) throws Exception {
    return transacaoBusiness.get(transacaoGuid);
  }

  /**
   * Foreign Key sistemas
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Sistemas/{sistemasGuid}")    
  public HttpEntity<PagedResources<Transacao>> findTransacaosBySistemas(@PathVariable("sistemasGuid") java.lang.String sistemasGuid, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(transacaoBusiness.findTransacaosBySistemas(sistemasGuid, pageable)), HttpStatus.OK);
  }
}
