package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.C0552c;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.C3475e;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.model.C3614g;
import com.bumptech.glide.util.C3850c;
import com.bumptech.glide.util.C3855f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.data.j */
/* loaded from: classes.dex */
public final class C3462j implements InterfaceC3452d<InputStream> {

    /* renamed from: a */
    public final C3614g f9207a;

    /* renamed from: b */
    public final int f9208b;

    /* renamed from: c */
    public HttpURLConnection f9209c;

    /* renamed from: d */
    public InputStream f9210d;

    /* renamed from: e */
    public volatile boolean f9211e;

    /* renamed from: com.bumptech.glide.load.data.j$a */
    /* loaded from: classes.dex */
    public static class C3463a {
    }

    static {
        new C3463a();
    }

    public C3462j(C3614g c3614g, int i) {
        this.f9207a = c3614g;
        this.f9208b = i;
    }

    /* renamed from: c */
    public static int m6723c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e);
                return -1;
            }
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    @NonNull
    /* renamed from: a */
    public final Class<InputStream> mo6579a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    /* renamed from: b */
    public final void mo6578b() {
        InputStream inputStream = this.f9210d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f9209c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f9209c = null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    public final void cancel() {
        this.f9211e = true;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    @NonNull
    /* renamed from: d */
    public final EnumC3444a mo6577d() {
        return EnumC3444a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    /* renamed from: e */
    public final void mo6576e(@NonNull EnumC3432i enumC3432i, @NonNull InterfaceC3452d.InterfaceC3453a<? super InputStream> interfaceC3453a) {
        StringBuilder sb;
        C3614g c3614g = this.f9207a;
        int i = C3855f.f9946b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                interfaceC3453a.mo6589f(m6722f(c3614g.m6597d(), 0, null, c3614g.f9542b.mo6596a()));
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                interfaceC3453a.mo6590c(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb = new StringBuilder("Finished http url fetcher fetch in ");
                } else {
                    return;
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(C3855f.m6413a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C3855f.m6413a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }

    /* renamed from: f */
    public final InputStream m6722f(URL url, int i, URL url2, Map<String, String> map) throws C3475e {
        boolean z;
        InputStream inputStream;
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new C3475e(-1, "In re-direct loop", null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z2 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                int i2 = this.f9208b;
                httpURLConnection.setConnectTimeout(i2);
                httpURLConnection.setReadTimeout(i2);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f9209c = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f9210d = this.f9209c.getInputStream();
                    if (this.f9211e) {
                        return null;
                    }
                    int m6723c = m6723c(this.f9209c);
                    int i3 = m6723c / 100;
                    if (i3 == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        HttpURLConnection httpURLConnection2 = this.f9209c;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                inputStream = new C3850c(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                inputStream = httpURLConnection2.getInputStream();
                            }
                            this.f9210d = inputStream;
                            return inputStream;
                        } catch (IOException e) {
                            throw new C3475e(m6723c(httpURLConnection2), "Failed to obtain InputStream", e);
                        }
                    }
                    if (i3 == 3) {
                        z2 = true;
                    }
                    if (z2) {
                        String headerField = this.f9209c.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                mo6578b();
                                return m6722f(url3, i + 1, url, map);
                            } catch (MalformedURLException e2) {
                                throw new C3475e(m6723c, C0552c.m12192b("Bad redirect url: ", headerField), e2);
                            }
                        }
                        throw new C3475e(m6723c, "Received empty or null redirect url", null);
                    } else if (m6723c == -1) {
                        throw new C3475e(m6723c, "Http request failed", null);
                    } else {
                        try {
                            throw new C3475e(m6723c, this.f9209c.getResponseMessage(), null);
                        } catch (IOException e3) {
                            throw new C3475e(m6723c, "Failed to get a response message", e3);
                        }
                    }
                } catch (IOException e4) {
                    throw new C3475e(m6723c(this.f9209c), "Failed to connect or obtain data", e4);
                }
            } catch (IOException e5) {
                throw new C3475e(0, "URL.openConnection threw", e5);
            }
        }
        throw new C3475e(-1, "Too many (> 5) redirects!", null);
    }
}
