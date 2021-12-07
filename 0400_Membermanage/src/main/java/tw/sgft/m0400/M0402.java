package tw.sgft.m0400;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class M0402 extends AppCompatActivity {

    private Button b001;
    private Intent intent = new Intent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0402);
        setupViewcomponent();
    }

    private void setupViewcomponent() {
        b001 =(Button)findViewById(R.id.m0402_b001);
        b001.setOnClickListener(b001On);
    }
    private View.OnClickListener b001On =new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.m0402_b001:

                    intent.putExtra("abc_title",getString(R.string.m0402_b001));
                    intent.setClass(M0402.this,M0400.class);
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