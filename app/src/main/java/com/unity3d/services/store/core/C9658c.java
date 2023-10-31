package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.WebViewAdsError;
import com.unity3d.services.core.webview.EnumC9627b;

/* renamed from: com.unity3d.services.store.core.c */
/* loaded from: classes3.dex */
public class C9658c extends WebViewAdsError {
    public C9658c(Enum<?> r1, String str, Object... objArr) {
        super(r1, str, objArr);
    }

    @Override // com.unity3d.scar.adapter.common.WebViewAdsError, com.unity3d.scar.adapter.common.IUnityAdsError
    public String getDomain() {
        return EnumC9627b.STORE.name();
    }
}
