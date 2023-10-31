package com.google.crypto.tink.shaded.protobuf;

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
/* renamed from: com.google.crypto.tink.shaded.protobuf.v */
/* loaded from: classes3.dex */
public final class EnumC8302v {

    /* renamed from: b */
    public static final EnumC8302v f16117b;

    /* renamed from: c */
    public static final EnumC8302v f16118c;

    /* renamed from: d */
    public static final EnumC8302v[] f16119d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC8302v[] f16120e;

    /* renamed from: a */
    public final int f16121a;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC8302v EF6;

    static {
        EnumC8206c0 enumC8206c0 = EnumC8206c0.DOUBLE;
        EnumC8302v enumC8302v = new EnumC8302v("DOUBLE", 0, 0, 1, enumC8206c0);
        EnumC8206c0 enumC8206c02 = EnumC8206c0.FLOAT;
        EnumC8302v enumC8302v2 = new EnumC8302v("FLOAT", 1, 1, 1, enumC8206c02);
        EnumC8206c0 enumC8206c03 = EnumC8206c0.LONG;
        EnumC8302v enumC8302v3 = new EnumC8302v("INT64", 2, 2, 1, enumC8206c03);
        EnumC8302v enumC8302v4 = new EnumC8302v("UINT64", 3, 3, 1, enumC8206c03);
        EnumC8206c0 enumC8206c04 = EnumC8206c0.INT;
        EnumC8302v enumC8302v5 = new EnumC8302v("INT32", 4, 4, 1, enumC8206c04);
        EnumC8302v enumC8302v6 = new EnumC8302v("FIXED64", 5, 5, 1, enumC8206c03);
        EnumC8302v enumC8302v7 = new EnumC8302v("FIXED32", 6, 6, 1, enumC8206c04);
        EnumC8206c0 enumC8206c05 = EnumC8206c0.BOOLEAN;
        EnumC8302v enumC8302v8 = new EnumC8302v("BOOL", 7, 7, 1, enumC8206c05);
        EnumC8206c0 enumC8206c06 = EnumC8206c0.STRING;
        EnumC8302v enumC8302v9 = new EnumC8302v("STRING", 8, 8, 1, enumC8206c06);
        EnumC8206c0 enumC8206c07 = EnumC8206c0.MESSAGE;
        EnumC8302v enumC8302v10 = new EnumC8302v("MESSAGE", 9, 9, 1, enumC8206c07);
        EnumC8206c0 enumC8206c08 = EnumC8206c0.BYTE_STRING;
        EnumC8302v enumC8302v11 = new EnumC8302v("BYTES", 10, 10, 1, enumC8206c08);
        EnumC8302v enumC8302v12 = new EnumC8302v("UINT32", 11, 11, 1, enumC8206c04);
        EnumC8206c0 enumC8206c09 = EnumC8206c0.ENUM;
        EnumC8302v enumC8302v13 = new EnumC8302v("ENUM", 12, 12, 1, enumC8206c09);
        EnumC8302v enumC8302v14 = new EnumC8302v("SFIXED32", 13, 13, 1, enumC8206c04);
        EnumC8302v enumC8302v15 = new EnumC8302v("SFIXED64", 14, 14, 1, enumC8206c03);
        EnumC8302v enumC8302v16 = new EnumC8302v("SINT32", 15, 15, 1, enumC8206c04);
        EnumC8302v enumC8302v17 = new EnumC8302v("SINT64", 16, 16, 1, enumC8206c03);
        EnumC8302v enumC8302v18 = new EnumC8302v("GROUP", 17, 17, 1, enumC8206c07);
        EnumC8302v enumC8302v19 = new EnumC8302v("DOUBLE_LIST", 18, 18, 2, enumC8206c0);
        EnumC8302v enumC8302v20 = new EnumC8302v("FLOAT_LIST", 19, 19, 2, enumC8206c02);
        EnumC8302v enumC8302v21 = new EnumC8302v("INT64_LIST", 20, 20, 2, enumC8206c03);
        EnumC8302v enumC8302v22 = new EnumC8302v("UINT64_LIST", 21, 21, 2, enumC8206c03);
        EnumC8302v enumC8302v23 = new EnumC8302v("INT32_LIST", 22, 22, 2, enumC8206c04);
        EnumC8302v enumC8302v24 = new EnumC8302v("FIXED64_LIST", 23, 23, 2, enumC8206c03);
        EnumC8302v enumC8302v25 = new EnumC8302v("FIXED32_LIST", 24, 24, 2, enumC8206c04);
        EnumC8302v enumC8302v26 = new EnumC8302v("BOOL_LIST", 25, 25, 2, enumC8206c05);
        EnumC8302v enumC8302v27 = new EnumC8302v("STRING_LIST", 26, 26, 2, enumC8206c06);
        EnumC8302v enumC8302v28 = new EnumC8302v("MESSAGE_LIST", 27, 27, 2, enumC8206c07);
        EnumC8302v enumC8302v29 = new EnumC8302v("BYTES_LIST", 28, 28, 2, enumC8206c08);
        EnumC8302v enumC8302v30 = new EnumC8302v("UINT32_LIST", 29, 29, 2, enumC8206c04);
        EnumC8302v enumC8302v31 = new EnumC8302v("ENUM_LIST", 30, 30, 2, enumC8206c09);
        EnumC8302v enumC8302v32 = new EnumC8302v("SFIXED32_LIST", 31, 31, 2, enumC8206c04);
        EnumC8302v enumC8302v33 = new EnumC8302v("SFIXED64_LIST", 32, 32, 2, enumC8206c03);
        EnumC8302v enumC8302v34 = new EnumC8302v("SINT32_LIST", 33, 33, 2, enumC8206c04);
        EnumC8302v enumC8302v35 = new EnumC8302v("SINT64_LIST", 34, 34, 2, enumC8206c03);
        EnumC8302v enumC8302v36 = new EnumC8302v("DOUBLE_LIST_PACKED", 35, 35, 3, enumC8206c0);
        f16117b = enumC8302v36;
        EnumC8302v enumC8302v37 = new EnumC8302v("FLOAT_LIST_PACKED", 36, 36, 3, enumC8206c02);
        EnumC8302v enumC8302v38 = new EnumC8302v("INT64_LIST_PACKED", 37, 37, 3, enumC8206c03);
        EnumC8302v enumC8302v39 = new EnumC8302v("UINT64_LIST_PACKED", 38, 38, 3, enumC8206c03);
        EnumC8302v enumC8302v40 = new EnumC8302v("INT32_LIST_PACKED", 39, 39, 3, enumC8206c04);
        EnumC8302v enumC8302v41 = new EnumC8302v("FIXED64_LIST_PACKED", 40, 40, 3, enumC8206c03);
        EnumC8302v enumC8302v42 = new EnumC8302v("FIXED32_LIST_PACKED", 41, 41, 3, enumC8206c04);
        EnumC8302v enumC8302v43 = new EnumC8302v("BOOL_LIST_PACKED", 42, 42, 3, enumC8206c05);
        EnumC8302v enumC8302v44 = new EnumC8302v("UINT32_LIST_PACKED", 43, 43, 3, enumC8206c04);
        EnumC8302v enumC8302v45 = new EnumC8302v("ENUM_LIST_PACKED", 44, 44, 3, enumC8206c09);
        EnumC8302v enumC8302v46 = new EnumC8302v("SFIXED32_LIST_PACKED", 45, 45, 3, enumC8206c04);
        EnumC8302v enumC8302v47 = new EnumC8302v("SFIXED64_LIST_PACKED", 46, 46, 3, enumC8206c03);
        EnumC8302v enumC8302v48 = new EnumC8302v("SINT32_LIST_PACKED", 47, 47, 3, enumC8206c04);
        EnumC8302v enumC8302v49 = new EnumC8302v("SINT64_LIST_PACKED", 48, 48, 3, enumC8206c03);
        f16118c = enumC8302v49;
        f16120e = new EnumC8302v[]{enumC8302v, enumC8302v2, enumC8302v3, enumC8302v4, enumC8302v5, enumC8302v6, enumC8302v7, enumC8302v8, enumC8302v9, enumC8302v10, enumC8302v11, enumC8302v12, enumC8302v13, enumC8302v14, enumC8302v15, enumC8302v16, enumC8302v17, enumC8302v18, enumC8302v19, enumC8302v20, enumC8302v21, enumC8302v22, enumC8302v23, enumC8302v24, enumC8302v25, enumC8302v26, enumC8302v27, enumC8302v28, enumC8302v29, enumC8302v30, enumC8302v31, enumC8302v32, enumC8302v33, enumC8302v34, enumC8302v35, enumC8302v36, enumC8302v37, enumC8302v38, enumC8302v39, enumC8302v40, enumC8302v41, enumC8302v42, enumC8302v43, enumC8302v44, enumC8302v45, enumC8302v46, enumC8302v47, enumC8302v48, enumC8302v49, new EnumC8302v("GROUP_LIST", 49, 49, 2, enumC8206c07), new EnumC8302v("MAP", 50, 50, 4, EnumC8206c0.VOID)};
        EnumC8302v[] values = values();
        f16119d = new EnumC8302v[values.length];
        for (EnumC8302v enumC8302v50 : values) {
            f16119d[enumC8302v50.f16121a] = enumC8302v50;
        }
    }

    public EnumC8302v(String str, int i, int i2, int i3, EnumC8206c0 enumC8206c0) {
        this.f16121a = i2;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            enumC8206c0.getClass();
        }
        if (i3 == 1) {
            enumC8206c0.ordinal();
        }
    }

    public static EnumC8302v valueOf(String str) {
        return (EnumC8302v) Enum.valueOf(EnumC8302v.class, str);
    }

    public static EnumC8302v[] values() {
        return (EnumC8302v[]) f16120e.clone();
    }

    /* renamed from: a */
    public final int m3495a() {
        return this.f16121a;
    }
}
