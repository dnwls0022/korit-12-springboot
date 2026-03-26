package korit_12.cardatabase00.web;


import korit_12.cardatabase00.entity.AccountCredentials;
import korit_12.cardatabase00.service.JwtService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//컴포넌트 추가  // 필수생성자 삭제

@AllArgsConstructor
@Controller
public class LoginController {
    private JwtService jwtService;
    private AuthenticationManager authenticationManager;


    //로그인이니까 post요청
    @PostMapping("/login")
    //요청과응답이두개
    public ResponseEntity<?> getToken(@RequestBody AccountCredentials credentials){
        //
        UsernamePasswordAuthenticationToken creds = new UsernamePasswordAuthenticationToken(credentials.username(), credentials.password());
        Authentication auth = authenticationManager.authenticate(creds);
        //                                            -지역변수로쓰임
        String jwts = jwtService.getToken(auth.getName()); // 외부에서는 볼수없다.

        //
        return ResponseEntity.ok()
                .header(HttpHeaders.AUTHORIZATION, "Bearer " +jwts)
                .header(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "Authorization")
                .build();
    }
}

// 로그인을통해 json  웹토큰을얻엇다