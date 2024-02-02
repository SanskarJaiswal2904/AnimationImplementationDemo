package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView logotext, welcometext;
    ImageView imageView;
    EditText editText;
    AppCompatButton button;
    Animation fade_anim, slide_from_left, rotation_max, set_anim, custom_anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logotext = findViewById(R.id.logotext);
        welcometext = findViewById(R.id.welcomeText);
        imageView = findViewById(R.id.image);
        editText = findViewById(R.id.nameEdit);
        button = findViewById(R.id.button);

        fade_anim = AnimationUtils.loadAnimation(this,R.anim.fade_anim);
        slide_from_left = AnimationUtils.loadAnimation(this,R.anim.slide_from_left);
        rotation_max = AnimationUtils.loadAnimation(this,R.anim.rotation_max);
        set_anim = AnimationUtils.loadAnimation(this,R.anim.scale_anim);
        custom_anim = AnimationUtils.loadAnimation(this,R.anim.custom);



        imageView.setAnimation(fade_anim);
        editText.setAnimation(slide_from_left);
        welcometext.setAnimation(rotation_max);
        button.setAnimation(set_anim);
        imageView.setAnimation(custom_anim);

    }
}