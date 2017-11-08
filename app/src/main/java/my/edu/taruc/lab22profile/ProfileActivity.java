package my.edu.taruc.lab22profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {

    private EditText editTextName,editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);
    }

    public void saveProfile(View view){
        String name, email;
        name = editTextName.getText().toString();
        email = editTextEmail.getText().toString();
        Intent intent = getIntent();
        intent.putExtra(MainActivity.PROFILE_NAME,name);
        intent.putExtra(MainActivity.PROFILE_EMAIL,email);
        setResult(RESULT_OK,intent);
        finish();
    }
}
