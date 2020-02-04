package af.asr.messagerouter.service;

import af.asr.messagerouter.model.Endpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataInitializer {

    @Autowired
    private EndpointService endpointService;


    @PostConstruct
    public void init(){
        createEndpointIfNotExist();
    }

    private void createEndpointIfNotExist(){
        if (endpointService.findall().size() < 1){
            Endpoint endpoint = Endpoint.builder().destination("dest_1").host("127.0.0.1").port(4000).topic("topic_1").build();
            endpointService.save(endpoint);
        }
    }

}
