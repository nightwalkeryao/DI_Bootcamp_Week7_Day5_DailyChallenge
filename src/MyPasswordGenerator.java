import org.passay.CharacterRule;
import org.passay.PasswordGenerator;

/**
 * My Password Generator with 3 lower and 3 upper alphabeticals, 3 digits, and 3 special chars
 */
public class MyPasswordGenerator {
    public static void main(String[] args) {
        CharacterRule lowerAlpha = new CharacterRule(MyCharacterData.LowerCase);
        lowerAlpha.setNumberOfCharacters(3);
        CharacterRule upperAlpha = new CharacterRule(MyCharacterData.UpperCase);
        upperAlpha.setNumberOfCharacters(3);
        CharacterRule digits = new CharacterRule(MyCharacterData.Digit);
        digits.setNumberOfCharacters(3);
        CharacterRule special = new CharacterRule(MyCharacterData.Special);
        special.setNumberOfCharacters(3);

        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String password = passwordGenerator.generatePassword(12, lowerAlpha, upperAlpha, digits, special);
        System.out.println("Generated password: " + password);
    }
}
