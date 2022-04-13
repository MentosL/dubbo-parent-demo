package com.montos.dubbo.provider;

import com.montos.dubbo.api.ApacheDubboExampleService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0")
public class ApacheDubboProvider  implements ApacheDubboExampleService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
