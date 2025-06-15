package connect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadServer extends Thread {

	private Socket socket;

	public ThreadServer(Socket socket, int coda) {
		this.socket = socket;
	}

	@Override
	public void run() {

		try (InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader bf = new BufferedReader(isr);

				OutputStream os = socket.getOutputStream();
				PrintWriter pw = new PrintWriter(os);) {

		} catch (IOException ex) {
			System.err.println("Errore nel flusso dati");
			// TODO: handle exception
		}
	}

}
