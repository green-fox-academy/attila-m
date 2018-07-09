package com.greenfox.postmanning.controllers;

import com.greenfox.postmanning.models.*;
import com.greenfox.postmanning.models.Error;
import com.greenfox.postmanning.models.Number;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;


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
  public Appended getAppended(@PathVariable("appendable") String word) {
    return new Appended(word);
  }

  @PostMapping("/dountil/{what}")
  public Returnable getResult(@RequestBody DoUntil until,
                              @PathVariable("what") String what) {
    if (until != ) {
      return new Error("Please provide a number!");
    } else if (until.getUntil() != null) {
      Integer number = 1;
      Integer temp = 1;
      if (what.equals("sum")) {
        for (Integer i = 1; i < until.getUntil(); i++) {
          temp++;
          number += temp;
        }
        return new Result(number);
      } else if (what.equals("factor")) {
        for (Integer i = 1; i <= until.getUntil(); i++) {
          number *= i;
        }
        return new Result(number);
      }
    } return new Error("Please select an operation!");
  }
}
