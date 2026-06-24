/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HIJO;

import PADRE.Persona;

/**
 *
 * @author ADRIANO
 */
public class Doctor extends Persona{
    
    private String CMP;
    private String especialidad;
    private Paciente[] pacientes;

    public Doctor(String CMP, String especialidad, Paciente[] pacientes, String nombres, String apellidos, int telefono, String correo) {
        super(nombres, apellidos, telefono, correo);
        this.CMP = CMP;
        this.especialidad = especialidad;
        this.pacientes = pacientes;
    }

    public String getCMP() {
        return CMP;
    }

    public void setCMP(String CMP) {
        this.CMP = CMP;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }

    

    
}
