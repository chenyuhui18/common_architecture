package org.dubbo.provider.user.service;

import org.dubbo.api.service.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
        return "Hello " + name;
    }

}
