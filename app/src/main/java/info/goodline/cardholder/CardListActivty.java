package info.goodline.cardholder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CardListActivty extends AppCompatActivity {

    private Card cardOne;
    private Card cardTow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list_activty);

        cardOne = new Card();
        cardOne.setName("Карта Лента");
        cardOne.setId("ID:1");
        cardOne.setPhoto("Фото: https://goo.gl/eQRqVq");

        cardTow = new Card();
        cardTow.setName("Карта Доминго");
        cardTow.setId("ID:2");
        cardTow.setPhoto("Фото: https://goo.gl/65NeMq ");
    }

    public void onClick_1(View view) {
        Intent intent = new Intent(this, EditCardActivty.class);
        intent.putExtra(Card.class.getSimpleName(), cardOne);
        startActivity(intent);
    }

    public void onClick_2(View view) {
        Intent intent_2 = new Intent(this, EditCardActivty.class);
        intent_2.putExtra(Card.class.getSimpleName(), cardTow);
        startActivity(intent_2);
    }
}
