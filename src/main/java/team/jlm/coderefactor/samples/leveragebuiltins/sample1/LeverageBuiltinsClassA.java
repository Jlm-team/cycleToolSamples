package team.jlm.coderefactor.samples.leveragebuiltins.sample1;

public class LeverageBuiltinsClassA {
    public LeverageParentInterface funcInA() {
        return new LeverageBuiltinsClassB();
    }
}
