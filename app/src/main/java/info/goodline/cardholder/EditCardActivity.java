package info.goodline.cardholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditCardActivity extends AppCompatActivity {

    Card card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_card);

        final TextView tvID = findViewById(R.id.tvID);
        final TextView tvTitle = findViewById(R.id.tvTitle);
        final TextView tvPhoto = findViewById(R.id.tvPhoto);

        Bundle argument = getIntent().getExtras();
        if (argument == null) {

            return;
        }

        card = (Card) argument.getParcelable(Card.class.getSimpleName());
        if (card == null) {
            return;
        }

        //String id = argument.getString("ID: ");
        //String title = argument.getString("Название карты: ");
        //String photo = argument.getString("Фото: ");
        String id = "ID: " + card.getId();
        String title = "Название карты: " + card.getTitle();
        String photo = "Фото: " + card.getPhoto();

        //tvID.setText(card.getId());
        //tvTitle.setText(card.getTitle());
        //tvPhoto.setText(card.getPhoto());
        tvID.setText(id);
        tvTitle.setText(title);
        tvPhoto.setText(photo);
    }
}