package com.knit.springboot.config.auth;

import com.knit.springboot.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomOAuth2UserService implements OAuth2UserService<OAuth2UserRequest,OAuth2User>{
    private final UserRepository userRepository;
    private final HttpSession httpSession;

    @Override
}
