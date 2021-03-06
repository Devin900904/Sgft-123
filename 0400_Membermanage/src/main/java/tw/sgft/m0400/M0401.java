package tw.sgft.m0400;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;



public class M0401 extends AppCompatActivity {


    private Button b001;
    private Button b002;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0401);
        setupViewcomponent();
    }

    private void setupViewcomponent() {
        b001 =(Button)findViewById(R.id.m0401_b001);
        b002 =(Button)findViewById(R.id.m0401_b002);
        b001.setOnClickListener(b001On);
        b002.setOnClickListener(b001On);
        Intent intent = this.getIntent();
        String mode_title = intent.getStringExtra("abc_title");
        this.setTitle(mode_title);
    }

    private Intent intent = new Intent();
    private View.OnClickListener b001On =new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.m0401_b002:

                    intent.putExtra("abc_title",getString(R.string.m0401_b002));
                    intent.setClass(M0401.this,M0400.class);
                    break;
            }
            startActivity(intent);
        }
    };
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu0400, menu);
        return true;
    }
//

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        Toast.makeText(getApplication(),"禁用返回鍵",Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (item.getItemId()){
            case R.id.action_setting:
                this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    //-----------------------------------------------------------------------
}

