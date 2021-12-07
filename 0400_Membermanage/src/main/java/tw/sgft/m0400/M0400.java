package tw.sgft.m0400;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

public class M0400 extends AppCompatActivity {

    private Button b001;
    private Intent intent = new Intent();
    private CheckBox chb01,chb02,chb03;
    private ImageButton b002;
    private Button b003;
    private Button b004;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0400);
        setupViewcomponent();
    }

    private void setupViewcomponent() {
        b001 =(Button)findViewById(R.id.m4000_b001);
        b002 =(ImageButton)findViewById(R.id.m0400_b002);
        b003 =(Button)findViewById(R.id.m0400_b003);
        b004 =(Button)findViewById(R.id.m0400_b004);
        chb01 = (CheckBox) findViewById(R.id.m0401_chb01);
        chb02 = (CheckBox) findViewById(R.id.m0401_chb02);
        chb03 = (CheckBox) findViewById(R.id.m0401_chb03);
        b001.setOnClickListener(b001on);
        b004.setOnClickListener(b001on);
        b002.setOnClickListener(b001on);
    }


    private View.OnClickListener b001on= new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.m4000_b001:

                intent.putExtra("abc_title",getString(R.string.m0400_b001));
                intent.setClass(M0400.this,M0401.class);
                break;
            case R.id.m0400_b004:

                intent.putExtra("abc_title",getString(R.string.m0400_b000));
                intent.setClass(M0400.this,M0402.class);
                break;
            case R.id.m0400_b002:

                intent.putExtra("abc_title",getString(R.id.m0400_b002));
                intent.setClass(M0400.this,M0403.class);
                break;
        }
        startActivity(intent);
    }
};
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu0400, menu);
        return true;
    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplication(),"禁用返回鍵",Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId()){
            case R.id.action_setting:
                this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}