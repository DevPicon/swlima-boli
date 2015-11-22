package pe.boli.android.swlima_boli.presentation.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import butterknife.Bind;
import pe.boli.android.swlima_boli.R;

public class MainActivity extends BaseActivity {

    @Bind(R.id.toolbar)
    protected Toolbar toolbar;

    @Override
    protected int getView() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate() {
        setSupportActionBar();

    }

    private void setSupportActionBar() {
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {

            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            getSupportActionBar().setTitle("Boli App");
        }
    }
}
