package com.trangntq.stringutil;

public class ValidationPassword {
    private String password;

    public ValidationPassword(String password) {
        this.password = password;
    }

    public boolean isStrongPassword() {
        int length = password.length();
        if (length < 8) {
            return false;
        }
        boolean hasUppercase = false, hasLowercase = false, hasDigit = false;
        int code;
        for (int i = 0; i < length; i++) {
            code = password.codePointAt(i);
            if (!Character.isUpperCase(code) && !Character.isLowerCase(code) && !Character.isDigit(code)) {
                return false;
            }
            if (Character.isUpperCase(code)) {
                hasUppercase = true;
            }
            if (Character.isLowerCase(code)) {
                hasLowercase = true;
            }
            if (Character.isDigit(code)) {
                hasDigit = true;
            }
        }
        return hasUppercase && hasLowercase && hasDigit;
    }
}
