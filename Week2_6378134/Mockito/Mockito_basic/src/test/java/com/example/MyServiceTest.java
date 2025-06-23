package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import com.example.ExternalApi;
import com.example.MyService;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

class MyServiceTest {
    @Test
    void testExternalApi() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }

    @Test
    void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }

    @Test
    void testArgumentMatching() {
        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getDataById(anyInt())).thenReturn("Data for ID");

        MyService service = new MyService(mockApi);
        service.fetchDataById(42);

        verify(mockApi).getDataById(eq(42));
    }

    @Test
    void testVoidMethod() {
        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.clearCache();

        verify(mockApi).clearCache();
    }

    @Test
    void testMultipleReturns() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData())
                .thenReturn("First")
                .thenReturn("Second");

        MyService service = new MyService(mockApi);

        assertEquals("First", service.fetchData());
        assertEquals("Second", service.fetchData());
    }

    @Test
    void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.fetchAndClear();

        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).getData();
        inOrder.verify(mockApi).clearCache();
    }

    @Test
    void testVoidMethodException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("API error")).when(mockApi).clearCache();

        MyService service = new MyService(mockApi);

        assertThrows(RuntimeException.class, () -> service.clearCache());
        verify(mockApi).clearCache();
    }
}
