package af.asr.messagerouter.api;

import af.asr.messagerouter.model.Endpoint;
import af.asr.messagerouter.service.EndpointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/routing")
public class EndpointController {

    @Autowired
    private EndpointService endpointService;

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity<List<Endpoint>> findall()
    {
        return ResponseEntity.ok(endpointService.findall());
    }


    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity<Endpoint> findOne(@PathVariable(value = "id", required = true) long id)
    {
        return ResponseEntity.ok(endpointService.findOne(id));
    }


    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Endpoint> save(@RequestBody(required = true) Endpoint endpoint)
    {
        return ResponseEntity.ok(endpointService.save(endpoint));
    }

}
