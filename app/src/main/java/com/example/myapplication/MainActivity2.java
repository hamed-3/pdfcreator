import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MainActivity2 extends AppCompatActivity {

    TextView countryTextView, plakelerTextView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        countryTextView = findViewById(R.id.textView3);
        plakelerTextView = findViewById(R.id.textView4);
        imageView = findViewById(R.id.imageView2);

        Intent intent = getIntent();
        String country = intent.getStringExtra("country");
        String plakeler = intent.getStringExtra("plakeler");
        int imageResource = intent.getIntExtra("image", 0);

        countryTextView.setText(country);
        plakelerTextView.setText(plakeler);
        imageView.setImageResource(imageResource);

    }
}
