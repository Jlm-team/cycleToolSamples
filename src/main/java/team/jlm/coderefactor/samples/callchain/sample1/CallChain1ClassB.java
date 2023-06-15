package team.jlm.coderefactor.samples.callchain.sample1;

public class CallChain1ClassB {
    CallChain1ClassC callChain1ClassC;
    public void funcInB(int intArg0) {
        callChain1ClassC.funcNoReturnInC(intArg0);
        System.out.println(callChain1ClassC.funcWithReturnValueInC(intArg0));
    }

    public void funcWhichInvokeA() {
        new CallChain1ClassA();
    }
}
