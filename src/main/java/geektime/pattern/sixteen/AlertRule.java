package geektime.pattern.sixteen;

import java.util.ArrayList;
import java.util.List;

public class AlertRule {
    private List<Rule> ruleList;

    private AlertRule() {
        ruleList = new ArrayList<>();
    }

    public void addMatchedRule(Rule rule) {
        ruleList.add(rule);
    }

    public Rule getMatchedRule(String api) {
        return ruleList.stream()
                .filter(rule -> rule.getApi().equals(api))
                .findFirst()
                .orElse(null);
    }
}
