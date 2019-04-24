package br.com.etecia.appherois;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HeroisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herois_activity);
    }

    public void abrirPersonagem(View view) {




        switch (view.getId()) {

            case R.id.capitaoamerica: {

                Intent intent = new Intent(this, CapitaoAmericaActivity.class);
                startActivity(intent);

                break;
            }

            case R.id.idHomemFerro: {

                Intent intent = new Intent(this, HomemDeFerroActivity.class);
                startActivity(intent);

                break;
            }

            case R.id.homemaranha: {

                Intent intent = new Intent(this, HomemAranhaActivity.class);
                startActivity(intent);

                break;
            }


        }



    }
}
