package com.knit.springboot.config.auth.dto;

import com.knit.springboot.domain.user.User;
import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
public class OAuthAttributes {
    private Map<String,Object> attributes;
    private String nameAttributeKey;
    private String name;
    private String email;
    private String picture;

    @Builder
    public OAuthAttributes(Map<String,Object> attribues,String nameAttributeKey,String name,String email,String picture){
        this.attributes=attribues;
        this.nameAttributeKey=nameAttributeKey;
        this.name=name;
        this.email=email;
        this.picture=picture;
    }

    public static OAuthAttributes of(String registrationId, String userNameAttributes, Map<String, Object> attributes) {
        return ofGoogle(userNameAttributeName, attributes);
    }

    public User toEntity(){
        return User.builder().name(name).email(email).picture(picture).role(role).build();
    }


}
