package team.jlm.coderefactor.result.moveA2B.sample1;

public class MoveA2BClassB {
    public static int staticFiledInA = 1;

    // ClassB uses static filed 'staticFiledInA' here
    // To remove cycle dependency, move 'staticFiledInA' into ClassB
    public void funcInB() {
        System.out.println(staticFiledInA);
    }
}
