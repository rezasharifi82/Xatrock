package xat.API;





import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class APIPS {


    public static String get_Quote(){
        String a="Everything is possible while you have Inner-peace ";
        try {


            URL url = new URL("http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();
                JSONParser parse = new JSONParser();
                JSONObject dataObject = (JSONObject) parse.parse(String.valueOf(informationString));
                //System.out.println();

                //JSONObject countryData = (JSONObject) dataObject.get(0);

                //System.out.println(countryData.get("quoteText"));
                a=(String) dataObject.get("quoteText");
                return (String) dataObject.get("quoteText");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return a;
    }



    public static Boolean Email_check(String that_email){
        Boolean a=true;
        //Boolean b=true;

        ///String a="Everything is possible while you have Inner-peace ";
        try {


            URL url = new URL("https://www.disify.com/api/email/"+that_email);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();
                JSONParser parse = new JSONParser();
                JSONObject dataObject = (JSONObject) parse.parse(String.valueOf(informationString));
                //System.out.println(informationString);

                //JSONObject countryData = (JSONObject) dataObject.get(0);

                //System.out.println(countryData.get("quoteText"));
                a=(Boolean) dataObject.get("format");

                return a;
                //return (String) dataObject.get("quoteText");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return a;

    }




    public static String get_time(){
        String a="00:00";
        try {


            URL url = new URL("http://worldtimeapi.org/api/timezone/Asia/Tehran");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();
                JSONParser parse = new JSONParser();
                JSONObject dataObject = (JSONObject) parse.parse(String.valueOf(informationString));
                //System.out.println(informationString);

                //JSONObject countryData = (JSONObject) dataObject.get(0);

                a= (String) dataObject.get("datetime");
                a=a.substring(11,16);
                //System.out.println(a);
                return a;
                //a=(String) dataObject.get("quoteText");
                //return (String) dataObject.get("quoteText");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return a;

    }


    public static String get_ip(){
        String a="192.168.1.1";
        try {


            URL url = new URL("http://worldtimeapi.org/api/timezone/Asia/Tehran");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();
                JSONParser parse = new JSONParser();
                JSONObject dataObject = (JSONObject) parse.parse(String.valueOf(informationString));
                //System.out.println(informationString);

                //JSONObject countryData = (JSONObject) dataObject.get(0);

                a= (String) dataObject.get("client_ip");
                //a=a.substring(11,16);
                //System.out.println(a);
                return a;
                //a=(String) dataObject.get("quoteText");
                //return (String) dataObject.get("quoteText");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return a;

    }










    public static void main(String[] args) {
        System.out.println(APIPS.get_ip());



    }

}
