package ir.shariaty.onlinetranslator.Models;

public class Response {
    private Boolean status;
    private int code;
    private String state;

    public Response(Boolean status, int code, String state) {
        this.status = status;
        this.code = code;
        this.state = state;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
