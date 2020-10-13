package cat.itb.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView resultImageView;
    ImageView resultImageView2;
    Button rollButton;
    Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultImageView = findViewById(R.id.appResult);
        resultImageView2 = findViewById(R.id.appResult2);
        rollButton = findViewById(R.id.appButton);
        resetButton = findViewById(R.id.resetButton);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rollButton.setText("Dice rolled.");

                int num = (int) Math.floor(Math.random() * 6  + 1);
                int num2 = (int) Math.floor(Math.random() * 6  + 1);

                resultImageView2.setVisibility(View.VISIBLE);
                resultImageView.setVisibility(View.VISIBLE);

                switch(num){

                    case 1:
                        resultImageView.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        resultImageView.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        resultImageView.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        resultImageView.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        resultImageView.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        resultImageView.setImageResource(R.drawable.dice_6);
                        break;

                }

                switch(num2){

                    case 1:
                        resultImageView2.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        resultImageView2.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        resultImageView2.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        resultImageView2.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        resultImageView2.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        resultImageView2.setImageResource(R.drawable.dice_6);
                        break;

                }

                if(num == 6 && num2 == 6){

                    Toast.makeText(MainActivity.this, "JACKOPT!!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rollButton.setText("Roll the Dice");

                resultImageView.setImageResource(R.drawable.empty_dice);
                resultImageView2.setImageResource(R.drawable.empty_dice);

            }
        });

        resultImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num = (int) Math.floor(Math.random() * 6  + 1);

                switch(num){

                    case 1:
                        resultImageView.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        resultImageView.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        resultImageView.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        resultImageView.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        resultImageView.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        resultImageView.setImageResource(R.drawable.dice_6);
                        break;

                }

            }
        });

        resultImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num = (int) Math.floor(Math.random() * 6  + 1);

                switch(num){

                    case 1:
                        resultImageView2.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        resultImageView2.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        resultImageView2.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        resultImageView2.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        resultImageView2.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        resultImageView2.setImageResource(R.drawable.dice_6);
                        break;

                }

            }
        });
    }
}