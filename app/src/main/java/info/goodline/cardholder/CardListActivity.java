package info.goodline.cardholder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CardListActivity extends AppCompatActivity {

    Card card = new Card();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list);

        final TextView tvTitle = findViewById(R.id.tvTitle);

        card.setId(1);
        card.setTitle("Лента");
        card.setPhoto("https://goo.gl/eQRqVq");

        card.setId(2);
        card.setTitle("Доминго");
        card.setPhoto("https://goo.gl/65NeMq");

    }
    public void onClick (View view)
    {
        Intent intent = new Intent(this, EditCardActivity.class);
        intent.putExtra(Card.class.getSimpleName(), card);
        startActivity(intent);
    }

    public void onClick1(View view){

        Intent intent = new Intent(this, EditCardActivity.class);
        intent.putExtra(Card.class.getSimpleName(), card);
        startActivity(intent);
    }
}
