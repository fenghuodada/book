package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Eg */
/* loaded from: assets/audience_network.dex */
public final class C4777Eg {
    public static byte[] A02;
    public static String[] A03 = {"PP5DU49yUGbqRFal6tR", "e4", "s2qoG2vtUJJ5SExk2bCAu68n8G6q3yTT", "MeMR7L2JKLgMWPmkziO", "xwzH1HasKQzILES6mTt", "p6SQsg09HqPHNf1RzYLQg9nXgmiNy", "F9DvreFu89Z0Ps32kzSJSyvHkTkLNKEg", "2vix8bbWvPZkkjsVpCvfcLhNaaIRZhff"};
    public final C4999IM A00;
    public final File A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {7, 60, 33, 39, 34, 34, 61, 32, 38, 55, 54, 114, 51, 49, 38, 59, 61, 60, 114, 52, 59, 62, 55, 114, 36, 55, 32, 33, 59, 61, 60, 104, 114};
        String[] strArr = A03;
        if (strArr[4].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[2] = "YMHIgoMQBupXygUq8X9ePyvP7esYeyMN";
        strArr2[7] = "V8iBact6T2ktuOUxJFnyGTvZTdpLIqou";
        A02 = bArr;
    }

    static {
        A01();
    }

    public C4777Eg(File file) {
        this.A01 = file;
        this.A00 = new C4999IM(file);
    }

    public final void A02(DownloadAction... downloadActionArr) throws IOException {
        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(this.A00.A04());
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(downloadActionArr.length);
            for (DownloadAction action : downloadActionArr) {
                DownloadAction.A03(action, dataOutputStream);
            }
            this.A00.A06(dataOutputStream);
            C5038Iz.A0X(null);
        } catch (Throwable th) {
            C5038Iz.A0X(dataOutputStream);
            throw th;
        }
    }

    public final DownloadAction[] A03(DownloadAction.Deserializer... deserializerArr) throws IOException {
        if (!this.A01.exists()) {
            return new DownloadAction[0];
        }
        try {
            InputStream A032 = this.A00.A03();
            DataInputStream dataInputStream = new DataInputStream(A032);
            int readInt = dataInputStream.readInt();
            if (readInt <= 0) {
                int readInt2 = dataInputStream.readInt();
                DownloadAction[] downloadActionArr = new DownloadAction[readInt2];
                for (int i = 0; i < readInt2; i++) {
                    downloadActionArr[i] = DownloadAction.A00(deserializerArr, dataInputStream);
                }
                C5038Iz.A0X(A032);
                return downloadActionArr;
            }
            throw new IOException(A00(0, 33, 48) + readInt);
        } catch (Throwable th) {
            C5038Iz.A0X(null);
            throw th;
        }
    }
}
