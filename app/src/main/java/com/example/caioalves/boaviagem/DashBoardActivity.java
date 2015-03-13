package com.example.caioalves.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by caioalves on 11/03/15.
 */
public class DashBoardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }

    public void selecionarOpcao(View view){

        switch (view.getId()){
            case R.id.novaViagemTextView:
                startActivity(new Intent(this, ViagemActivity.class));
                break;
        }
    }

}
