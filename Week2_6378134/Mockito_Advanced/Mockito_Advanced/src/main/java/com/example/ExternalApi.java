package com.example;

public interface ExternalApi {
    String getData();
    String getDataById(int id);
    void clearCache();
}
