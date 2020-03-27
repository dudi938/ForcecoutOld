package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {


	String LogFilePath = "/Log.txt";

	@RequestMapping("/")
	public String index() {
		
		Logger.AppendToFile(LogFilePath, "HttpRequest to /");
		return "Greetings from Spring my Boot!";
	}

	@RequestMapping("/forsecout")
	public String forsecout() {

		Logger.AppendToFile(LogFilePath, "HttpRequest to /forsecout");
		return "Wellcome to forsecout exam!";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
