// import java.lang.reflect.Array;

public class Pessoa {
    public Contato[] contatos;
    private String nome;
    private int max;
    private int cont;

    public Pessoa(String nome, int max){
        this.nome=nome;
        this.max=max;
        this.contatos = new Contato[max];
    }
    
    public void adicionarContato(Contato c){
        if (this.cont<this.max){
            this.contatos[cont] = c;
            this.cont++;
        }
    }
    
    public Contato[] getContatos(){
        return contatos;
    }
    
    // public Contato[] getContatos(String tipo){
    //     // Contato getContatos[];
    //     // if (tipo.toLowerCase()=="email"){
    //     //     for (int i=0; i<max; i++){
    //     //         if (contatos[i].getTipo().toLowerCase()=="email"){
    //     //             getContatos[j]=contatos[i];
    //     //             j++;
    //     //         }
    //     //     }
    //     // }else{
    //     //     for (int i=0; i<max; i++){
    //     //         if (contatos[i].getTipo().toLowerCase()=="telefone"){
    //     //             getContatos[j]=contatos[i];
    //     //             j++;
    //     //         }
    //     //     }
    //     // }
    //     return contatos;
    // }

    // public boolean possuiEmail(){
    //     boolean possuiEmail;
    //     if (this.getContatos("email").length>0){
    //         possuiEmail=true;
    //     } else {
    //         possuiEmail=false;
    //     }
    //     return possuiEmail;
    // }
    
    // public boolean possuiTelefone(){
    //     boolean possuiTelefone;
    //     if (this.getContatos("telefone").length>0){
    //         possuiTelefone=true;
    //     } else {
    //         possuiTelefone=false;
    //     }
    //     return possuiTelefone;
    // }
    
    public void exibirContatos(){
        for (Contato contato : contatos){
            contato.exibir();
        }
    }

    public String getNome() {
        return nome;
    }
}