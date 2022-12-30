package ar.com.momo.monster.mobile.model.exceptions;

public class ApiError {

    private Integer status;
    private String message;
    private String error;

    public ApiError() {
        //No-arg constructor
    }

    public ApiError(Integer status, String message, String error) {
        this.status = status;
        this.message = message;
        this.error = error;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "ApiError{" +
            "status=" + status +
            ", message='" + message + '\'' +
            ", error='" + error + '\'' +
            '}';
    }
}
