package net.androidbootcamp.hangmangame;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;





public class MainActivity extends AppCompatActivity
{
        int playerIndex;

        @Override
        public void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button button = (Button) findViewById(R.id.btnPlaySubmit);
            final Spinner numPlayers = (Spinner) findViewById(R.id.spnPlayer);

            button.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    playerIndex = numPlayers.getSelectedItemPosition();

                    switch (playerIndex)
                    {
                        case 0:
                            startActivity(new Intent(MainActivity.this, PlayerOneSunject.class));
                            break;
                        case 1:
                            startActivity(new Intent(MainActivity.this, PlayerTwoSubject.class));
                            break;

                    }


                }
            });


        }

    }
