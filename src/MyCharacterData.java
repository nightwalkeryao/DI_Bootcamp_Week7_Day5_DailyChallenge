import org.passay.CharacterData;

/**
 * EnglishCharacterData in the org.passay EnglishCharacterData, minus some hard to type special chars
 */
public enum MyCharacterData implements CharacterData {
    LowerCase("INSUFFICIENT_LOWERCASE", "abcdefghijklmnopqrstuvwxyz"),
    UpperCase("INSUFFICIENT_UPPERCASE", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"),
    Digit("INSUFFICIENT_DIGIT", "0123456789"),
    Alphabetical("INSUFFICIENT_ALPHABETICAL", UpperCase.getCharacters() + LowerCase.getCharacters()),
    Special("INSUFFICIENT_SPECIAL", "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~¡");

    private final String errorCode;
    private final String characters;

    private MyCharacterData(String code, String charString) {
        this.errorCode = code;
        this.characters = charString;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getCharacters() {
        return this.characters;
    }
}
