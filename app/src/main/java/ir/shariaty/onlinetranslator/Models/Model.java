package ir.shariaty.onlinetranslator.Models;


public class Model {

    private Data data;
     private Response response;
     private Meta meta;

    public Model(Data data, Response response, Meta meta) {
        this.data = data;
        this.response = response;
        this.meta = meta;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
