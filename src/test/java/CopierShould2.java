import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopierShould2 {

    DestinationMock destinationMock = new DestinationMock();

    @Test
    void GetChar_is_called_once () {
        SourceMock sourceMock = new SourceMock("a");
        Copier copier = new Copier(sourceMock, destinationMock);
        copier.Copy();

        assertEquals(1, sourceMock.getCharWasCalled);
    }


}