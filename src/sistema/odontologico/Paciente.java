/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.odontologico;

/**
 *
 * @author riky_
 */
public class Paciente {
    private String Nombre;
    private String Apellido;
    private String Correo_Electronico;
    private String Celular;
    private String FechaNacimiento;
    private String Genero;
    private String id_Clinico;

    public Paciente(String Nombre, String Apellido, String Correo_Electronico, String Celular, String FechaNacimiento, String Genero, String id_Clinico) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo_Electronico = Correo_Electronico;
        this.Celular = Celular;
        this.FechaNacimiento = FechaNacimiento;
        this.Genero = Genero;
        this.id_Clinico = id_Clinico;
    }
    
}
