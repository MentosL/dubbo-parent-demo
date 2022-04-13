package com.montos.dubbo.api;

import java.util.concurrent.CompletableFuture;

public interface ApacheDubboExampleService {
    String sayHello(String name);

    default CompletableFuture<String> sayHelloAsync(String name) {
        return CompletableFuture.completedFuture(sayHello(name));
    }
}
