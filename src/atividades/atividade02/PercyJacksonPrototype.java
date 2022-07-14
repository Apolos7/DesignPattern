package atividades.atividade02;

public class PercyJacksonPrototype extends LivroPrototype {

    // Professor, esse construtor seria private por ser usado apenas nessa classe
    protected PercyJacksonPrototype(PercyJacksonPrototype percyJacksonPrototype) {
        this.titulo = percyJacksonPrototype.getTitulo();
        this.autor = percyJacksonPrototype.getAutor();
        this.classIndicativa = percyJacksonPrototype.getAutor();
        this.genero = percyJacksonPrototype.getGenero();
    }

    public PercyJacksonPrototype() {
    }

    public String exibirInfo() {
        String info = String.format("Titulo: %s%nDedicatoria: %s%nGênero: %s%nAutor: %s%nClassificação Indicativa: %s%n", getTitulo(), getNomeDedicatoria(), getGenero(), getAutor(), getClassIndicativa());
        return info;
    }

    @Override
    public LivroPrototype clonar() {
        PercyJacksonPrototype livro = new PercyJacksonPrototype(this);
        return livro;
    }

}
