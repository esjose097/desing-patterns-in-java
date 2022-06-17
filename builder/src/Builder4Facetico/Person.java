/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder4Facetico;

/**
 * Este objeto tiene demasiadas facetas y oportunidades de construcción
 * por lo cual se necesitara una manera diferente de adaptar el builder.
 * @author jose casal
 */
public class Person {
    //Atributos publicos para ahorrarme el timepo de los constructores ya que es solo un ejemplo.
    //Adress
    public String streedAdress, postCode, city;
    //Employment
    public String companyName, position;
    public int annualInCome;

    @Override
    public String toString() {
        return "Person{" + "streedAdress=" + streedAdress + ", postCode=" + postCode + ", city=" + city + ", companyName=" + companyName + ", position=" + position + ", annualInCome=" + annualInCome + '}';
    }
    
    
    
}
