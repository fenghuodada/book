package p060j$.util.stream;

import java.util.EnumMap;
import java.util.Map;
import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10321P;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DISTINCT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.util.stream.X2 */
/* loaded from: classes2.dex */
public final class EnumC10587X2 {
    public static final EnumC10587X2 DISTINCT;
    public static final EnumC10587X2 ORDERED;
    public static final EnumC10587X2 SHORT_CIRCUIT;
    public static final EnumC10587X2 SIZED;
    public static final EnumC10587X2 SORTED;

    /* renamed from: f */
    static final int f21097f;

    /* renamed from: g */
    static final int f21098g;

    /* renamed from: h */
    static final int f21099h;

    /* renamed from: i */
    private static final int f21100i;

    /* renamed from: j */
    private static final int f21101j;

    /* renamed from: k */
    private static final int f21102k;

    /* renamed from: l */
    static final int f21103l;

    /* renamed from: m */
    static final int f21104m;

    /* renamed from: n */
    static final int f21105n;

    /* renamed from: o */
    static final int f21106o;

    /* renamed from: p */
    static final int f21107p;

    /* renamed from: q */
    static final int f21108q;

    /* renamed from: r */
    static final int f21109r;

    /* renamed from: s */
    static final int f21110s;

    /* renamed from: t */
    static final int f21111t;

    /* renamed from: u */
    static final int f21112u;

    /* renamed from: v */
    private static final /* synthetic */ EnumC10587X2[] f21113v;

    /* renamed from: a */
    private final Map f21114a;

    /* renamed from: b */
    private final int f21115b;

    /* renamed from: c */
    private final int f21116c;

    /* renamed from: d */
    private final int f21117d;

    /* renamed from: e */
    private final int f21118e;

    static {
        EnumC10583W2 enumC10583W2 = EnumC10583W2.SPLITERATOR;
        C10579V2 m757f = m757f(enumC10583W2);
        EnumC10583W2 enumC10583W22 = EnumC10583W2.STREAM;
        m757f.m765a(enumC10583W22);
        EnumC10583W2 enumC10583W23 = EnumC10583W2.OP;
        m757f.f21090a.put(enumC10583W23, 3);
        EnumC10587X2 enumC10587X2 = new EnumC10587X2("DISTINCT", 0, 0, m757f);
        DISTINCT = enumC10587X2;
        C10579V2 m757f2 = m757f(enumC10583W2);
        m757f2.m765a(enumC10583W22);
        m757f2.f21090a.put(enumC10583W23, 3);
        EnumC10587X2 enumC10587X22 = new EnumC10587X2("SORTED", 1, 1, m757f2);
        SORTED = enumC10587X22;
        C10579V2 m757f3 = m757f(enumC10583W2);
        m757f3.m765a(enumC10583W22);
        Map map = m757f3.f21090a;
        map.put(enumC10583W23, 3);
        EnumC10583W2 enumC10583W24 = EnumC10583W2.TERMINAL_OP;
        map.put(enumC10583W24, 2);
        EnumC10583W2 enumC10583W25 = EnumC10583W2.UPSTREAM_TERMINAL_OP;
        map.put(enumC10583W25, 2);
        EnumC10587X2 enumC10587X23 = new EnumC10587X2("ORDERED", 2, 2, m757f3);
        ORDERED = enumC10587X23;
        C10579V2 m757f4 = m757f(enumC10583W2);
        m757f4.m765a(enumC10583W22);
        m757f4.f21090a.put(enumC10583W23, 2);
        EnumC10587X2 enumC10587X24 = new EnumC10587X2("SIZED", 3, 3, m757f4);
        SIZED = enumC10587X24;
        C10579V2 m757f5 = m757f(enumC10583W23);
        m757f5.m765a(enumC10583W24);
        EnumC10587X2 enumC10587X25 = new EnumC10587X2("SHORT_CIRCUIT", 4, 12, m757f5);
        SHORT_CIRCUIT = enumC10587X25;
        f21113v = new EnumC10587X2[]{enumC10587X2, enumC10587X22, enumC10587X23, enumC10587X24, enumC10587X25};
        f21097f = m761b(enumC10583W2);
        f21098g = m761b(enumC10583W22);
        f21099h = m761b(enumC10583W23);
        m761b(enumC10583W24);
        m761b(enumC10583W25);
        int i = 0;
        for (EnumC10587X2 enumC10587X26 : values()) {
            i |= enumC10587X26.f21118e;
        }
        f21100i = i;
        int i2 = f21098g;
        f21101j = i2;
        int i3 = i2 << 1;
        f21102k = i3;
        f21103l = i2 | i3;
        EnumC10587X2 enumC10587X27 = DISTINCT;
        f21104m = enumC10587X27.f21116c;
        f21105n = enumC10587X27.f21117d;
        EnumC10587X2 enumC10587X28 = SORTED;
        f21106o = enumC10587X28.f21116c;
        f21107p = enumC10587X28.f21117d;
        EnumC10587X2 enumC10587X29 = ORDERED;
        f21108q = enumC10587X29.f21116c;
        f21109r = enumC10587X29.f21117d;
        EnumC10587X2 enumC10587X210 = SIZED;
        f21110s = enumC10587X210.f21116c;
        f21111t = enumC10587X210.f21117d;
        f21112u = SHORT_CIRCUIT.f21116c;
    }

    private EnumC10587X2(String str, int i, int i2, C10579V2 c10579v2) {
        EnumC10583W2[] values = EnumC10583W2.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            Map map = c10579v2.f21090a;
            if (i3 >= length) {
                this.f21114a = map;
                int i4 = i2 * 2;
                this.f21115b = i4;
                this.f21116c = 1 << i4;
                this.f21117d = 2 << i4;
                this.f21118e = 3 << i4;
                return;
            }
            AbstractC10331a.m998z(map, values[i3], 0);
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m762a(int i, int i2) {
        return i | (i2 & (i == 0 ? f21100i : ~(((f21101j & i) << 1) | i | ((f21102k & i) >> 1))));
    }

    /* renamed from: b */
    private static int m761b(EnumC10583W2 enumC10583W2) {
        EnumC10587X2[] values;
        int i = 0;
        for (EnumC10587X2 enumC10587X2 : values()) {
            i |= ((Integer) enumC10587X2.f21114a.get(enumC10583W2)).intValue() << enumC10587X2.f21115b;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m760c(InterfaceC10321P interfaceC10321P) {
        int characteristics = interfaceC10321P.characteristics();
        int i = characteristics & 4;
        int i2 = f21097f;
        return (i == 0 || interfaceC10321P.getComparator() == null) ? characteristics & i2 : characteristics & i2 & (-5);
    }

    /* renamed from: f */
    private static C10579V2 m757f(EnumC10583W2 enumC10583W2) {
        C10579V2 c10579v2 = new C10579V2(new EnumMap(EnumC10583W2.class));
        c10579v2.m765a(enumC10583W2);
        return c10579v2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m756g(int i) {
        return i & ((~i) >> 1) & f21101j;
    }

    public static EnumC10587X2 valueOf(String str) {
        return (EnumC10587X2) Enum.valueOf(EnumC10587X2.class, str);
    }

    public static EnumC10587X2[] values() {
        return (EnumC10587X2[]) f21113v.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m759d(int i) {
        return (i & this.f21118e) == this.f21116c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean m758e(int i) {
        int i2 = this.f21118e;
        return (i & i2) == i2;
    }
}
