package edu.luc.cs.cs271.lab2;

import java.util.Optional;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    final Team t1 = new Team("USA", "Sarachan", 500);
    final Team t2 = new Team("Chile", "Rueda", 600);
    final Team t3 = new Team("Germany", "Löw", 700);
    final Team[] array = {t1, t2, t3};
    final List<Team> list = Arrays.asList(array);

    final Scanner keyboard = new Scanner(System.in);

    // Get team name
    System.out.print("Enter name to search: ");
    final String key = keyboard.nextLine();
    System.out.println("Looking for team " + key);

    // Runs the linear search on the array
    final Optional<Integer> index1 = Search.findTeamPosition(array, key);
    checkTeamListIndex(Arrays.asList(array), index1);
    
    // Runs the linear search on the list
    final Optional<Integer> index2 = Search.findTeamPosition(list, key);
    checkTeamListIndex(list, index2);

    // Get funding level
    System.out.print("Enter min funding to search: ");
    final String fundingString = keyboard.nextLine();
    final int funding = Integer.parseInt(fundingString);
    System.out.println("Looking for min funding " + funding);
  
    // Runs the linear search on the array
    final Optional<Integer> index3 = Search.findTeamMinFunding(array, funding);
    checkTeamListIndex(Arrays.asList(array), index3);

    // Runs the binary search on the array
    final Optional<Integer> index4 = Search.findTeamMinFundingFast(array, funding);
    checkTeamListIndex(Arrays.asList(array), index4);
  }
  static void checkTeamListIndex(final List<Team> list, final Optional<Integer> index) {
    // Checks the index
    if (index.isPresent()) {
      System.out.println("Found!");
      final int pos = index.get();
      final Team team = list.get(pos);
      // done DRY - eliminate this code duplication
      System.out.println("Name: " + team.getName());
      System.out.println("Head coach: " + team.getHeadcoach());
      System.out.println("Funding: " + team.getFunding());
      System.out.println("Array index: " + pos);
      System.out.println("Ranking: " + (pos + 1));
    } else {
      System.out.println("Not Found!");
    }
  }
}
