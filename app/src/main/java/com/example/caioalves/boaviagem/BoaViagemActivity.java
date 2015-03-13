package com.example.caioalves.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by caioalves on 10/03/15.
 */
public class BoaViagemActivity extends Activity{

    private EditText usuario;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.login);

        usuario = (EditText) findViewById(R.id.usuarioEditText);
        senha   = (EditText) findViewById(R.id.senhaEditText);
    }

    public void logarOnClick(View v){
        String usuarioInformado = usuario.getText().toString();
        String senhaInformada   = senha.getText().toString();

        if("root".equals(usuarioInformado) && "123".equals(senhaInformada)){
            startActivity(new Intent(this, DashBoardActivity.class));
        }else{
            String mensagemErro = getString(R.string.erroAutenticacao);
            Toast toast = Toast.makeText(this, mensagemErro, Toast.LENGTH_SHORT);
            toast.show();
        }
    }


}
