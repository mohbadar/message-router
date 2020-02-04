package af.asr.messagerouter.service;

import af.asr.messagerouter.model.Endpoint;
import af.asr.messagerouter.repository.EndpointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EndpointService {

    @Autowired
    private EndpointRepository endpointRepository;

    public Endpoint save(Endpoint endpoint)
    {
        return endpointRepository.save(endpoint);
    }

    public List<Endpoint> findall(){
        return endpointRepository.findAll();
    }

    public Endpoint findOne(long id)
    {
        return  endpointRepository.getOne(id);
    }


}
