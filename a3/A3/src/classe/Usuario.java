
package classe;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class Usuario {
    
   String Nome;
   String Email;
   String CPF;
   String nascimento;
   String Usuario;
  

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
   String Senha;
   
   
   
   
   
   
   
    public void cadastrar(){
    
    String sql = "INSERT INTO usuario(nome, usuario, "
            + "email, senha,cpf) VALUES (?, ?, ?,?,?)";
    ConnectionFactory factory = new ConnectionFactory();
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, Nome);
        ps.setString(2, Usuario);
        ps.setString(3, Email);
        ps.setString(4, Senha);
        ps.setString(5, CPF);
        ps.execute();
        
        JOptionPane.showMessageDialog(null, "Usuário Incluído com Sucesso!");
    }
    catch (Exception e){
        e.printStackTrace();
    }
    }
    
   
    public void alterar(){
    
    String sql = "update tb_pessoa set nome = ?, email= ?, senha= ? where usuario=?";
    ConnectionFactory factory = new ConnectionFactory();
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, Nome);
        ps.setString(2, Email);
        ps.setString(3, Senha);
        ps.setString(4, Usuario);
        ps.execute();
        
        JOptionPane.showMessageDialog(null, "Usuário alterado com Sucesso!");
    }
    catch (Exception e){
        e.printStackTrace();
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void listar (){
        
        String sql = "SELECT * FROM usauario";
        
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
       
        PreparedStatement ps = c.prepareStatement(sql);
     
        ResultSet rs = ps.executeQuery();
    
        while (rs.next()){
            int codigo = rs.getInt("codigo");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

 
    
}
