package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* renamed from: com.google.android.exoplayer2.upstream.d0 */
/* loaded from: classes.dex */
public final class C7356d0 extends AbstractC7358e {

    /* renamed from: e */
    public final int f13747e;

    /* renamed from: f */
    public final byte[] f13748f;

    /* renamed from: g */
    public final DatagramPacket f13749g;
    @Nullable

    /* renamed from: h */
    public Uri f13750h;
    @Nullable

    /* renamed from: i */
    public DatagramSocket f13751i;
    @Nullable

    /* renamed from: j */
    public MulticastSocket f13752j;
    @Nullable

    /* renamed from: k */
    public InetAddress f13753k;
    @Nullable

    /* renamed from: l */
    public InetSocketAddress f13754l;

    /* renamed from: m */
    public boolean f13755m;

    /* renamed from: n */
    public int f13756n;

    /* renamed from: com.google.android.exoplayer2.upstream.d0$a */
    /* loaded from: classes.dex */
    public static final class C7357a extends C7365j {
        public C7357a(Exception exc, int i) {
            super(exc, i);
        }
    }

    public C7356d0() {
        super(true);
        this.f13747e = 8000;
        byte[] bArr = new byte[AdError.SERVER_ERROR_CODE];
        this.f13748f = bArr;
        this.f13749g = new DatagramPacket(bArr, 0, (int) AdError.SERVER_ERROR_CODE);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    public final void close() {
        this.f13750h = null;
        MulticastSocket multicastSocket = this.f13752j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f13753k);
            } catch (IOException unused) {
            }
            this.f13752j = null;
        }
        DatagramSocket datagramSocket = this.f13751i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f13751i = null;
        }
        this.f13753k = null;
        this.f13754l = null;
        this.f13756n = 0;
        if (this.f13755m) {
            this.f13755m = false;
            m5174m();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: g */
    public final long mo5146g(DataSpec dataSpec) throws C7357a {
        DatagramSocket datagramSocket;
        Uri uri = dataSpec.f13712a;
        this.f13750h = uri;
        String host = uri.getHost();
        int port = this.f13750h.getPort();
        m5173n(dataSpec);
        try {
            this.f13753k = InetAddress.getByName(host);
            this.f13754l = new InetSocketAddress(this.f13753k, port);
            if (this.f13753k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f13754l);
                this.f13752j = multicastSocket;
                multicastSocket.joinGroup(this.f13753k);
                datagramSocket = this.f13752j;
            } else {
                datagramSocket = new DatagramSocket(this.f13754l);
            }
            this.f13751i = datagramSocket;
            datagramSocket.setSoTimeout(this.f13747e);
            this.f13755m = true;
            m5172o(dataSpec);
            return -1L;
        } catch (IOException e) {
            throw new C7357a(e, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e2) {
            throw new C7357a(e2, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    @Nullable
    /* renamed from: k */
    public final Uri mo5145k() {
        return this.f13750h;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7361g
    public final int read(byte[] bArr, int i, int i2) throws C7357a {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f13756n;
        DatagramPacket datagramPacket = this.f13749g;
        if (i3 == 0) {
            try {
                this.f13751i.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f13756n = length;
                m5175l(length);
            } catch (SocketTimeoutException e) {
                throw new C7357a(e, AdError.CACHE_ERROR_CODE);
            } catch (IOException e2) {
                throw new C7357a(e2, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.f13756n;
        int min = Math.min(i4, i2);
        System.arraycopy(this.f13748f, length2 - i4, bArr, i, min);
        this.f13756n -= min;
        return min;
    }
}
