package info.goodline.cardholder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CardListActivity extends AppCompatActivity {

    Card cardLenta = new Card();
    Card cardDomingo = new Card();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list);

        final TextView tvTitle = findViewById(R.id.tvTitle);

        cardLenta.setId(1);
        cardLenta.setTitle("Лента");
        cardLenta.setPhoto("https://goo.gl/eQRqVq");

        cardDomingo.setId(2);
        cardDomingo.setTitle("Доминго");
        cardDomingo.setPhoto("https://goo.gl/65NeMq");

    }
    public void onClick (View view)
    {
        Intent intent = new Intent(this, EditCardActivity.class);
        intent.putExtra(Card.class.getSimpleName(), cardLenta);
        startActivity(intent);
    }

    public void onClick1(View view){

        Intent intent = new Intent(this, EditCardActivity.class);
        intent.putExtra(Card.class.getSimpleName(), cardDomingo);
        startActivity(intent);
    }
}
