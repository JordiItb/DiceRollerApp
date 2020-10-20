package cat.itb.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
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

                int num = (int) Math.floor(Math.random() * 6);
                int num2 = (int) Math.floor(Math.random() * 6);
                int[] opc = {R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3, R.drawable.dice_4, R.drawable.dice_5, R.drawable.dice_6};
                resultImageView.setImageResource(opc[num]);
                resultImageView2.setImageResource(opc[num2]);

                resultImageView2.setVisibility(View.VISIBLE);
                resultImageView.setVisibility(View.VISIBLE);


                if(num == 5 && num2 == 5){

                    Toast toast = Toast.makeText(MainActivity.this, "JACKOPT!!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP, Gravity.CENTER, 0);
                    toast.show();

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

                int num = (int) Math.floor(Math.random() * 6);
                int[] opc = {R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3, R.drawable.dice_4, R.drawable.dice_5, R.drawable.dice_6};
                resultImageView.setImageResource(opc[num]);


            }
        });

        resultImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num = (int) Math.floor(Math.random() * 6);
                int[] opc = {R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3, R.drawable.dice_4, R.drawable.dice_5, R.drawable.dice_6};
                resultImageView2.setImageResource(opc[num]);


            }
        });
    }
}