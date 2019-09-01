package main;

public class Account {

    private String name;
    private String login;
    private String senha;

    public int friends[];
    public int qt_friends = 0;
    public String message[];
    public int qt_message = 0;
    public int pedidos[];
    public int qt_pedidos = 0;

    //DADOS :
    private int genero;
         //("1 - MASCULINO");
        // ("2 - FEMININO");
        // ("3 - OUTRO");
    private int idade;
    private String cidade;
    private int relacionamento;

    public int getQt_friends() {
        return qt_friends;
    }

    public int getQt_message() {
        return qt_message;
    }

    public int getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(int relacionamento) {
        this.relacionamento = relacionamento;
    }

    public int[] getPedidos() {
        return pedidos;
    }

    public void  setPedidos(int[] pedidos) {
        this.pedidos = pedidos;
        qt_pedidos++;
    }

    public int getQt_pedidos() {
        return this.qt_pedidos;
    }

    public int getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
