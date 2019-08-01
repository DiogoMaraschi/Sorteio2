package com.vc.sorteio;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;
import java.util.stream.IntStream;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Random random = new Random();
        Button novoS = (Button) findViewById(R.id.botaoS);

        novoS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numSorteado= 0;
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();
                int num11 = Integer.parseInt(n1);
                int num22 = Integer.parseInt(n2);
                do {
                    numSorteado = random.nextInt(num22);
                }while (numSorteado<num11);
                String g = Integer.toString(numSorteado);
                TextView re = (TextView) findViewById(R.id.resultado);
                re.setText(g);
            }
        });
    }
}