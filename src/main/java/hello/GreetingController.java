package hello;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "%s!";
    private final AtomicLong counter = new AtomicLong();

    //count the length
    private long count = 0;
    private Set<Long> idSet = new HashSet<Long>();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    //request the message and check id, then count message's words of uniqle ids
    public void count(@RequestParam(value="name", defaultValue="World") String name){
        if (!(idSet.contains(Long(id)))){
            count += countWords(message);
        }
    }

    private long countWords(String sentence){
        String[] wordArray = sentence.trim().split("\\s+");
        long temp = wordArray.length;
        return temp;
    }
}
