package br.com.etecia.appherois;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomemAranhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homem_aranha);
    }

    public void voltaMenu(View view) {

        Intent intent = new Intent(this, HeroisActivity.class);
        startActivity(intent);
    }
}
