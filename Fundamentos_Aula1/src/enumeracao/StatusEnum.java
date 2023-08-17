
package enumeracao;

public enum StatusEnum {
    EM_PREPARACAO("Em preparacao"),EM_TRANSPORTE("Em Transporte"),ENTREGUE("Entregue ao cliente");
    
    
    private String status;
    
    private StatusEnum(String status){
       this.status = status;
    }
    
    public String getStatus(){
    return this.status;
    }
 }
