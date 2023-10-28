import proxy.BanqueService;
import proxy.BanqueWs;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub=new BanqueWs().getBanqueServicePort() ;
        System.out.println(stub.convert(7600));


    }
}
