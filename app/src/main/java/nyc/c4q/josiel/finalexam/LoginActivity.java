package nyc.c4q.josiel.finalexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username_et);
        password = (EditText) findViewById(R.id.password_et);
        submit = (Button) findViewById(R.id.submit_button);

        submit.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
//                handleLogin("", "");
                if (username.getText().toString().isEmpty() && !password.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a username", Toast.LENGTH_SHORT).show();
                } else if (password.getText().toString().isEmpty() && !username.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a password", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent();
                    intent.setClass(getApplicationContext(), ProfileActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

//    private void handleLogin(String username, String password) {
//
//        if (username.isEmpty() && !password.isEmpty()) {
//            Toast.makeText(getApplicationContext(), "Enter a username", Toast.LENGTH_SHORT).show();
//        }
//        if (password.isEmpty() && !username.isEmpty()) {
//            Toast.makeText(getApplicationContext(), "Enter a password", Toast.LENGTH_SHORT).show();
//        } else {
//            Intent intent = new Intent();
//            intent.setClass(getApplicationContext(), ProfileActivity.class);
//        }
//    }

}
