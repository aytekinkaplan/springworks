package com.springworks.springworks;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TvSeriesController {
    @GetMapping("/tvseries")
    public String getTvSeries(Model model) {
        model.addAttribute("title1", new TvSeries("Game of Thrones", "Dragonstone", 9.5));
        model.addAttribute("title2", new TvSeries("Breaking Bad", "Ozymandias", 10));
        model.addAttribute("title3", new TvSeries("Attack on Titan", "Hero", 9.9));
        model.addAttribute("title4", new TvSeries("Attack on Titan", "Perfect Game", 9.9));
        model.addAttribute("title5", new TvSeries("Star Wars: The Clone Wars", "Victory and Death", 9.5));
        model.addAttribute("title6", new TvSeries("Mr. Robot", "407 Proxy Authentication Required", 9.5));
        return "tvseries";
    }
}
