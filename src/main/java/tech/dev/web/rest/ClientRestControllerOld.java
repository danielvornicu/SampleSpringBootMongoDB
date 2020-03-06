package tech.dev.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.dev.service.ClientService;
import tech.dev.to.ClientTO;

import java.util.List;

/**
 * Controller REST
 * <p>
 * Date: 03/03/2020
 *
 * @author d.vornicu
 * @version 1.0 $Revision$ $Date$
 */

@RestController
@RequestMapping(value= ClientRestControllerOld.REQUEST_MAPPING)
public class ClientRestControllerOld {
    public static final String REQUEST_MAPPING = "/clientsOld";

    //1 on utilise directement le repository dans le controlleur et on travaille avec des entités
    //1 private ClientRepository clientRepository;

    //2 on injecte un service de type ClientService qui utilise le repository
    //2 le service travaille avec des TO
    private ClientService clientService;

//1
//    public ClientRestController(ClientRepository clientRepository) {
//        this.clientRepository = clientRepository;
//    }

    @Autowired
    public ClientRestControllerOld(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    //1. public List<Client> listeClients(){
    public ResponseEntity<List<ClientTO>> index() {
        //1. liste d'entites
        //List<Client> clients = this.clientRepository.findAll();
        //return clients;

        //2.liste des TO
        List<ClientTO> clients = clientService.findAllFillTO();
        return new ResponseEntity<List<ClientTO>>(clients, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    //@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    //1. public ResponseEntity<Client> getClient(@PathVariable("id") String id) {
    public ResponseEntity<ClientTO> show(@PathVariable("id") String id) {
        //1.with entity
//        Optional<Client> client = this.clientRepository.findById(id);
//        if (client.isPresent()) {
//            return new ResponseEntity<Client>(client.get(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
//        }

        //with TO
        ClientTO client = clientService.findByIdFillTO(id);
        return new ResponseEntity<ClientTO>(client, HttpStatus.OK);

    }

    @PostMapping(value = "/new")
    //@RequestMapping(value = "/new", method = RequestMethod.POST)
    //1 public ResponseEntity<List<Client>> createClient(@RequestBody Client client) {
    public ResponseEntity<List<ClientTO>> create(@RequestBody ClientTO clientTO) {
        //1. with entity
        //this.clientRepository.insert(client);
        //List<Client> clients = this.clientRepository.findAll();
        //return new ResponseEntity<List<Client>>(clients, HttpStatus.OK);

        //2.with TO
        clientService.saveTO(clientTO, true);
        List<ClientTO> clients = clientService.findAllFillTO();
        return new ResponseEntity<List<ClientTO>>(clients, HttpStatus.OK);
    }

    @PostMapping(value = "/{id}/edit")
    //@RequestMapping(value = "/{id}/edit", method = RequestMethod.POST)
    //1 public ResponseEntity<List<Client>> update(@RequestBody Client client) {
    public ResponseEntity<List<ClientTO>> update(@RequestBody ClientTO clientTO) {
        //1. with entity
//        this.clientRepository.save(client);
//        List<Client> clients = this.clientRepository.findAll();
//        return new ResponseEntity<List<Client>>(clients, HttpStatus.OK);

        //2.with TO
        clientService.saveTO(clientTO, false);
        List<ClientTO> clients = clientService.findAllFillTO();
        return new ResponseEntity<List<ClientTO>>(clients, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}/delete")
    //@RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    //1 public ResponseEntity<List<Client>>  delete(@PathVariable("id") String id) {
    public ResponseEntity<List<ClientTO>> delete(@PathVariable("id") String id) {
        //1.with entity
//        this.clientRepository.deleteById(id);
//        List<Client> clients = this.clientRepository.findAll();
//        return new ResponseEntity<List<Client>>(clients, HttpStatus.OK);

        //with TO
        clientService.deleteClientByClientId(id);
        List<ClientTO> clients = clientService.findAllFillTO();
        return new ResponseEntity<List<ClientTO>>(clients, HttpStatus.OK);
    }

}
