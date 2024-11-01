
// COMEÇO DO CÓDIGO

import java.swing.*;
import java.util.*;

// FAZER A CLASSE PRINCIPAL 

public class main {


    //    COMEÇO DA CLASSE DO USUÁRIO

    public static class Usuario {

        private int id; 
        private string nome; 
        private string email;
        private string senha;
        private string nomeusuario;

        public Usuario(int id, string nome, string email, string senha, string nomeusuario) {

            public boolean login (string email, string senha) {

                return this.email.equals(email) && this.senha.equals(senha);
            }
        }
    
// FAZENDO A CLASSE DA DENÚNCIA

public static class denuncia {

    private int id;
    private int idUsuario;
    private string tipoProblema;
    private string descricao;
    private string localizacao;
    private string datacriacao;
    private string status;

    public Denuncia(int id, int idUsuario, String tipoProblema, String descricao, String localizacao) {

        this.id = id;
        this.idUsuario = idUsuario;
        this.tipoProblema = tipoProblema;
        this.descricao = descricao;
        this.localizacao =localizacao;
        this.datacriacao = new date();
        this.status = "aberta";

}

public void fecharDenuncia() {

    this.status = "fechada";

  }
  
}


// CRIANDO AS CLASSES PARA ADICIONAR COMENTÁRIOS 

public static class comentario {

    private int id;
    private int idDenuncia;
    private int idUsuario;
    private string comentario;
    private Date dataComentario;


    public Comentario(Int id, int iDDenuncia, int idUsuario, string Comentario);

    }
}


// FAZENDO O DASHBOARD


public static class Dashboard {

    public Map<String, Integer> gerarRelatorioMensal() {

        // FAZER UMA LÓGICA GERAR OS RELATÓRIOS SÓ QUE BEM BÁSICO 

        return new HashMap<>();
    }
}


// FAZENDO AS CLASSES GRÁFICAS DE LOGIN 

public static class LoginWindow {

    public void criarJanela() {

        JFrame frame = new JFrame("Login");
        Jpanel panel = new JPanel();
        JTextField emailField = new JPasswordField(20);
        JPasswordField senhaField = new JPasswordField(20);
        JButton loginButton = new JButton("Entrar");


        // CÓDIGOS DOS COMPONENTES DO PAINEL 

        panel.add(new JLabel)("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Senha"));
        panel.add(loginButton);


        frame.add(panel);
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible("true";)

    }
}


// BASE PRINCIPAL 


public static void main(String[] args) {

    loginWindow loginWindow = new LoginWindow();
    loginWindow. criarJanela();
    
}
