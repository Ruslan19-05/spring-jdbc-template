package az.turing.springjdbctemplateexcample;

import az.turing.springjdbctemplateexcample.domain.entity.User;
import az.turing.springjdbctemplateexcample.domain.repository.UserPostgresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@RequiredArgsConstructor

public class SpringJdbctemplateExcampleApplication implements CommandLineRunner {

    private final UserPostgresRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbctemplateExcampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(repository.getAll());
    }
}
