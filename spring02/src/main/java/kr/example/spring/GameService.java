package kr.example.spring;

import kr.example.spring.domain.GameDto;

public interface GameService {

	public GameDto play(int choiceIdx);

}
