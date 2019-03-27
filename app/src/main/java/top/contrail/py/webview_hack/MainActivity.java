package top.contrail.py.webview_hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button url_go=null;
    EditText url_edit=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url_go = (Button) findViewById(R.id.urlGo);
        url_edit=(EditText) findViewById(R.id.editText);

        url_go.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {

                String url = url_edit.getText().toString();

                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);

            }

        });


    }
}
