package com.smart4s.app.merchant.helloworld;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    private WebView mWv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        mWv = this.<WebView>findViewById(R.id.wv);
        //加载网络url
        mWv.getSettings().setJavaScriptEnabled(true);
        mWv.setWebViewClient(new MyWebViewClient());
        mWv.setWebChromeClient(new MyWebChromeClient());
        mWv.loadUrl("https://m.baidu.com");
        // 加载本地html
        // mWv.loadUrl("file:///android_asset/hello.html");
    }


    class MyWebViewClient extends WebViewClient{
        // WebView中继续加载网页，不必打开浏览器
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return super.shouldOverrideUrlLoading(view, request);
        }

        //页面开始加载
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            Log.d("WebView","onPageStarted");
        }
        //网页加载结束
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            Log.d("WebView","onPageFinished");
            //mWv.loadUrl("javascript:alert('Hello')");
            mWv.evaluateJavascript("javascript:alert('Hello')",null);
        }
    }

    class MyWebChromeClient extends WebChromeClient{
        //页面加载进度0-100之间
        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
        }
        //网页标题
        @Override
        public void onReceivedTitle(WebView view, String title) {
            super.onReceivedTitle(view, title);
            setTitle(title);
        }
    }
    //网页后退
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK && mWv.canGoBack()){
            mWv.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}