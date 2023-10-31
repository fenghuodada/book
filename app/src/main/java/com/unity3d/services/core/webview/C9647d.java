package com.unity3d.services.core.webview;

import android.content.Context;
import android.webkit.WebSettings;

/* renamed from: com.unity3d.services.core.webview.d */
/* loaded from: classes3.dex */
public class C9647d extends WebView {
    public C9647d(Context context) {
        super(context);
        WebSettings settings = getSettings();
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
    }
}
