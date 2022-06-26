package com.jbt.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * @author javabeginnerstutorial.com
 */
public class optional_java_8_stream {

  public static void main(String[] args) {

    List<ABC> list = new ArrayList<>();
    list.add(new ABC("name1", 12));
    list.add(new ABC("name2", null));
    list.add(new ABC(null, 12));

    String name = list.stream().map(ABC::getName)
        .filter(Optional::isPresent)
        .map(Optional::orElseThrow)
        .collect(Collectors.joining(","));

    System.out.println(name);

    // Since JDK 9
    name = list.stream()
        .map(ABC::getName)
        .flatMap(Optional::stream)
        .collect(Collectors.joining(","));

    System.out.println(name);

    name = list.stream()
        .map(ABC::getName)
        .map(name1 -> name1.orElse("NO_NAME"))
        .collect(Collectors.joining(","));

    System.out.println(name);
  }


}

class ABC {

  private String name;
  private Integer age;

  public ABC(String name, Integer age) {
    this.name = name;
    this.age = age;
  }


  public Optional<String> getName() {
    if (name == null) {
      return Optional.empty();
    }
    return Optional.of(name);
  }

  public Optional<Integer> getAge() {
    if (age == null) {
      return Optional.empty();
    }
    return Optional.of(age);
  }
}
