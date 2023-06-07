// import java.lang.reflect.Array;

public class Pessoa {
    private Contato contatos[];
    private String nome;
    private int max;
    private int cont=0;

    public Pessoa(String nome, int max){
        this.nome=nome;
        this.max=max;
    }
    
    public void adicionarContato(Contato c){
        if (cont<max) {
            this.contatos[cont]=c;
            cont++;
        }
    }
    
    public Contato[] getContatos(){
        return contatos;
    }
    
    public Contato[] getContatos(String tipo){
        int j;
        int a;
        // Contato getContatos[];
        // if (tipo.toLowerCase()=="email"){
        //     for (int i=0; i<max; i++){
        //         if (contatos[i].getTipo().toLowerCase()=="email"){
        //             getContatos[j]=contatos[i];
        //             j++;
        //         }
        //     }
        // }else{
        //     for (int i=0; i<max; i++){
        //         if (contatos[i].getTipo().toLowerCase()=="telefone"){
        //             getContatos[j]=contatos[i];
        //             j++;
        //         }
        //     }
        // }
        return contatos;
    }

    public boolean possuiEmail(){
        boolean possuiEmail;
        if (this.getContatos("email").length>0){
            possuiEmail=true;
        } else {
            possuiEmail=false;
        }
        return possuiEmail;
    }
    
    public boolean possuiTelefone(){
        boolean possuiTelefone;
        if (this.getContatos("telefone").length>0){
            possuiTelefone=true;
        } else {
            possuiTelefone=false;
        }
        return possuiTelefone;
    }
    
    public void exibirContatos(){
        
    }

    public String getNome() {
        return nome;
    }
}