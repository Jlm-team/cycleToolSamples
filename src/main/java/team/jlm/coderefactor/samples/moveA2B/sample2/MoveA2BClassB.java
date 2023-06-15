package team.jlm.coderefactor.samples.moveA2B.sample2;

public class MoveA2BClassB {
    // ClassB uses nonstatic filed 'staticFiledInA' here
    // To remove cycle dependency, move this method into ClassA
    public static void funcInB(MoveA2BClassA moveA2BClassA) {
        System.out.println(moveA2BClassA.nonstaticFiledInA);
    }
}
