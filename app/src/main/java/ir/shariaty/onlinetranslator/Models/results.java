package ir.shariaty.onlinetranslator.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class results {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("title_en")
    @Expose
    private String title_en;

    @SerializedName("text")
    @Expose
    private String text;

    @SerializedName("source")
    @Expose
    private String source;

    @SerializedName("db")
    @Expose
    private String db;

    @SerializedName("num")
    @Expose
    private int  num;


   // private String id;
   /* private String title;
    private String text;
    private String source;
    private String db;
    private int num;*/



    public results(String id, String title, String title_en,String text, String source, String db, int num) {
        this.id = id;
        this.title = title;
        this.title_en=title_en;
        this.text = text;
        this.source = source;
        this.db = db;
        this.num = num;
    }

    public String getTitle_en() {
        return title_en;
    }

    public void setTitle_en(String title_en) {
        this.title_en = title_en;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
