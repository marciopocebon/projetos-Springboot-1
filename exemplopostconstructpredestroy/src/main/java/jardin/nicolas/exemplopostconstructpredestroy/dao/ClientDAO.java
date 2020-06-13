package jardin.nicolas.exemplopostconstructpredestroy.dao;

import jardin.nicolas.exemplopostconstructpredestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Nicólas
 * @version 1.0
 * @since 6/11/2020 - 3:23 PM
 */
@Getter @Setter
@Component
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstruct() {
        System.out.println("Objeto foi criado");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Objeto foi finalizado");
    }


}
