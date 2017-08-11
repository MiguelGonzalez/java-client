package microsoft.aspnet.signalr.client.transport.listener;

import microsoft.aspnet.signalr.client.http.Request;
import microsoft.aspnet.signalr.client.http.Response;

public interface ConnectionFilter {
    public void exec(Request request);
    public void exec(Request request, Response response);
}