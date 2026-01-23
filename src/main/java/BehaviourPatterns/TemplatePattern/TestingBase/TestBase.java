package BehaviourPatterns.TemplatePattern.TestingBase;

// xUnit, NUnit use Template Method for test lifecycle
public abstract class TestBase
{
    public final void runTest() // Template Method
    {
        setup();      // Hook
        executeTest(); // Abstract
        teardown();    // Hook
    }

    protected void setup() { }
    protected abstract void executeTest();
    protected void teardown() { }
}
