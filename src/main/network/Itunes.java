package network;


import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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

            JSONObject myJSO = new JSONObject(sb.toString());

        } finally {

            if (br != null) {
                br.close();
            }
        }


    }



}

// System.out.println(sb);

//    myJSON.getJSONArray("resultCount");
//   System.out.println(myJSON.getString("results"));
//    JSONObject results = myJSON.getJSONObject("resultCount");
//     JSONArray trackNames = results.getJSONArray("trackName");
// System.out.println(myJSON.
//  System.out.println(myJSON.keySet().size());
// myJSON.getString("resultCount");
//    JSONArray data1 = jObject.getJSONArray("results");
//    JSONObject results = myJSON.getJSONObject("results");
//   JSONArray trackNames = results.getJSONArray("trackName");
//    System.out.println(trackNames);

// JSONObject obj =  new JSONObject(json);
//JSONObject results = obj.getJSONObject("results");
//JSONArray bindings = results.getJSONArray("bindings");