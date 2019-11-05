/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author pedro
 */
public class Empleado {

        protected int id;
        protected String nombre;
        protected String apellido;
        protected double salario;
        protected int departamento;
        protected  ArrayList<Empleado> arrayEmpleados;
        static RandomAccessFile archivo;

    public Empleado(){
        
        this.id = 0;
        this.nombre = null;
        this.apellido = null;
        this.salario = 0.0;
        this.departamento = 0;
    
    }
    public Empleado(int id, String nombre,String apellido, double salario, int departamento) {
        this.id = id;
        this.nombre = nombre;
          this.apellido = apellido;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return apellido;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) throws FileNotFoundException {
        this.departamento = departamento;
    }
      
    public static void EscribirFichAleatorio (ArrayList<Empleado>arrayEmpleado)throws IOException{
  
    File file = new File("AleatorioEmple.dat");
    RandomAccessFile rd = null;
    
        try {
           rd = new RandomAccessFile(file, "rw");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    StringBuffer buffer = null;//buffer para almacenar apellido


        for (int i=0;i<arrayEmpleado.size(); i++){ //recorro los arrays      
            rd.writeInt(i+1); //uso i+1 para identificar empleado
            buffer = new StringBuffer(arrayEmpleado.get(i).getApellido());   
            buffer.setLength(10); //6 caracteres para el apellido
           
            rd.writeChars(buffer.toString());
            rd.writeInt(arrayEmpleado.get(i).getId());
            rd.writeUTF(arrayEmpleado.get(i).getNombre());
            rd.writeUTF(arrayEmpleado.get(i).getApellido());        
            rd.writeDouble(arrayEmpleado.get(i).getSalario());
            rd.writeInt(arrayEmpleado.get(i).getDepartamento());

        }  
        rd.close();
    }
   
    public void lecturaFichero(ArrayList<Empleado>arrayEmpleado)  throws IOException{
        
       
        File file = null;
        file = new File("AleatorioEmple.dat");
        RandomAccessFile rd = new RandomAccessFile(file, "r");
        int pos = 0;
        String nombr = null;
        int id_d = 0;
        String apellid = null;
        Double salari = 0.0;
        int departament = 0;
        
        
        if(file == null){
            System.out.println("No se ha abierto el fichero");
        }
       
        for(int i = 0;i < 1;i++){
           
            rd.seek(pos);
            id_d = rd.readInt();        
            System.out.println("lo que vale id : " +id_d);
            nombr = rd.readUTF();
            System.out.println("El nombre es : " + nombr);
            apellid = rd.readUTF();
            System.out.println("El apellido es : "+ apellid);
            departament = rd.readInt();        
            
            salari = rd.readDouble();
           
            System.out.println("Imprimimos empleado : " + salari+" \n" +departament);
            pos+=36;
        }
   
    }
    public static void main(String[] args) throws IOException {
        
        Empleado e = new Empleado();
        Empleado e1 = new Empleado(1,"Antonio","Cuvi",33.2,10);
        Empleado e2 = new Empleado(2,"Manolo","Lama",41.2,8);
        Empleado e3 = new Empleado(3,"Abelardo","Sonson",55.2,6);

        ArrayList<Empleado> arrayEmpleados = null;
        arrayEmpleados = new ArrayList();
        
        e.lecturaFichero(arrayEmpleados);
        arrayEmpleados.add(e1);
        arrayEmpleados.add(e2);
        arrayEmpleados.add(e3);
        e.EscribirFichAleatorio(arrayEmpleados);
    }
        

}
