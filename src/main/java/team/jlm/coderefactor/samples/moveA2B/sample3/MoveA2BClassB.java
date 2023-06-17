package team.jlm.coderefactor.samples.moveA2B.sample3;

public class MoveA2BClassB {
    private static final int privateFieldInB = 2;

    // ClassB uses nonstatic filed 'staticFiledInA' here
    // To remove cycle dependency, move this method into ClassA
    public static void funcInB(MoveA2BClassA moveA2BClassA) {
        System.out.println(privateFieldInB);
        System.out.println(moveA2BClassA.nonstaticFiledInA);
    }

    public static void funcInA1() {
        System.out.println("funcInA1");
    }

    public void funcInB1() {
        funcInA1();
    }
}
