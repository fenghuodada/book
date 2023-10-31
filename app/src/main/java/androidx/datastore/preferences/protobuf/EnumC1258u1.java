package androidx.datastore.preferences.protobuf;

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
/* renamed from: androidx.datastore.preferences.protobuf.u1 */
/* loaded from: classes.dex */
public class EnumC1258u1 {

    /* renamed from: c */
    public static final C1259a f3089c;

    /* renamed from: d */
    public static final C1260b f3090d;

    /* renamed from: e */
    public static final C1261c f3091e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC1258u1[] f3092f;

    /* renamed from: a */
    public final EnumC1266v1 f3093a;

    /* renamed from: b */
    public final int f3094b;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC1258u1 EF0;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC1258u1 EF1;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC1258u1 EF2;

    /* renamed from: androidx.datastore.preferences.protobuf.u1$a */
    /* loaded from: classes.dex */
    public enum C1259a extends EnumC1258u1 {
        public C1259a() {
            super("STRING", 8, EnumC1266v1.STRING, 2);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.u1$b */
    /* loaded from: classes.dex */
    public enum C1260b extends EnumC1258u1 {
        public C1260b(EnumC1266v1 enumC1266v1) {
            super("GROUP", 9, enumC1266v1, 3);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.u1$c */
    /* loaded from: classes.dex */
    public enum C1261c extends EnumC1258u1 {
        public C1261c(EnumC1266v1 enumC1266v1) {
            super("MESSAGE", 10, enumC1266v1, 2);
        }
    }

    static {
        EnumC1258u1 enumC1258u1 = new EnumC1258u1("DOUBLE", 0, EnumC1266v1.DOUBLE, 1);
        EnumC1258u1 enumC1258u12 = new EnumC1258u1("FLOAT", 1, EnumC1266v1.FLOAT, 5);
        EnumC1266v1 enumC1266v1 = EnumC1266v1.LONG;
        EnumC1258u1 enumC1258u13 = new EnumC1258u1("INT64", 2, enumC1266v1, 0);
        EnumC1258u1 enumC1258u14 = new EnumC1258u1("UINT64", 3, enumC1266v1, 0);
        EnumC1266v1 enumC1266v12 = EnumC1266v1.INT;
        EnumC1258u1 enumC1258u15 = new EnumC1258u1("INT32", 4, enumC1266v12, 0);
        EnumC1258u1 enumC1258u16 = new EnumC1258u1("FIXED64", 5, enumC1266v1, 1);
        EnumC1258u1 enumC1258u17 = new EnumC1258u1("FIXED32", 6, enumC1266v12, 5);
        EnumC1258u1 enumC1258u18 = new EnumC1258u1("BOOL", 7, EnumC1266v1.BOOLEAN, 0);
        C1259a c1259a = new C1259a();
        f3089c = c1259a;
        EnumC1266v1 enumC1266v13 = EnumC1266v1.MESSAGE;
        C1260b c1260b = new C1260b(enumC1266v13);
        f3090d = c1260b;
        C1261c c1261c = new C1261c(enumC1266v13);
        f3091e = c1261c;
        f3092f = new EnumC1258u1[]{enumC1258u1, enumC1258u12, enumC1258u13, enumC1258u14, enumC1258u15, enumC1258u16, enumC1258u17, enumC1258u18, c1259a, c1260b, c1261c, new EnumC1258u1(EnumC1266v1.BYTE_STRING) { // from class: androidx.datastore.preferences.protobuf.u1.d
        }, new EnumC1258u1("UINT32", 12, enumC1266v12, 0), new EnumC1258u1("ENUM", 13, EnumC1266v1.ENUM, 0), new EnumC1258u1("SFIXED32", 14, enumC1266v12, 5), new EnumC1258u1("SFIXED64", 15, enumC1266v1, 1), new EnumC1258u1("SINT32", 16, enumC1266v12, 0), new EnumC1258u1("SINT64", 17, enumC1266v1, 0)};
    }

    public /* synthetic */ EnumC1258u1() {
        throw null;
    }

    public EnumC1258u1(String str, int i, EnumC1266v1 enumC1266v1, int i2) {
        this.f3093a = enumC1266v1;
        this.f3094b = i2;
    }

    public static EnumC1258u1 valueOf(String str) {
        return (EnumC1258u1) Enum.valueOf(EnumC1258u1.class, str);
    }

    public static EnumC1258u1[] values() {
        return (EnumC1258u1[]) f3092f.clone();
    }
}
