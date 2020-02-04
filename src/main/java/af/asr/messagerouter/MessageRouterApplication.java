package af.asr.messagerouter;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MessageRouterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageRouterApplication.class, args);
	}

	@Bean
	public CamelContext camelContext()
	{
		return new DefaultCamelContext();
	}
}
