package info.prateep.springasync.web;

import info.prateep.springasync.bean.Simple;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/testsvc")
public class TestController {
    @RequestMapping(value = "/tests")
    public ResponseEntity<Simple> testMethod(){
        Simple simple = new Simple();
        simple.setName("Name1");
        simple.setAge(30);
        return new ResponseEntity<Simple>(simple, HttpStatus.OK);
    }
}
