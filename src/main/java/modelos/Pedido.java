package modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.Data;

@Data
@RegisterForReflection
@ApplicationScoped
public class Pedido {
    @JsonAlias({"name","user_name","named"})
    String nombre;
    @JsonAlias({"cantidad","numeros","quantity"})
    String cantidad;
}
