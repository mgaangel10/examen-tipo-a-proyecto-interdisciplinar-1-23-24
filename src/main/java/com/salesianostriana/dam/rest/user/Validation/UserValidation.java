package com.salesianostriana.dam.rest.user.Validation;

import com.salesianostriana.dam.rest.user.model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidation implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"username","username.empty");
        ValidationUtils.rejectIfEmpty(errors,"password","password.empty");
        User u = (User) target;
        if (u.getPassword().length()<8){
            errors.rejectValue("password","negativevalue");
        }
    }
}
