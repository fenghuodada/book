package com.unity3d.scar.adapter.common;

/* loaded from: classes3.dex */
public class WebViewAdsError implements IUnityAdsError {

    /* renamed from: a */
    protected String f18011a;

    /* renamed from: b */
    private Enum f18012b;

    /* renamed from: c */
    protected Object[] f18013c;

    public WebViewAdsError(Enum<?> r1, String str, Object... objArr) {
        this.f18012b = r1;
        this.f18011a = str;
        this.f18013c = objArr;
    }

    @Override // com.unity3d.scar.adapter.common.IUnityAdsError
    public int getCode() {
        return -1;
    }

    @Override // com.unity3d.scar.adapter.common.IUnityAdsError
    public String getDescription() {
        return this.f18011a;
    }

    @Override // com.unity3d.scar.adapter.common.IUnityAdsError
    public String getDomain() {
        return null;
    }

    public Object[] getErrorArguments() {
        return this.f18013c;
    }

    public Enum<?> getErrorCategory() {
        return this.f18012b;
    }
}
