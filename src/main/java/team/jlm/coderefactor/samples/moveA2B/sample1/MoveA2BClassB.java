package team.jlm.coderefactor.samples.moveA2B.sample1;

public class MoveA2BClassB {
    // ClassB uses static filed 'staticFiledInA' here
    // To remove cycle dependency, move 'staticFiledInA' into ClassB
    public void funcInB() {
        System.out.println(MoveA2BClassA.staticFiledInA);
    }
}
