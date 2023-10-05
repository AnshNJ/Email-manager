package com.driver;

public class PasswordChecks {
    private String password;

    PasswordChecks(String password){
        this.password = password;
    }

    public boolean checkUpperCase(){
        for(char c : this.password.toCharArray()){
            if(c>='A' && c<='Z') return true;
        }
        return false;
    }

    public boolean checkLowerCase(){
        for(char c : this.password.toCharArray()){
            if(c>='a' && c<='z') return true;
        }
        return false;
    }

    public boolean checkDigit(){
        for(char c : this.password.toCharArray()){
            if(c>='0' && c<='9') return true;
        }
        return false;
    }

    public boolean checkSpecial(){
        for(char c : this.password.toCharArray()){
            if(!Character.isLetterOrDigit(c)) return true;
        }
        return false;
    }
}

