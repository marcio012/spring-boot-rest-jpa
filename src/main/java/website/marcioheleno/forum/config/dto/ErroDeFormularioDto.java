package website.marcioheleno.forum.config.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErroDeFormularioDto {

    private String campo;
    private String error;

}
