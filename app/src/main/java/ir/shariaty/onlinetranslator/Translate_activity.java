package ir.shariaty.onlinetranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Translate_activity extends AppCompatActivity {
    TextView showWord , showMeaning, showSource;
    String title_en,pron,source,text;
    ImageButton sharebtn,copybtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);

        showWord=(TextView)findViewById(R.id.showWord);
        showMeaning=(TextView)findViewById(R.id.showMeaning);
        showSource=(TextView)findViewById(R.id.showSource);

        sharebtn=(ImageButton)findViewById(R.id.Sharebtn);
        copybtn=(ImageButton)findViewById(R.id.copybtn);

        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT,text);
                startActivity(Intent.createChooser(shareIntent,"Share Via :"));
            }
        });

        copybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("label", text);
                clipboard.setPrimaryClip(clip);
                Toast.makeText(Translate_activity.this, "text copyed!", Toast.LENGTH_SHORT).show();

            }
        });


        //show word
        String title=getIntent().getStringExtra("title");
        String title_en=getIntent().getStringExtra("title_en");
        if(title.equals(""))
        showWord.setText(title_en);
        else
            showWord.setText(title);

        //show source
        source=getIntent().getStringExtra("source");
        showSource.setText(source);

        //show description/meaning
        text=getIntent().getStringExtra("text");
        showMeaning.setText(text);


    }
}