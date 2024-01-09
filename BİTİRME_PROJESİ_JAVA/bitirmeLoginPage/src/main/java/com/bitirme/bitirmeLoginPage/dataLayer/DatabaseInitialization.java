/*package com.bitirme.bitirmeLoginPage.dataLayer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bitirme.bitirmeLoginPage.login.entities.Login;
import com.bitirme.bitirmeLoginPage.repository.LoginRepository;

@Configuration
public class DatabaseInitialization {

    @Bean
    public CommandLineRunner initializeDatabase(LoginRepository loginRepository) {
        return args -> {
            // Veritabanına örnek bir kullanıcı ekleyin
            loginRepository.save(new Login("ornek_kullanici", "gizli_sifre"));

            System.out.println("Veritabanına örnek kullanıcı eklendi: ornek_kullanici");
        };
    }
}*/



