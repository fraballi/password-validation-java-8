package com.company;

import org.passay.*;

public enum PasswordConstraintValidator {
    INSTANCE;

    public PasswordValidator get() {
        LengthRule minimumLength = new LengthRule();
        minimumLength.setMinimumLength(8);

        return new PasswordValidator(
                minimumLength,
                new CharacterRule(EnglishCharacterData.UpperCase, 1),
                new CharacterRule(EnglishCharacterData.LowerCase, 1),
                new CharacterRule(EnglishCharacterData.Digit, 1),
                new CharacterRule(EnglishCharacterData.Special, 1),
                new WhitespaceRule()
        );
    }
}
