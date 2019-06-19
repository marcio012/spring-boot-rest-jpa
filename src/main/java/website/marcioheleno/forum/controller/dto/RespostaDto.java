package website.marcioheleno.forum.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import website.marcioheleno.forum.model.Resposta;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class RespostaDto {

    private Long id;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private String nomeAutor;

    public RespostaDto(Resposta resposta) {
        this.id = resposta.getId();
        this.mensagem = resposta.getMensagem();
        this.dataCriacao = resposta.getDataCriacao();
        this.nomeAutor = resposta.getAutor().getNome();
    }
}
