package dextra.com.br.lanchonete.shared.utils;

import android.support.annotation.StringRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import dextra.com.br.lanchonete.R;

/**
 * Created by cledson.alves on 18/07/2018.
 */

public class CoreActivity extends AppCompatActivity {


    public void configActionBar(@StringRes int title, boolean showLogo){
        configActionBar(getString(title), showLogo, true);

    }

    public void configActionBar(String title, boolean showLogo, boolean isClosedButton) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowCustomEnabled(true);
            actionBar.setDisplayShowHomeEnabled(false);
            actionBar.setCustomView(R.layout.layout_header);
           // initHeader(actionBar, actionBar.getCustomView(), title, showLogo, isClosedButton);
        }
    }
    public

}
