package com.applovin.impl.sdk.p033e;

import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.C0063d;
import com.applovin.impl.mediation.C3025h;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3277q;
import com.applovin.impl.sdk.C3278r;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3240b;
import com.applovin.impl.sdk.network.C3245c;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3123d;
import com.applovin.impl.sdk.p032d.C3124e;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.applovin.impl.sdk.e.c */
/* loaded from: classes.dex */
public abstract class AbstractC3138c extends AbstractRunnableC3131a implements C3025h.InterfaceC3026a {

    /* renamed from: a */
    protected final AbstractC3080e f8200a;

    /* renamed from: c */
    private AppLovinAdLoadListener f8201c;

    /* renamed from: d */
    private final C3277q f8202d;

    /* renamed from: e */
    private final C3278r f8203e;

    /* renamed from: f */
    private final Collection<Character> f8204f;

    /* renamed from: g */
    private final C3124e f8205g;

    /* renamed from: h */
    private boolean f8206h;

    public AbstractC3138c(String str, AbstractC3080e abstractC3080e, C3214m c3214m, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, c3214m);
        if (abstractC3080e == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f8200a = abstractC3080e;
        this.f8201c = appLovinAdLoadListener;
        this.f8202d = c3214m.m7438ab();
        this.f8203e = c3214m.m7439aa();
        this.f8204f = m7663j();
        this.f8205g = new C3124e();
    }

    /* renamed from: a */
    private Uri m7681a(Uri uri, String str) {
        StringBuilder sb;
        String str2;
        if (uri != null) {
            String uri2 = uri.toString();
            if (StringUtils.isValidString(uri2)) {
                if (C3349v.m6862a()) {
                    m7705a("Caching " + str + " image...");
                }
                return m7664g(uri2);
            } else if (!C3349v.m6862a()) {
                return null;
            } else {
                sb = new StringBuilder("Failed to cache ");
                sb.append(str);
                str2 = " image";
            }
        } else if (!C3349v.m6862a()) {
            return null;
        } else {
            sb = new StringBuilder("No ");
            sb.append(str);
            str2 = " image to cache";
        }
        sb.append(str2);
        m7705a(sb.toString());
        return null;
    }

    /* renamed from: a */
    private Uri m7677a(String str, String str2) {
        StringBuilder sb;
        if (this.f8203e != null) {
            return m7672b(str, str2);
        }
        String replace = str2.replace(RemoteSettings.FORWARD_SLASH_STRING, "_");
        String m7963L = this.f8200a.m7963L();
        if (StringUtils.isValidString(m7963L)) {
            replace = C0063d.m13053a(m7963L, replace);
        }
        File m7097a = this.f8202d.m7097a(replace, this.f8192b.m7476L());
        if (m7097a == null) {
            return null;
        }
        if (m7097a.exists()) {
            this.f8205g.m7731b(m7097a.length());
            sb = new StringBuilder("file://");
        } else if (!this.f8202d.m7100a(m7097a, C0063d.m13053a(str, str2), Arrays.asList(str), this.f8205g)) {
            return null;
        } else {
            sb = new StringBuilder("file://");
        }
        sb.append(m7097a.getAbsolutePath());
        return Uri.parse(sb.toString());
    }

    /* renamed from: b */
    private Uri m7672b(String str, String str2) {
        StringBuilder sb;
        String replace = str2.replace(RemoteSettings.FORWARD_SLASH_STRING, "_");
        String m7963L = this.f8200a.m7963L();
        if (StringUtils.isValidString(m7963L)) {
            replace = C0063d.m13053a(m7963L, replace);
        }
        File m7076a = this.f8203e.m7076a(replace, this.f8192b.m7476L());
        if (m7076a == null) {
            return null;
        }
        if (m7076a.exists()) {
            this.f8205g.m7731b(m7076a.length());
            sb = new StringBuilder("file://");
        } else if (!this.f8203e.m7078a(m7076a, C0063d.m13053a(str, str2), Arrays.asList(str), this.f8205g)) {
            return null;
        } else {
            sb = new StringBuilder("file://");
        }
        sb.append(m7076a.getAbsolutePath());
        return Uri.parse(sb.toString());
    }

    /* renamed from: g */
    private Uri m7664g(String str) {
        return m7668c(str, this.f8200a.m7967H(), true);
    }

    /* renamed from: j */
    private Collection<Character> m7663j() {
        HashSet hashSet = new HashSet();
        for (char c : ((String) this.f8192b.m7456a(C3109b.f7887bm)).toCharArray()) {
            hashSet.add(Character.valueOf(c));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* renamed from: a */
    public Uri m7674a(String str, List<String> list, boolean z) {
        String str2;
        if (this.f8203e != null) {
            return m7670b(str, list, z);
        }
        if (StringUtils.isValidString(str)) {
            if (C3349v.m6862a()) {
                m7705a("Caching video " + str + "...");
            }
            String m7103a = this.f8202d.m7103a(m7698f(), str, this.f8200a.m7963L(), list, z, this.f8205g);
            if (!StringUtils.isValidString(m7103a)) {
                if (C3349v.m6862a()) {
                    m7700d("Failed to cache video");
                }
                mo7656h();
                return null;
            }
            File m7097a = this.f8202d.m7097a(m7103a, m7698f());
            if (m7097a != null) {
                Uri fromFile = Uri.fromFile(m7097a);
                if (fromFile != null) {
                    if (C3349v.m6862a()) {
                        m7705a("Finish caching video for ad #" + this.f8200a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + m7103a);
                    }
                    return fromFile;
                } else if (!C3349v.m6862a()) {
                    return null;
                } else {
                    str2 = "Unable to create URI from cached video file = " + m7097a;
                }
            } else if (!C3349v.m6862a()) {
                return null;
            } else {
                str2 = "Unable to cache video = " + str + "Video file was missing or null";
            }
            m7700d(str2);
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public String m7676a(String str, List<String> list) {
        InputStream inputStream;
        if (this.f8203e != null) {
            return m7671b(str, list);
        }
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                if (C3349v.m6862a()) {
                    m7705a("Nothing to cache, skipping...");
                }
                return null;
            }
            String fileName = ((Boolean) this.f8192b.m7456a(C3109b.f8024eT)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
            if (StringUtils.isValidString(this.f8200a.m7963L())) {
                fileName = this.f8200a.m7963L() + fileName;
            }
            try {
                File m7097a = this.f8202d.m7097a(fileName, m7698f());
                if (m7097a != null && m7097a.exists()) {
                    return this.f8202d.m7101a(m7097a);
                }
                try {
                    inputStream = this.f8202d.m7096a(str, list, true, this.f8205g);
                    if (inputStream != null) {
                        try {
                            this.f8202d.m7091b(inputStream, m7097a);
                        } catch (Throwable th) {
                            th = th;
                            Utils.close(inputStream, this.f8192b);
                            throw th;
                        }
                    }
                    Utils.close(inputStream, this.f8192b);
                    return this.f8202d.m7101a(m7097a);
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                }
            } catch (Throwable th3) {
                if (C3349v.m6862a()) {
                    m7704a("Resource at " + str + " failed to load.", th3);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0038, code lost:
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m7675a(java.lang.String r11, java.util.List<java.lang.String> r12, com.applovin.impl.sdk.p029ad.AbstractC3080e r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p033e.AbstractC3138c.m7675a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.e):java.lang.String");
    }

    /* renamed from: a */
    public void m7682a() {
        this.f8192b.m7480H().m8112b(this);
    }

    @Override // com.applovin.impl.mediation.C3025h.InterfaceC3026a
    /* renamed from: a */
    public void mo7604a(AbstractC2823a abstractC2823a) {
        if (abstractC2823a.m8798f().equalsIgnoreCase(this.f8200a.m7961N())) {
            if (C3349v.m6862a()) {
                m7700d("Updating flag for timeout...");
            }
            this.f8206h = true;
        }
        this.f8192b.m7480H().m8112b(this);
    }

    /* renamed from: a */
    public void m7680a(AppLovinAdBase appLovinAdBase) {
        C3123d.m7746a(this.f8205g, appLovinAdBase, this.f8192b);
    }

    /* renamed from: b */
    public Uri m7670b(String str, List<String> list, boolean z) {
        String str2;
        if (StringUtils.isValidString(str)) {
            m7705a("Caching video " + str + "...");
            String m7082a = this.f8203e.m7082a(m7698f(), str, this.f8200a.m7963L(), list, z, this.f8205g);
            if (!StringUtils.isValidString(m7082a)) {
                m7700d("Failed to cache video");
                mo7656h();
                Bundle bundle = new Bundle();
                bundle.putLong("ad_id", this.f8200a.getAdIdNumber());
                bundle.putInt("load_response_code", this.f8205g.m7723j());
                Exception m7724i = this.f8205g.m7724i();
                if (m7724i != null) {
                    bundle.putString("load_exception_message", m7724i.getMessage());
                }
                this.f8192b.m7433ag().m7535a(bundle, "video_caching_failed");
                return null;
            }
            File m7076a = this.f8203e.m7076a(m7082a, m7698f());
            if (m7076a != null) {
                Uri fromFile = Uri.fromFile(m7076a);
                if (fromFile != null) {
                    m7705a("Finish caching video for ad #" + this.f8200a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + m7082a);
                    return fromFile;
                }
                str2 = "Unable to create URI from cached video file = " + m7076a;
            } else {
                str2 = "Unable to cache video = " + str + "Video file was missing or null";
            }
            m7700d(str2);
            return null;
        }
        return null;
    }

    /* renamed from: b */
    public String m7671b(String str, List<String> list) {
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                m7705a("Nothing to cache, skipping...");
                return null;
            }
            String fileName = ((Boolean) this.f8192b.m7456a(C3109b.f8024eT)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
            if (StringUtils.isValidString(this.f8200a.m7963L())) {
                fileName = this.f8200a.m7963L() + fileName;
            }
            File m7076a = this.f8203e.m7076a(fileName, m7698f());
            ByteArrayOutputStream m7079a = (m7076a == null || !m7076a.exists()) ? null : this.f8203e.m7079a(m7076a);
            if (m7079a == null) {
                m7079a = this.f8203e.m7075a(str, list, true, this.f8205g);
                if (m7079a != null) {
                    this.f8203e.m7080a(m7079a, m7076a);
                    this.f8205g.m7734a(m7079a.size());
                }
            } else {
                this.f8205g.m7731b(m7079a.size());
            }
            try {
                return m7079a.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                m7704a("UTF-8 encoding not supported.", e);
            } catch (Throwable th) {
                m7704a("String resource at " + str + " failed to load.", th);
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean m7673b() {
        return this.f8206h;
    }

    /* renamed from: c */
    public Uri m7668c(String str, List<String> list, boolean z) {
        String str2;
        if (this.f8203e != null) {
            return m7667d(str, list, z);
        }
        try {
            String m7103a = this.f8202d.m7103a(m7698f(), str, this.f8200a.m7963L(), list, z, this.f8205g);
            if (StringUtils.isValidString(m7103a)) {
                File m7097a = this.f8202d.m7097a(m7103a, m7698f());
                if (m7097a != null) {
                    Uri fromFile = Uri.fromFile(m7097a);
                    if (fromFile != null) {
                        return fromFile;
                    }
                    if (!C3349v.m6862a()) {
                        return null;
                    }
                    str2 = "Unable to extract Uri from image file";
                } else if (!C3349v.m6862a()) {
                    return null;
                } else {
                    str2 = "Unable to retrieve File from cached image filename = " + m7103a;
                }
                m7700d(str2);
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                m7704a("Failed to cache image at url = " + str, th);
                return null;
            }
            return null;
        }
    }

    /* renamed from: c */
    public void m7669c() {
        if (C3349v.m6862a()) {
            m7705a("Caching mute images...");
        }
        Uri m7681a = m7681a(this.f8200a.m7939aC(), "mute");
        if (m7681a != null) {
            this.f8200a.m7896c(m7681a);
        }
        Uri m7681a2 = m7681a(this.f8200a.m7938aD(), "unmute");
        if (m7681a2 != null) {
            this.f8200a.m7893d(m7681a2);
        }
        if (C3349v.m6862a()) {
            m7705a("Ad updated with muteImageFilename = " + this.f8200a.m7939aC() + ", unmuteImageFilename = " + this.f8200a.m7938aD());
        }
    }

    /* renamed from: d */
    public Uri m7667d(String str, List<String> list, boolean z) {
        String str2;
        try {
            String m7082a = this.f8203e.m7082a(m7698f(), str, this.f8200a.m7963L(), list, z, this.f8205g);
            if (StringUtils.isValidString(m7082a)) {
                File m7076a = this.f8203e.m7076a(m7082a, m7698f());
                if (m7076a != null) {
                    Uri fromFile = Uri.fromFile(m7076a);
                    if (fromFile != null) {
                        return fromFile;
                    }
                    str2 = "Unable to extract Uri from image file";
                } else {
                    str2 = "Unable to retrieve File from cached image filename = " + m7082a;
                }
                m7700d(str2);
                return null;
            }
            return null;
        } catch (Throwable th) {
            m7704a("Failed to cache image at url = " + str, th);
            return null;
        }
    }

    /* renamed from: e */
    public Uri m7666e(String str) {
        return m7674a(str, this.f8200a.m7967H(), true);
    }

    /* renamed from: f */
    public String m7665f(final String str) {
        if (StringUtils.isValidString(str)) {
            C3245c mo7190a = C3245c.m7323a(this.f8192b).mo7186a(str).mo7179b("GET").mo7187a((C3245c.C3246a) "").mo7189a(0).mo7190a();
            final AtomicReference atomicReference = new AtomicReference(null);
            this.f8192b.m7470R().m7341a(mo7190a, new C3240b.C3242a(), new C3240b.InterfaceC3244c<String>() { // from class: com.applovin.impl.sdk.e.c.1
                @Override // com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
                /* renamed from: a */
                public void mo7327a(int i, String str2, String str3) {
                    AbstractC3138c abstractC3138c = AbstractC3138c.this;
                    abstractC3138c.m7700d("Failed to load resource from '" + str + "'");
                }

                @Override // com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
                /* renamed from: a */
                public void mo7326a(String str2, int i) {
                    atomicReference.set(str2);
                }
            });
            String str2 = (String) atomicReference.get();
            if (str2 != null) {
                this.f8205g.m7734a(str2.length());
            }
            return str2;
        }
        return null;
    }

    /* renamed from: h */
    public void mo7656h() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8201c;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            this.f8201c = null;
        }
    }

    /* renamed from: i */
    public void mo7655i() {
        if (C3349v.m6862a()) {
            m7705a("Rendered new ad:" + this.f8200a);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e.c.2
            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC3138c.this.f8201c != null) {
                    AbstractC3138c.this.f8201c.adReceived(AbstractC3138c.this.f8200a);
                    AbstractC3138c.this.f8201c = null;
                }
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f8200a.m7962M()) {
            if (C3349v.m6862a()) {
                m7705a("Subscribing to timeout events...");
            }
            this.f8192b.m7480H().m8113a(this);
        }
    }
}
