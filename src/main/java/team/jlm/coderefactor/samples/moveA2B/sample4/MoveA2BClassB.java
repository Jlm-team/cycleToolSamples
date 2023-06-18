package team.jlm.coderefactor.samples.moveA2B.sample4;

public class MoveA2BClassB {
    private static final int privateFieldInB = 2;

    private int filedInB = 1;

    private int privateFuncInB() {
        return filedInB;
    }

    // ClassB uses nonstatic filed 'staticFiledInA' here
    // To remove cycle dependency, move this method into ClassA
    public static void funcInB(MoveA2BClassA moveA2BClassA) {
        System.out.println(privateFieldInB);
        System.out.println(moveA2BClassA.nonstaticFiledInA);
    }

    public static void funcInA1(MoveA2BClassB moveA2BClassB) {
        System.out.println("funcInA1");
    }

    // ClassB uses object of ClassA here
    // to remove cycle dependency,
    // make this method static first and then move it to ClassA
    public void funcInB1(MoveA2BClassA classA) {
        filedInB = 2;
        System.out.println(this.privateFuncInB());
        classA.nonstaticFiledInA = 1;
    }
}
