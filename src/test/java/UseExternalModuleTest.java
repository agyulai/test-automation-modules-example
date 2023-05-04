import org.testng.annotations.Test;

public class UseExternalModuleTest extends BaseTest {

    @Test
    public void testModuleIntegration() {
        ApiIntegration apiIntegration = new ApiIntegration();
        apiIntegration.changeStateOfApplication();
    }
}
