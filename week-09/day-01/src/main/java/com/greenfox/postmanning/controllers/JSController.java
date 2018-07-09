package com.greenfox.postmanning.controllers;

import com.greenfox.postmanning.models.*;
import com.greenfox.postmanning.models.Error;
import com.greenfox.postmanning.models.Number;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSController {

  @GetMapping("/doubling")
  public Returnable getDoubleOfNumber(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      return new Number(input);
    } else {
      return new Error("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  public Returnable getGreeting(@RequestParam(value = "name", required = false) String name,
                                @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new Error("Please provide a name!");
    } else if (title == null) {
      return new Error("Please provide a title!");
    } else {
      return new Greeting(new Person(name, title));
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Appended getAppended(@PathVariable String appendable) {
    
  }
}
