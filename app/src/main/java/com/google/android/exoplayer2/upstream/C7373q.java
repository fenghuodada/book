package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0486c;
import androidx.constraintlayout.core.C0510h;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7421n;
import com.google.common.base.InterfaceC7939h;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import libv2ray.V2rayConfig;

/* renamed from: com.google.android.exoplayer2.upstream.q */
/* loaded from: classes.dex */
public final class C7373q extends AbstractC7358e {

    /* renamed from: e */
    public final boolean f13825e;

    /* renamed from: f */
    public final int f13826f;

    /* renamed from: g */
    public final int f13827g;
    @Nullable

    /* renamed from: h */
    public final String f13828h;
    @Nullable

    /* renamed from: i */
    public final C7383x f13829i;

    /* renamed from: j */
    public final C7383x f13830j;

    /* renamed from: k */
    public final boolean f13831k;
    @Nullable

    /* renamed from: l */
    public final InterfaceC7939h<String> f13832l;
    @Nullable

    /* renamed from: m */
    public HttpURLConnection f13833m;
    @Nullable

    /* renamed from: n */
    public InputStream f13834n;

    /* renamed from: o */
    public boolean f13835o;

    /* renamed from: p */
    public int f13836p;

    /* renamed from: q */
    public long f13837q;

    /* renamed from: r */
    public long f13838r;

    /* renamed from: com.google.android.exoplayer2.upstream.q$a */
    /* loaded from: classes.dex */
    public static final class C7374a implements InterfaceC7380u {
        @Nullable

        /* renamed from: b */
        public String f13840b;

        /* renamed from: a */
        public final C7383x f13839a = new C7383x();

        /* renamed from: c */
        public final int f13841c = 8000;

        /* renamed from: d */
        public final int f13842d = 8000;

        @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i.InterfaceC7364a
        /* renamed from: a */
        public final InterfaceC7363i mo5147a() {
            return new C7373q(this.f13840b, this.f13841c, this.f13842d, this.f13839a);
        }
    }

    public C7373q(String str, int i, int i2, C7383x c7383x) {
        super(true);
        this.f13828h = str;
        this.f13826f = i;
        this.f13827g = i2;
        this.f13825e = false;
        this.f13829i = c7383x;
        this.f13832l = null;
        this.f13830j = new C7383x();
        this.f13831k = false;
    }

    /* renamed from: t */
    public static void m5149t(@Nullable HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = C7408g0.f13905a) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    public final void close() throws HttpDataSource$HttpDataSourceException {
        try {
            InputStream inputStream = this.f13834n;
            if (inputStream != null) {
                long j = this.f13837q;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f13838r;
                }
                m5149t(this.f13833m, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = C7408g0.f13905a;
                    throw new HttpDataSource$HttpDataSourceException(e, (int) AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.f13834n = null;
            m5153p();
            if (this.f13835o) {
                this.f13835o = false;
                m5174m();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b3  */
    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo5146g(com.google.android.exoplayer2.upstream.DataSpec r19) throws com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.C7373q.mo5146g(com.google.android.exoplayer2.upstream.DataSpec):long");
    }

    @Override // com.google.android.exoplayer2.upstream.AbstractC7358e, com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: h */
    public final Map<String, List<String>> mo5154h() {
        HttpURLConnection httpURLConnection = this.f13833m;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    @Nullable
    /* renamed from: k */
    public final Uri mo5145k() {
        HttpURLConnection httpURLConnection = this.f13833m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: p */
    public final void m5153p() {
        HttpURLConnection httpURLConnection = this.f13833m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C7421n.m5056b("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f13833m = null;
        }
    }

    /* renamed from: q */
    public final URL m5152q(URL url, @Nullable String str) throws HttpDataSource$HttpDataSourceException {
        String str2;
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !V2rayConfig.HTTP.equals(protocol)) {
                    String valueOf = String.valueOf(protocol);
                    if (valueOf.length() != 0) {
                        str2 = "Unsupported protocol redirect: ".concat(valueOf);
                    } else {
                        str2 = new String("Unsupported protocol redirect: ");
                    }
                    throw new HttpDataSource$HttpDataSourceException(str2, AdError.INTERNAL_ERROR_CODE);
                } else if (!this.f13825e && !protocol.equals(url.getProtocol())) {
                    String protocol2 = url.getProtocol();
                    StringBuilder m9043a = C2745h.m9043a(protocol.length() + C0552c.m12193a(protocol2, 41), "Disallowed cross-protocol redirect (", protocol2, " to ", protocol);
                    m9043a.append(")");
                    throw new HttpDataSource$HttpDataSourceException(m9043a.toString(), AdError.INTERNAL_ERROR_CODE);
                } else {
                    return url2;
                }
            } catch (MalformedURLException e) {
                throw new HttpDataSource$HttpDataSourceException(e, (int) AdError.INTERNAL_ERROR_CODE, 1);
            }
        }
        throw new HttpDataSource$HttpDataSourceException("Null location redirect", AdError.INTERNAL_ERROR_CODE);
    }

    /* renamed from: r */
    public final HttpURLConnection m5151r(DataSpec dataSpec) throws IOException {
        boolean z;
        HttpURLConnection m5150s;
        boolean z2;
        DataSpec dataSpec2 = dataSpec;
        URL url = new URL(dataSpec2.f13712a.toString());
        int i = dataSpec2.f13714c;
        byte[] bArr = dataSpec2.f13715d;
        long j = dataSpec2.f13717f;
        long j2 = dataSpec2.f13718g;
        if ((dataSpec2.f13720i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = this.f13825e;
        boolean z4 = this.f13831k;
        if (!z3 && !z4) {
            return m5150s(url, i, bArr, j, j2, z, true, dataSpec2.f13716e);
        }
        URL url2 = url;
        int i2 = i;
        byte[] bArr2 = bArr;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                Map<String, String> map = dataSpec2.f13716e;
                URL url3 = url2;
                int i5 = i2;
                boolean z5 = z4;
                long j3 = j2;
                m5150s = m5150s(url2, i2, bArr2, j, j2, z, false, map);
                int responseCode = m5150s.getResponseCode();
                String headerField = m5150s.getHeaderField("Location");
                if ((i5 != 1 && i5 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    m5150s.disconnect();
                    if (z5 && responseCode == 302) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        bArr2 = null;
                        i2 = 1;
                    } else {
                        i2 = i5;
                    }
                    url2 = m5152q(url3, headerField);
                } else {
                    m5150s.disconnect();
                    url2 = m5152q(url3, headerField);
                    i2 = i5;
                }
                dataSpec2 = dataSpec;
                i3 = i4;
                z4 = z5;
                j2 = j3;
            } else {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException(C0510h.m12340a(31, "Too many redirects: ", i4)), (int) AdError.INTERNAL_ERROR_CODE, 1);
            }
        }
        return m5150s;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7361g
    public final int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f13837q;
            if (j != -1) {
                long j2 = j - this.f13838r;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.f13834n;
            int i3 = C7408g0.f13905a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.f13838r += read;
                m5175l(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            int i4 = C7408g0.f13905a;
            throw HttpDataSource$HttpDataSourceException.m5177a(e, 2);
        }
    }

    /* renamed from: s */
    public final HttpURLConnection m5150s(URL url, int i, @Nullable byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        Map<String, String> map2;
        String sb;
        String str;
        boolean z3;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f13826f);
        httpURLConnection.setReadTimeout(this.f13827g);
        HashMap hashMap = new HashMap();
        C7383x c7383x = this.f13829i;
        if (c7383x != null) {
            hashMap.putAll(c7383x.m5142a());
        }
        C7383x c7383x2 = this.f13830j;
        synchronized (c7383x2) {
            if (c7383x2.f13850b == null) {
                c7383x2.f13850b = Collections.unmodifiableMap(new HashMap(c7383x2.f13849a));
            }
            map2 = c7383x2.f13850b;
        }
        hashMap.putAll(map2);
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = C7384y.f13851a;
        if (j == 0 && j2 == -1) {
            sb = null;
        } else {
            StringBuilder m12390a = C0486c.m12390a("bytes=", j, "-");
            if (j2 != -1) {
                m12390a.append((j + j2) - 1);
            }
            sb = m12390a.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        String str3 = this.f13828h;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        if (z) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z2);
        if (bArr != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        httpURLConnection.setDoOutput(z3);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str2 = "POST";
            }
        } else {
            str2 = "GET";
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* renamed from: u */
    public final void m5148u(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            InputStream inputStream = this.f13834n;
            int i = C7408g0.f13905a;
            int read = inputStream.read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), (int) AdError.SERVER_ERROR_CODE, 1);
            }
            if (read == -1) {
                throw new HttpDataSource$HttpDataSourceException();
            }
            j -= read;
            m5175l(read);
        }
    }
}
