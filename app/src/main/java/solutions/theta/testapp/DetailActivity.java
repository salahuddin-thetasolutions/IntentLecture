package solutions.theta.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle extras=getIntent().getExtras();
        String Name=extras.getString("name");
        String Email=extras.getString("email");
        Toast.makeText(this, Name+"", Toast.LENGTH_SHORT).show();
        TextView mName=(TextView)findViewById(R.id.tvName);
        TextView mEmail=(TextView)findViewById(R.id.tvEmail);
        mName.setText(Name);
        mEmail.setText(Email);
    }
}
