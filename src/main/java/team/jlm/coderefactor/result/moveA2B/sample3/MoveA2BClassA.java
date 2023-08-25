package team.jlm.coderefactor.result.moveA2B.sample3;

public class MoveA2BClassA {
    public int nonstaticFiledInA = 1;
    int x;

    // ClassB uses nonstatic filed 'staticFiledInA' here
    // To remove cycle dependency, move this method into ClassA
    public static void funcInB(MoveA2BClassA moveA2BClassA) {
        System.out.println(MoveA2BClassB.privateFieldInB);
        System.out.println(moveA2BClassA.nonstaticFiledInA);
    }

    public int funcInA0() {
        System.out.println(new MoveA2BClassB());
        return x;
    }

}
