package network;



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





        } finally {

            if (br != null) {
                br.close();
            }
        }


    }



}
