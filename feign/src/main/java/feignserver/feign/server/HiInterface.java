package feignserver.feign.server;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="USER", fallback = SchedualServiceHiHystric.class)
public interface HiInterface {

    @RequestMapping(value="/hi", method=RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
