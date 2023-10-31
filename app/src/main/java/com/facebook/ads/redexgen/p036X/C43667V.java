package com.facebook.ads.redexgen.p036X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.7V */
/* loaded from: assets/audience_network.dex */
public final class C43667V {
    public static byte[] A02;
    public static String[] A03 = {"xEW9LSpkxtcMkiVkCjWXuTu5CJHPJiyq", "tTP", "A", "dhAFlm3SiPB0s9864OvgcmZEVzRtwwmX", "mnE9bSEHBlleLkXo6La2W5bpkmZqSUyN", "0jwmHWkFqK", "xBcWrb6s57BN1yke0uYkFqIHC7aAgPEb", "dL0KwaEpZdlIbw3ka3MpOkzONR5qkJY2"};
    public static final String A04;
    public static volatile C43667V A05;
    public final C5952Xx A00;
    public final Map<String, C43637S> A01 = Collections.synchronizedMap(new HashMap());

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{97, 102, 34, 124, 98, 107, 68, 103, 98, 38, 105, 115, 114, 118, 115, 114, 38, 98, 99, 117, 114, 111, 104, 103, 114, 111, 105, 104, 38, 46, 96, 111, 106, 99, 59, 26, 49, 44, 53, 57, 40, 120, 43, 49, 34, 61, 120, 61, 32, 59, 61, 61, 60, 43, 120, 53, 57, 32, 120, 43, 49, 34, 61, 120, 62, 55, 42, 120, 43, 44, 55, 42, 57, Utf8.REPLACEMENT_BYTE, 61, 98, 120, 103, 69, 71, 76, 65, 4, 65, 86, 86, 75, 86, 10, 4, 102, 77, 80, 73, 69, 84, 4, 77, 87, 4, 74, 81, 72, 72, 10, 57, 30, 22, 19, 26, 27, 95, 11, 16, 95, 28, 16, 15, 6, 95, 19, 16, 28, 30, 19, 95, 22, 18, 30, 24, 26, 95, 22, 17, 11, 16, 95, 28, 30, 28, 23, 26, 95, 87, 10, 13, 19, 66, 53, 14, 1, 2, 12, 5, 64, 20, 15, 64, 23, 18, 9, 20, 5, 64, 2, 9, 20, 13, 1, 16, 64, 20, 15, 64, 6, 9, 12, 5, 64, 72, 21, 18, 12, 93, 80, 107, 100, 103, 105, 96, 37, 113, 106, 37, 114, 119, 108, 113, 96, 37, 103, 108, 113, 104, 100, 117, 37, 113, 106, 37, 106, 112, 113, 117, 112, 113, 37, 118, 113, 119, 96, 100, 104, 126, 108, 108, 122, 107, 37, 48, 48, 48, Utf8.REPLACEMENT_BYTE, 48, 53, 60, 99, 118, 118, 68, 75, 78, 71, 24, 13, 13, 13, 67, 76, 70, 80, 77, 75, 70, 125, 67, 81, 81, 71, 86, 13, 27, 31, 19, 21, 23, 0, 3, 13, 8, 77, 86, 83, 86, 87, 79, 86};
    }

    static {
        A09();
        A04 = C43667V.class.getSimpleName();
    }

    public C43667V(C5952Xx c5952Xx) {
        this.A00 = c5952Xx;
    }

    private int A00(String str, @Nullable Bitmap bitmap) {
        String A08 = A08(0, 2, 17);
        if (bitmap == null) {
            A0B(null);
            return 0;
        }
        File A07 = A07(this.A00);
        File file = new File(A07, str.hashCode() + A08(2, 4, 85));
        try {
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    int size = byteArrayOutputStream.size();
                    int size2 = C5064JR.A0D(this.A00);
                    if (size >= size2) {
                        A0B(new Throwable(A08(35, 42, 1) + size));
                        A0A(byteArrayOutputStream);
                        A0A(null);
                        return 0;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byteArrayOutputStream.writeTo(fileOutputStream);
                    fileOutputStream.flush();
                    A0A(byteArrayOutputStream);
                    A0A(fileOutputStream);
                    return size;
                } catch (IOException e) {
                    A0B(e);
                    String str2 = A04;
                    Log.e(str2, A08(148, 36, 57) + str + A08, e);
                    A0A(null);
                    A0A(null);
                    return 0;
                } catch (OutOfMemoryError e2) {
                    A0B(e2);
                    Log.e(A04, A08(184, 39, 92), e2);
                    A0A(null);
                    A0A(null);
                    if (A03[2].length() != 5) {
                        A03[5] = "QxsbBUkJdqjFKv7NMRisOUwCFhjpKYpW";
                        return 0;
                    }
                    throw new RuntimeException();
                }
            } catch (FileNotFoundException e3) {
                String str3 = A04;
                Log.e(str3, A08(6, 29, 95) + file.getPath() + A08, e3);
                A0B(e3);
                A0A(null);
                A0A(null);
                return 0;
            }
        } catch (Throwable fnfe) {
            A0A(null);
            A0A(null);
            throw fnfe;
        }
    }

    @Nullable
    private final Bitmap A01(C44148U c44148u, C43637S c43637s, int i, int i2, String str) {
        if (C43687X.A06(c44148u) && A08(266, 4, 53).equals(str)) {
            Map<String, C43637S> map = this.A01;
            if (A03[4].charAt(4) != 'b') {
                throw new RuntimeException();
            }
            A03[1] = "FHlvPh";
            map.put(c43637s.A07, c43637s);
        }
        String str2 = c43637s.A07;
        C43677W c43677w = new C43677W(c43637s.A05, c43637s.A06, A08(261, 5, 43), str, str2);
        File A07 = A07(this.A00);
        File file = new File(A07, str2.hashCode() + A08(2, 4, 85));
        if (!file.exists()) {
            C43687X.A04(c44148u, c43677w, false);
            if (str2.startsWith(A08(232, 7, 0)) && !str2.startsWith(A08(239, 22, 123))) {
                return A04(str2, i2, i);
            }
            return A02(c44148u, c43637s, str);
        }
        C43687X.A04(c44148u, c43677w, true);
        try {
            if (A0C(i2, i)) {
                return C43697Y.A02(file.getCanonicalPath(), i2, i, this.A00);
            }
            return BitmapFactory.decodeFile(file.getCanonicalPath());
        } catch (IOException e) {
            A0B(e);
            return null;
        }
    }

    @Nullable
    private Bitmap A02(C44148U c44148u, C43637S c43637s, String path) {
        String substring;
        Bitmap A01;
        String failureReason = c43637s.A07;
        int i = c43637s.A03;
        int i2 = c43637s.A04;
        long storedSize = System.currentTimeMillis();
        IOException e = null;
        String url = A08(223, 9, 70);
        boolean startsWith = failureReason.startsWith(url);
        String A08 = A08(239, 22, 123);
        if (startsWith || failureReason.startsWith(A08)) {
            if (failureReason.startsWith(url)) {
                substring = failureReason.substring(url.length());
            } else {
                substring = failureReason.substring(A08.length());
            }
            InputStream inputStream = null;
            try {
                try {
                    inputStream = this.A00.getAssets().open(substring);
                    if (A0C(i, i2)) {
                        try {
                            A01 = C43697Y.A01(inputStream, i, i2);
                        } catch (IOException e2) {
                            e = e2;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            throw th;
                        }
                    } else {
                        A01 = BitmapFactory.decodeStream(inputStream);
                    }
                    if (inputStream != null) {
                        A0A(inputStream);
                    }
                } catch (IOException e4) {
                    e = e4;
                } catch (OutOfMemoryError e5) {
                    e = e5;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            boolean A0C = A0C(i, i2);
            if (A03[2].length() == 5) {
                throw new RuntimeException();
            }
            A03[2] = "klQgZYPMp8CYh3QQVMKsyyqrprqRLh";
            if (A0C) {
                try {
                    A01 = A05(failureReason, i, i2);
                } catch (IOException e6) {
                    e = e6;
                    A0B(e);
                    A01 = A03(failureReason);
                }
                if (A03[3].charAt(9) == 'R') {
                    throw new RuntimeException();
                }
                A03[5] = "Wv696HPT8k3";
            } else {
                A01 = A03(failureReason);
            }
        }
        String th4 = e != null ? e.toString() : null;
        if (A01 != null) {
            long A00 = A00(failureReason, A01);
            long currentTimeMillis = System.currentTimeMillis() - storedSize;
            if (A00 <= 0) {
                C43687X.A03(c44148u, c43637s, path, C43687X.A01, th4, null, null);
                if (C5064JR.A0q(c44148u)) {
                    return null;
                }
                return A01;
            }
            C43687X.A03(c44148u, c43637s, path, C43687X.A02, th4, Long.valueOf(A00), Long.valueOf(currentTimeMillis));
            return A01;
        }
        int i3 = C43687X.A03;
        if (A03[5].length() != 20) {
            A03[7] = "fy8dw3JHkots1ng5AFby2Wzsn8QVwQ2O";
            C43687X.A03(c44148u, c43637s, path, i3, th4, null, null);
            return null;
        }
        throw new RuntimeException();
    }

    @Nullable
    private Bitmap A03(String str) {
        byte[] A5o;
        InterfaceC5526R1 ADA = C5545RK.A00(this.A00).ADA(str, new C5541RG());
        if (ADA != null && (A5o = ADA.A5o()) != null) {
            return BitmapFactory.decodeByteArray(A5o, 0, A5o.length);
        }
        return null;
    }

    @Nullable
    private Bitmap A04(String str, int i, int i2) {
        Bitmap A022;
        int A00;
        try {
            boolean A0C = A0C(i, i2);
            String A08 = A08(232, 7, 0);
            if (!A0C) {
                A022 = BitmapFactory.decodeStream(new FileInputStream(str.substring(A08.length())), null, null);
            } else {
                A022 = C43697Y.A02(str.substring(A08.length()), i, i2, this.A00);
            }
            A00 = A00(str, A022);
        } catch (IOException e) {
            String str2 = A04;
            Log.e(str2, A08(105, 43, 38) + str + A08(0, 2, 17), e);
        }
        if (C5064JR.A0q(this.A00)) {
            if (A00 <= 0) {
                return null;
            }
            return A022;
        }
        return A022;
    }

    @Nullable
    private Bitmap A05(String str, int i, int i2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        InputStream inputStream = httpURLConnection.getInputStream();
        Bitmap A01 = C43697Y.A01(inputStream, i, i2);
        A0A(inputStream);
        return A01;
    }

    public static C43667V A06(C5952Xx c5952Xx) {
        if (A05 == null) {
            synchronized (C43667V.class) {
                if (A05 == null) {
                    A05 = new C43667V(c5952Xx);
                }
            }
        }
        return A05;
    }

    public static File A07(C44148U c44148u) {
        return c44148u.getCacheDir();
    }

    public static void A0A(@Nullable Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(@Nullable Throwable th) {
        String A08 = A08(261, 5, 43);
        if (th != null) {
            this.A00.A06().A8y(A08, C44458z.A1e, new C444690(th));
        } else {
            this.A00.A06().A8y(A08, C44458z.A1e, new C444690(A08(77, 28, 125)));
        }
    }

    private boolean A0C(int i, int i2) {
        return i > 0 && i2 > 0 && C5064JR.A0y(this.A00);
    }

    @Nullable
    public final Bitmap A0D(C43637S c43637s) {
        return A01(this.A00, c43637s, c43637s.A04, c43637s.A03, c43637s.A01);
    }

    @Nullable
    public final Bitmap A0E(C44148U c44148u, String str, int i, int i2, String str2) {
        C43637S c43637s = this.A01.get(str);
        return (!C43687X.A06(c44148u) || c43637s == null) ? A01(c44148u, new C43637S(str, i, i2, A08(270, 7, 97), A08(270, 7, 97)), i2, i, str2) : A01(c44148u, c43637s, i2, i, str2);
    }

    @Nullable
    public final File A0F(String str) {
        File A07 = A07(this.A00);
        File file = new File(A07, str.hashCode() + A08(2, 4, 85));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A0G(String str) {
        File A07 = A07(this.A00);
        File file = new File(A07, str.hashCode() + A08(2, 4, 85));
        return file.exists() ? file.getPath() : str;
    }
}
