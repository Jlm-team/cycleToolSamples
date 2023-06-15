package team.jlm.coderefactor.samples.callchain.sample1;

public class CallChain1ClassA {
    CallChain1ClassB callChain1ClassB;

    public void funcInA() {
        callChain1ClassB.funcInB(1);
    }
}
