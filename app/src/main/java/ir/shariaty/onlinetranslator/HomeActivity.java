package ir.shariaty.onlinetranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    TextView tvfromlang,tvtolang;
    ImageButton changelanBtn , translate_btn;
    String langinducter;
    EditText inputtext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //change language btn
        tvfromlang=(TextView)findViewById(R.id.tvfromlang);
        tvtolang=(TextView)findViewById(R.id.tvtolang);
        changelanBtn=(ImageButton)findViewById(R.id.changelangBtn);
        translate_btn=(ImageButton)findViewById(R.id.translate_btn);
        inputtext=(EditText)findViewById(R.id.inputtext);

        changelanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputtext.getText().clear();
                langinducter=tvfromlang.getText().toString();
                tvfromlang.setText(tvtolang.getText().toString());
                tvtolang.setText(langinducter);
            }
        });

        translate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "go next page", Toast.LENGTH_SHORT).show();
            }
        });

    }
}