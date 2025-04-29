package az.turing.springjdbctemplateexcample;

import az.turing.springjdbctemplateexcample.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor

public class SpringJdbctemplateExcampleApplication implements CommandLineRunner {

    private final UserRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbctemplateExcampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(repository.getAll());
    }
}
