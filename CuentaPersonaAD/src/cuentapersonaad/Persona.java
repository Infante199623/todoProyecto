/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentapersonaad;

/**
 *
 * @author pedro
 */
public class Persona {
    
    private String nombre = "null";
    private int edad = 0;
    private String DNI = "null";
    private char sexo;
    private float peso = (float) 0.0;
    private double altura = 0.0;

    public Persona() {
        nombre = "null";
        edad = 0;
        DNI = "null";
        sexo = 'H';
        peso = (float) 0.0;
        altura = 0.0;
    }
     public Persona(String nombr,int ed,String dn,char sex,float pes,double altur) {
        nombre = nombr;
        edad = ed;
        DNI = dn;
        sexo = sex;
        peso = (float) pes;
        altura = altur;
    }
    public Persona(String nombr,int ed,char sex){
        nombre = nombr;
        edad = ed;
        sexo = sex;
        peso = (float) 0.0;
        altura = 0.0;
        DNI = "null";
    }
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int calcularIMC(){
    
        float res = (float) 0.0;
        int devuelve = 0;
        
       res = (float) (this.peso / (this.altura*this.altura));
    
       if (res <= 25 && res >= 20){
       
           devuelve = 0;
       }
       if(res < 20){
           devuelve = -1;
       }
       if(res > 25){
           devuelve = 1;
       }
       
       return devuelve;
       
    }
    public boolean esMayorDeEdad(){
    
        boolean esMayor = false;
        
        if(this.edad < 18){
            
            esMayor = false;
        }else{
        
            esMayor = true;
        }
        
        return esMayor;
    }
    public char comprobarSexo(char sex){
        
        if('H' == this.sexo){           
              System.out.println("Es correcto");
        }else{
             System.out.println("No Es correcto");      
        }
            
    
        return sex;
    }
   
    public void printPersona(){
    
         System.out.println("Nombre " + this.nombre);      
         System.out.println("Edad " + this.edad);    
         System.out.println("DNI " + this.DNI);    
         System.out.println("Sexo " + this.sexo);    
         System.out.println("Peso " + this.peso);    
         System.out.println("Altura " + this.altura);    
    
    }
    public void alumnoPredefinido(Persona p){
    
        p.setAltura(1.87);
        p.setDNI("74744686E");
        p.setEdad(13);
        p.setPeso((float) 72.2);
        p.setSexo('H');
        p.setNombre("Renol");
    
    }
    
    @Override
    public String toString (){
        
        String mensaje ;
        mensaje = "El nombre es "+nombre+",la edad : "+edad+",DNI : "+DNI+",el sexo es : " + sexo + ",el peso es :  "+ peso + " y la altura es : " + altura;
        return mensaje;
    }
    public String generaDNI(){
        
        String letra;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        int numero = (int) Math.floor((Math.random() * 99999999) + 10000000);  
         //System.out.println( "numero aleatorio : " + numero );
        String DN;
        DN = Integer.toString(numero);
        letra = Integer.toString(numero%23);
  
        int index = numero - (Math.abs(numero/23)*23);
        
        DN += letras.charAt(index); 
        return DN;
    }

    void ComprobarSiMayorONo(Persona p) {
        
            boolean esMayorDeEdad = p.esMayorDeEdad();
            if(esMayorDeEdad == true){
                System.out.println("Es mayor de edad " + p.getEdad()+ " años.");
            }else{
                System.out.println("Es menor de edad " + p.getEdad() + " años.");
            }
        
    }

    void ImprimirSuIMC(int n) {
        if(n == -1){
               System.out.println("Estas por debajo de tu peso ideal");
        }
        if(n == 1){
               System.out.println("Estas por encima de tu peso ideal");
        }
        if(n == 0){
               System.out.println("Estas en tu peso ideal");
        }
              
    }
}
