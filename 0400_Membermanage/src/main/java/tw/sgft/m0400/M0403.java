package tw.sgft.m0400;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class M0403 extends AppCompatActivity {


    private Button b001;
    private Button b002;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0403);
        setupViewcomponent();
    }

    private void setupViewcomponent() {
        b002 =(Button)findViewById(R.id.m0403_b002);
        b002.setOnClickListener(b001On);
    }

    private Intent intent = new Intent();
    private View.OnClickListener b001On =new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.m0403_b002:

                    intent.putExtra("abc_title",getString(R.string.m0403_b002));
                    intent.setClass(M0403.this,M0400.class);
                    break;
            }
            startActivity(intent);
        }
    };
}
