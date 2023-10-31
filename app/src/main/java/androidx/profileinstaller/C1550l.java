package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.view.menu.C0235r;
import androidx.concurrent.futures.C0484a;
import androidx.constraintlayout.core.C0499a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

@RequiresApi(19)
/* renamed from: androidx.profileinstaller.l */
/* loaded from: classes.dex */
public final class C1550l {

    /* renamed from: a */
    public static final byte[] f3564a = {112, 114, 111, 0};

    /* renamed from: b */
    public static final byte[] f3565b = {112, 114, 109, 0};

    @NonNull
    /* renamed from: a */
    public static byte[] m10469a(@NonNull C1542d[] c1542dArr, @NonNull byte[] bArr) throws IOException {
        int i = 0;
        int i2 = 0;
        for (C1542d c1542d : c1542dArr) {
            i2 += (((((c1542d.f3556g * 2) + 8) - 1) & (-8)) / 8) + (c1542d.f3554e * 2) + m10468b(c1542d.f3550a, c1542d.f3551b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c1542d.f3555f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, C1551m.f3568c)) {
            int length = c1542dArr.length;
            while (i < length) {
                C1542d c1542d2 = c1542dArr[i];
                m10458l(byteArrayOutputStream, c1542d2, m10468b(c1542d2.f3550a, c1542d2.f3551b, bArr));
                m10456n(byteArrayOutputStream, c1542d2);
                m10459k(byteArrayOutputStream, c1542d2);
                m10457m(byteArrayOutputStream, c1542d2);
                i++;
            }
        } else {
            for (C1542d c1542d3 : c1542dArr) {
                m10458l(byteArrayOutputStream, c1542d3, m10468b(c1542d3.f3550a, c1542d3.f3551b, bArr));
            }
            int length2 = c1542dArr.length;
            while (i < length2) {
                C1542d c1542d4 = c1542dArr[i];
                m10456n(byteArrayOutputStream, c1542d4);
                m10459k(byteArrayOutputStream, c1542d4);
                m10457m(byteArrayOutputStream, c1542d4);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    @NonNull
    /* renamed from: b */
    public static String m10468b(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        Object obj;
        byte[] bArr2 = C1551m.f3570e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = C1551m.f3569d;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                str2 = str2.replace("!", ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (!str2.contains("!") && !str2.contains(":")) {
                if (str2.endsWith(".apk")) {
                    return str2;
                }
                return C0484a.m12392a(C0499a.m12383b(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : ":", str2);
            } else if ("!".equals(obj)) {
                return str2.replace(":", "!");
            } else {
                if (":".equals(obj)) {
                    str2 = str2.replace("!", ":");
                }
                return str2;
            }
        }
    }

    /* renamed from: c */
    public static int m10467c(int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return i2 + i3;
                }
                throw new IllegalStateException(C0235r.m12816a("Unexpected flag: ", i));
            }
            return i2;
        }
        throw new IllegalStateException("HOT methods are not stored in the bitmap");
    }

    /* renamed from: d */
    public static int[] m10466d(@NonNull ByteArrayInputStream byteArrayInputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += C1543e.m10474e(byteArrayInputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    @NonNull
    /* renamed from: e */
    public static C1542d[] m10465e(@NonNull FileInputStream fileInputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, C1542d[] c1542dArr) throws IOException {
        byte[] bArr3 = C1551m.f3571f;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(C1551m.f3566a, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m10475d = (int) C1543e.m10475d(fileInputStream, 1);
                    byte[] m10476c = C1543e.m10476c(fileInputStream, (int) C1543e.m10475d(fileInputStream, 4), (int) C1543e.m10475d(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m10476c);
                        try {
                            C1542d[] m10464f = m10464f(byteArrayInputStream, m10475d, c1542dArr);
                            byteArrayInputStream.close();
                            return m10464f;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, C1551m.f3572g)) {
            int m10474e = C1543e.m10474e(fileInputStream);
            byte[] m10476c2 = C1543e.m10476c(fileInputStream, (int) C1543e.m10475d(fileInputStream, 4), (int) C1543e.m10475d(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(m10476c2);
                try {
                    C1542d[] m10463g = m10463g(byteArrayInputStream2, bArr2, m10474e, c1542dArr);
                    byteArrayInputStream2.close();
                    return m10463g;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
    }

    @NonNull
    /* renamed from: f */
    public static C1542d[] m10464f(@NonNull ByteArrayInputStream byteArrayInputStream, int i, C1542d[] c1542dArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C1542d[0];
        }
        if (i == c1542dArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int m10474e = C1543e.m10474e(byteArrayInputStream);
                iArr[i2] = C1543e.m10474e(byteArrayInputStream);
                strArr[i2] = new String(C1543e.m10477b(byteArrayInputStream, m10474e), StandardCharsets.UTF_8);
            }
            for (int i3 = 0; i3 < i; i3++) {
                C1542d c1542d = c1542dArr[i3];
                if (c1542d.f3551b.equals(strArr[i3])) {
                    int i4 = iArr[i3];
                    c1542d.f3554e = i4;
                    c1542d.f3557h = m10466d(byteArrayInputStream, i4);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return c1542dArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    @NonNull
    /* renamed from: g */
    public static C1542d[] m10463g(@NonNull ByteArrayInputStream byteArrayInputStream, @NonNull byte[] bArr, int i, C1542d[] c1542dArr) throws IOException {
        C1542d c1542d;
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new C1542d[0];
        }
        if (i == c1542dArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                C1543e.m10474e(byteArrayInputStream);
                String str2 = new String(C1543e.m10477b(byteArrayInputStream, C1543e.m10474e(byteArrayInputStream)), StandardCharsets.UTF_8);
                long m10475d = C1543e.m10475d(byteArrayInputStream, 4);
                int m10474e = C1543e.m10474e(byteArrayInputStream);
                if (c1542dArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i3 = 0; i3 < c1542dArr.length; i3++) {
                        if (c1542dArr[i3].f3551b.equals(str)) {
                            c1542d = c1542dArr[i3];
                            break;
                        }
                    }
                }
                c1542d = null;
                if (c1542d != null) {
                    c1542d.f3553d = m10475d;
                    int[] m10466d = m10466d(byteArrayInputStream, m10474e);
                    if (Arrays.equals(bArr, C1551m.f3570e)) {
                        c1542d.f3554e = m10474e;
                        c1542d.f3557h = m10466d;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return c1542dArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    @NonNull
    /* renamed from: h */
    public static C1542d[] m10462h(@NonNull FileInputStream fileInputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (Arrays.equals(bArr, C1551m.f3567b)) {
            int m10475d = (int) C1543e.m10475d(fileInputStream, 1);
            byte[] m10476c = C1543e.m10476c(fileInputStream, (int) C1543e.m10475d(fileInputStream, 4), (int) C1543e.m10475d(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m10476c);
                try {
                    C1542d[] m10461i = m10461i(byteArrayInputStream, str, m10475d);
                    byteArrayInputStream.close();
                    return m10461i;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    @NonNull
    /* renamed from: i */
    public static C1542d[] m10461i(@NonNull ByteArrayInputStream byteArrayInputStream, @NonNull String str, int i) throws IOException {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C1542d[0];
        }
        C1542d[] c1542dArr = new C1542d[i];
        for (int i2 = 0; i2 < i; i2++) {
            int m10474e = C1543e.m10474e(byteArrayInputStream);
            int m10474e2 = C1543e.m10474e(byteArrayInputStream);
            c1542dArr[i2] = new C1542d(str, new String(C1543e.m10477b(byteArrayInputStream, m10474e), StandardCharsets.UTF_8), C1543e.m10475d(byteArrayInputStream, 4), m10474e2, (int) C1543e.m10475d(byteArrayInputStream, 4), (int) C1543e.m10475d(byteArrayInputStream, 4), new int[m10474e2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            C1542d c1542d = c1542dArr[i3];
            int available = byteArrayInputStream.available() - c1542d.f3555f;
            int i4 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c1542d.f3558i;
                if (available2 <= available) {
                    break;
                }
                i4 += C1543e.m10474e(byteArrayInputStream);
                treeMap.put(Integer.valueOf(i4), 1);
                for (int m10474e3 = C1543e.m10474e(byteArrayInputStream); m10474e3 > 0; m10474e3--) {
                    C1543e.m10474e(byteArrayInputStream);
                    int m10475d = (int) C1543e.m10475d(byteArrayInputStream, 1);
                    if (m10475d != 6 && m10475d != 7) {
                        while (m10475d > 0) {
                            C1543e.m10475d(byteArrayInputStream, 1);
                            for (int m10475d2 = (int) C1543e.m10475d(byteArrayInputStream, 1); m10475d2 > 0; m10475d2--) {
                                C1543e.m10474e(byteArrayInputStream);
                            }
                            m10475d--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                c1542d.f3557h = m10466d(byteArrayInputStream, c1542d.f3554e);
                int i5 = c1542d.f3556g;
                BitSet valueOf = BitSet.valueOf(C1543e.m10477b(byteArrayInputStream, ((((i5 * 2) + 8) - 1) & (-8)) / 8));
                for (int i6 = 0; i6 < i5; i6++) {
                    int i7 = 2;
                    if (!valueOf.get(m10467c(2, i6, i5))) {
                        i7 = 0;
                    }
                    if (valueOf.get(m10467c(4, i6, i5))) {
                        i7 |= 4;
                    }
                    if (i7 != 0) {
                        Integer num = treeMap.get(Integer.valueOf(i6));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i6), Integer.valueOf(i7 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return c1542dArr;
    }

    /* renamed from: j */
    public static boolean m10460j(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull byte[] bArr, @NonNull C1542d[] c1542dArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = C1551m.f3566a;
        int i = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                C1543e.m10472g(byteArrayOutputStream2, c1542dArr.length);
                int i2 = 2;
                int i3 = 2;
                for (C1542d c1542d : c1542dArr) {
                    C1543e.m10473f(byteArrayOutputStream2, c1542d.f3552c, 4);
                    C1543e.m10473f(byteArrayOutputStream2, c1542d.f3553d, 4);
                    C1543e.m10473f(byteArrayOutputStream2, c1542d.f3556g, 4);
                    String m10468b = m10468b(c1542d.f3550a, c1542d.f3551b, bArr2);
                    int length2 = m10468b.getBytes(StandardCharsets.UTF_8).length;
                    C1543e.m10472g(byteArrayOutputStream2, length2);
                    i3 = i3 + 4 + 4 + 4 + 2 + (length2 * 1);
                    byteArrayOutputStream2.write(m10468b.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 == byteArray.length) {
                    C1552n c1552n = new C1552n(1, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(c1552n);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i4 = 0;
                    for (int i5 = 0; i5 < c1542dArr.length; i5++) {
                        try {
                            C1542d c1542d2 = c1542dArr[i5];
                            C1543e.m10472g(byteArrayOutputStream3, i5);
                            C1543e.m10472g(byteArrayOutputStream3, c1542d2.f3554e);
                            i4 = i4 + 2 + 2 + (c1542d2.f3554e * 2);
                            m10459k(byteArrayOutputStream3, c1542d2);
                        } finally {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i4 == byteArray2.length) {
                        C1552n c1552n2 = new C1552n(3, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(c1552n2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < c1542dArr.length) {
                            try {
                                C1542d c1542d3 = c1542dArr[i6];
                                int i8 = i;
                                for (Map.Entry<Integer, Integer> entry : c1542d3.f3558i.entrySet()) {
                                    i8 |= entry.getValue().intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                m10457m(byteArrayOutputStream4, c1542d3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                m10456n(byteArrayOutputStream5, c1542d3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                C1543e.m10472g(byteArrayOutputStream3, i6);
                                int length3 = byteArray3.length + i2 + byteArray4.length;
                                int i9 = i7 + 2 + 4;
                                ArrayList arrayList4 = arrayList3;
                                C1543e.m10473f(byteArrayOutputStream3, length3, 4);
                                C1543e.m10472g(byteArrayOutputStream3, i8);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i7 = i9 + length3;
                                i6++;
                                arrayList3 = arrayList4;
                                i = 0;
                                i2 = 2;
                            } finally {
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i7 == byteArray5.length) {
                            C1552n c1552n3 = new C1552n(4, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList2.add(c1552n3);
                            long j = 4;
                            long size = j + j + 4 + (arrayList2.size() * 16);
                            C1543e.m10473f(byteArrayOutputStream, arrayList2.size(), 4);
                            int i10 = 0;
                            while (i10 < arrayList2.size()) {
                                C1552n c1552n4 = (C1552n) arrayList2.get(i10);
                                C1543e.m10473f(byteArrayOutputStream, C1544f.m10471a(c1552n4.f3573a), 4);
                                C1543e.m10473f(byteArrayOutputStream, size, 4);
                                boolean z = c1552n4.f3575c;
                                byte[] bArr3 = c1552n4.f3574b;
                                if (z) {
                                    byte[] m10478a = C1543e.m10478a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(m10478a);
                                    C1543e.m10473f(byteArrayOutputStream, m10478a.length, 4);
                                    C1543e.m10473f(byteArrayOutputStream, bArr3.length, 4);
                                    length = m10478a.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    C1543e.m10473f(byteArrayOutputStream, bArr3.length, 4);
                                    C1543e.m10473f(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i10++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i11));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            } finally {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        byte[] bArr4 = C1551m.f3567b;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] m10469a = m10469a(c1542dArr, bArr4);
            C1543e.m10473f(byteArrayOutputStream, c1542dArr.length, 1);
            C1543e.m10473f(byteArrayOutputStream, m10469a.length, 4);
            byte[] m10478a2 = C1543e.m10478a(m10469a);
            C1543e.m10473f(byteArrayOutputStream, m10478a2.length, 4);
            byteArrayOutputStream.write(m10478a2);
            return true;
        }
        byte[] bArr5 = C1551m.f3569d;
        if (Arrays.equals(bArr, bArr5)) {
            C1543e.m10473f(byteArrayOutputStream, c1542dArr.length, 1);
            for (C1542d c1542d4 : c1542dArr) {
                String m10468b2 = m10468b(c1542d4.f3550a, c1542d4.f3551b, bArr5);
                C1543e.m10472g(byteArrayOutputStream, m10468b2.getBytes(StandardCharsets.UTF_8).length);
                C1543e.m10472g(byteArrayOutputStream, c1542d4.f3557h.length);
                C1543e.m10473f(byteArrayOutputStream, c1542d4.f3558i.size() * 4, 4);
                C1543e.m10473f(byteArrayOutputStream, c1542d4.f3552c, 4);
                byteArrayOutputStream.write(m10468b2.getBytes(StandardCharsets.UTF_8));
                for (Integer num : c1542d4.f3558i.keySet()) {
                    C1543e.m10472g(byteArrayOutputStream, num.intValue());
                    C1543e.m10472g(byteArrayOutputStream, 0);
                }
                for (int i12 : c1542d4.f3557h) {
                    C1543e.m10472g(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        byte[] bArr6 = C1551m.f3568c;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] m10469a2 = m10469a(c1542dArr, bArr6);
            C1543e.m10473f(byteArrayOutputStream, c1542dArr.length, 1);
            C1543e.m10473f(byteArrayOutputStream, m10469a2.length, 4);
            byte[] m10478a3 = C1543e.m10478a(m10469a2);
            C1543e.m10473f(byteArrayOutputStream, m10478a3.length, 4);
            byteArrayOutputStream.write(m10478a3);
            return true;
        }
        byte[] bArr7 = C1551m.f3570e;
        if (Arrays.equals(bArr, bArr7)) {
            C1543e.m10472g(byteArrayOutputStream, c1542dArr.length);
            for (C1542d c1542d5 : c1542dArr) {
                String m10468b3 = m10468b(c1542d5.f3550a, c1542d5.f3551b, bArr7);
                C1543e.m10472g(byteArrayOutputStream, m10468b3.getBytes(StandardCharsets.UTF_8).length);
                TreeMap<Integer, Integer> treeMap = c1542d5.f3558i;
                C1543e.m10472g(byteArrayOutputStream, treeMap.size());
                C1543e.m10472g(byteArrayOutputStream, c1542d5.f3557h.length);
                C1543e.m10473f(byteArrayOutputStream, c1542d5.f3552c, 4);
                byteArrayOutputStream.write(m10468b3.getBytes(StandardCharsets.UTF_8));
                for (Integer num2 : treeMap.keySet()) {
                    C1543e.m10472g(byteArrayOutputStream, num2.intValue());
                }
                for (int i13 : c1542d5.f3557h) {
                    C1543e.m10472g(byteArrayOutputStream, i13);
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static void m10459k(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull C1542d c1542d) throws IOException {
        int i = 0;
        for (int i2 : c1542d.f3557h) {
            Integer valueOf = Integer.valueOf(i2);
            C1543e.m10472g(byteArrayOutputStream, valueOf.intValue() - i);
            i = valueOf.intValue();
        }
    }

    /* renamed from: l */
    public static void m10458l(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull C1542d c1542d, @NonNull String str) throws IOException {
        C1543e.m10472g(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        C1543e.m10472g(byteArrayOutputStream, c1542d.f3554e);
        C1543e.m10473f(byteArrayOutputStream, c1542d.f3555f, 4);
        C1543e.m10473f(byteArrayOutputStream, c1542d.f3552c, 4);
        C1543e.m10473f(byteArrayOutputStream, c1542d.f3556g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: m */
    public static void m10457m(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull C1542d c1542d) throws IOException {
        byte[] bArr = new byte[((((c1542d.f3556g * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : c1542d.f3558i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int i = intValue2 & 2;
            int i2 = c1542d.f3556g;
            if (i != 0) {
                int m10467c = m10467c(2, intValue, i2);
                int i3 = m10467c / 8;
                bArr[i3] = (byte) ((1 << (m10467c % 8)) | bArr[i3]);
            }
            if ((intValue2 & 4) != 0) {
                int m10467c2 = m10467c(4, intValue, i2);
                int i4 = m10467c2 / 8;
                bArr[i4] = (byte) ((1 << (m10467c2 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: n */
    public static void m10456n(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull C1542d c1542d) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : c1542d.f3558i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                C1543e.m10472g(byteArrayOutputStream, intValue - i);
                C1543e.m10472g(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }
}
