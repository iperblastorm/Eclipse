package main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import connect.*;
import datiDiGioco.DatiDiGioco.protocol1;

public class LucaServer {
	public static void main(String[] args) throws Exception {

		int coda = 0;

		try {
			ServerSocket server = new ServerSocket(1025);
			Mysqlconnection conn = new Mysqlconnection();
			protocol1 a = conn.searchPersonaggi("iperblastorm");
			
			System.out.println(a.getId()+" "+a.getLevel()+" "+a.getPlayerClass());	

			while (true) {
				if (coda < 5) {
					Socket socket = server.accept();
					
					ThreadServer thread = new ThreadServer(socket, coda);
					thread.start();
				}
			}

		} catch (IOException ex) {
			System.err.println("Errore apertura socket"+ex);
		}
	}
}
