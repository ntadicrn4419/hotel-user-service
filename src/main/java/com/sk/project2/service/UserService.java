package com.sk.project2.service;

import com.sk.project2.dto.UserCreateDto;
import com.sk.project2.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<UserDto> findAll(Pageable pageable);

    UserDto add(UserCreateDto userCreateDto);
}
