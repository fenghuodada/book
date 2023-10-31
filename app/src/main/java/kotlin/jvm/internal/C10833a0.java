package kotlin.jvm.internal;

import androidx.concurrent.futures.C0485b;
import java.util.List;
import kotlin.InterfaceC10739c;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.functions.InterfaceC10810b;
import kotlin.jvm.functions.InterfaceC10811c;
import kotlin.jvm.functions.InterfaceC10812d;
import kotlin.jvm.functions.InterfaceC10813e;
import kotlin.jvm.functions.InterfaceC10814f;
import kotlin.jvm.functions.InterfaceC10815g;
import kotlin.jvm.functions.InterfaceC10816h;
import kotlin.jvm.functions.InterfaceC10817i;
import kotlin.jvm.functions.InterfaceC10818j;
import kotlin.jvm.functions.InterfaceC10819k;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.functions.InterfaceC10821m;
import kotlin.jvm.functions.InterfaceC10822n;
import kotlin.jvm.functions.InterfaceC10823o;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.functions.InterfaceC10825q;
import kotlin.jvm.functions.InterfaceC10826r;
import kotlin.jvm.functions.InterfaceC10827s;
import kotlin.jvm.functions.InterfaceC10828t;
import kotlin.jvm.functions.InterfaceC10829u;
import kotlin.jvm.functions.InterfaceC10830v;
import kotlin.jvm.functions.InterfaceC10831w;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import kotlin.jvm.internal.markers.InterfaceC10848b;

/* renamed from: kotlin.jvm.internal.a0 */
/* loaded from: classes3.dex */
public final class C10833a0 {
    /* renamed from: a */
    public static List m440a(Object obj) {
        if ((obj instanceof InterfaceC10847a) && !(obj instanceof InterfaceC10848b)) {
            m438c(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            C10843j.m426j(C10833a0.class.getName(), e);
            throw e;
        }
    }

    /* renamed from: b */
    public static void m439b(int i, Object obj) {
        int i2;
        if (obj != null) {
            boolean z = false;
            if (obj instanceof InterfaceC10739c) {
                if (obj instanceof InterfaceC10840g) {
                    i2 = ((InterfaceC10840g) obj).getArity();
                } else if (obj instanceof InterfaceC10809a) {
                    i2 = 0;
                } else if (obj instanceof InterfaceC10820l) {
                    i2 = 1;
                } else if (obj instanceof InterfaceC10824p) {
                    i2 = 2;
                } else if (obj instanceof InterfaceC10825q) {
                    i2 = 3;
                } else if (obj instanceof InterfaceC10826r) {
                    i2 = 4;
                } else if (obj instanceof InterfaceC10827s) {
                    i2 = 5;
                } else if (obj instanceof InterfaceC10828t) {
                    i2 = 6;
                } else if (obj instanceof InterfaceC10829u) {
                    i2 = 7;
                } else if (obj instanceof InterfaceC10830v) {
                    i2 = 8;
                } else if (obj instanceof InterfaceC10831w) {
                    i2 = 9;
                } else if (obj instanceof InterfaceC10810b) {
                    i2 = 10;
                } else if (obj instanceof InterfaceC10811c) {
                    i2 = 11;
                } else if (obj instanceof InterfaceC10812d) {
                    i2 = 12;
                } else if (obj instanceof InterfaceC10813e) {
                    i2 = 13;
                } else if (obj instanceof InterfaceC10814f) {
                    i2 = 14;
                } else if (obj instanceof InterfaceC10815g) {
                    i2 = 15;
                } else if (obj instanceof InterfaceC10816h) {
                    i2 = 16;
                } else if (obj instanceof InterfaceC10817i) {
                    i2 = 17;
                } else if (obj instanceof InterfaceC10818j) {
                    i2 = 18;
                } else if (obj instanceof InterfaceC10819k) {
                    i2 = 19;
                } else if (obj instanceof InterfaceC10821m) {
                    i2 = 20;
                } else if (obj instanceof InterfaceC10822n) {
                    i2 = 21;
                } else if (obj instanceof InterfaceC10823o) {
                    i2 = 22;
                } else {
                    i2 = -1;
                }
                if (i2 == i) {
                    z = true;
                }
            }
            if (!z) {
                m438c(obj, "kotlin.jvm.functions.Function" + i);
                throw null;
            }
        }
    }

    /* renamed from: c */
    public static void m438c(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(C0485b.m12391a(name, " cannot be cast to ", str));
        C10843j.m426j(C10833a0.class.getName(), classCastException);
        throw classCastException;
    }
}
