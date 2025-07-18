package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MultiReturnServiceTest {
    @Test
    public void testServiceWithMultipleReturnValues() {
        Repository mockRepo = mock(Repository.class);
        when(mockRepo.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");
        Service service = new Service(mockRepo);
        String first = service.processData();
        String second = service.processData();
        assertEquals("Processed First Mock Data", first);
        assertEquals("Processed Second Mock Data", second);
    }
}
