package com.adcolony.sdk;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: com.adcolony.sdk.s4 */
/* loaded from: classes.dex */
public final class RunnableC2288s4 implements Runnable {

    /* renamed from: a */
    public HttpURLConnection f5560a;

    /* renamed from: b */
    public InputStream f5561b;

    /* renamed from: c */
    public final C2100e2 f5562c;

    /* renamed from: d */
    public final InterfaceC2289a f5563d;

    /* renamed from: f */
    public String f5565f;

    /* renamed from: i */
    public Map<String, List<String>> f5568i;

    /* renamed from: n */
    public boolean f5573n;

    /* renamed from: o */
    public int f5574o;

    /* renamed from: p */
    public int f5575p;

    /* renamed from: e */
    public C2081d2 f5564e = null;

    /* renamed from: g */
    public int f5566g = 0;

    /* renamed from: h */
    public boolean f5567h = false;

    /* renamed from: j */
    public String f5569j = "";

    /* renamed from: k */
    public String f5570k = "";

    /* renamed from: l */
    public String f5571l = "";

    /* renamed from: m */
    public String f5572m = "";

    /* renamed from: com.adcolony.sdk.s4$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2289a {
        /* renamed from: a */
        void mo9434a(RunnableC2288s4 runnableC2288s4, C2100e2 c2100e2, Map<String, List<String>> map);
    }

    public RunnableC2288s4(C2100e2 c2100e2, InterfaceC2289a interfaceC2289a) {
        this.f5562c = c2100e2;
        this.f5563d = interfaceC2289a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0179  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m9503b() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.RunnableC2288s4.m9503b():boolean");
    }

    /* renamed from: c */
    public final void m9502c() throws Exception {
        OutputStream outputStream;
        InputStream errorStream;
        String byteArrayOutputStream;
        String str = this.f5562c.f5097a;
        if (this.f5561b != null) {
            if (this.f5569j.length() == 0) {
                outputStream = new ByteArrayOutputStream(4096);
            } else {
                outputStream = new FileOutputStream(new File(this.f5569j).getAbsolutePath());
            }
        } else if (str.equals("WebServices.download")) {
            this.f5561b = this.f5560a.getInputStream();
            outputStream = new FileOutputStream(this.f5570k);
        } else if (str.equals("WebServices.get")) {
            this.f5561b = this.f5560a.getInputStream();
            outputStream = new ByteArrayOutputStream(4096);
        } else if (str.equals("WebServices.post")) {
            this.f5560a.connect();
            if (this.f5560a.getResponseCode() >= 200 && this.f5560a.getResponseCode() <= 299) {
                errorStream = this.f5560a.getInputStream();
            } else {
                errorStream = this.f5560a.getErrorStream();
            }
            this.f5561b = errorStream;
            outputStream = new ByteArrayOutputStream(4096);
        } else {
            outputStream = null;
        }
        HttpURLConnection httpURLConnection = this.f5560a;
        if (httpURLConnection != null) {
            this.f5575p = httpURLConnection.getResponseCode();
            this.f5568i = this.f5560a.getHeaderFields();
        }
        InputStream inputStream = this.f5561b;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 4096);
                if (read != -1) {
                    int i = this.f5574o + read;
                    this.f5574o = i;
                    if (this.f5567h && i > this.f5566g) {
                        throw new Exception("Data exceeds expected maximum (" + this.f5574o + RemoteSettings.FORWARD_SLASH_STRING + this.f5566g + "): " + this.f5560a.getURL().toString());
                    }
                    outputStream.write(bArr, 0, read);
                } else {
                    String str2 = "UTF-8";
                    String str3 = this.f5565f;
                    if (str3 != null && !str3.isEmpty()) {
                        str2 = this.f5565f;
                    }
                    if (outputStream instanceof ByteArrayOutputStream) {
                        String headerField = this.f5560a.getHeaderField("Content-Type");
                        if (this.f5564e != null && headerField != null && headerField.contains("application/octet-stream") && ((ByteArrayOutputStream) outputStream).size() != 0) {
                            byteArrayOutputStream = this.f5564e.m9650c(((ByteArrayOutputStream) outputStream).toByteArray());
                        } else {
                            byteArrayOutputStream = ((ByteArrayOutputStream) outputStream).toString(str2);
                        }
                        this.f5572m = byteArrayOutputStream;
                    }
                    bufferedInputStream.close();
                    if (inputStream != null) {
                        return;
                    }
                    return;
                }
            }
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.RunnableC2288s4.run():void");
    }
}
