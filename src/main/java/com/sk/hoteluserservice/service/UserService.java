package com.sk.hoteluserservice.service;

import com.sk.hoteluserservice.dto.TokenRequestDto;
import com.sk.hoteluserservice.dto.TokenResponseDto;
import com.sk.hoteluserservice.dto.UserCreateDto;
import com.sk.hoteluserservice.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<UserDto> findAll(Pageable pageable);

    UserDto add(UserCreateDto userCreateDto);

    TokenResponseDto login(TokenRequestDto tokenRequestDto);
}
