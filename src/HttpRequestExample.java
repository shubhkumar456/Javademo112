//public class HttpRequestExample {
    import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

    public class HttpRequestExample {
        public static void main(String[] args) {
            try {
                URL url = new URL("https://api.example.com/data");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String line;
                    StringBuilder response = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        response.append(line);

                    }
                    reader.close();


                    // Process the response here
                    System.out.println(response.toString());

                } else {
                    System.out.println("HTTP request failed with response code: " + responseCode);
                }
            } catch (Exception e) {
                e.printStackTrace();

            }

        }
    }

//}
