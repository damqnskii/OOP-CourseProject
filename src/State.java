import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class State {
    private String name;
    boolean isFinal;
    Map<Character, Set<State>> transitions;
    Set<State> epsilonTransitions;

    public void addTransition(char symbol, State nextState) {
        transitions.putIfAbsent(symbol, new HashSet<>());
        transitions.get(symbol).add(nextState);
    }

    public void addEpsilonTransition(State nextState) {
        epsilonTransitions.add(nextState);
    }
}
