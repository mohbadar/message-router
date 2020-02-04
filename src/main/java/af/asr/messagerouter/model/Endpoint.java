package af.asr.messagerouter.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Endpoint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    private String identifier;

    private String host;

    private String port;

    private String destination;
}
