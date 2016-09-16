/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lenovo
 */
public class Password {
    private int longitud;
    private String Password;

    public Password(String Password) {
        this.longitud = 8;
        this.Password = Password;
    }
   

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public String NiveldeSeguridad(String contra){
        String tamaño;
        int cont;
        cont=contra.length();
        if(cont>6){
         tamaño="Contraseña es segura"+cont;
         
        }else{
         tamaño="Contraseña es muy corta"+cont; 
        }
        return tamaño;
    
    } 
    public String mostrar(String contra){
        String tamaño,cont;
        tamaño = contra;
        return tamaño;
    }
    public void cambiar(String Cambiar_contra){
        String tamaño,cont;
        
        tamaño=this.getPassword();
        tamaño=Cambiar_contra;
        
        cont=tamaño;
    }
    private int checkPasswordStrength(String password) {
        int strengthPercentage=0;
        String[] partialRegexChecks = { ".*[a-z]+.*", // lower
                ".*[A-Z]+.*", // upper
                ".*[\\d]+.*", // digits
                ".*[@#$%]+.*" // symbols
        };


                    if (password.matches(partialRegexChecks[0])) {
                    strengthPercentage+=25;
            }
                    if (password.matches(partialRegexChecks[1])) {
                    strengthPercentage+=25;
            }
                    if (password.matches(partialRegexChecks[2])) {
                    strengthPercentage+=25;
            }
                    if (password.matches(partialRegexChecks[3])) {
                    strengthPercentage+=25;
            }


        return strengthPercentage;
    }
}
