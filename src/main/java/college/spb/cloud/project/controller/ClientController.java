package college.spb.cloud.project.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

import college.spb.cloud.project.model.dto.ClientDto;
import college.spb.cloud.project.model.dto.mapper.ClientMapper;
import college.spb.cloud.project.model.entity.Client;
import college.spb.cloud.project.service.ClientService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
@Slf4j
public class ClientController {

    private final ClientService clientService;
    private final ClientMapper clientMapper;

    @PostMapping
    @ResponseStatus(CREATED)
    public Mono<ResponseEntity<ClientDto>> createClient(ClientDto clientDto) {
        log.info("Request received: Create new client: {}", clientDto);
        return clientService.createClient(clientMapper.toEntity(clientDto))
            .map(client -> ResponseEntity.ok().body(clientMapper.toDto(client)));
    }

    @GetMapping
    @ResponseStatus(OK)
    public Mono<ResponseEntity<ClientDto>> getClientById(Long clientId) {
        log.info("Request received: Get client with id: {}", clientId);
        return clientService.getClientById(clientId)
            .map(client -> ResponseEntity.ok().body(clientMapper.toDto(client)));
    }




}
