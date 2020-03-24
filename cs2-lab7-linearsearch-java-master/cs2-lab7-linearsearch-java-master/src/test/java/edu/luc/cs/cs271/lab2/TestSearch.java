package edu.luc.cs.cs271.lab2;

import edu.luc.cs.cs271.lab2.Search;
import edu.luc.cs.cs271.lab2.Team;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;


public class TestSearch {

  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String store = Integer.toString(i);
      array[i] = new Team("Team " + store, "Coach " + store, i * 100 + 50);
    }
    return array;
  }

  //  makeListFixture done
  List<Team> makeListFixture(final int size) {
    final List<Team> list = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      final String store = Integer.toString(i);
      list.add(new Team("Team " + store, "Coach " + store, i * 100 + 50));
    }
    return list;
  }

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 10").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 9").isPresent());
  }


  //  testFindPositionList0, 10s, 10f done
  @Test
  public void testFindPositionList0() {
    final List<Team> list = makeListFixture(0);
    assertFalse(Search.findTeamPosition(list, "Team 11").isPresent());
  }
  @Test
  public void testFindPositionList10s() {
    final List<Team> list = makeListFixture(10);
    assertFalse(Search.findTeamPosition(list, "Team 5").isPresent());
  }
  @Test
  public void testFindPositionList10f() {
    final List<Team> list = makeListFixture(10);
    assertFalse(Search.findTeamPosition(list, "Team 5").isPresent());
  }
  //  testFindMinFundingArray for several sizes and scenarios done

  @Test
  public void testFindMinFundingArray0()
  {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamMinFunding(arr, 200).isPresent());
  }
  @Test
  public void testFindMinFundingArray10s()
  {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamMinFunding(arr, 950).isPresent());
  }
  @Test
  public void testFindMinFundingArray10f()
  {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamMinFunding(arr, 1400).isPresent());
  }

  // testFindMinFundingArrayFast for several sizes and scenarios done
  @Test
  public void testFindMinFundingArrayFast0(){
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamMinFundingFast(arr, 600).isPresent());
  }
  @Test
  public void testFindMinFundingArrayFast10s()
  {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamMinFundingFast(arr, 950).isPresent());
  }
  @Test
  public void testFindMinFundingArrayFast10f()
  {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamMinFundingFast(arr, 1500).isPresent());
  }
}