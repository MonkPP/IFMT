public class DesafioFibonacci {
  public	static	void	main(String[]	args) {
	int	anterior=0, atual=1;
	System.out.print(anterior + ", ");
	while(atual<100) {
	    System.out.print(atual + ", ");
	    atual=anterior+atual;
	    anterior=atual-anterior;
	}
	System.out.print(atual);
  }
}
