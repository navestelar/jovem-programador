public class Pessoa {
    public Contato[] contatos;
    private String nome;
    private int max;
    private int cont;

    public Pessoa(String nome, int max){
        this.nome=nome;
        this.max=max;
        this.cont=0;
        this.contatos = new Contato[max];
    }
    
    public void adicionarContato(Contato c){
        if (this.cont<this.max){
            this.contatos[this.cont] = c;
            this.cont++;
        }
    }
    
    public Contato[] getContatos(){
        return contatos;
    }
    
    public Contato[] getContatos(String tipo){
        Contato[] getContato = new Contato[max];
        int j=0;
        if (tipo.toLowerCase()=="email"){
            for (int i=0; i<cont; i++){
                if (this.contatos[i].tipo=="email"){
                    getContato[j]=contatos[i];
                    j++;
                }
            }
        }else{
            if (tipo.toLowerCase()=="telefone"){
                for (int i=0; i<cont; i++){
                    if (this.contatos[i].tipo=="telefone"){
                        getContato[j]=contatos[i];
                        j++;
                    }
                }
            }
        }
        return getContato;
    }

    public boolean possuiEmail(){
        if (this.getContatos("email")[0]!=null){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean possuiTelefone(){
        if (this.getContatos("telefone")[0]!=null){
            return true;
        } else {
            return false;
        }
    }
    
    public void exibirContatos(){
        if (contatos[0]!=null){
            for (int i=0; i<this.cont; i++){
                contatos[i].exibir();
            }
        }
    }

    public String getNome() {
        return nome;
    }
}