/*
Question:

Create a class Player with below attributes:

playerId - int
playerName - String
runs - int
playerType - String
matchType - String

The above attributes should be private. Write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement two static methods – findPlayerWithLowestRuns and findPlayerByMatchType in Solution class.

findPlayerWithLowestRuns method:

This method will take array of Player objects and a String value as input parameters.

The method will return the least runs of the Player from the array of Player objects for the given player type (String parameter passed).

If no Player with the above condition is present in the array of Player objects, then the method should return 0.

findPlayerByMatchType method:

This method will take array of Player objects and String value as input parameters and return the array of Player objects belonging to the match type passed as input parameter in descending order of playerId.

If no Player with the above condition is present in the array of Player objects, then the method should return null.

Note:
No two Players will have the same playerId and runs.
All the searches should be case insensitive.
The above mentioned static methods should be called from the main method.
Output Requirements:

For findPlayerWithLowestRuns method:

The main method should print the returned runs if the returned value is greater than 0.
Otherwise print:
No such player

For findPlayerByMatchType method:

The main method should print the playerId from the returned Player array for each Player if the returned value is not null.
If the returned value is null then print:
No Player with given matchType
Input Format:

Read the values of 4 Player objects in the following attribute sequence:

playerId
playerName
runs
playerType
matchType

After reading 4 Player objects, read:

playerType
matchType
 */

import java.util.*;

public class Q7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Player[] arr = new Player[4];

        for (int i = 0; i < 4; i++) {

            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            int runs = Integer.parseInt(sc.nextLine());
            String playerType = sc.nextLine();
            String matchType = sc.nextLine();

            arr[i] = new Player(id, name, runs, playerType, matchType);
        }

        String playerType = sc.nextLine();
        String matchType = sc.nextLine();

        int result1 = findPlayerWithLowestRuns(arr, playerType);

        if (result1 > 0) {
            System.out.println(result1);
        } else {
            System.out.println("No such player");
        }

        Player[] result2 = findPlayerByMatchType(arr, matchType);

        if (result2 != null) {
            for (Player p : result2) {
                System.out.println(p.getPlayerId());
            }
        } else {
            System.out.println("No Player with given matchType");
        }

        sc.close();
    }

    public static int findPlayerWithLowestRuns(Player[] arr,String playerType) 
    {

        int min = Integer.MAX_VALUE;
        boolean found = false;

        for (Player p : arr) {

            if (p.getPlayerType().equalsIgnoreCase(playerType)) {

                if (p.getRuns() < min) {
                    min = p.getRuns();
                }

                found = true;
            }
        }

        return found ? min : 0;
    }

    public static Player[] findPlayerByMatchType(Player[] arr,String matchType) 
    {

        ArrayList<Player> list = new ArrayList<>();

        for (Player p : arr) {

            if (p.getMatchType().equalsIgnoreCase(matchType)) {
                list.add(p);
            }
        }

        if (list.size() == 0) 
        {
            return null;
        }

        Collections.sort(list,
                (a, b) -> b.getPlayerId() - a.getPlayerId());

        return list.toArray(new Player[list.size()]);
    }
}

class Player {

    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int playerId, String playerName,
            int runs, String playerType,
            String matchType) {

        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
}

