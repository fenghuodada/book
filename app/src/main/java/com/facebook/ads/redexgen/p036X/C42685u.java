package com.facebook.ads.redexgen.p036X;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.5u */
/* loaded from: assets/audience_network.dex */
public final class C42685u {
    public static byte[] A00;
    public static String[] A01 = {"BBXCQ1c8lWMx5iTCFSjBAsNmZ8", "uWpSMDe8Dl1QwAjraNXmi3HjN39WCwvV", "Nl77HN8SOPKSqciG8lmOC8DFY50qabgT", "qKAuPB5zte0w", "tHnAlNrx5zeOSNOAYBdYTMmeA", "muO01a58leOoeMmtxXp9cvgd3", "skgH0VF5dzwRL9wPv5", "Mbe4svBdXamA1BIwkYK5rcxDOVieSFVl"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[2].charAt(14) != 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "5u7aTW8yax3G";
            strArr[6] = "UvSwr6xgQWJsIweShl";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 109);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{118, 126, 115, 115, 124, 118, 96, 125, 123, 118, 123, 118, 40, 36, 37, Utf8.REPLACEMENT_BYTE, 46, 37, Utf8.REPLACEMENT_BYTE, 113, 100, 100, 40, 36, 38, 101, 45, 42, 40, 46, 41, 36, 36, 32, 101, 32, 42, Utf8.REPLACEMENT_BYTE, 42, 37, 42, 101, 59, 57, 36, 61, 34, 47, 46, 57, 101, 10, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 57, 34, 41, 62, Utf8.REPLACEMENT_BYTE, 34, 36, 37, 2, 47, 27, 57, 36, 61, 34, 47, 46, 57, 37, 32, 36, 32, 61, 22, 61, 59, 40, 42, 34, 32, 39, 46};
    }

    static {
        A02();
    }

    public static C42675t A00(ContentResolver contentResolver) {
        String A012 = A01(72, 14, 36);
        String A013 = A01(3, 9, 127);
        String A014 = A01(0, 3, 122);
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(C5191La.A00(A01(12, 60, 38)), new String[]{A014, A013, A012}, null, null, null);
            if (query == null || !query.moveToFirst()) {
                C42675t c42675t = new C42675t(null, null, false);
                if (query != null) {
                    query.close();
                }
                return c42675t;
            }
            String string = query.getString(query.getColumnIndex(A014));
            String advertisingId = query.getString(query.getColumnIndex(A013));
            C42675t c42675t2 = new C42675t(string, advertisingId, Boolean.valueOf(query.getString(query.getColumnIndex(A012))).booleanValue());
            query.close();
            return c42675t2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }
}
