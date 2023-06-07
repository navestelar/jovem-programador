<<<<<<< HEAD
public class CampoMinado {
    
    private Tabuleiro board;
    boolean terminar = false;
    boolean ganhou = false;
    int[] jogada;
    int rodada = 0;

    public CampoMinado(){
        board = new Tabuleiro();
        Jogar(board);
        jogada = new int[2];
    }

    private void Jogar(Tabuleiro board) {
        do {
            rodada++;
            System.out.println("Rodada "+rodada);
            board.exibe();
            terminar = board.set
        }
    }
}
=======
public class CampoMinado {
    
    private Tabuleiro board;
    boolean terminar = false;
    boolean ganhou = false;
    int[] jogada;
    int rodada = 0;

    public CampoMinado(){
        board = new Tabuleiro();
        Jogar(board);
        jogada = new int[2];
    }

    private void Jogar(Tabuleiro board) {
        do {
            rodada++;
            System.out.println("Rodada "+rodada);
            board.exibe();
            terminar = board.set
        }
    }
}
>>>>>>> 0033798148f2d50ba623bde7aa2bcc5d332b46a1
