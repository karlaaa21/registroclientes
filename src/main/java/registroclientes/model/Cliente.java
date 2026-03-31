package registroclientes.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {
    
    @NotBlank
    private String nombre;

    @NotBlank
    private String correo;

    @NotNull
    private Integer edad;
    
}
