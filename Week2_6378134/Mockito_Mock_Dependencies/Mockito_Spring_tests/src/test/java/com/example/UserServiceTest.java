package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.util.Optional;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserService userService;
    @Test
    void testGetUserById() {
        User user = new User();
        user.setId(2L);
        user.setName("Bob");
        when(userRepository.findById(2L)).thenReturn(Optional.of(user));
        User result = userService.getUserById(2L);
        assertThat(result.getName()).isEqualTo("Bob");
    }}
