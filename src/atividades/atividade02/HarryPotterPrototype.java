package atividades.atividade02;

public class HarryPotterPrototype extends LivroPrototype {

    // Professor, esse construtor seria private por ser usado apenas nessa classe
    protected HarryPotterPrototype(HarryPotterPrototype harryPotterPrototype) {
        this.titulo = harryPotterPrototype.getTitulo();
        this.autor = harryPotterPrototype.getAutor();
        this.classIndicativa = harryPotterPrototype.getAutor();
        this.genero = harryPotterPrototype.getGenero();
    }

    public HarryPotterPrototype() {}

    @Override
    public String exibirInfo() {
        String info = String.format("Titulo: %s%nDedicatoria: %s%nGênero: %s%nAutor: %s%nClassificação Indicativa: %s%n", getTitulo(), getNomeDedicatoria(), getGenero(), getAutor(), getClassIndicativa());
        return info;
    }

    @Override
    public LivroPrototype clonar() {
        HarryPotterPrototype livro = new HarryPotterPrototype(this);
        return livro;
    }

}
