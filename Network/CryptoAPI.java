package br.com.unicuritiba.meujeitoninjadeinvestir.Network;

import org.json.JSONObject;
import br.com.unicuritiba.meujeitoninjadeinvestir.Model.Crypto;

public class CryptoAPI {
    Crypto crypto = new Crypto();
    public void getCryptoBTCxBRL(CryptoListener listener) {
        ConnectionAsyncTask connectionAsyncTask = new ConnectionAsyncTask(new ConnectionAsyncTask.ConnectionListener() {
            @Override
            public void onRequestResult(JSONObject object) {

                try {
                    JSONObject coin = object.getJSONObject("BTCBRL");
                    crypto.setName(coin.getString("name"));
                    crypto.setCodein(coin.getString("codein"));
                    crypto.setBid(coin.getString("bid"));
                } catch (Exception e) { }
                listener.onCryptoMapperFinish(crypto);
            }
        });
        connectionAsyncTask.execute("https://economia.awesomeapi.com.br/last/BTC-BRL", "GET");
    }

    public void getCryptoBTCxUSD(CryptoListener listener) {
        ConnectionAsyncTask connectionAsyncTask = new ConnectionAsyncTask(new ConnectionAsyncTask.ConnectionListener() {
            @Override
            public void onRequestResult(JSONObject object) {

                try {
                    JSONObject coin = object.getJSONObject("BTCUSD");
                    crypto.setName(coin.getString("name"));
                    crypto.setCodein(coin.getString("codein"));
                    crypto.setBid(coin.getString("bid"));
                } catch (Exception e) { }
                listener.onCryptoMapperFinish(crypto);
            }
        });
        connectionAsyncTask.execute("https://economia.awesomeapi.com.br/last/BTC-USD", "GET");
    }

    public void getCryptoETHxBRL(CryptoListener listener) {
        ConnectionAsyncTask connectionAsyncTask = new ConnectionAsyncTask(new ConnectionAsyncTask.ConnectionListener() {
            @Override
            public void onRequestResult(JSONObject object) {

                try {
                    JSONObject coin = object.getJSONObject("ETHBRL");
                    crypto.setName(coin.getString("name"));
                    crypto.setCodein(coin.getString("codein"));
                    crypto.setBid(coin.getString("bid"));
                } catch (Exception e) { }
                listener.onCryptoMapperFinish(crypto);
            }
        });
        connectionAsyncTask.execute("https://economia.awesomeapi.com.br/last/ETH-BRL", "GET");
    }

    public void getCryptoETHxUSD(CryptoListener listener) {
        ConnectionAsyncTask connectionAsyncTask = new ConnectionAsyncTask(new ConnectionAsyncTask.ConnectionListener() {
            @Override
            public void onRequestResult(JSONObject object) {

                try {
                    JSONObject coin = object.getJSONObject("ETHUSD");
                    crypto.setName(coin.getString("name"));
                    crypto.setCodein(coin.getString("codein"));
                    crypto.setBid(coin.getString("bid"));
                } catch (Exception e) { }
                listener.onCryptoMapperFinish(crypto);
            }
        });
        connectionAsyncTask.execute("https://economia.awesomeapi.com.br/last/ETH-USD", "GET");
    }

    public void getCryptoBRLxUSD(CryptoListener listener) {
        ConnectionAsyncTask connectionAsyncTask = new ConnectionAsyncTask(new ConnectionAsyncTask.ConnectionListener() {
            @Override
            public void onRequestResult(JSONObject object) {

                try {
                    JSONObject coin = object.getJSONObject("BRLUSD");
                    crypto.setName(coin.getString("name"));
                    crypto.setCodein(coin.getString("codein"));
                    crypto.setBid(coin.getString("bid"));
                } catch (Exception e) { }
                listener.onCryptoMapperFinish(crypto);
            }
        });
        connectionAsyncTask.execute("https://economia.awesomeapi.com.br/last/BRL-USD", "GET");
    }

    public interface CryptoListener {
        void onCryptoMapperFinish(Crypto crypto);
    }

}
