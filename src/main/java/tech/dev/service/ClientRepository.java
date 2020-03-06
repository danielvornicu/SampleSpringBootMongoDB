package tech.dev.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tech.dev.domain.Client;

/**
 * Client repository
 * <p>
 * Date: 03/03/2020
 *
 * @author d.vornicu
 * @version 1.0 $Revision$ $Date$
 */

@Repository
public interface ClientRepository extends MongoRepository<Client,String> {
}
