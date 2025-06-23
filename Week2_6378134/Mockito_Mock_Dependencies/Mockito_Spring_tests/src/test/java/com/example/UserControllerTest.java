package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
@ExtendWith(MockitoExtension.class)
public class UserControllerTest {
    @Mock
    private UserService userService;
    @InjectMocks
    private UserController userController;
    @Test
    void testGetUser() {
        User user = new User();
        user.setId(1L);
        user.setName("Alice");
        when(userService.getUserById(1L)).thenReturn(user);
        ResponseEntity<User> response = userController.getUser(1L);
        assertThat(response.getBody().getName()).isEqualTo("Alice");
    }
}
