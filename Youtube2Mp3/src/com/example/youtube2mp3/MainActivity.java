package com.example.youtube2mp3;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.os.Build;



public class MainActivity extends ActionBarActivity {

	PlaceholderFragment pf;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
         
         
        
        if (savedInstanceState == null) {
        	
        	 pf=new PlaceholderFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, pf)
                    .commit();
        
        
            

               
              
       
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
    	WebView  pWebView ;

    	
        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            
            //レイアウトで指定したWebViewのIDを指定する。
            pWebView = (WebView)rootView.findViewById(R.id.webView1);
          //リンクをタップしたときに標準ブラウザを起動させない
            pWebView.setWebViewClient(new WebViewClient());
  
            return rootView;
        }

    }
 	public void onclick1(View view) {
 		Intent it=new Intent(
 				"android.intent.action.VIEW",
 				Uri.parse("http://www.google.com"));
 		startActivity(it);
 		//最初にYahoo! Japanのページを表示する。
 		/*
 		AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
 		alertDialog.setTitle(getString(R.string.app_name));// タイトルを設定します
		alertDialog.setMessage("test");// メッセージを設定
 		alertDialog.show();
 		*/
	}
 	
 	
 	public void onclick2(View view) {
 		//pWebView.loadUrl("http://www.yahoo.co.jp/");	
 		pf.pWebView.loadUrl("http://www.yahoo.co.jp/");	
 	}
}
