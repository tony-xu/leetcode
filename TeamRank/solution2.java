import java.util.*;

class Solution {

    public String rankTeams(String[] votes) {
        if (votes.length == 1) {
            return votes[0];
        }
        // create a map to store the vote counts for each team
        HashMap<Character, int[]> map = new HashMap<>();
        for (String vote : votes) {
            for (int i = 0; i < vote.length(); i++) {
                char c = vote.charAt(i);
                if (!map.containsKey(c)) {
                    map.put(c, new int[26]);
                }
                map.get(c)[i]++;
            }
        }

        // create a list of teams, sorted by their vote counts
        ArrayList<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> {
            for (int i = 0; i < 26; i++) {
                if (map.get(a)[i] != map.get(b)[i]) {
                    return map.get(b)[i] - map.get(a)[i];
                }
            }
            return a - b;
        });

/*      StringBuilder sb = new StringBuilder();
        for (Character c : list) {
            sb.append(c);
        }
        String res = sb.toString();*/

        // convert the list of teams back to an array
        String res = '';
        for (Character c : list) {
            res = res.concat(c);
        }

        return res;
    }
}