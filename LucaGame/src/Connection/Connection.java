package Connection;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Connection {
	
	private String indirizzo = "100.82.201.121";
	private int porta = 1025 ;
	
	public Connection() {
		try (Socket socket = new Socket(indirizzo, porta);
			 InputStream is = socket.getInputStream();
			 BufferedInputStream bis = new BufferedInputStream(is);
			 DataInputStream dis =new DataInputStream(bis);
				
			 OutputStream os = socket.getOutputStream();
			 PrintWriter pw = new PrintWriter(os);
				){
		} catch (IOException e) {
			System.err.println("Errore"+e);
			// TODO: handle exception
		}
	}
		

}
