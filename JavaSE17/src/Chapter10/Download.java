package Chapter10;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

public class Download { 

    public static InputStream openStream(String uri) throws Exception{
        return HttpClient
                .newHttpClient()
                .send(
                        HttpRequest.newBuilder(URI.create(uri)).build(),
                        BodyHandlers.ofInputStream()
                )
                .body();
    }

    public static void main(String[] args) throws Exception {
        var src = openStream(args[0]);
        var dest = new FileOutputStream(args[1]);
        IOn.dump(src, dest);
        var url = new URL(args[0]);
        var src1 = url.openStream();
        IOn.dump(src1, System.out);
    }
}
