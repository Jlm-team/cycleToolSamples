package team.jlm.coderefactor.samples.moveA2B.sample2;

public class MoveA2BClassA {
    public int nonstaticFiledInA = 1;
    int x;
    public int func() {
        System.out.println(new MoveA2BClassB());
        return x;
    }
}
