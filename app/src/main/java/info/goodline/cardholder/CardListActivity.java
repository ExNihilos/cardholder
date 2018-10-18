package info.goodline.cardholder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CardListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list);

        TextView titletext1 = findViewById(R.id.textView);
        TextView titletext2 = findViewById(R.id.textView2);
        titletext1.setText("Карта: Лента");
        titletext2.setText("Карта: Доминго");

    }
    public void onClick(View view) {
        Card card1 = new Card();
        card1.setId(1);
        card1.setTitle("'Лента'");
        card1.setPhoto("https://goo.gl/eQRqVq");
       Intent intent = new Intent( this, EditCardActivty.class);
       intent.putExtra(Card.class.getSimpleName(),card1);
       startActivity(intent);
    }
    public void onClick2(View view) {
        Card card2 = new Card();
        card2.setId(2);
        card2.setTitle("'Доминго'");
        card2.setPhoto("https://goo.gl/65NeMq");
        Intent intent = new Intent( this, EditCardActivty.class);
        intent.putExtra(Card.class.getSimpleName(),card2);
        startActivity(intent);
    }
}
