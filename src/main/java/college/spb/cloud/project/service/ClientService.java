package college.spb.cloud.project.service;

import college.spb.cloud.project.model.entity.Client;
import college.spb.cloud.project.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Mono<Client> getClientById(Long clientId) {
        return clientRepository.findById(clientId);
    }

    public Mono<Client> createClient(Client client) {
        log.info("Creating client: {}", client);
        return clientRepository.save(client);
    }

}
