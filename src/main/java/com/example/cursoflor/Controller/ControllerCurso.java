package com.example.cursoflor.Controller;
import com.example.cursoflor.Repository.RepositoryCurso;
import com.example.cursoflor.domain.Votante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Controller
public class ControllerCurso {

    @Autowired
    RepositoryCurso repositoryCurso;

    @GetMapping("/")
    public String inicio(Model model){
        Votante votante = new Votante();
        model.addAttribute("votante", votante);
        return "Views/index";
    }

    @PostMapping("/")
    public String guardarVotación1(
            @Valid @ModelAttribute("votante") Votante votante,
            BindingResult result){
        if(result.hasErrors()){
            return "Views/index";
        }
        repositoryCurso.save(votante);
        return "Views/gracias";
    }


}
