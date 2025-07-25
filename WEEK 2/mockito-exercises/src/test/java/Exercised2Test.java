import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Exercised2Test {
	@Test
    public void testVerifyInteraction() {
        
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        
        MyService service = new MyService(mockApi);
        service.fetchData();
    
        verify(mockApi).getData();
    }


}
