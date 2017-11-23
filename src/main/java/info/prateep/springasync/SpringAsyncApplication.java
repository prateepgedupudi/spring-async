package info.prateep.springasync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:jdbcpoller.xml"})
public class SpringAsyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAsyncApplication.class, args);
	}
}
