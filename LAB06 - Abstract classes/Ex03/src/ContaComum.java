public class ContaComum extends ContaCorrente{
    public ContaComum(float val, int num, int senha) {
        super(val, num, senha);
        limite = 0;
    }

    private float limite;

    public boolean debitaValor ( float val , int senha ) {
        if ( senha != senha )
            return ( false ); // senha deve ser vá lida
        if ( estado != 1 )
            return ( false ); // conta deve ser ativa
        if ( val <= 0 )
            return ( false ); // val > 0
        if ( val > saldo )
            return ( false );

        saldo -= val ;
        if ( saldo == 0 )
            estado = 2; // torna conta inativa
        return ( true ) ;
    }

    public void debitaValor ( float val ) {
        saldo -= val ;
    }

    public float getSaldo ( int senha ) {
        if ( senha == senha )
            return saldo ;
        else
            return -1; // indicando que houve problema na senha
    }
    public void creditaValor ( int senha , float val ) {
        if ( senha == senha )
            saldo += val ;
    }
    protected int getEstado ( int senha ) {
        if ( senha == senha )
            return estado ;
        else
            return -1;
    }
    protected void setEstado ( int senha , int e ) {
        if ( senha == senha )
            estado = e;
    }
    protected boolean isSenha ( int senha ) {
        if ( senha == senha )
            return true ;
        else
            return false ;
    }
}
