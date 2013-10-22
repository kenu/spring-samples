package kr.example.spring;

import java.util.Locale;
import java.util.Random;

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
	
	@RequestMapping(value = "/game.do", method = RequestMethod.GET)
	public String game(Locale locale, Model model) {
		return "game";
	}
	
	@RequestMapping(value = "/play.do", method = RequestMethod.GET)
	public String play(@RequestParam("choice") int choiceIdx, Locale locale, Model model) {
	    String[] imgs = new String[] {"scissors.png", "rock.png", "paper.png"};

	    Random random = new Random(System.nanoTime());
	    int comIdx = random.nextInt(3);
	    
	    String result = "";
	    int diff = choiceIdx - comIdx;
	    if(diff == 0) {
	    	result = "비겼습니다.";
	    } else if (diff == -1 || diff == 2) {
	    	result = "이겼습니다.";
	    } else {
	    	result = "졌습니다.";
	    }
	    String myImg = imgs[choiceIdx];
	    String comImg = imgs[comIdx];
	    
	    model.addAttribute("myImg", myImg);
	    model.addAttribute("comImg", comImg);
	    model.addAttribute("result", result);

		return "play";
	}
	
}
