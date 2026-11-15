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
    // 실시간 버스 도착 정보 페이지 (http://localhost:8080/bus-arrival)
    @GetMapping("/bus-arrival")
    public String busArrivalPage() {
        return "arrival"; // templates/arrival.html 파일을 렌더링
    }
    // 여행지 추천 페이지 (http://localhost:8080/recommend)
    @GetMapping("/recommend")
    public String recommendPage() {
        return "recommend"; // templates/recommend.html 파일을 렌더링
    }
}
