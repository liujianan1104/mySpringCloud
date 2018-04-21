package feignserver.feign.server;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements HiInterface {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
