package Aula01.Revisão.Encapsulamento;

public class Livros {

    private String titulo, autor, resumo;
    private int ano, classificao;
    private boolean status_de_locacao;

    public Livros(String titulo, String autor, String resumo, int ano, int classificao, boolean status_de_locacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.resumo = resumo;
        this.ano = ano;
        this.classificao = classificao;
        this.status_de_locacao = status_de_locacao;
    }

    public Livros(){

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getClassificao() {
        return classificao;
    }

    public void setClassificao(int classificao) {
        this.classificao = classificao;
    }

    public boolean isStatus_de_locacao() {
        return status_de_locacao;
    }

    public void setStatus_de_locacao(boolean status_de_locacao) {
        this.status_de_locacao = status_de_locacao;
    }

        public void imprimir(){
            String status;
            if(this.isStatus_de_locacao()==true){
                status = "Disponivel";
            }else{
                status = "Indisponivel";
            }
            System.out.println("\nTítulo: "+this.getTitulo()+
                    "\nAutor: "+this.getAutor()+
                    "\nAno: "+this.getAno()+
                    "\nResumo: "+this.getResumo()+
                    "\nClassificao: "+this.getClassificao()+
                    "\nStatus de locação: "+status);
        }
}
