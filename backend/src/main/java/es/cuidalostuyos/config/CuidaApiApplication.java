package es.cuidalostuyos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@SpringBootApplication
public class CuidaApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CuidaApiApplication.class, args);
    }

    @RestController
    static class HealthController {
        @GetMapping("/api/health")
        public Map<String, String> health() {
            return Map.of("status", "ok", "application", "Cuida a los tuyos");
        }
    }
}
