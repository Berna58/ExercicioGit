/**
 * Realizado a Março de 2021
 * @author Berna
 */
public class Navio 
{
    private String matricula;
    private String nome;
    private float comprimento;

    /**
     *
     * @param matricula
     */
    public Navio(String matricula) 
    {
        this.matricula = matricula;
    }

    /**
     * Get da Matricula
     * @return
     */
    public String getMatricula() 
    {
        return matricula;
    }

    /**
     * Get do Nome
     * @return
     */
    public String getNome() 
    {
        return nome;
    }

    /**
     * Get do Comprimento
     * @return
     */
    public float getComprimento() 
    {
        return comprimento;
    }

    /**
     * Set do Nome
     * @param nome
     */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    /**
     * Set do Comprimento
     * @param comprimento
     */
    public void setComprimento(float comprimento) 
    {
        this.comprimento = comprimento;
    }
    
    
}
