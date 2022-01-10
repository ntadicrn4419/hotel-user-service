package com.sk.hoteluserservice.mapper;

import com.sk.hoteluserservice.domain.User;
import com.sk.hoteluserservice.dto.UserCreateDto;
import com.sk.hoteluserservice.dto.UserDto;
import com.sk.hoteluserservice.repository.RoleRepository;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    private RoleRepository roleRepository;

    public UserMapper(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public UserDto userToUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setEmail(user.getEmail());
        userDto.setFirstName(user.getFirstname());
        userDto.setLastName(user.getLastname());
        userDto.setUsername(user.getUsername());
        userDto.setBirthDate(user.getBirthDate());
        userDto.setPhone(user.getPhone());
        userDto.setPassportNumber(user.getPassportNumber());
        userDto.setNumberOfReservations(user.getNumberOfReservations());
        userDto.setHotelName(user.getHotelName());
        userDto.setHireDate(user.getHireDate());
        return userDto;
    }

    public User userCreateDtoToUser(UserCreateDto userCreateDto) {
        User user = new User();
        user.setEmail(userCreateDto.getEmail());
        user.setFirstname(userCreateDto.getFirstName());
        user.setLastname(userCreateDto.getLastName());
        user.setUsername(userCreateDto.getUsername());
        user.setPassword(userCreateDto.getPassword());

        user.setBirthDate(userCreateDto.getBirthDate());
        user.setPhone(userCreateDto.getPhone());
        user.setPassportNumber(userCreateDto.getPassportNumber());
        user.setNumberOfReservations(userCreateDto.getNumberOfReservations());
        user.setHotelName(userCreateDto.getHotelName());
        user.setHireDate(userCreateDto.getHireDate());

        user.setRole(roleRepository.findRoleByName("ROLE_CLIENT").get()); // role moze biti: ROLE_CLIENT, ROLE_MANAGER, ROLE_ADMIN// sta treba staviti ovde?
        user.setNumberOfReservations(0);

        return user;
    }
}
