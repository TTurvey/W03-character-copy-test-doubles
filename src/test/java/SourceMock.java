import javax.xml.transform.sax.SAXResult;

public class SourceMock implements ISource{

    public int getCharWasCalled;
    public String inputString;

    public SourceMock(String inputString) {
        this.getCharWasCalled = 0;
        this.inputString = inputString;
    }


    public char GetChar() {
        getCharWasCalled ++;

        return 'a';
    }

}
