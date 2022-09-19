public class SourceMock implements ISource{

    public int getCharWasCalled;

    public SourceMock() {
        this.getCharWasCalled = 0;
    }

    @Override
    public char GetChar() {
        getCharWasCalled ++;
        return 'a';
    }

}
