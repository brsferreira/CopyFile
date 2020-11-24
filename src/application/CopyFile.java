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
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			//data input
			fin = new FileInputStream("..\\CopyFile\\src\\application\\frist.txt");
			//data output
			fout = new FileOutputStream("..\\CopyFile\\src\\application\\second.txt");
			
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
			
			
		} catch (IOException e) {
			System.out.println("ERROR I/O: " + e.getMessage() + e.getCause());
		}finally {
			try {
				if(fin != null) fin.close();;
			} catch (IOException e) {
				System.out.println("ERROR I/O: in input file" + e.getMessage());
			}
			try {
				if(fout != null) fout.close();
			} catch (Exception e2) {
				System.out.println("ERROR I/O: in output file" + e2.getMessage());
			}
		}
	}//main
}//class
