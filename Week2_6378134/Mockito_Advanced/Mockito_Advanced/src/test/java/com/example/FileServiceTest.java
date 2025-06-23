package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FileServiceTest {
    @Test
    public void testServiceWithMockFileIO() {
        FileReader mockReader = mock(FileReader.class);
        FileWriter mockWriter = mock(FileWriter.class);

        when(mockReader.read()).thenReturn("Mock File Content");

        FileService fileService = new FileService(mockReader, mockWriter);
        String result = fileService.processFile();

        assertEquals("Processed Mock File Content", result);
        verify(mockWriter).write("Processed Mock File Content");
    }
}
