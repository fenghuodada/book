package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Uu */
/* loaded from: assets/audience_network.dex */
public final class C5766Uu implements InterfaceC4955He {
    public static byte[] A07;
    public static String[] A08 = {"bSKnstrcEyUtH2EUzSuh7p", "TJp7broMG9ALkddxCeG8bg", "OUGN6fd13DTUK57USEtQiA6N8BMR4vG7", "MPCQ8AeafYWdEx3u0S1dfC5VpPwXU5er", "I2tJ7ud2NszgocKkHkmClXbQ6vlHE0Sp", "WRhnMtRu3VoUyGpCORxDhLZcb6GbN7Pt", "ionJv1BxfCrQS8AxzLJ8Tcnsr6gm7Nx1", "YblFDiTYESfr8ZIRtB8BAyjauKLHc0qm"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    @Nullable
    public final InterfaceC4977I0<? super C5766Uu> A06;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{70, 113, 103, 123, 97, 102, 119, 113, 52, 125, 112, 113, 122, 96, 125, 114, 125, 113, 102, 52, 121, 97, 103, 96, 52, 118, 113, 52, 117, 122, 52, 125, 122, 96, 113, 115, 113, 102, 58, 7, 0, 27, 114, Utf8.REPLACEMENT_BYTE, 39, 33, 38, 114, 39, 33, 55, 114, 33, 49, 58, 55, Utf8.REPLACEMENT_BYTE, 55, 114, 32, 51, 37, 32, 55, 33, 61, 39, 32, 49, 55, 117, 102, 112, 117, 98, 116, 104, 114, 117, 100, 98};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.RawResourceDataSource> */
    public C5766Uu(Context context, @Nullable InterfaceC4977I0<? super C5766Uu> interfaceC4977I0) {
        this.A05 = context.getResources();
        this.A06 = interfaceC4977I0;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final Uri A7k() {
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
        if (r1 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
        if (r1 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
        r7.A00 = r8.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
        r2 = r7.A01.getLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
        if (r2 != (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
        r7.A00 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
        r4 = r2 - r8.A03;
     */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long ACw(com.facebook.ads.redexgen.p036X.C4959Hi r8) throws com.facebook.ads.redexgen.p036X.C4976Hz {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5766Uu.ACw(com.facebook.ads.redexgen.X.Hi):long");
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final void close() throws C4976Hz {
        this.A02 = null;
        try {
            try {
                if (this.A03 != null) {
                    this.A03.close();
                }
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                    } finally {
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            InterfaceC4977I0<? super C5766Uu> interfaceC4977I0 = this.A06;
                            if (interfaceC4977I0 != null) {
                                interfaceC4977I0.ACa(this);
                            }
                        }
                    }
                } catch (IOException e) {
                    throw new C4976Hz(e);
                }
            } catch (IOException e2) {
                throw new C4976Hz(e2);
            }
        } catch (Throwable th) {
            this.A03 = null;
            try {
                try {
                    if (this.A01 != null) {
                        this.A01.close();
                    }
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        InterfaceC4977I0<? super C5766Uu> interfaceC4977I02 = this.A06;
                        if (interfaceC4977I02 != null) {
                            interfaceC4977I02.ACa(this);
                        }
                    }
                    throw th;
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        InterfaceC4977I0<? super C5766Uu> interfaceC4977I03 = this.A06;
                        if (interfaceC4977I03 != null) {
                            interfaceC4977I03.ACa(this);
                        }
                    }
                }
            } catch (IOException e3) {
                throw new C4976Hz(e3);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final int read(byte[] bArr, int i, int i2) throws C4976Hz {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C4976Hz(e);
            }
        }
        int read = this.A03.read(bArr, i, i2);
        if (read == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new C4976Hz(new EOFException());
        }
        long j2 = this.A00;
        if (j2 != -1) {
            this.A00 = j2 - read;
        }
        InterfaceC4977I0<? super C5766Uu> interfaceC4977I0 = this.A06;
        if (interfaceC4977I0 != null) {
            interfaceC4977I0.AAG(this, read);
        }
        return read;
    }
}
