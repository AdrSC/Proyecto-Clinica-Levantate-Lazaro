/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HIJO;

import PADRE.Persona;
import java.time.LocalDate;

/**
 *
 * @author ADRIANO
 */
public class Paciente extends Persona{
    
    private  String dni;
    private LocalDate fechaNacimiento;
    private String sexo;
    private Doctor[] doctores;
    private boolean estado;

    public Paciente(String dni, LocalDate fechaNacimiento, String sexo, Doctor[] doctores,boolean estado, String nombres, String apellidos, int telefono, String correo) {
        super(nombres, apellidos, telefono, correo);
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.doctores = doctores;
        this.estado = estado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Doctor[] getDoctores() {
        return doctores;
    }

    public void setDoctores(Doctor[] doctores) {
        this.doctores = doctores;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
