package application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* Copia um arquivo de texto.
Para usar esse programa, especifique o nome do
arquivo de origem e do arquivo de destino.
Por exemplo, para copiar um arquivo chamado FIRST.TXT
em um arquivo chamado SECOND.TXT, use a linha de comando
a seguir.
*/

public final class CopyFile {

	public static void main(String[] args) {
		
		int i;
		
		try(FileInputStream fin = new FileInputStream("..\\CopyFile\\src\\application\\frist.txt");
				FileOutputStream fout = new FileOutputStream("..\\CopyFile\\src\\application\\second.txt")) {
			//data input
			//data output
			
			
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
			
			
		} catch (IOException e) {
			System.out.println("ERROR I/O: " + e.getMessage() + e.getCause());
		}
	}//main
}//class
