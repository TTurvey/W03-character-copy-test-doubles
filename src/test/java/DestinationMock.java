public class DestinationMock implements IDestination{

    public int setCharWasCalled;

    public DestinationMock() {
        this.setCharWasCalled = 0;
    }

    public void SetChar(char character) {
        this.setCharWasCalled ++;
    };
}
