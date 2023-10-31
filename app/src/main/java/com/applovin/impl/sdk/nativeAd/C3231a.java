package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p032d.C3124e;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.File;
import java.util.Collections;

/* renamed from: com.applovin.impl.sdk.nativeAd.a */
/* loaded from: classes.dex */
public class C3231a extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final C3124e f8465a;

    /* renamed from: c */
    private final AppLovinNativeAdImpl f8466c;

    /* renamed from: d */
    private final InterfaceC3232a f8467d;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3232a {
        /* renamed from: a */
        void mo7360a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public C3231a(AppLovinNativeAdImpl appLovinNativeAdImpl, C3214m c3214m, InterfaceC3232a interfaceC3232a) {
        super("TaskCacheNativeAd", c3214m);
        this.f8465a = new C3124e();
        this.f8466c = appLovinNativeAdImpl;
        this.f8467d = interfaceC3232a;
    }

    @Nullable
    /* renamed from: a */
    private Uri m7367a(Uri uri) {
        String str;
        if (uri == null) {
            return null;
        }
        if (C3349v.m6862a()) {
            m7705a("Attempting to cache resource: " + uri);
        }
        String m7082a = this.f8192b.m7439aa() != null ? this.f8192b.m7439aa().m7082a(m7698f(), uri.toString(), this.f8466c.getCachePrefix(), Collections.emptyList(), false, this.f8465a) : this.f8192b.m7438ab().m7103a(m7698f(), uri.toString(), this.f8466c.getCachePrefix(), Collections.emptyList(), false, this.f8465a);
        if (StringUtils.isValidString(m7082a)) {
            File m7076a = this.f8192b.m7439aa() != null ? this.f8192b.m7439aa().m7076a(m7082a, m7698f()) : this.f8192b.m7438ab().m7097a(m7082a, m7698f());
            if (m7076a != null) {
                Uri fromFile = Uri.fromFile(m7076a);
                if (fromFile != null) {
                    return fromFile;
                }
                if (C3349v.m6862a()) {
                    str = "Unable to extract Uri from image file";
                    m7700d(str);
                }
            } else if (C3349v.m6862a()) {
                str = "Unable to retrieve File from cached image filename = " + m7082a;
                m7700d(str);
            }
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C3349v.m6862a()) {
            m7705a("Begin caching ad #" + this.f8466c.getAdIdNumber() + "...");
        }
        Uri m7367a = m7367a(this.f8466c.getIconUri());
        if (m7367a != null) {
            this.f8466c.setIconUri(m7367a);
        }
        Uri m7367a2 = m7367a(this.f8466c.getMainImageUri());
        if (m7367a2 != null) {
            this.f8466c.setMainImageUri(m7367a2);
        }
        Uri m7367a3 = m7367a(this.f8466c.getPrivacyIconUri());
        if (m7367a3 != null) {
            this.f8466c.setPrivacyIconUri(m7367a3);
        }
        if (C3349v.m6862a()) {
            m7705a("Finished caching ad #" + this.f8466c.getAdIdNumber());
        }
        this.f8467d.mo7360a(this.f8466c);
    }
}
