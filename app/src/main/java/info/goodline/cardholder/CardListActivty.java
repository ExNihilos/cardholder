package info.goodline.cardholder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CardListActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list_activty);
    }

    public void onClick(View view) {
        Card cards = new Card();
        cards.setCard_name("Лента");
        cards.setId("1");
        cards.setPhoto("https://goo.gl/eQRqVq");

        Intent intent = new Intent(this, EditCardActivty.class);
        intent.putExtra(Card.class.getSimpleName(), cards);
        startActivity(intent);
    }
}
