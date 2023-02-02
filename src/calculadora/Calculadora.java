package calculadora;

public class Calculadora extends Calculos implements IOperacoes {
    private double valor1;
    private double valor2;
    private int operacao;
    private double resultado;
    
    // Getters and Setters
    
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }    
    
    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }
    
    public double getResultado() {
        return resultado;
    }
    
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }    
    
    // Constructor
    
    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    // Methods
    
    public void Somar(double valor1, double valor2) {
        resultado = valor1 + valor2;
    }
    
    public void Subtrair(double valor1, double valor2) {
        resultado =  valor1 - valor2;
    }
    
    public void Multiplicar(double valor1, double valor2) {
        resultado =  valor1 * valor2;
    }
    
    public void Dividir(double valor1, double valor2) {
        if (valor2 <= 0)
            resultado =  0;
        else
            resultado =  valor1 / valor2;
    }   
}
