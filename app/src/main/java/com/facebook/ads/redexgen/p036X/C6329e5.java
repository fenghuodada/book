package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.e5 */
/* loaded from: assets/audience_network.dex */
public final class C6329e5 implements InterfaceC390903<Bitmap> {
    public static byte[] A06;
    public static String[] A07 = {"O8BWLXPdzHA", "6sEzkrKiC7tSlAyzako7Jr1QeLTjq7r7", "buIAODYM5Oo034kKCIV4I7ZzRqvLqiIh", "ENOGp8Grp5cb6hByXNSQMpF2JyONyocp", "tnh", "2Zn0DxkDz4CuR43sN", "3j1ga9q4MlHQ2cRzMN", "NuleDR7CXAFlpWhCDunnHJWIhrQ2pSEs"};
    public final int A00;
    public final int A01;
    public final String A02 = C6329e5.class.getSimpleName();
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
            if (A07[7].charAt(0) == 'p') {
                throw new RuntimeException();
            }
            A07[6] = "rTtdlTA5qc3UePbll3p";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A07[4].length() != 3) {
            throw new RuntimeException();
        }
        A07[6] = "j2OKbozXXbIBudrsn6AX9zPsXXh";
        A06 = new byte[]{1, 91, 66, 95, 7, 44, 49, 40, 36, 53, 101, 44, 54, 101, 43, 48, 41, 41, 124, 65, 90, 92, 73, 77, 80, 86, 87, 25, 93, 76, 75, 80, 87, 94, 25, 95, 80, 85, 92, 25, 90, 86, 84, 73, 75, 92, 74, 74, 80, 86, 87};
    }

    static {
        A02();
    }

    public C6329e5(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = z3;
    }

    public static C390802<Bitmap> A00(Throwable th) {
        return new C390802<>(false, null, th);
    }

    private void A03(File file, @Nullable Bitmap bitmap) throws IOException {
        if (bitmap == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= 3145728) {
                return;
            }
            String str = file.getCanonicalPath() + A01(0, 4, 39);
            File file2 = new File(str);
            file2.createNewFile();
            fileOutputStream = new FileOutputStream(str);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            fileInputStream = new FileInputStream(str);
            fileOutputStream2 = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream2.write(bArr, 0, read);
                } else {
                    file2.delete();
                    return;
                }
            }
        } finally {
            C39280M.A07(byteArrayOutputStream);
            C39280M.A07(fileOutputStream);
            C39280M.A07(fileInputStream);
            C39280M.A07(fileOutputStream2);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC390903
    @SuppressLint({"CatchGeneralException"})
    public final C390802<Bitmap> A3A(File file, InterfaceC39270L interfaceC39270L) {
        if (!this.A04) {
            return new C390802<>(true, null);
        }
        try {
            Bitmap A03 = C39280M.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
            if (A03 != null) {
                return new C390802<>(true, A03);
            }
            interfaceC39270L.A8r(new C6323dz(A01(4, 14, 77)));
            return A00(null);
        } catch (Throwable th) {
            if (A07[6].length() != 26) {
                String[] strArr = A07;
                strArr[2] = "Rre6UfQ4j0qmCPYEhTx2DnaeM5gEursB";
                strArr[1] = "Gg2NoIsyPtMRdLQD2TdVPdh2XNeZHi6S";
                file.delete();
                interfaceC39270L.A8r(th);
                return A00(th);
            }
            throw new RuntimeException();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC390903
    @SuppressLint({"CatchGeneralException"})
    public final void A4B(File file, InterfaceC39270L interfaceC39270L) throws C6323dz {
        if (this.A03) {
            try {
                Bitmap A03 = C39280M.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
                if (A03 != null) {
                    A03(file, A03);
                } else {
                    file.delete();
                    throw new C6323dz(A01(4, 14, 77));
                }
            } catch (C6323dz e) {
                interfaceC39270L.A92(e);
                throw e;
            } catch (Throwable th) {
                interfaceC39270L.A92(th);
                throw new C6323dz(A01(18, 33, 49), th);
            }
        }
    }
}
