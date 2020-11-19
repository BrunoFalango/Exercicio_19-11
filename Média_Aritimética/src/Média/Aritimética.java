package Média;
import java.util.Scanner;

public class Aritimética {
	

	public static void main(String[] args) {
		  Scanner read = new Scanner(System.in);
		  int i,soma=0,soma6=0,jogadas[];
		  int n;
		  double media=0;

		 

		   for(i=0;i<10;++i){

			   
		       scanf("%d",n);

		       media+=n;

		       jogadas[i]=n;

		       if(n==6)

		           ++soma6;

		   }

		   media/=10;

		   for(i=0;i<10;++i){

		       if(jogadas[i]>media)

		           ++soma;

		   }

		   System.out.printf("%d números são maiores que média aritmética dos 10 lançamentos\n%d porcento das jogadas foram 6\n",soma,(soma6*100)/10);

		}


	}


