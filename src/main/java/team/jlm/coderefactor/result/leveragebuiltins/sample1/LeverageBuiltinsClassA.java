package team.jlm.coderefactor.result.leveragebuiltins.sample1;

public class LeverageBuiltinsClassA {
    public LeverageParentInterface funcInA() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (LeverageParentInterface) Class.forName("team.jlm.coderefactor.result.leveragebuiltins.sample1.LeverageBuiltinsClassB").newInstance();
    }
}
