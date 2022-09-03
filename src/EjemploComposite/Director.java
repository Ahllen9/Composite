/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploComposite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arturo
 */
public class Director implements Empleado{
    private List<Empleado> listaEmpleados = new ArrayList<Empleado>();
       
    @Override
    public void mostrarDetallesEmpleado(){
        for(Empleado emp:listaEmpleados)
        {
            emp.mostrarDetallesEmpleado();
        }
    }
       
    public void addEmpleado(Empleado emp)
    {
        listaEmpleados.add(emp);
    }
       
    public void removeEmpleado(Empleado emp)
    {
        listaEmpleados.remove(emp);
    }
}
