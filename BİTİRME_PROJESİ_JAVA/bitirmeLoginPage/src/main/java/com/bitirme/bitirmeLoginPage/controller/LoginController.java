package com.bitirme.bitirmeLoginPage.controller;

import com.bitirme.bitirmeLoginPage.entities.Login;
import com.bitirme.bitirmeLoginPage.repository.LoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    private final LoginRepository loginRepository;

    @Autowired
    public LoginController(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestBody Login loginRequest) {
        Login existingUser = loginRepository.findByUsernameAndPassword(
                loginRequest.getUsername(), loginRequest.getPassword());
        if (existingUser != null) {
            ResponseEntity<String> usernameResponse = getUsername(existingUser);
            return ResponseEntity.ok("{\"message\": \"Giriş başarılı!\", \"username\": \"" + usernameResponse.getBody() + "\"}");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"message\": \"Geçersiz kullanıcı adı veya şifre\"}");
        }
    }

    @GetMapping("/getUsername")
    public ResponseEntity<String> getUsername(Login user) {
        String username = "mert"; // Gerçek kullanıcı adını buradan alabilirsiniz, şu an sabit bir değer kullanıldı.
        return ResponseEntity.ok(username);
    }

    // Diğer metotlar...
}

