package com.facebook.ads.internal.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.p036X.C4778Ej;
import com.facebook.ads.redexgen.p036X.C4800F5;
import com.facebook.ads.redexgen.p036X.InterfaceC4799F4;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class DownloadAction {
    public static byte[] A05;
    public final int A00;
    public final Uri A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-55, -67, 14, 47, -32, 36, 37, 51, 37, 50, 41, 33, 44, 41, 58, 37, 50, -32, 38, 47, 53, 46, 36, -32, 38, 47, 50, -6};
    }

    public abstract InterfaceC4799F4 A07(C4800F5 c4800f5);

    public abstract void A08(DataOutputStream dataOutputStream) throws IOException;

    /* loaded from: assets/audience_network.dex */
    public static abstract class Deserializer {
        public final int A00;
        public final String A01;

        public abstract DownloadAction A01(int i, DataInputStream dataInputStream) throws IOException;

        public Deserializer(String str, int i) {
            this.A01 = str;
            this.A00 = i;
        }
    }

    public DownloadAction(String str, int i, Uri uri, boolean z, @Nullable byte[] bArr) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = uri;
        this.A03 = z;
        this.A04 = bArr == null ? new byte[0] : bArr;
    }

    public static DownloadAction A00(Deserializer[] deserializerArr, InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String readUTF = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        for (Deserializer deserializer : deserializerArr) {
            if (readUTF.equals(deserializer.A01) && deserializer.A00 >= readInt) {
                return deserializer.A01(readInt, dataInputStream);
            }
        }
        throw new C4778Ej(A01(2, 26, 85) + readUTF + A01(0, 2, 50) + readInt);
    }

    public static void A03(DownloadAction downloadAction, OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(downloadAction.A02);
        dataOutputStream.writeInt(downloadAction.A00);
        downloadAction.A08(dataOutputStream);
        dataOutputStream.flush();
    }

    public boolean A09(DownloadAction downloadAction) {
        return this.A01.equals(downloadAction.A01);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadAction that = (DownloadAction) obj;
        return this.A02.equals(that.A02) && this.A00 == that.A00 && this.A01.equals(that.A01) && this.A03 == that.A03 && Arrays.equals(this.A04, that.A04);
    }

    public int hashCode() {
        int result = Arrays.hashCode(this.A04);
        return (((this.A01.hashCode() * 31) + (this.A03 ? 1 : 0)) * 31) + result;
    }
}
