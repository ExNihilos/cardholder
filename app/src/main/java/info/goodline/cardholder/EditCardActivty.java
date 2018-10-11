package info.goodline.cardholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditCardActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_card_activty);

        final TextView tvCardName = findViewById(R.id.tvCardName);
        final TextView tvPhoto = findViewById(R.id.tvPhoto);
        final TextView tvID = findViewById(R.id.tvID);

        Bundle arg = getIntent().getExtras();
        if (arg == null) {
            return;
        }

        Card cards = (Card) arg.getSerializable(Card.class.getSimpleName());

        String card_name = cards.getCard_name();
        String photo = cards.getPhoto();
        String id = cards.getId();

        tvCardName.setText(card_name);
        tvPhoto.setText(photo);
        tvID.setText(id);
    }
}
