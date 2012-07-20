/*
 * Create an empty abstract class to allow plugins to only
 * implement their required differences.
 */

public abstract class Plugin_Base implements Proxy_Plugin {
    public void init(Proxy context) {
        return;
    }
    
    public void read_handshake(Proxy context) {
        return;
    }
    
    public void read_auth(Proxy context) {
        return;
    }
    
    public void read_auth_result(Proxy context) {
        return;
    }
    
    public void read_query(Proxy context) {
        return;
    }
    
    public void read_query_result(Proxy context) {
        return;
    }
    
    public void send_query_result(Proxy context) {
        return;
    }
    
    public void cleanup(Proxy context) {
        return;
    }
}