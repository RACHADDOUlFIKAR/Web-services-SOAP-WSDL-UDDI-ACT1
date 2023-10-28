package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWs")
public class BanqueService {
@WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double mt)  {
        return mt*10.54;
    }
    public Compte getCompte(int code){
        return new Compte(code,Math.random()*9888,new Date());
    }
    public List<Compte> compteList(){
        return List.of(
                new Compte(1,Math.random()*9888,new Date()),
                new Compte(2,Math.random()*9888,new Date()),
                new Compte(3,Math.random()*9888,new Date())
        );
    }
}
