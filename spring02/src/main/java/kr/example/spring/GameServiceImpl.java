package kr.example.spring;

import java.util.Random;

import org.springframework.stereotype.Service;

import kr.example.spring.domain.GameDto;

@Service("gameService")
public class GameServiceImpl implements GameService {

	@Override
	public GameDto play(int choiceIdx) {
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
	    
	    GameDto gameDto = new GameDto(choiceIdx, comIdx, myImg, comImg, result);
		return gameDto;
	}
}
