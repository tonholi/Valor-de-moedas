package br.com.unicuritiba.meujeitoninjadeinvestir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import br.com.unicuritiba.meujeitoninjadeinvestir.Model.Crypto;
import br.com.unicuritiba.meujeitoninjadeinvestir.Network.CryptoAPI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button BTCXBRL = findViewById(R.id.BTCXBRL);
        Button BTCXUSD = findViewById(R.id.BTCXUSD);
        Button EHTXBRL = findViewById(R.id.ETHXBRL);
        Button EHTXUSD = findViewById(R.id.ETHXUSD);
        Button BRLXUSD = findViewById(R.id.BRLXUSD);
        TextView textView = findViewById(R.id.text_view_btc_brl);


        new CryptoAPI().getCryptoBTCxBRL( new CryptoAPI.CryptoListener() {
            @Override
            public void onCryptoMapperFinish(Crypto crypto) {


                BTCXBRL.setOnClickListener(view -> {
                    crypto.setBotao((String) BTCXBRL.getText());
                    textView.setText(crypto.getName() + "\n"
                            + crypto.getBid()
                            + " "
                            + crypto.getCodein()
                    );
;
                });
            }
        });

        new CryptoAPI().getCryptoBTCxUSD( new CryptoAPI.CryptoListener() {
            @Override
            public void onCryptoMapperFinish(Crypto crypto) {


                BTCXUSD.setOnClickListener(view -> {
                    //crypto.setBotao((String) BTCXBRL.getText());
                    textView.setText(crypto.getName() + "\n"
                            + crypto.getBid()
                            + " "
                            + crypto.getCodein()
                    );

                });
            }
        });

        new CryptoAPI().getCryptoETHxBRL( new CryptoAPI.CryptoListener() {
            @Override
            public void onCryptoMapperFinish(Crypto crypto) {


                EHTXBRL.setOnClickListener(view -> {
                    //crypto.setBotao((String) BTCXBRL.getText());
                    textView.setText(crypto.getName() + "\n"
                            + crypto.getBid()
                            + " "
                            + crypto.getCodein()
                    );

                });
            }
        });

        new CryptoAPI().getCryptoETHxUSD( new CryptoAPI.CryptoListener() {
            @Override
            public void onCryptoMapperFinish(Crypto crypto) {


                EHTXUSD.setOnClickListener(view -> {
                    //crypto.setBotao((String) BTCXBRL.getText());
                    textView.setText(crypto.getName() + "\n"
                            + crypto.getBid()
                            + " "
                            + crypto.getCodein()
                    );

                });
            }
        });

        new CryptoAPI().getCryptoBRLxUSD( new CryptoAPI.CryptoListener() {
            @Override
            public void onCryptoMapperFinish(Crypto crypto) {


                BRLXUSD.setOnClickListener(view -> {
                    //crypto.setBotao((String) BTCXBRL.getText());
                    textView.setText(crypto.getName() + "\n"
                            + crypto.getBid()
                            + " "
                            + crypto.getCodein()
                    );

                });
            }
        });


    }
}