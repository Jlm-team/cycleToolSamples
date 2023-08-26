package team.jlm.coderefactor.result.leveragebuiltins.sample2;

public class LeverageBuiltinsClassA {
    // for most reasons, developers must handle exceptions yourself
    LeverageParentInterface leverageParentInterface = (LeverageParentInterface) Class.forName("team.jlm.coderefactor.result.leveragebuiltins.sample2.LeverageBuiltinsClassB").newInstance();
}
