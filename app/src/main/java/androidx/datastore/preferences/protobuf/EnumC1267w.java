package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF6 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.w */
/* loaded from: classes.dex */
public final class EnumC1267w {

    /* renamed from: b */
    public static final EnumC1267w f3129b;

    /* renamed from: c */
    public static final EnumC1267w f3130c;

    /* renamed from: d */
    public static final EnumC1267w[] f3131d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC1267w[] f3132e;

    /* renamed from: a */
    public final int f3133a;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC1267w EF6;

    static {
        EnumC1167d0 enumC1167d0 = EnumC1167d0.DOUBLE;
        EnumC1267w enumC1267w = new EnumC1267w("DOUBLE", 0, 0, 1, enumC1167d0);
        EnumC1167d0 enumC1167d02 = EnumC1167d0.FLOAT;
        EnumC1267w enumC1267w2 = new EnumC1267w("FLOAT", 1, 1, 1, enumC1167d02);
        EnumC1167d0 enumC1167d03 = EnumC1167d0.LONG;
        EnumC1267w enumC1267w3 = new EnumC1267w("INT64", 2, 2, 1, enumC1167d03);
        EnumC1267w enumC1267w4 = new EnumC1267w("UINT64", 3, 3, 1, enumC1167d03);
        EnumC1167d0 enumC1167d04 = EnumC1167d0.INT;
        EnumC1267w enumC1267w5 = new EnumC1267w("INT32", 4, 4, 1, enumC1167d04);
        EnumC1267w enumC1267w6 = new EnumC1267w("FIXED64", 5, 5, 1, enumC1167d03);
        EnumC1267w enumC1267w7 = new EnumC1267w("FIXED32", 6, 6, 1, enumC1167d04);
        EnumC1167d0 enumC1167d05 = EnumC1167d0.BOOLEAN;
        EnumC1267w enumC1267w8 = new EnumC1267w("BOOL", 7, 7, 1, enumC1167d05);
        EnumC1167d0 enumC1167d06 = EnumC1167d0.STRING;
        EnumC1267w enumC1267w9 = new EnumC1267w("STRING", 8, 8, 1, enumC1167d06);
        EnumC1167d0 enumC1167d07 = EnumC1167d0.MESSAGE;
        EnumC1267w enumC1267w10 = new EnumC1267w("MESSAGE", 9, 9, 1, enumC1167d07);
        EnumC1167d0 enumC1167d08 = EnumC1167d0.BYTE_STRING;
        EnumC1267w enumC1267w11 = new EnumC1267w("BYTES", 10, 10, 1, enumC1167d08);
        EnumC1267w enumC1267w12 = new EnumC1267w("UINT32", 11, 11, 1, enumC1167d04);
        EnumC1167d0 enumC1167d09 = EnumC1167d0.ENUM;
        EnumC1267w enumC1267w13 = new EnumC1267w("ENUM", 12, 12, 1, enumC1167d09);
        EnumC1267w enumC1267w14 = new EnumC1267w("SFIXED32", 13, 13, 1, enumC1167d04);
        EnumC1267w enumC1267w15 = new EnumC1267w("SFIXED64", 14, 14, 1, enumC1167d03);
        EnumC1267w enumC1267w16 = new EnumC1267w("SINT32", 15, 15, 1, enumC1167d04);
        EnumC1267w enumC1267w17 = new EnumC1267w("SINT64", 16, 16, 1, enumC1167d03);
        EnumC1267w enumC1267w18 = new EnumC1267w("GROUP", 17, 17, 1, enumC1167d07);
        EnumC1267w enumC1267w19 = new EnumC1267w("DOUBLE_LIST", 18, 18, 2, enumC1167d0);
        EnumC1267w enumC1267w20 = new EnumC1267w("FLOAT_LIST", 19, 19, 2, enumC1167d02);
        EnumC1267w enumC1267w21 = new EnumC1267w("INT64_LIST", 20, 20, 2, enumC1167d03);
        EnumC1267w enumC1267w22 = new EnumC1267w("UINT64_LIST", 21, 21, 2, enumC1167d03);
        EnumC1267w enumC1267w23 = new EnumC1267w("INT32_LIST", 22, 22, 2, enumC1167d04);
        EnumC1267w enumC1267w24 = new EnumC1267w("FIXED64_LIST", 23, 23, 2, enumC1167d03);
        EnumC1267w enumC1267w25 = new EnumC1267w("FIXED32_LIST", 24, 24, 2, enumC1167d04);
        EnumC1267w enumC1267w26 = new EnumC1267w("BOOL_LIST", 25, 25, 2, enumC1167d05);
        EnumC1267w enumC1267w27 = new EnumC1267w("STRING_LIST", 26, 26, 2, enumC1167d06);
        EnumC1267w enumC1267w28 = new EnumC1267w("MESSAGE_LIST", 27, 27, 2, enumC1167d07);
        EnumC1267w enumC1267w29 = new EnumC1267w("BYTES_LIST", 28, 28, 2, enumC1167d08);
        EnumC1267w enumC1267w30 = new EnumC1267w("UINT32_LIST", 29, 29, 2, enumC1167d04);
        EnumC1267w enumC1267w31 = new EnumC1267w("ENUM_LIST", 30, 30, 2, enumC1167d09);
        EnumC1267w enumC1267w32 = new EnumC1267w("SFIXED32_LIST", 31, 31, 2, enumC1167d04);
        EnumC1267w enumC1267w33 = new EnumC1267w("SFIXED64_LIST", 32, 32, 2, enumC1167d03);
        EnumC1267w enumC1267w34 = new EnumC1267w("SINT32_LIST", 33, 33, 2, enumC1167d04);
        EnumC1267w enumC1267w35 = new EnumC1267w("SINT64_LIST", 34, 34, 2, enumC1167d03);
        EnumC1267w enumC1267w36 = new EnumC1267w("DOUBLE_LIST_PACKED", 35, 35, 3, enumC1167d0);
        f3129b = enumC1267w36;
        EnumC1267w enumC1267w37 = new EnumC1267w("FLOAT_LIST_PACKED", 36, 36, 3, enumC1167d02);
        EnumC1267w enumC1267w38 = new EnumC1267w("INT64_LIST_PACKED", 37, 37, 3, enumC1167d03);
        EnumC1267w enumC1267w39 = new EnumC1267w("UINT64_LIST_PACKED", 38, 38, 3, enumC1167d03);
        EnumC1267w enumC1267w40 = new EnumC1267w("INT32_LIST_PACKED", 39, 39, 3, enumC1167d04);
        EnumC1267w enumC1267w41 = new EnumC1267w("FIXED64_LIST_PACKED", 40, 40, 3, enumC1167d03);
        EnumC1267w enumC1267w42 = new EnumC1267w("FIXED32_LIST_PACKED", 41, 41, 3, enumC1167d04);
        EnumC1267w enumC1267w43 = new EnumC1267w("BOOL_LIST_PACKED", 42, 42, 3, enumC1167d05);
        EnumC1267w enumC1267w44 = new EnumC1267w("UINT32_LIST_PACKED", 43, 43, 3, enumC1167d04);
        EnumC1267w enumC1267w45 = new EnumC1267w("ENUM_LIST_PACKED", 44, 44, 3, enumC1167d09);
        EnumC1267w enumC1267w46 = new EnumC1267w("SFIXED32_LIST_PACKED", 45, 45, 3, enumC1167d04);
        EnumC1267w enumC1267w47 = new EnumC1267w("SFIXED64_LIST_PACKED", 46, 46, 3, enumC1167d03);
        EnumC1267w enumC1267w48 = new EnumC1267w("SINT32_LIST_PACKED", 47, 47, 3, enumC1167d04);
        EnumC1267w enumC1267w49 = new EnumC1267w("SINT64_LIST_PACKED", 48, 48, 3, enumC1167d03);
        f3130c = enumC1267w49;
        f3132e = new EnumC1267w[]{enumC1267w, enumC1267w2, enumC1267w3, enumC1267w4, enumC1267w5, enumC1267w6, enumC1267w7, enumC1267w8, enumC1267w9, enumC1267w10, enumC1267w11, enumC1267w12, enumC1267w13, enumC1267w14, enumC1267w15, enumC1267w16, enumC1267w17, enumC1267w18, enumC1267w19, enumC1267w20, enumC1267w21, enumC1267w22, enumC1267w23, enumC1267w24, enumC1267w25, enumC1267w26, enumC1267w27, enumC1267w28, enumC1267w29, enumC1267w30, enumC1267w31, enumC1267w32, enumC1267w33, enumC1267w34, enumC1267w35, enumC1267w36, enumC1267w37, enumC1267w38, enumC1267w39, enumC1267w40, enumC1267w41, enumC1267w42, enumC1267w43, enumC1267w44, enumC1267w45, enumC1267w46, enumC1267w47, enumC1267w48, enumC1267w49, new EnumC1267w("GROUP_LIST", 49, 49, 2, enumC1167d07), new EnumC1267w("MAP", 50, 50, 4, EnumC1167d0.VOID)};
        EnumC1267w[] values = values();
        f3131d = new EnumC1267w[values.length];
        for (EnumC1267w enumC1267w50 : values) {
            f3131d[enumC1267w50.f3133a] = enumC1267w50;
        }
    }

    public EnumC1267w(String str, int i, int i2, int i3, EnumC1167d0 enumC1167d0) {
        this.f3133a = i2;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            enumC1167d0.getClass();
        }
        if (i3 == 1) {
            enumC1167d0.ordinal();
        }
    }

    public static EnumC1267w valueOf(String str) {
        return (EnumC1267w) Enum.valueOf(EnumC1267w.class, str);
    }

    public static EnumC1267w[] values() {
        return (EnumC1267w[]) f3132e.clone();
    }

    /* renamed from: a */
    public final int m10732a() {
        return this.f3133a;
    }
}
