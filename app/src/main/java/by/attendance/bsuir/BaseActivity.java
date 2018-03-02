package by.attendance.bsuir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseActivity extends AppCompatActivity {

    private static final Logger LOG = LoggerFactory.getLogger(BaseActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        LOG.info("SLF4J info");
        LOG.error("123");
    }
}
