public class Node {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getState0() {
        return state0;
    }

    public void setState0(Node state0) {
        this.state0 = state0;
    }

    public Node getState1() {
        return state1;
    }

    public void setState1(Node state1) {
        this.state1 = state1;
    }

    private Node state0;
    private Node state1;

    public Node(String n) {
        name = n;
    }

    public void setState(Node s0, Node s1) {
        state0 = s0;
        state1 = s1;
    }

    public boolean equals(Node n) {
        return this.name.equals(n.name);
    }

    public String toString() {
        return name;
    }

}
