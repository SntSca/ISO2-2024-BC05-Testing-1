package com.trabajoTeorico2.persona;

import java.time.LocalDate;

public class Persona {

    @SuppressWarnings("unused")
	private String nombre;
    @SuppressWarnings("unused")
	private String apellidos;
    private LocalDate fechaNacimiento;
    private String nacionalidad;
    private String titulacion;
    private boolean tieneCertificadoIngles;
    private String numeroTelefono;
    private String correoElectronico;

    public Persona() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public boolean isTieneCertificadoIngles() {
        return tieneCertificadoIngles;
    }

    public void setTieneCertificadoIngles(boolean tieneCertificadoIngles) {
        this.tieneCertificadoIngles = tieneCertificadoIngles;
    }


    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }


    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public boolean esElegibleParaMatricularse() {
        if (LocalDate.now().getYear() - fechaNacimiento.getYear() < 18) {
            return false;
        }
        if (titulacion == null || !(titulacion.equalsIgnoreCase("Máster") || titulacion.equalsIgnoreCase("Doctorado"))) {
            return false;
        }

        if (!"España".equalsIgnoreCase(nacionalidad) && !"Francia".equalsIgnoreCase(nacionalidad) && !"Alemania".equalsIgnoreCase(nacionalidad)) {
            return false;
        }

        if (numeroTelefono == null || !numeroTelefono.matches("\\d{9}")) {
            return false;
        }

        if (correoElectronico == null || !correoElectronico.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")) {
            return false;
        }

        return true;
    }

}