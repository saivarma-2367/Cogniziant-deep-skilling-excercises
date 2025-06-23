package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class CustomQueryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    void testFindByName() {
        User user = new User();
        user.setId(1L);
        user.setName("David");
        userRepository.save(user);
        List<User> users = userRepository.findByName("David");
        assertFalse(users.isEmpty());
        assertEquals("David", users.get(0).getName());
    }
}

