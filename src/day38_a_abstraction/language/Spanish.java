package day38_a_abstraction.language;

import day38_a_abstraction.language.Language;

public class Spanish implements Language {

    @Override
    public void hi(){
        System.out.println("Hola");
    }

    @Override
    public void bye() {
        System.out.println("Adios");
    }

}