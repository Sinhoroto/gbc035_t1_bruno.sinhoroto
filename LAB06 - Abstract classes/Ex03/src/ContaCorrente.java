public abstract class ContaCorrente {

    protected float saldo ;
    protected int estado ; // 1= conta ativa 2= conta inativa
    protected int numConta ;
    protected int senha ;

    public ContaCorrente ( float val , int num , int senha ) {
        numConta = num ;
        senha = senha ;
        saldo = val ;
        estado = 1; // conta ativa
    }

    public abstract boolean debitaValor ( float val , int senha );
    public abstract void debitaValor ( float val );
    public abstract float getSaldo ( int senha );
    public abstract void creditaValor ( int senha , float val );
    protected abstract int getEstado ( int senha );
    protected abstract void setEstado ( int senha , int e );
    protected abstract boolean isSenha ( int senha );
}
