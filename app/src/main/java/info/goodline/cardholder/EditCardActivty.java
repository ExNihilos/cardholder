package info.goodline.cardholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditCardActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_card_activty);

        TextView titletext3 = findViewById(R.id.textView3);
        TextView titletext4 = findViewById(R.id.textView4);
        TextView titletext5 = findViewById(R.id.textView5);

        Bundle arguments = getIntent().getExtras();
        if (arguments == null) {
            return;
        }
        Card carder = (Card)arguments.getSerializable(Card.class.getSimpleName());

        if(carder == null)
        {
            return;
        }
        String title = carder.getTitle();
        int id = carder.getId();
        String photo = carder.getPhoto();
        titletext3.setText("Карта "+title);
        titletext4.setText("id: "+id);
        titletext5.setText("Фото: "+photo);
    }
}

