package hello.api;

import java.util.concurrent.atomic.AtomicLong;

import hello.dtos.FollowupDto;
import hello.service.FollowupService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by guojing on 2016/12/13.
 */
@RestController
public class FollowupController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Resource
    private FollowupService followupService;

    @RequestMapping(value="/followup/{followupId}")
    @ResponseBody
    public FollowupDto greeting(@PathVariable(value="followupId") Integer followupId) {
        String someId = followupService.getById(Long.valueOf(followupId));
        return new FollowupDto(counter.incrementAndGet(), String.format(template, someId));
    }
}
