package team.jlm.coderefactor.result.callchain.sample1;

public class CallChain1ClassA {
    CallChain1ClassC callChain1ClassC;

    public void funcInA() {
        callChain1ClassC.funcNoReturnInC(1);
        System.out.println(callChain1ClassC.funcWithReturnValueInC(1));
    }
}
