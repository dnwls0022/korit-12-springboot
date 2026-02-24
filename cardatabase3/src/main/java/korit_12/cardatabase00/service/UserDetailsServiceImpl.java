package korit_12.cardatabase00.service;

import korit_12.cardatabase00.entity.AppUser;
import korit_12.cardatabase00.repository.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

//특정한인터페이스를 구현한 규칙 UserDetailsServiceImpl



@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    //필드선언
    private AppUserRepository appUserRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> user= appUserRepository.findByUsername(username);
        UserBuilder builder=null;
        //내부에널이아닌 무언가가존재한다면
        if (user.isPresent()) { //if가 실행되면 user를 AppUser 객체가 있다.
            AppUser currentUser = user.get(); //Optional 에서 제네릭으로 존재하는 객체를 빼내는메서드 get()
            builder = User.withUsername(username)
                    .password(currentUser.getPassword())
                    .roles(currentUser.getRole());
        }else {
            throw new UsernameNotFoundException("해당 username을 가진 사용자를 찾지 못함");

        }
        return builder.build();

    }
}
