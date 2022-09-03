package EjemploComposite;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arturo
 */
public class Compania {
    
    public static void main(String[] args) {
        Desarrollador des1 = new Desarrollador(100, "Lokesh Sharma", "Pro Developer");
        Desarrollador des2 = new Desarrollador(101, "Vinay Sharma", "Developer");
        Director desDirectory = new Director();
        desDirectory.addEmpleado(des1);
        desDirectory.addEmpleado(des2);
          
        Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager");
        Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager");
          
        Director manDirectory = new Director();
        manDirectory.addEmpleado(man1);
        manDirectory.addEmpleado(man2);
      
        Director directorio = new Director();
        directorio.addEmpleado(desDirectory);
        directorio.addEmpleado(manDirectory);
        directorio.mostrarDetallesEmpleado();
    }
}
