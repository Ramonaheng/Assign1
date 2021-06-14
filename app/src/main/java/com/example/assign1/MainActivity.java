package com.example.assign1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public
class MainActivity extends AppCompatActivity {
    Button    button1;
    Button    button2;
    Button    button3;
    ImageView image;
    int       count = 1;
    int       score = 0;
    TextView answer;


    @Override
    protected
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        button1 = findViewById ( R.id.kendrick );
        button2 = findViewById ( R.id.Tiller );
        button3 = findViewById ( R.id.Dre );
        answer =(TextView ) findViewById (R.id.sum);
        image = ( ImageView ) findViewById ( R.id.image );
        image.setImageResource ( R.drawable.k_dot );

        addListenerOnButton ( );
        addListenerOnButton2 ();
        addListenerOnButton3 ();



    }


    public void addListenerOnButton ( ) {


        button1.setOnClickListener ( new View.OnClickListener ( ) {

            @Override
            public
            void onClick ( View arg0 ) {

                if (count == 1) {
                    image.setImageResource ( R.drawable.ypoung_tiller );
                    Toast.makeText ( getApplicationContext ( ), "correct", Toast.LENGTH_SHORT ).show ( );
                    score = score + 1;
                    count += 1;

                }
                else if (count == 2) {
                    image.setImageResource ( R.drawable.dre );

                    Toast.makeText ( MainActivity.this, "wrong", Toast.LENGTH_SHORT ).show ( );
                    count += 1;
                }

                else if (count == 3) {
                    image.setImageResource ( R.drawable.dre );

                    Toast.makeText ( MainActivity.this, "wrong", Toast.LENGTH_SHORT ).show ( );
                    count += 1;
                    answer.setText ( "Your Total score is :"+score );
                }


            }


        });
    }

    public void addListenerOnButton2 ( ) {


        button2.setOnClickListener ( new View.OnClickListener ( ) {

            @Override
            public
            void onClick ( View arg0 ) {

                if (count == 1) {
                    image.setImageResource ( R.drawable.ypoung_tiller );
                    Toast.makeText ( getApplicationContext ( ), "wrong", Toast.LENGTH_SHORT ).show ( );

                    count += 1;

                }
                else if (count == 2) {
                    image.setImageResource ( R.drawable.dre );
                    Toast.makeText ( MainActivity.this, "correct", Toast.LENGTH_SHORT ).show ( );
                    score = score + 1;
                    count += 1;
                }

                else if (count == 3) {
                    image.setImageResource ( R.drawable.dre );
                    Toast.makeText ( MainActivity.this, "wrong", Toast.LENGTH_SHORT ).show ( );
                    count += 1;
                    answer.setText ( "Your Total score is :"+score );
                }


            }


        });
    }

    public void addListenerOnButton3 ( ) {


        button3.setOnClickListener ( new View.OnClickListener ( ) {

            @Override
            public
            void onClick ( View arg0 ) {

                if (count == 1) {
                    image.setImageResource (R.drawable.dre );
                    Toast.makeText ( getApplicationContext ( ), "wrong", Toast.LENGTH_SHORT ).show ( );
                    count += 1;

                }
                else if (count == 2) {
                    image.setImageResource ( R.drawable.dre );

                    Toast.makeText ( MainActivity.this, "wrong", Toast.LENGTH_SHORT ).show ( );
                    count += 1;

                }

                else if (count == 3) {
                    image.setImageResource ( R.drawable.dre );

                    Toast.makeText ( MainActivity.this, "correct", Toast.LENGTH_SHORT ).show ( );
                    score = score + 1;
                    count += 1;
                    answer.setText ( "Your Total score is :"+score );

                }


            }


        });
    }










}



