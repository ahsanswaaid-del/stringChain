package stringCahin.stringCahin;

public class EStub extends E {

    public EStub() {
        super();   // חובה, ותקין לגמרי
    }

    @Override
    public String process(String prefix) {
        return prefix + "X";   // ה־סטאב מחזיר X במקום O
    }
}