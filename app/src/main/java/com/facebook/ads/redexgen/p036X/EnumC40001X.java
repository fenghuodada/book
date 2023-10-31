package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum A05 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.1X */
/* loaded from: assets/audience_network.dex */
public final class EnumC40001X {
    public static byte[] A01;
    public static final /* synthetic */ EnumC40001X[] A02;
    public static final EnumC40001X A03;
    public static final EnumC40001X A04;
    public static final EnumC40001X A05;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{24, 23, 18, 27, 1, 14, 12, 27, 29, 31, 29, 22, 27, 3, 1, 28, 11, 10, 12, 3, 1, 22, 16, 18, 16, 27, 22, 119, 101, 98, 118, 105, 101, 119, Byte.MAX_VALUE, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String A012 = A01(27, 16, 0);
        A05 = new EnumC40001X(A012, 0, A012);
        String A013 = A01(13, 14, 115);
        A04 = new EnumC40001X(A013, 1, A013);
        String A014 = A01(0, 13, 126);
        A03 = new EnumC40001X(A014, 2, A014);
        A02 = new EnumC40001X[]{A05, A04, A03};
    }

    public EnumC40001X(String str, int i, String str2) {
        this.A00 = str2;
    }

    public static EnumC40001X A00(String str) {
        EnumC40001X[] values;
        for (EnumC40001X enumC40001X : values()) {
            if (enumC40001X.A00.equalsIgnoreCase(str)) {
                return enumC40001X;
            }
        }
        return A03;
    }

    public static EnumC40001X valueOf(String str) {
        return (EnumC40001X) Enum.valueOf(EnumC40001X.class, str);
    }

    public static EnumC40001X[] values() {
        return (EnumC40001X[]) A02.clone();
    }
}
