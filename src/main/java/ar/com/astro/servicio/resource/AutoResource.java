package ar.com.astro.servicio.resource;

import ar.com.astro.servicio.resource.response.AutoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AutoResource {


    //Cuando envien un metodo GET al servicio se invoca este servicio
    @GetMapping(path ="car/{id}",produces= "application/json")
    public AutoResponse getAutoById(@PathVariable(name ="id") Long id) {

        return new AutoResponse(id,"test_brand","test_model",10.0D);

    }


}
