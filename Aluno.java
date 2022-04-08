public class Aluno {
    private String Nome;
    private Number Password;
    private String CPF;
    private String CNPJ;
    private String Endereço;
    private String Complemento;
    private String Email;

    public String getNome() { return Nome; }
    public void setNome(String nome) { Nome = nome; }
    public Number getPassword() { return Password; }
    public void setPassword(Number password) { Password = password; }
    public String getCPF() { return CPF; }
    public void setCPF(String CPF) { this.CPF = CPF; }
    public String getCNPJ() { return CNPJ; }
    public void setCNPJ(String CNPJ) { this.CNPJ = CNPJ; }
    public String getEndereço() { return Endereço; }
    public void setEndereço(String endereço) { Endereço = endereço; }
    public String getComplemento() { return Complemento; }
    public void setComplemento(String complemento) { Complemento = complemento; }
    public String getEmail() { return Email; }
    public void setEmail(String email) { Email = email; }

}
