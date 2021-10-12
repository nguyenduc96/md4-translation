package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.DictionaryService;

@Controller
public class TranslationController {
    DictionaryService dictionaryService = new DictionaryService();

    @GetMapping
    public String show() {
        return "index";
    }

    @GetMapping("/dictionary")
    public ModelAndView dictionary(@RequestParam String eng) {
        String vie = dictionaryService.search(eng);
        ModelAndView modelAndView = new ModelAndView("index");
        if (vie == null) {
            modelAndView.addObject("message", "Khong co trong tu dien");
        } else {
            modelAndView.addObject("message", vie);
        }
        return modelAndView;
    }
}
