package org.example;

import org.example.modelos.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Paciente pacienteVacio = new Paciente();
        Paciente pacienteLleno = new Paciente(1, "Ana", "García", 28, "Femenino", LocalDate.of(1995, 5, 20), "Calle de la Salud 123", "987654321", "ana.garcia@example.com", LocalDate.of(2023, 9, 1), "Soltera", "Sin antecedentes relevantes", "Ninguna", "Metformina", "Historia clínica sin datos relevantes");

        Medico medicoVacio = new Medico();
        Medico medicoLleno = new Medico(1, "Juan", "Pérez", "Cardiología", "123456789", "juan@example.com", "Calle Falsa 123", "123456", 10, "Hospital General", true, "9 AM - 5 PM", "Madrid", "Madrid", "España");

        Enfermedad enfermedadVacia = new Enfermedad();
        Enfermedad enfermedadLlena = new Enfermedad(1, "Diabetes", "Enfermedad crónica", "Sed, aumento de orina", "Insulina", "Genética, estilo de vida", "Crónica", "Controlable", true, "Personas mayores");

        Medicamento medicamentoVacio = new Medicamento();
        Medicamento medicamentoLleno = new Medicamento(1, "Metformina", "Metformina", "Tableta", "500 mg", "Oral", "Náuseas", "Insuficiencia renal", 30, "Farmacéutica XYZ");

        SignoVital signoVitalVacio = new SignoVital();
        SignoVital signoVitalLleno = new SignoVital(1, "Presión Arterial", 2000.00, "mmHg", LocalDate.now(), "Normal", "1", "1", "Normal", "Manual");


        System.out.println("Ingrese datos del Paciente");
        Paciente paciente = new Paciente();
        System.out.print("ID: ");
        paciente.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nombre: ");
        paciente.setNombre(scanner.nextLine());
        System.out.print("Apellido: ");
        paciente.setApellido(scanner.nextLine());
        System.out.print("Edad: ");
        paciente.setEdad(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Sexo: ");
        paciente.setSexo(scanner.nextLine());
        System.out.print("Fecha de Nacimiento (YYYY-MM-DD): ");
        String fechaNacimientoStr = scanner.nextLine();
        paciente.setFechaNacimiento(LocalDate.parse(fechaNacimientoStr));
        System.out.print("Dirección: ");
        paciente.setDireccion(scanner.nextLine());
        System.out.print("Teléfono: ");
        paciente.setTelefono(scanner.nextLine());
        System.out.print("Correo Electrónico: ");
        paciente.setCorreoElectronico(scanner.nextLine());
        System.out.print("Fecha de Ingreso (YYYY-MM-DD): ");
        String fechaIngresoStr = scanner.nextLine();
        paciente.setFechaIngreso(LocalDate.parse(fechaIngresoStr));
        System.out.print("Estado Civil: ");
        paciente.setEstadoCivil(scanner.nextLine());
        System.out.print("Antecedentes Médicos: ");
        paciente.setAntecedentesMedicos(scanner.nextLine());
        System.out.print("Alergias: ");
        paciente.setAlergias(scanner.nextLine());
        System.out.print("Medicamentos: ");
        paciente.setMedicamentos(scanner.nextLine());
        System.out.print("Historia Clínica: ");
        paciente.setHistoriaClinica(scanner.nextLine());

        System.out.println("Datos del Paciente: " + paciente);



        System.out.println("Ingrese datos del Medico");
        Medico medico = new Medico();
        System.out.print("ID: ");
        medico.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nombre: ");
        medico.setNombre(scanner.nextLine());
        System.out.print("Apellido: ");
        medico.setApellido(scanner.nextLine());
        System.out.print("Especialidad: ");
        medico.setEspecialidad(scanner.nextLine());
        System.out.print("Telefono: ");
        medico.setTelefono(scanner.nextLine());
        System.out.print("Correo Electrónico: ");
        medico.setCorreoElectronico(scanner.nextLine());
        System.out.print("Dirección: ");
        medico.setDireccion(scanner.nextLine());
        System.out.print("Cédula Profesional: ");
        medico.setCedulaProfesional(scanner.nextLine());
        System.out.print("Años de Experiencia: ");
        medico.setExperienciaAnos(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Institución: ");
        medico.setInstitucion(scanner.nextLine());
        System.out.print("¿Está disponible? (true/false): ");
        medico.setDisponible(scanner.nextBoolean());
        scanner.nextLine();
        System.out.print("Horario de Consulta: ");
        medico.setHorarioConsulta(scanner.nextLine());
        System.out.print("Ciudad: ");
        medico.setCiudad(scanner.nextLine());
        System.out.print("Estado: ");
        medico.setEstado(scanner.nextLine());
        System.out.print("País: ");
        medico.setPais(scanner.nextLine());

        System.out.println("Datos del Médico: " + medico);


        System.out.println("Ingrese datos de la Enfermedad:");
        Enfermedad enfermedad = new Enfermedad();
        System.out.print("ID: ");
        enfermedad.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nombre: ");
        enfermedad.setNombre(scanner.nextLine());
        System.out.print("Descripción: ");
        enfermedad.setDescripcion(scanner.nextLine());
        System.out.print("Síntomas: ");
        enfermedad.setSintomas(scanner.nextLine());
        System.out.print("Tratamiento: ");
        enfermedad.setTratamiento(scanner.nextLine());
        System.out.print("Causas: ");
        enfermedad.setCausas(scanner.nextLine());
        System.out.print("Tipo: ");
        enfermedad.setTipo(scanner.nextLine());
        System.out.print("Pronóstico: ");
        enfermedad.setPronostico(scanner.nextLine());
        System.out.print("¿Es contagiosa? (true/false): ");
        enfermedad.setContagiosa(scanner.nextBoolean());
        scanner.nextLine();
        System.out.print("Grupo de Riesgo: ");
        enfermedad.setGrupoRiesgo(scanner.nextLine());

        System.out.println("Datos de la Enfermedad: " + enfermedad);


        System.out.println("Ingrese datos del Medicamento:");
        Medicamento medicamento = new Medicamento();
        System.out.print("ID: ");
        medicamento.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nombre: ");
        medicamento.setNombre(scanner.nextLine());
        System.out.print("Principio Activo: ");
        medicamento.setPrincipioActivo(scanner.nextLine());
        System.out.print("Forma Farmacéutica: ");
        medicamento.setFormaFarmaceutica(scanner.nextLine());
        System.out.print("Dosis: ");
        medicamento.setDosis(scanner.nextLine());
        System.out.print("Vía de Administración: ");
        medicamento.setViaAdministracion(scanner.nextLine());
        System.out.print("Efectos Secundarios: ");
        medicamento.setEfectosSecundarios(scanner.nextLine());
        System.out.print("Contraindicaciones: ");
        medicamento.setContraindicaciones(scanner.nextLine());
        System.out.print("Duración del Tratamiento (días): ");
        medicamento.setDuracionTratamiento(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Fabricante: ");
        medicamento.setFabricante(scanner.nextLine());

        System.out.println("Datos del Medicamento: " + medicamento);


        System.out.println("Ingrese datos del Signo Vital:");
        SignoVital signoVital = new SignoVital();
        System.out.print("ID: ");
        signoVital.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Tipo: ");
        signoVital.setTipo(scanner.nextLine());
        System.out.print("Valor: ");
        signoVital.setValor(scanner.nextDouble());
        scanner.nextLine(); 
        System.out.print("Unidad: ");
        signoVital.setUnidad(scanner.nextLine());
        System.out.print("Fecha de Registro (YYYY-MM-DD): ");
        signoVital.setFechaRegistro(LocalDate.parse(scanner.nextLine()));
        System.out.print("Comentario: ");
        signoVital.setComentario(scanner.nextLine());
        System.out.print("ID del Paciente: ");
        signoVital.setPacienteId(scanner.nextLine());
        System.out.print("ID del Médico: ");
        signoVital.setMedicoId(scanner.nextLine());
        System.out.print("Estado: ");
        signoVital.setEstado(scanner.nextLine());
        System.out.print("Método de Medición: ");
        signoVital.setMetodoMedicion(scanner.nextLine());

        System.out.println("Datos del Signo Vital: " + signoVital);


    }
}