package devmind.quiz.controller;

import devmind.quiz.service.AddService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
@RequiredArgsConstructor
public class AddController {

    private final AddService addService;

    @RequestMapping(value = "/first/{first}/second/{second}", method = RequestMethod.GET)
    public String add(@PathVariable String first, @PathVariable String second) {
        return String.valueOf(Long.parseLong(first) + Long.parseLong(second));
    }

    @RequestMapping(value = "/bonus/first/{first}/second/{second}", method = RequestMethod.GET)
    public String enhancedAdd(@PathVariable String first, @PathVariable String second) {
        return addService.add(first, second);
    }
}