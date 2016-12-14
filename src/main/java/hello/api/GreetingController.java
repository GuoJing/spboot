package hello.api;

import java.util.concurrent.atomic.AtomicLong;

import hello.service.FollowupService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by guojing on 2016/12/13.
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Resource
    private FollowupService followupService;

    @RequestMapping("/greeting")
    public Greeter greeting(@RequestParam(value="name", defaultValue="World") String name) {
        int i = 123;
        Long id = Long.valueOf(i);
        String someId = followupService.getById(Long.valueOf(id));
        return new Greeter(counter.incrementAndGet(), String.format(template, someId));
    }
}
