/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_logics;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

/**
 *
 * @author DecentCode
 */
@Named("registrationForm")
@RequestScoped
public class RegistrationForm {
    
    private String firstName;    
    private String lastName;

    public RegistrationForm() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void validateName(FacesContext fc, UIComponent c,
            Object value){
        if  (((String)value).contains("!")||
            ((String)value).contains("@")||
            ((String)value).contains("#")||
            ((String)value).contains("$")||
            ((String)value).contains("%")||
            ((String)value).contains("&")||
            ((String)value).contains("*"))
            throw new ValidatorException(
            new FacesMessage("Name cannot contain "
                    + "special characters"));
    } 

    
}
