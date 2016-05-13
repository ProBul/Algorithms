package com.bulkin.algorithms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bulkin.facebook.R;

public class MainActivity extends AppCompatActivity {
    //count how many letters are in the Sticker
    private int Facef = 1;
    private int Facea = 1;
    private int Facec = 1;
    private int Facee = 1;
    private int Faceb = 1;
    private int Faceo = 2;
    private int Facek = 1;
    //counter for the new word to compare with the sticker word
    int f = 0;
    int a = 0;
    int c = 0;
    int e = 0;
    int b = 0;
    int o = 0;
    int k = 0;

    //the word that will be recieved (for this example it`s "ffaceboook")
    private String givenWord /*= "facebook"*/;
    private int numOfStickers = 1;

    private Button btn_countStickers, btn_checkIfSwapble;
    private EditText et_facebookStick, et_oneSwap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_countStickers = (Button) findViewById(R.id.button_stickers);
        btn_checkIfSwapble = (Button) findViewById(R.id.button_swapCounter);
        et_facebookStick = (EditText) findViewById(R.id.editText_faceSticker);
        et_oneSwap = (EditText) findViewById(R.id.editText_swapCounter);

        // //use algorithm from FaceBookSticker.class to determine how many stickers
        // do i need to make a given word
        btn_countStickers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                givenWord = et_facebookStick.getText().toString();
                FaceBookSticker fbs = new FaceBookSticker();
                numOfStickers = fbs.countStickers(givenWord);
                Toast.makeText(getApplicationContext(), "you will need " +
                        String.valueOf(numOfStickers) + " stickers", Toast.LENGTH_LONG).show();

            }
        });

        //use algorithm from DubleSwitch.class to determine
        // if the int Array can be arranged in one swap
        //will work only for numbers from 0-9

        btn_checkIfSwapble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_numToCheck= et_oneSwap.getText().toString();
                int length= str_numToCheck.length();
                int[] A = new int[length];

                for (int i =0; i<length;i++){
                    A[i]= Character.getNumericValue(str_numToCheck.charAt(i));
                }

                DubleSwitch ds = new DubleSwitch();
                int canBeArranged = ds.solution(A);
                if (canBeArranged == 1) {
                    Toast.makeText(getApplicationContext(), "can be sorted", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "can`t be sorted", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}