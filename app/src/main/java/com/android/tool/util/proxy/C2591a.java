package com.android.tool.util.proxy;

import android.util.Log;
import androidx.activity.result.C0063d;
import androidx.constraintlayout.core.C0499a;
import com.android.tool.util.util.C2603g;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.Vector;
import libv2ray.V2rayConfig;

/* renamed from: com.android.tool.util.proxy.a */
/* loaded from: classes.dex */
public final class C2591a extends Thread {

    /* renamed from: c */
    public static final Vector<C2592a> f6101c = new Vector<>();

    /* renamed from: d */
    public static long f6102d;

    /* renamed from: a */
    public ServerSocket f6103a;

    /* renamed from: b */
    public int f6104b = 5678;

    /* renamed from: com.android.tool.util.proxy.a$a */
    /* loaded from: classes.dex */
    public static class C2592a extends Thread {

        /* renamed from: a */
        public Socket f6105a;

        /* renamed from: b */
        public Socket f6106b;

        /* renamed from: c */
        public InputStream f6107c;

        /* renamed from: d */
        public InputStream f6108d;

        /* renamed from: e */
        public OutputStream f6109e;

        /* renamed from: f */
        public OutputStream f6110f;

        /* renamed from: g */
        public boolean f6111g = false;

        /* renamed from: h */
        public final boolean f6112h = false;

        /* renamed from: com.android.tool.util.proxy.a$a$a */
        /* loaded from: classes.dex */
        public class C2593a extends Thread {

            /* renamed from: a */
            public final InputStream f6113a;

            /* renamed from: b */
            public final OutputStream f6114b;

            /* renamed from: c */
            public final byte[] f6115c = new byte[4096];

            public C2593a(InputStream inputStream, OutputStream outputStream) {
                this.f6113a = inputStream;
                this.f6114b = outputStream;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                OutputStream outputStream = this.f6114b;
                byte[] bArr = this.f6115c;
                while (true) {
                    try {
                        int read = this.f6113a.read(bArr, 0, 4096);
                        if (read == -1) {
                            return;
                        }
                        if (read > 0) {
                            outputStream.write(bArr, 0, read);
                            outputStream.flush();
                        }
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
        }

        public C2592a(Socket socket) {
            this.f6105a = socket;
        }

        /* renamed from: b */
        public final synchronized void m9353b() {
            try {
                Socket socket = this.f6105a;
                if (socket != null && socket.isConnected()) {
                    this.f6105a.close();
                }
                this.f6105a = null;
            } catch (Exception unused) {
            }
            try {
                Socket socket2 = this.f6106b;
                if (socket2 != null && socket2.isConnected()) {
                    this.f6106b.close();
                }
                this.f6106b = null;
            } catch (Exception unused2) {
            }
            C2591a.f6101c.remove(this);
        }

        /* renamed from: c */
        public final void m9352c(String str, String str2) throws Exception {
            String[] split = str2.split(" ");
            if (split.length != 3) {
                m9349f(505, "Bad CONNECT syntax");
                return;
            }
            int indexOf = split[1].indexOf(58);
            if (indexOf != -1 && Integer.valueOf(split[1].substring(indexOf + 1)).intValue() != 443) {
                m9349f(505, "CONNECT is for port 443 only");
                return;
            }
            Socket socket = new Socket(str, (int) V2rayConfig.DEFAULT_PORT);
            this.f6106b = socket;
            this.f6108d = socket.getInputStream();
            this.f6110f = this.f6106b.getOutputStream();
            this.f6109e.write("HTTP/1.1 200 OK\r\n\r\n".getBytes());
            this.f6109e.flush();
            C2593a c2593a = new C2593a(this.f6108d, this.f6109e);
            C2593a c2593a2 = new C2593a(this.f6107c, this.f6110f);
            c2593a.start();
            c2593a2.start();
            c2593a.join();
            c2593a2.join();
            this.f6111g = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: Exception -> 0x00c6, UnknownHostException -> 0x00d9, IOException -> 0x00e0, TryCatch #2 {UnknownHostException -> 0x00d9, IOException -> 0x00e0, Exception -> 0x00c6, blocks: (B:17:0x0041, B:19:0x0058, B:27:0x0071, B:29:0x0079, B:30:0x008b, B:32:0x0093, B:34:0x0099, B:36:0x009f, B:38:0x00bf, B:39:0x00c2, B:20:0x005d, B:22:0x0063, B:23:0x0069), top: B:46:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[Catch: Exception -> 0x00c6, UnknownHostException -> 0x00d9, IOException -> 0x00e0, TryCatch #2 {UnknownHostException -> 0x00d9, IOException -> 0x00e0, Exception -> 0x00c6, blocks: (B:17:0x0041, B:19:0x0058, B:27:0x0071, B:29:0x0079, B:30:0x008b, B:32:0x0093, B:34:0x0099, B:36:0x009f, B:38:0x00bf, B:39:0x00c2, B:20:0x005d, B:22:0x0063, B:23:0x0069), top: B:46:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: Exception -> 0x00c6, UnknownHostException -> 0x00d9, IOException -> 0x00e0, TryCatch #2 {UnknownHostException -> 0x00d9, IOException -> 0x00e0, Exception -> 0x00c6, blocks: (B:17:0x0041, B:19:0x0058, B:27:0x0071, B:29:0x0079, B:30:0x008b, B:32:0x0093, B:34:0x0099, B:36:0x009f, B:38:0x00bf, B:39:0x00c2, B:20:0x005d, B:22:0x0063, B:23:0x0069), top: B:46:0x0041 }] */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m9351d(java.lang.String r15) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 225
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.tool.util.proxy.C2591a.C2592a.m9351d(java.lang.String):void");
        }

        /* renamed from: e */
        public final void m9350e() throws Exception {
            boolean z;
            int i;
            int i2;
            int i3 = -1;
            String str = "";
            String str2 = str;
            String str3 = str2;
            int i4 = -1;
            boolean z2 = true;
            while (true) {
                int read = this.f6108d.read();
                if (read != i3) {
                    StringBuilder m12383b = C0499a.m12383b(str);
                    m12383b.append((char) read);
                    str = m12383b.toString();
                    if (str.endsWith("\r\n")) {
                        if (str.regionMatches(true, 0, "Content-Length: ", 0, 16)) {
                            i4 = Integer.valueOf(str.substring(16, str.length() - 2)).intValue();
                        }
                        if (str.regionMatches(true, 0, "Connection: Close", 0, 17)) {
                            this.f6111g = true;
                        }
                        if (str.regionMatches(true, 0, "Transfer-Encoding:", 0, 18)) {
                            str3 = str.substring(18).trim().toLowerCase();
                        }
                        int i5 = 0;
                        if (z2) {
                            if (str.startsWith("HTTP/1.0")) {
                                this.f6111g = true;
                            }
                            Integer.valueOf(str.split(" ")[1]).intValue();
                            z2 = false;
                        }
                        str2 = C0063d.m13053a(str2, str);
                        if (str.length() != 2) {
                            str = "";
                            i3 = -1;
                        } else {
                            this.f6109e.write(str2.getBytes());
                            this.f6109e.flush();
                            if (i4 == 0) {
                                return;
                            }
                            int i6 = -1;
                            if (i4 == -1) {
                                if (str3.indexOf("chunked") != -1) {
                                    while (true) {
                                        String str4 = "";
                                        do {
                                            int read2 = this.f6108d.read();
                                            if (read2 != i6) {
                                                StringBuilder m12383b2 = C0499a.m12383b(str4);
                                                m12383b2.append((char) read2);
                                                str4 = m12383b2.toString();
                                            } else {
                                                throw new Exception("read error");
                                            }
                                        } while (!str4.endsWith("\r\n"));
                                        int indexOf = str4.indexOf(";");
                                        if (indexOf == i6) {
                                            indexOf = str4.length() - 2;
                                        }
                                        int intValue = Integer.valueOf(str4.substring(0, indexOf), 16).intValue();
                                        this.f6109e.write(str4.getBytes());
                                        if (intValue == 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        int i7 = intValue + 2;
                                        if (i7 > 4096) {
                                            i = 4096;
                                        } else {
                                            i = i7;
                                        }
                                        byte[] bArr = new byte[i];
                                        while (i7 != 0) {
                                            InputStream inputStream = this.f6108d;
                                            if (i7 <= 4096) {
                                                i2 = i7;
                                            } else {
                                                i2 = i;
                                            }
                                            int read3 = inputStream.read(bArr, 0, i2);
                                            if (read3 != -1) {
                                                if (read3 > 0) {
                                                    i7 -= read3;
                                                    this.f6109e.write(bArr, 0, read3);
                                                }
                                            } else {
                                                throw new Exception("read error");
                                            }
                                        }
                                        this.f6109e.flush();
                                        if (!z) {
                                            i6 = -1;
                                        } else {
                                            return;
                                        }
                                    }
                                } else {
                                    byte[] bArr2 = new byte[65536];
                                    while (true) {
                                        int read4 = this.f6108d.read(bArr2, 0, 65536);
                                        if (read4 != -1) {
                                            if (read4 > 0) {
                                                this.f6109e.write(bArr2, 0, read4);
                                                this.f6109e.flush();
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            } else {
                                byte[] bArr3 = new byte[i4];
                                while (i4 != 0) {
                                    int read5 = this.f6108d.read(bArr3, i5, i4);
                                    if (read5 == -1) {
                                        break;
                                    } else if (read5 > 0) {
                                        i4 -= read5;
                                        i5 += read5;
                                    }
                                }
                                this.f6109e.write(bArr3);
                                this.f6109e.flush();
                                return;
                            }
                        }
                    }
                } else {
                    throw new Exception("read error");
                }
            }
        }

        /* renamed from: f */
        public final void m9349f(int i, String str) throws Exception {
            String str2;
            this.f6109e.write(("HTTP/1.1 " + i + " " + str + "\r\nContent-Length: " + str2.length() + "\r\n\r\n").getBytes());
            this.f6109e.write(("<h1>Error : " + i + " : " + str + "</h1>").getBytes());
            this.f6109e.flush();
        }

        /* renamed from: g */
        public final void m9348g(String[] strArr) throws Exception {
            byte[] bArr;
            int i = 0;
            int i2 = -1;
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (strArr[i3].regionMatches(true, 0, "Content-Length: ", 0, 16)) {
                    String str = strArr[i3];
                    i2 = Integer.valueOf(str.substring(16, str.length())).intValue();
                }
            }
            if (i2 != -1) {
                InputStream inputStream = this.f6107c;
                Vector<C2592a> vector = C2591a.f6101c;
                try {
                    bArr = new byte[i2];
                } catch (Exception unused) {
                }
                while (i < i2) {
                    int read = inputStream.read(bArr, i, i2 - i);
                    if (read > 0) {
                        i += read;
                    } else {
                        bArr = null;
                        break;
                    }
                }
                this.f6110f.write(bArr);
                this.f6110f.flush();
                return;
            }
            throw new Exception("unknown post size");
        }

        /* renamed from: h */
        public final void m9347h(String[] strArr) throws Exception {
            String str = "";
            for (int i = 0; i < strArr.length; i++) {
                if (i == 0) {
                    String str2 = strArr[i];
                    String[] split = str2.split(" ");
                    if (split.length == 3) {
                        String str3 = split[1];
                        if (str3.startsWith("http:") || str3.startsWith("https:")) {
                            URL url = new URL(str3);
                            str2 = split[0] + " " + url.getFile() + " " + split[2];
                        }
                    }
                    strArr[i] = str2;
                }
                StringBuilder m12383b = C0499a.m12383b(str);
                m12383b.append(strArr[i]);
                str = C0063d.m13053a(m12383b.toString(), "\r\n");
            }
            this.f6110f.write(C0063d.m13053a(str, "\r\n").getBytes());
            this.f6110f.flush();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            int read;
            C2591a.f6101c.add(this);
            C2591a.f6102d = System.currentTimeMillis();
            this.f6105a.getPort();
            this.f6105a.getInetAddress().getHostAddress();
            try {
                this.f6107c = this.f6105a.getInputStream();
                this.f6109e = this.f6105a.getOutputStream();
                do {
                    String str = "";
                    do {
                        if (this.f6107c.read() != -1) {
                            str = str + ((char) read);
                        } else {
                            throw new Exception("read error");
                        }
                    } while (!str.endsWith("\r\n\r\n"));
                    C2591a.f6102d = System.currentTimeMillis();
                    m9351d(str);
                } while (!this.f6111g);
                this.f6105a.close();
            } catch (Exception unused) {
            }
            m9353b();
        }
    }

    public C2591a() {
        f6102d = System.currentTimeMillis();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f6104b = Integer.valueOf(C2603g.m9338b("ProxyPort")).intValue();
        Log.e("ProxyServer", "ProxyServer.run() port=" + this.f6104b);
        for (int i = 0; i < 5; i++) {
            try {
                this.f6103a = new ServerSocket(this.f6104b);
                break;
            } catch (Exception e) {
                Log.d("JFPS", "ProxyServer.run() bind Exception=" + e);
                if (i == 4) {
                    return;
                }
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused) {
                }
            }
        }
        Log.d("JFPS", "ProxyServer.run() main loop");
        while (!this.f6103a.isClosed()) {
            try {
                new C2592a(this.f6103a.accept()).start();
            } catch (Exception unused2) {
                return;
            }
        }
    }
}
