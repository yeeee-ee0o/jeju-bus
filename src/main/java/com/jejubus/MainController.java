package com.jejubus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // 메인 페이지 (http://localhost:8080/)
    @GetMapping("/")
    public String index() {
        return "index"; // templates/index.html을 렌더링
    }

    // 로그인 페이지 (http://localhost:8080/login)
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // templates/login.html을 렌더링
    }

    // 회원가입 페이지 (http://localhost:8080/signup)
    @GetMapping("/signup")
    public String signupPage() {
        return "signup"; // templates/signup.html을 렌더링
    }
}
