package com.greenfox.foxclub.repositories;

import com.greenfox.foxclub.models.Trick;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TrickRepositoryImpl implements TrickRepository {

  private List<Trick> trickList;

  public TrickRepositoryImpl() {
    trickList = new ArrayList<>();
  }

  public void addTrick(Trick trick) {
    trickList.add(trick);
  }

  public List<Trick> getTrickList() {
    return trickList;
  }

  public void setTrickList(List<Trick> trickList) {
    this.trickList = trickList;
  }
}

