import java.util.*;

public class Q9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player[] arr = new Player[4];

        for (int i = 0; i < 4; i++) {
            int playerId = sc.nextInt();
            sc.nextLine();

            String playerName = sc.nextLine();
            int runs = sc.nextInt();
            sc.nextLine();

            String playerType = sc.nextLine();
            String matchType = sc.nextLine();

            arr[i] = new Player(playerId, playerName, runs, playerType, matchType);
        }

        String type2 = sc.nextLine();

        Player[] result = findPlayerByMatchType(arr, type2);

        if (result == null) {
            System.out.println("No Player Found");
        } else {
            for (Player p : result) {
                System.out.println(p.getPlayerId());
            }
        }
    }

    public static Player[] findPlayerByMatchType(Player[] arr, String type2) {

        ArrayList<Player> list = new ArrayList<>();

        for (Player p : arr) {
            if (p.getMatchType().equalsIgnoreCase(type2)) {
                list.add(p);
            }
        }

        Collections.sort(list, (a, b) -> b.getPlayerId() - a.getPlayerId());

        if (list.size() == 0) {
            return null;
        } else {
            return list.toArray(new Player[list.size()]);
        }
    }
}

class Player {

    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    Player(int pid, String pname, int run, String ptype, String mtype) {
        playerId = pid;
        playerName = pname;
        runs = run;
        playerType = ptype;
        matchType = mtype;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getRuns() {
        return runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getMatchType() {
        return matchType;
    }
}