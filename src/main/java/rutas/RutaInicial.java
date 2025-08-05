package rutas;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import modelos.Pedido;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;


@RegisterForReflection
@ApplicationScoped
public class RutaInicial extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:rutaInicial")
                .log("Entro la peticion: ${body}")
                .unmarshal().json(JsonLibrary.Jackson, Pedido.class)
                .log("Segundo log: ${body}")
                .marshal().json()
                .end();
    }
}
