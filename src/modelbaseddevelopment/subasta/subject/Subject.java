package modelbaseddevelopment.subasta.subject;

import modelbaseddevelopment.subasta.subscriptor.Licitador;


//Instanciamos interfaz de la clase subject

public interface Subject {

    void registerLicitador(Licitador t);

    void removeLicitador(Licitador t);

    void notifyLicitadors();

}