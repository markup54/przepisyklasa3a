package pl.zabrze.zs10.listy1_klasa3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ListaPrzepisowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        String kategoria = getIntent()
                .getExtras()
                .get(MainActivityListaKategorii.KATEGORIA)
                .toString();
        TextView textView = findViewById(R.id.textViewNazwaKAtegorii);
        textView.setText(kategoria);


    }
}