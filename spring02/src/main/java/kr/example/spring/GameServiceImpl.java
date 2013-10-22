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
	    	result = "�����ϴ�.";
	    } else if (diff == -1 || diff == 2) {
	    	result = "�̰���ϴ�.";
	    } else {
	    	result = "�����ϴ�.";
	    }
	    String myImg = imgs[choiceIdx];
	    String comImg = imgs[comIdx];
	    
	    GameDto gameDto = new GameDto(choiceIdx, comIdx, myImg, comImg, result);
		return gameDto;
	}
}
