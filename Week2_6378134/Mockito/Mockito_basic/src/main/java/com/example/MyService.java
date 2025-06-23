package com.example;
public class MyService {
    private final ExternalApi api;
    public MyService(ExternalApi api) {
        this.api = api;
    }
    public String fetchData() {
        return api.getData();
    }
    public String fetchDataById(int id) {
        return api.getDataById(id);
    }
    public void clearCache() {
        api.clearCache();
    }
    public void fetchAndClear() {
        api.getData();
        api.clearCache();
    }
}
