package team.jlm.coderefactor.result.callchain.sample1;

public class CallChain1ClassC {
    public void funcNoReturnInC(int intArg0) {
        System.out.println("calling funcNoReturnInC, arg0 is: " + intArg0);
    }

    public int funcWithReturnValueInC(int intArg0) {
        System.out.println("calling funcWithReturnValueInC, arg0 is: " + intArg0);
        return intArg0;
    }
}
