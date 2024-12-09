package br.pdvcongelados.model.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import br.pdvcongelados.model.entities.Endereco;

/**
 *
 * @author Murilo Gritti
 */

public class ServicoCep{
    
    private final static String SERVICE_URL = "https://brasilapi.com.br/api/cep/v1/";
    private static HttpURLConnection connection;
    
    @SuppressWarnings("deprecation")
    public static Endereco findAddress(String cep) throws IOException {
        try {
            connection = (HttpURLConnection) new URL(SERVICE_URL + cep).openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json;charset=UTF-8");
            connection.connect();
                        
            if (connection.getResponseCode() != 200) {
                throw new IllegalArgumentException("CEP inválido.");
            }
            
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"))) {
                Endereco endereco = new Gson().fromJson(br, Endereco.class);
                connection.disconnect();
                return endereco;
            }
            
        }
        catch (IOException e) {
            throw new IOException(e.getMessage());
        }
        catch (IllegalStateException | JsonSyntaxException e) {
            throw new IOException("Digite um CEP para poder pesquisar.");
        }
    }
}