package adapter;

public class WebService {
    private String host;

    public WebService(String host) {
        this.host = host;
    }

    public Json request(Json jsonRequest) {
        // Simulate a web service request here
        // For simplicity, we'll just print the request and return a mock Json response
        System.out.println("Request to " + host + ": " + jsonRequest);
        return new Json(); // Mock response
    }
}
