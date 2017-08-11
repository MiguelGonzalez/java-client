package microsoft.aspnet.signalr.client.transport.listener;

import microsoft.aspnet.signalr.client.http.Request;
import microsoft.aspnet.signalr.client.http.Response;

public interface ExceptionFilter {
    public void exec(Request request, Response response, Exception ex);
}