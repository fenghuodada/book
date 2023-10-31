package androidx.constraintlayout.motion.widget;

import android.text.TextUtils;
import com.iab.omid.library.adcolony.C8736c;
import com.iab.omid.library.adcolony.adsession.C8722l;
import com.iab.omid.library.adcolony.adsession.EnumC8719i;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: androidx.constraintlayout.motion.widget.g */
/* loaded from: classes.dex */
public class C0561g {
    /* renamed from: a */
    public static void m12182a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static void m12181b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: c */
    public static void m12180c(C8722l c8722l) {
        if (!c8722l.f16575g) {
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: d */
    public static void m12179d(C8722l c8722l) {
        if (c8722l.f16574f) {
            m12180c(c8722l);
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    /* renamed from: e */
    public static byte[] m12178e(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i = 0; i < 16; i++) {
                byte b = (byte) ((bArr[i] << 1) & 254);
                bArr2[i] = b;
                if (i < 15) {
                    bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    /* renamed from: f */
    public static void m12177f(C8722l c8722l) {
        boolean z;
        if (EnumC8719i.NATIVE == c8722l.f16570b.f16529a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    /* renamed from: g */
    public static String m12176g(String str, String str2) {
        Pattern pattern = C8736c.f16612a;
        String str3 = "<script type=\"text/javascript\">" + str + "</script>";
        m12181b(str2, "HTML is null or empty");
        ArrayList arrayList = new ArrayList();
        int length = str2.length();
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf("<!--", i);
            if (indexOf >= 0) {
                int indexOf2 = str2.indexOf("-->", indexOf);
                int[] iArr = new int[2];
                if (indexOf2 >= 0) {
                    iArr[0] = indexOf;
                    iArr[1] = indexOf2;
                    arrayList.add(iArr);
                    i = indexOf2 + 3;
                } else {
                    iArr[0] = indexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i = length;
        }
        int[][] iArr2 = (int[][]) arrayList.toArray((int[][]) Array.newInstance(Integer.TYPE, 0, 2));
        StringBuilder sb = new StringBuilder(str3.length() + str2.length() + 16);
        if (C8736c.m3179b(str2, sb, C8736c.f16613b, str3, iArr2) || C8736c.m3180a(str2, sb, C8736c.f16612a, str3, iArr2) || C8736c.m3179b(str2, sb, C8736c.f16615d, str3, iArr2) || C8736c.m3180a(str2, sb, C8736c.f16614c, str3, iArr2) || C8736c.m3179b(str2, sb, C8736c.f16617f, str3, iArr2) || C8736c.m3180a(str2, sb, C8736c.f16616e, str3, iArr2) || C8736c.m3180a(str2, sb, C8736c.f16618g, str3, iArr2)) {
            return sb.toString();
        }
        return str3.concat(str2);
    }
}
