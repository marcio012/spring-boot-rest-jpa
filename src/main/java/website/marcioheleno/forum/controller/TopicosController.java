package website.marcioheleno.forum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import website.marcioheleno.forum.controller.dto.TopicoDto;
import website.marcioheleno.forum.model.Curso;
import website.marcioheleno.forum.model.Topico;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista(){
        Topico topico = new Topico("Dúvida de Java", "Dúvida do Sring boot", new Curso("Spring", "Programação"));
        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }

}
