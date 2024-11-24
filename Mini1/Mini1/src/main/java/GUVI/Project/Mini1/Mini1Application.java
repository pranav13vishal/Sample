package GUVI.Project.Mini1;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@OpenAPIDefinition(
        info = @Info(
                title = "Employee Management Application API documentation",
                description = "Spring boot - API documentation for the User Management",
                    version = "1.0",
                contact = @Contact(
                        name = "PRANAV VISHAL",
                        email = "pranav13vishal@gmail.com"
                )
        )
)
@SpringBootApplication
public class Mini1Application {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(Mini1Application.class, args);
    }

}
