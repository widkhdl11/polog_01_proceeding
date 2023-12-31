package com.polog.polog.domain.member.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RedisHash(value = "refresh", timeToLive = 604800)
public class RefreshToken {

    private String id;

    private String ip;

    private Collection<? extends GrantedAuthority> authorities;
//    @Enumerated(EnumType.STRING)
//    private Authority authority;

    @Indexed
    private String refreshToken;
}