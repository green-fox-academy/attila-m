package com.greenfox.postmanning.controllers;

import com.greenfox.postmanning.models.*;
import com.greenfox.postmanning.models.Error;
import com.greenfox.postmanning.models.Number;
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
  public Returnable getResult(@RequestBody(required = false) DoUntil until,
                              @PathVariable("what") String what) {
    if (until != null) {
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
    }
    return new Error("Please provide a number!");
  }
  @PostMapping("/arrays")
  public Returnable calculateArray(@RequestBody ArraysOperation arrays) {
    Integer sum = 0;
    if (arrays.getWhat().equals("sum")) {
      for (int i = 0; i < arrays.getNumbers().length; i++) {
        sum+=arrays.getNumbers()[i];
      }
    } else if (arrays.getWhat().equals("multiply")) {
      for (int i = 0; i < arrays.getNumbers().length - 1 ; i++) {
        sum+=arrays.getNumbers()[i] * arrays.getNumbers()[i + 1];
      }
    } return new Result(sum);
  }
}
