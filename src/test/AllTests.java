package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BishopTest.class, CheckMateTest.class, GameBoardSetupTest.class, KingTest.class,
        KnightTest.class, PawnTest.class, PieceTest.class, PreloaderTest.class, QueenTest.class,
        RookTest.class, ServerTest.class })
public class AllTests {

}
