package solutions.theta.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import solutions.theta.testapp.Models.User;

public class DetailActivity extends AppCompatActivity {
    User objUser=null;
    RadioButton male,female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extras=getIntent().getExtras();
         objUser=(User) extras.getSerializable("objuser");
        if(objUser.getGendar().equals("Male")){
            male.setChecked(true);
        }else if(objUser.getGendar().equals("Female")){

        }

        Toast.makeText(this, objUser.getName().toString(), Toast.LENGTH_SHORT).show();
    }

}
