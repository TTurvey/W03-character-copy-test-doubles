import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CopierShould {

    ISource source = mock(ISource.class);
    IDestination destination = mock(IDestination.class);

    @Test
    void GetChar_is_called_once () {
        Copier copier = new Copier(source, destination);
        copier.Copy();
        verify(source, atLeastOnce()).GetChar();
    }

}



//        verify(source, atLeastOnce()).GetChar(); //MOCK