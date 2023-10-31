package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF2 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.crypto.tink.shaded.protobuf.r1 */
/* loaded from: classes3.dex */
public class EnumC8289r1 {

    /* renamed from: b */
    public static final C8291b f16078b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC8289r1[] f16079c;

    /* renamed from: a */
    public final EnumC8296s1 f16080a;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC8289r1 EF0;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC8289r1 EF1;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC8289r1 EF2;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.r1$b */
    /* loaded from: classes3.dex */
    public enum C8291b extends EnumC8289r1 {
        public C8291b(EnumC8296s1 enumC8296s1) {
            super("GROUP", 9, enumC8296s1, 3);
        }
    }

    static {
        EnumC8289r1 enumC8289r1 = new EnumC8289r1("DOUBLE", 0, EnumC8296s1.DOUBLE, 1);
        EnumC8289r1 enumC8289r12 = new EnumC8289r1("FLOAT", 1, EnumC8296s1.FLOAT, 5);
        EnumC8296s1 enumC8296s1 = EnumC8296s1.LONG;
        EnumC8289r1 enumC8289r13 = new EnumC8289r1("INT64", 2, enumC8296s1, 0);
        EnumC8289r1 enumC8289r14 = new EnumC8289r1("UINT64", 3, enumC8296s1, 0);
        EnumC8296s1 enumC8296s12 = EnumC8296s1.INT;
        EnumC8289r1 enumC8289r15 = new EnumC8289r1("INT32", 4, enumC8296s12, 0);
        EnumC8289r1 enumC8289r16 = new EnumC8289r1("FIXED64", 5, enumC8296s1, 1);
        EnumC8289r1 enumC8289r17 = new EnumC8289r1("FIXED32", 6, enumC8296s12, 5);
        EnumC8289r1 enumC8289r18 = new EnumC8289r1("BOOL", 7, EnumC8296s1.BOOLEAN, 0);
        EnumC8289r1 enumC8289r19 = new EnumC8289r1() { // from class: com.google.crypto.tink.shaded.protobuf.r1.a
            {
                EnumC8296s1 enumC8296s13 = EnumC8296s1.STRING;
            }
        };
        EnumC8296s1 enumC8296s13 = EnumC8296s1.MESSAGE;
        C8291b c8291b = new C8291b(enumC8296s13);
        f16078b = c8291b;
        f16079c = new EnumC8289r1[]{enumC8289r1, enumC8289r12, enumC8289r13, enumC8289r14, enumC8289r15, enumC8289r16, enumC8289r17, enumC8289r18, enumC8289r19, c8291b, new EnumC8289r1(enumC8296s13) { // from class: com.google.crypto.tink.shaded.protobuf.r1.c
        }, new EnumC8289r1(EnumC8296s1.BYTE_STRING) { // from class: com.google.crypto.tink.shaded.protobuf.r1.d
        }, new EnumC8289r1("UINT32", 12, enumC8296s12, 0), new EnumC8289r1("ENUM", 13, EnumC8296s1.ENUM, 0), new EnumC8289r1("SFIXED32", 14, enumC8296s12, 5), new EnumC8289r1("SFIXED64", 15, enumC8296s1, 1), new EnumC8289r1("SINT32", 16, enumC8296s12, 0), new EnumC8289r1("SINT64", 17, enumC8296s1, 0)};
    }

    public /* synthetic */ EnumC8289r1() {
        throw null;
    }

    public EnumC8289r1(String str, int i, EnumC8296s1 enumC8296s1, int i2) {
        this.f16080a = enumC8296s1;
    }

    public static EnumC8289r1 valueOf(String str) {
        return (EnumC8289r1) Enum.valueOf(EnumC8289r1.class, str);
    }

    public static EnumC8289r1[] values() {
        return (EnumC8289r1[]) f16079c.clone();
    }
}
