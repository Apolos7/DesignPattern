package atividades.atividade02;

public abstract class LivroPrototype {

    protected String titulo;
    protected String nomeDedicatoria;
    protected String genero;
    protected String autor;
    protected String classIndicativa;

    public abstract LivroPrototype clonar();

    public abstract String exibirInfo();

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getClassIndicativa() {
        return classIndicativa;
    }

    public void setClassIndicativa(String classIndicativa) {
        this.classIndicativa = classIndicativa;
    }

    public String getNomeDedicatoria() {
        return nomeDedicatoria;
    }

    public void setNomeDedicatoria(String nomeDedicatoria) {
        this.nomeDedicatoria = nomeDedicatoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
