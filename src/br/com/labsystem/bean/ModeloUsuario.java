
package br.com.labsystem.bean;

/**
 *
 * @author CIDRONIO
 */
public class ModeloUsuario {
    private String matricula;
    private String nome;
    private String datNasc;
    private String login;
    private String periodoIngresso;
    private String permissao;
    private String senha;
    private String tag;
    private String curso;
    private byte[] imagem;

    public String getPeriodoIngresso() {
        return periodoIngresso;
    }

    public void setPeriodoIngresso(String periodoIngresso) {
        this.periodoIngresso = periodoIngresso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatNasc() {
        return datNasc;
    }

    public void setDatNasc(String datNasc) {
        this.datNasc = datNasc;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
    
}
