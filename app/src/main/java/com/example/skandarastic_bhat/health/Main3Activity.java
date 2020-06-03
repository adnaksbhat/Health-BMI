package com.example.skandarastic_bhat.health;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView=findViewById(R.id.textii);
        String para = String.format("\"Steps to be followed  --------------------\n\n1) CHECK YOUR BMR\n\nBMR or Bessel Modulation rate or Body metabolism rate\nwhich says your body calorie burning capacity.\n\n***\n\n2) FOLLOW CALORIE MANAGEMENT\n\nEach food \uD83E\uDD58 you eat has calories (Energy) in it.\nEat calorie less than that of your BMR count.\n[ Ex: Your BMR is 2000; if your total calorie intake is around 1300 then remaining 700 out of 2000 wil burn from your body’s excess fat] So that when 7000 calories get burned, you will loose 1 kg. You can google for each food’s calorie.\n\n***\n\n3] DO SIMPLE EXERCISES\n\nExercise may burn your excess fat stored!\nFor example when you walk for an hour, approximately you will loose 250 calorie and 1 hour cycling \uD83D\uDEB4\u200D♀ 400 calorie.\n\n***\n\n4] DRINK 2.5-3L OF WATER.\n\n Good amount of water will flush out bad water/fluid content.\n\n***\n\n5] NUTRITION\n\nGive good amount Nutritious food mainly protein vitamins minerals healthy fats\n");
  textView.setText(para);
  textView.setMovementMethod(new ScrollingMovementMethod());



    }

}
