package com.unity3d.services.core.request;

import com.unity3d.services.core.log.C9549a;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.unity3d.services.core.request.h */
/* loaded from: classes3.dex */
public class C9583h {

    /* renamed from: a */
    private URL f18968a;

    /* renamed from: b */
    private String f18969b;

    /* renamed from: c */
    private byte[] f18970c;

    /* renamed from: d */
    private Map<String, List<String>> f18971d;

    /* renamed from: e */
    private Map<String, List<String>> f18972e;

    /* renamed from: f */
    private int f18973f;

    /* renamed from: g */
    private long f18974g;

    /* renamed from: h */
    private boolean f18975h;

    /* renamed from: i */
    private ByteArrayOutputStream f18976i;

    /* renamed from: j */
    private int f18977j;

    /* renamed from: k */
    private int f18978k;

    /* renamed from: l */
    private InterfaceC9579d f18979l;

    /* renamed from: com.unity3d.services.core.request.h$a */
    /* loaded from: classes3.dex */
    public enum EnumC9584a {
        POST,
        GET,
        HEAD
    }

    public C9583h(String str, String str2) throws MalformedURLException {
        this(str, str2, null);
    }

    public C9583h(String str, String str2, Map<String, List<String>> map) throws MalformedURLException {
        this(str, str2, map, 30000, 30000);
    }

    public C9583h(String str, String str2, Map<String, List<String>> map, int i, int i2) throws MalformedURLException {
        this.f18973f = -1;
        this.f18974g = -1L;
        this.f18975h = false;
        this.f18968a = new URL(str);
        this.f18969b = str2;
        this.f18971d = map;
        this.f18977j = i;
        this.f18978k = i2;
    }

    /* renamed from: f */
    private HttpURLConnection m1893f() throws C9580e, IllegalArgumentException {
        HttpURLConnection httpURLConnection;
        if (m1887l().toString().startsWith("https://")) {
            try {
                httpURLConnection = (HttpsURLConnection) m1887l().openConnection();
            } catch (IOException e) {
                throw new C9580e("Open HTTPS connection: " + e.getMessage());
            }
        } else if (!m1887l().toString().startsWith("http://")) {
            throw new IllegalArgumentException("Invalid url-protocol in url: " + m1887l().toString());
        } else {
            try {
                httpURLConnection = (HttpURLConnection) m1887l().openConnection();
            } catch (IOException e2) {
                throw new C9580e("Open HTTP connection: " + e2.getMessage());
            }
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setConnectTimeout(m1896c());
        httpURLConnection.setReadTimeout(m1891h());
        try {
            httpURLConnection.setRequestMethod(m1890i());
            if (m1894e() != null && m1894e().size() > 0) {
                for (String str : m1894e().keySet()) {
                    for (String str2 : m1894e().get(str)) {
                        C9549a.m2019b("Setting header: " + str + "=" + str2);
                        httpURLConnection.setRequestProperty(str, str2);
                    }
                }
            }
            return httpURLConnection;
        } catch (ProtocolException e3) {
            throw new C9580e("Set Request Method: " + m1890i() + ", " + e3.getMessage());
        }
    }

    /* renamed from: a */
    public long m1900a(OutputStream outputStream) throws Exception {
        InputStream errorStream;
        HttpURLConnection m1893f = m1893f();
        m1893f.setDoInput(true);
        if (m1890i().equals(EnumC9584a.POST.name())) {
            m1893f.setDoOutput(true);
            OutputStream outputStream2 = null;
            try {
                try {
                    outputStream2 = m1893f.getOutputStream();
                    if (m1897b() == null) {
                        String m1892g = m1892g();
                        if (m1892g != null) {
                            outputStream2.write(m1892g.getBytes(StandardCharsets.UTF_8));
                        }
                    } else {
                        outputStream2.write(m1897b());
                    }
                    outputStream2.flush();
                    try {
                        outputStream2.close();
                    } catch (Exception e) {
                        C9549a.m2023a("Error closing writer", e);
                        throw e;
                    }
                } catch (IOException e2) {
                    C9549a.m2023a("Error while writing POST params", e2);
                    throw new C9580e("Error writing POST params: " + e2.getMessage());
                }
            } catch (Throwable th) {
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (Exception e3) {
                        C9549a.m2023a("Error closing writer", e3);
                        throw e3;
                    }
                }
                throw th;
            }
        }
        try {
            this.f18973f = m1893f.getResponseCode();
            long contentLength = m1893f.getContentLength();
            this.f18974g = contentLength;
            if (contentLength == -1) {
                this.f18974g = m1893f.getHeaderFieldInt("X-OrigLength", -1);
            }
            ByteArrayOutputStream byteArrayOutputStream = this.f18976i;
            long j = 0;
            ByteArrayOutputStream byteArrayOutputStream2 = outputStream;
            if (byteArrayOutputStream != null && byteArrayOutputStream == byteArrayOutputStream2 && this.f18974g > 0) {
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream((int) this.f18974g);
                this.f18976i = byteArrayOutputStream3;
                byteArrayOutputStream2 = byteArrayOutputStream3;
            }
            if (m1893f.getHeaderFields() != null) {
                this.f18972e = m1893f.getHeaderFields();
            }
            try {
                errorStream = m1893f.getInputStream();
            } catch (IOException e4) {
                errorStream = m1893f.getErrorStream();
                if (errorStream == null) {
                    throw new C9580e("Can't open error stream: " + e4.getMessage());
                }
            }
            InterfaceC9579d interfaceC9579d = this.f18979l;
            if (interfaceC9579d != null) {
                interfaceC9579d.mo1904a(m1887l().toString(), this.f18974g, this.f18973f, this.f18972e);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(errorStream);
            byte[] bArr = new byte[4096];
            int i = 0;
            while (!m1886m() && i != -1) {
                try {
                    i = bufferedInputStream.read(bArr);
                    if (i > 0) {
                        byteArrayOutputStream2.write(bArr, 0, i);
                        j += i;
                        InterfaceC9579d interfaceC9579d2 = this.f18979l;
                        if (interfaceC9579d2 != null) {
                            interfaceC9579d2.mo1903a(m1887l().toString(), j, this.f18974g);
                        }
                    }
                } catch (IOException e5) {
                    throw new C9580e("Network exception: " + e5.getMessage());
                } catch (Exception e6) {
                    throw new Exception("Unknown Exception: " + e6.getMessage());
                }
            }
            m1893f.disconnect();
            byteArrayOutputStream2.flush();
            return j;
        } catch (IOException | RuntimeException e7) {
            throw new C9580e("Response code: " + e7.getMessage());
        }
    }

    /* renamed from: a */
    public void m1902a() {
        this.f18975h = true;
    }

    /* renamed from: a */
    public void m1901a(InterfaceC9579d interfaceC9579d) {
        this.f18979l = interfaceC9579d;
    }

    /* renamed from: a */
    public void m1899a(String str) {
        this.f18970c = str.getBytes(StandardCharsets.UTF_8);
    }

    /* renamed from: a */
    public void m1898a(byte[] bArr) {
        this.f18970c = bArr;
    }

    /* renamed from: b */
    public byte[] m1897b() {
        return this.f18970c;
    }

    /* renamed from: c */
    public int m1896c() {
        return this.f18977j;
    }

    /* renamed from: d */
    public long m1895d() {
        return this.f18974g;
    }

    /* renamed from: e */
    public Map<String, List<String>> m1894e() {
        return this.f18971d;
    }

    /* renamed from: g */
    public String m1892g() {
        URL url = this.f18968a;
        if (url != null) {
            return url.getQuery();
        }
        return null;
    }

    /* renamed from: h */
    public int m1891h() {
        return this.f18978k;
    }

    /* renamed from: i */
    public String m1890i() {
        return this.f18969b;
    }

    /* renamed from: j */
    public int m1889j() {
        return this.f18973f;
    }

    /* renamed from: k */
    public Map<String, List<String>> m1888k() {
        return this.f18972e;
    }

    /* renamed from: l */
    public URL m1887l() {
        return this.f18968a;
    }

    /* renamed from: m */
    public boolean m1886m() {
        return this.f18975h;
    }

    /* renamed from: n */
    public String m1885n() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f18976i = byteArrayOutputStream;
        m1900a(byteArrayOutputStream);
        return this.f18976i.toString("UTF-8");
    }
}
