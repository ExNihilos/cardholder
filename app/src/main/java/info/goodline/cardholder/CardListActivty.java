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

    public void onClick_1(View view) {

        Card card = new Card();
        card.setName("Карта Лента");
        card.setId("ID:1");
        card.setPhoto("Фото: https://goo.gl/eQRqVq");

        Intent intent = new Intent(this, EditCardActivty.class);
        intent.putExtra(Card.class.getSimpleName(), card);
        startActivity(intent);
    }

    public void onClick_2(View view) {

        Card card = new Card();
        card.setName("Карта Доминго");
        card.setId("ID:2");
        card.setPhoto("Фото: https://goo.gl/65NeMq ");

        Intent intent_2 = new Intent(this, EditCardActivty.class);
        intent_2.putExtra(Card.class.getSimpleName(), card);
        startActivity(intent_2);
    }
}
