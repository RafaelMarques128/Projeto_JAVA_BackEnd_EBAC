package br.com.rpires.reflections.tarefa;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface Tabela {
    String nome();
}