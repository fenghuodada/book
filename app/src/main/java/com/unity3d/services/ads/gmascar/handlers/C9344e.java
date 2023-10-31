package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.WebViewAdsError;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;

/* renamed from: com.unity3d.services.ads.gmascar.handlers.e */
/* loaded from: classes3.dex */
public class C9344e implements IAdsErrorHandler<WebViewAdsError> {
    @Override // com.unity3d.scar.adapter.common.IAdsErrorHandler
    /* renamed from: a */
    public void handleError(WebViewAdsError webViewAdsError) {
        C9620a.m1774c().m1784a(EnumC9627b.valueOf(webViewAdsError.getDomain()), webViewAdsError.getErrorCategory(), webViewAdsError.getErrorArguments());
    }
}
