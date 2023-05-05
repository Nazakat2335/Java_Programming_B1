package day38_a_abstraction.language;

import day38_a_abstraction.language.Language;

public class Turkish implements Language {

    @Override
    public void hi() {
        System.out.println("Merhaba");
    }

    @Override
    public void bye() {
        System.out.println("Gule Gule");
    }
}
