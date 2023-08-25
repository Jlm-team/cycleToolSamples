package team.jlm.coderefactor.result.moveA2B.sample3;

public class MoveA2BClassB {
    public static final int privateFieldInB = 2;

    public static void funcInA1() {
        System.out.println("funcInA1");
    }

    public void funcInB1() {
        funcInA1();
    }
}
