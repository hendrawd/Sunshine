package belajar.app.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import belajar.app.sunshine.Controllers.CloudConnecting;
import belajar.app.sunshine.Controllers.CloudResult;
import belajar.app.sunshine.Controllers.CloudURL;

public class MainActivity extends AppCompatActivity {

    CloudConnecting cloudConnecting;
    CloudURL url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cloudConnecting = new CloudConnecting();
        cloudConnecting.getData(getApplicationContext(),
                url.getCurrentWeather("Jakarta"), new CloudResult() {
                    @Override
                    public void resultData(String response) {
                        Toast.makeText(MainActivity.this,
                                response,
                                Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void errorResultData(String errorResponse) {
                        Log.d("Error", errorResponse);
                    }
                });

    }
}
