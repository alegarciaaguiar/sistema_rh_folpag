package model.interfaces;

public interface Autenticavel {

    boolean login(
            String login,
            String senha
    );
}