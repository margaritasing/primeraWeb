package com.example.primerWeb;

import java.util.ArrayList;
import java.util.List;

public class AlumnaDAO {

    public static List<Alumna> getAlumnas(){

        List<Alumna> lista = new ArrayList<>();
        lista.add(new Alumna("Maria", "Medina", "BackEnd"));
        lista.add(new Alumna("Libia", "Medina", "BackEnd"));
        lista.add(new Alumna("Thais", "Freites", "BackEnd"));
        lista.add(new Alumna("Kira", "Freites", "FrontEnd"));
        lista.add(new Alumna("Ana", "Tevez", "BackEnd"));
        lista.add(new  Alumna("Leonor", "Monsalve", "FrontEnd"));
        lista.add(new Alumna("Johenny", "Leon", "BackEnd"));
        lista.add(new Alumna("Angelina", "Freites", "FrontEnd"));
        lista.add(new Alumna("Geraldine", "Carquez", "BackEnd"));
        lista.add(new Alumna("Adriana", "Ruiz", "BackEnd"));

        return lista;
    }




}
