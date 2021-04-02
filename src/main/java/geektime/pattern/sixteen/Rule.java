package geektime.pattern.sixteen;

public class Rule {
    private int maxTps;
    private String api;
    private int maxErrorCount;

    public Rule() {

    }

    public Rule(int maxTps, int api, int maxErrorCount) {

    }

    public int getMaxTps() {
        return this.maxTps;
    }
    public String getApi() {
        return this.api;
    }
    public int getMaxErrorCount() {
        return this.maxErrorCount;
    }
}
