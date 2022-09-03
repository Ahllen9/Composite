/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploComposite;

/**
 *
 * @author arturo
 */
public class Manager implements Empleado{
    private String name;
    private long empId;
    private String position;
  
    public Manager(long empId, String name, String position){
        this.empId = empId;
        this.name = name;
        this.position = position;
    }
    
    @Override
    public void mostrarDetallesEmpleado() {
        System.out.println(empId+" "+name);
    }
}
