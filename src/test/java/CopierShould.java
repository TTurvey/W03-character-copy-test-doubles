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

    @Test
    void setDestination_SetChar_is_called_when_Copy_is_called() {
        Copier copier = new Copier(source, destination);
        copier.Copy();
        verify(destination, atLeastOnce()).SetChar(anyChar());
    }

    @Test
    void source_and_destination_should_have_the_same_character() {
        char OUR_CHAR = 'n';

        when(source.GetChar()).thenReturn(OUR_CHAR);
        Copier copier = new Copier(source, destination);
        copier.Copy();

        verify(destination, atLeastOnce()).SetChar(OUR_CHAR);
    }

}



//        verify(source, atLeastOnce()).GetChar(); //MOCK