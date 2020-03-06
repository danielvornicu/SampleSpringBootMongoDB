package tech.dev.to.convertor;

import tech.dev.commons.to.base.convertor.TOConvertor;
import tech.dev.domain.Client;
import tech.dev.to.ClientTO;

/**
 * Description de la classe
 * <p>
 * Date: 04/03/2020
 *
 * @author d.vornicu
 * @version 1.0 $Revision$ $Date$
 */

public class ClientTOConvertor extends TOConvertor<Client, ClientTO> {

    @Override
    public ClientTO document2TO(Client client, boolean fillAll) {

        ClientTO to = new ClientTO();

        to.setId(client.getId());
        to.setNom(client.getNom());
        to.setPrenom(client.getPrenom());

        return to;
    }

    @Override
    public Client fillDocument(ClientTO to, Client client) {

        if (client == null) {
            client = new Client();
        }

        client.setNom(to.getNom());
        client.setPrenom(to.getPrenom());

        return client;
    }

}
