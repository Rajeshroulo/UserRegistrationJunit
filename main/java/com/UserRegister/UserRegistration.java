package com.UserRegister;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
    private static final String MOB_NUM_PATTERN = "^[0-9]{2}[ ]*[6-9][0-9]{9}$";
    private static final String PASSWORD_PATTERN1 = "(?=.*[A-Z]+)(?=.*[0-9]+).{8,}";
    private static final String PASSWORD_PATTERN2 = "[0-9a-zA-Z]*[^0-9a-zA-Z][0-9a-zA-Z]*";

    public boolean validateFirstName(String fName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fName).matches();
    }

    public boolean validateLastName(String lName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lName).matches();
    }

    public boolean validateEmailId(String eMail) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(eMail).matches();
    }

    public boolean validateMobileNumber(String mobNum) {
        Pattern pattern = Pattern.compile(MOB_NUM_PATTERN);
        return pattern.matcher(mobNum).matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern1 = Pattern.compile(PASSWORD_PATTERN1);
        Pattern pattern2 = Pattern.compile(PASSWORD_PATTERN2);
        return pattern1.matcher(password).matches() && pattern2.matcher(password).matches();
    }
}

