package network;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;
import sun.misc.IOUtils;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Itunes {

    public static void main(String[] args) throws MalformedURLException, IOException {

        BufferedReader br = null;

        try {
            //  String apikey = "you need to sign up for an API key!"; //fill this in with the API key they email you
            String findSong = "https://itunes.apple.com/search?term=daniel+caesar&entity=musicVideo";
            String theURL = findSong;
            URL url = new URL(theURL);

            br = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;

            StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null) {

                sb.append(line);
                sb.append(System.lineSeparator());
            }

            System.out.println(sb);

           // JSONObject json = new JSONObject(theURL);
           // JSONObject results = json.getJSONObject("results");
           // JSONArray trackName = results.getJSONArray("trackName");




        } finally {

            if (br != null) {
                br.close();
            }
        }


    }



}
