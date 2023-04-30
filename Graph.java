public class Graph {
    private Node sttNode;
    private Node curNode;
    private Node endNode;

    private Node S0 = new Node("S0");
    private Node S1 = new Node("S1");
    private Node S2 = new Node("S2");
    private Node S3 = new Node("S3");
    private Node S4 = new Node("S4");

    public void init() {
        S0.setState(S0, S1);
        S1.setState(S1, S2);
        S2.setState(S2, S3);
        S3.setState(S3, S4);
        S4.setState(S4, S0);
        sttNode = S0;
        curNode = sttNode;
        endNode = S4;
    }
    
    public String isAccept(String s) {
        init();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(getCurrent() + " (" + s.charAt(i) + ") -> ");
            NextState(String.valueOf(s.charAt(i)));
        }
        System.out.println(getCurrent());
        return (curNode == endNode) ? "accept" : "not accept";
    }

    public void NextState(String s) {
        if (s.equals("0")) {
            curNode = curNode.getState0();
        } else if (s.equals("1")) {
            curNode = curNode.getState1();
        }
    }

    public String getCurrent() {
        return curNode.getName();
    }

    public String getStart() {
        return sttNode.getName();
    }

    public String getEnd() {
        return endNode.getName();
    }

    public String toString() {
        String s = "";
        s = String.format("Start : %s , Current : %s , End : %s", getStart(), getCurrent(), getEnd());

        return s;
    }

}
