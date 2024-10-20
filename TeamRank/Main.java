import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public String rankTeams(String[] votes) {
        if (votes.length == 1) {
            return votes[0];
        }

        HashMap<Character, int[]> teamRank = new HashMap<>();
        for (String vote : votes) {
            for (int i = 0; i < vote.length(); i++) {
                char c = vote.charAt(i);
                if (!teamRank.containsKey(c)) {
                    teamRank.put(c, new int[26]);
                }
                teamRank.get(c)[i]++;
            }
        }

        String result = teamRank.entrySet().stream()
                .sorted((entry1, entry2) -> {
                    for (int i = 0; i < entry1.getValue().length; i++) {
                        if (entry1.getValue()[i] != entry2.getValue()[i]) {
                            return entry2.getValue()[i] - entry1.getValue()[i];
                        }
                    }
                    return entry1.getKey() - entry2.getKey();
                })
                .map(Map.Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.joining());

        return result;
    }
}