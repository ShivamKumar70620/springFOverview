package com.springTutorial.springTutorial;
import com.springTutorial.springTutorial.EnterPrise.MyWebController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springTutorial.springTutorial.game.GameRunner;
import com.springTutorial.springTutorial.game.MarioGame;
import com.springTutorial.springTutorial.game.SuperContraGame;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringTutorialApplication.class, args);
//		MarioGame game = new MarioGame();
//		SuperContraGame scGame = new SuperContraGame();
//		GameRunner runner = new GameRunner(scGame);

		GameRunner runner = context.getBean(GameRunner.class);
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromWebController());
		runner.run();
	}

}
