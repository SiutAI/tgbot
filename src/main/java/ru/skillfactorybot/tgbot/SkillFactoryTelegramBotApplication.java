package java.ru.skillfactorybot.tgbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableScheduling
@SpringBootApplication
public class SkillFactoryTelegramBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillFactoryTelegramBotApplication.class, args);
	}

}
