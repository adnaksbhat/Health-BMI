package com.example.skandarastic_bhat.health;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;



public class Main2Activity extends AppCompatActivity {

   TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.texti2);
        String para =String.format( "Steps to be followed ------------\n                \n1) CHECK YOUR BMR \n\n***\n\nBMR or Bessel Modulation rate or Body metabolism rate which says your body calorie burning capacity .\n\n***\n\n2) FOLLOW CALORIE MANAGEMENT \n\nEach food \uD83E\uDD58 you eat has calories (Energy) in it. \nEat more healthy calories  than that of your BMR count. \n[ Ex: Your BMR is 1000; if your total calorie intake is around 1500 then remaining 500 out of 1000 wil get stored in body as fat and helps in muscle build] So that when 7000 calories get stored in your body, you will gain 1 kg. You can google for each food’s calorie.\n\n***\n\n3] DO SIMPLE EXERCISES \n\nExercise will increase your muscle by maintaining calorie thus gives you enough strength!!\n\n***\n\n4] DRINK 2.5-3L of water.\n \n Good amount of water will flush out bad water/fluid content. \n \n ***\n \n5] NUTRITION \n\nGive good amount Nutritious food mainly vitamins,minerals,healthy fats and proteins which along with exercise builds up strong muscles \uD83D\uDCAA\n");
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());



    }
}
