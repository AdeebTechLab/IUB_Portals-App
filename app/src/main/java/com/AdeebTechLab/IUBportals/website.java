package com.AdeebTechLab.IUBportals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.jetbrains.annotations.Nullable;

public class website extends AppCompatActivity {




    private static final int FILE_UPLOAD_REQUEST_CODE = 1;
    private WebView WebView;

    private CardView Home, Phone, Desktop;

    public ProgressBar progressBar;
    private Button uploadButton;
    private ValueCallback<Uri[]> uploadCallback;






    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);




        WebView = findViewById(R.id.webView);





        String url= getIntent().getStringExtra("url");





        WebSettings mywebsettings = WebView.getSettings();



        mywebsettings.setJavaScriptEnabled(true);
        mywebsettings.setBuiltInZoomControls(true);
        mywebsettings.setDisplayZoomControls(false);
        mywebsettings.setLoadsImagesAutomatically(true);
        mywebsettings.setLoadWithOverviewMode(true);
        mywebsettings.setUseWideViewPort(true);
        mywebsettings.setDomStorageEnabled(true);


        WebView.loadUrl(url);





        //Button------------------------------------------------------------

        Home=(CardView) findViewById(R.id.Home);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(website.this, Home.class);
                startActivity(intent);

            }
        });

        Phone=(CardView) findViewById(R.id.Phone);
        Phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDesktopMode (WebView, false);
            }
        });

        Desktop=(CardView) findViewById(R.id.Desktop);
        Desktop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDesktopMode (WebView, true);
            }
        });






        // Configure file upload handling
        WebView.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onShowFileChooser(
                    WebView webView, ValueCallback<Uri[]> filePathCallback, FileChooserParams fileChooserParams) {
                uploadCallback = filePathCallback;
                openFileChooser();
                return true;
            }
        });


        //improve webview performance

        WebView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        WebView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);

        WebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        mywebsettings.setDomStorageEnabled(true);
        mywebsettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        mywebsettings.setUseWideViewPort(true);
        mywebsettings.setSavePassword(true);
        mywebsettings.setSaveFormData(true);


        mywebsettings.setEnableSmoothTransition(true);





        //handle downloading

        WebView.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimeType, long contentLength) {

                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
                request.setMimeType(mimeType);
                String cookies = CookieManager.getInstance().getCookie(url);
                request.addRequestHeader("cookie",cookies);
                request.addRequestHeader("User-Agent",userAgent);
                request.setDescription("Downloading file....");
                request.setTitle(URLUtil.guessFileName(url,contentDisposition,mimeType));
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,URLUtil.guessFileName(url, contentDisposition, mimeType));
                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(request);
                Toast.makeText(getApplicationContext(),"Downloading File",Toast.LENGTH_SHORT).show();


            }
        });


        //ProgresBar

        progressBar = (ProgressBar) findViewById(R.id.Pro);
        WebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);
                setTitle("Loading...");

            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.GONE);
                setTitle(view.getTitle());
            }
        });


    }

    public void setDesktopMode(WebView webView,boolean enabled) {
        String newUserAgent = webView.getSettings().getUserAgentString();
        if (enabled) {
            try {
                String ua = webView.getSettings().getUserAgentString();
                String androidOSString = webView.getSettings().getUserAgentString().substring(ua.indexOf("("), ua.indexOf(")") + 1);
                newUserAgent = webView.getSettings().getUserAgentString().replace(androidOSString, "(X11; Linux x86_64)");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            newUserAgent = null;
        }

        webView.getSettings().setUserAgentString(newUserAgent);
        webView.getSettings().setUseWideViewPort(enabled);
        webView.getSettings().setLoadWithOverviewMode(enabled);
        webView.reload();
    }




    private void openFileChooser() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("*/*");
        startActivityForResult(intent, FILE_UPLOAD_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == FILE_UPLOAD_REQUEST_CODE) {
            if (uploadCallback != null) {
                Uri[] result = WebChromeClient.FileChooserParams.parseResult(resultCode, data);
                uploadCallback.onReceiveValue(result);
                uploadCallback = null;
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }



    @Override
    public void onBackPressed() {
        if(WebView.canGoBack()){

            WebView.goBack();
        }
        else {

            super.onBackPressed();
        }
    }
}