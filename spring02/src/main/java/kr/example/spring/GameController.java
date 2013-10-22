package kr.example.spring;

import java.util.Locale;

import kr.example.spring.domain.GameDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class GameController {
	@Autowired
	private GameService gameService;
	
	@RequestMapping(value = "/game.do", method = RequestMethod.GET)
	public String game(Locale locale, Model model) {
		return "game";
	}
	
	@RequestMapping(value = "/play.do", method = RequestMethod.GET)
	public String play(@RequestParam("choice") int choiceIdx, Locale locale, Model model) {
	    GameDto gameDto = gameService.play(choiceIdx);
	    
	    model.addAttribute("game", gameDto);

		return "play";
	}

}
