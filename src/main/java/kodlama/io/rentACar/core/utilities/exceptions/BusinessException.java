package kodlama.io.rentACar.core.utilities.exceptions;

public class BusinessException extends RuntimeException{
    public BusinessException(String message){
        super(); // Kalıtım alınan runtimeexception classındaki message objesine yönlendiririz
    }
}
