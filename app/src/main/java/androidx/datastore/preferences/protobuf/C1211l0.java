package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.C1149f;
import androidx.datastore.preferences.protobuf.EnumC1258u1;
import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.l0 */
/* loaded from: classes.dex */
public final class C1211l0<K, V> {

    /* renamed from: a */
    public final C1212a<K, V> f3038a;

    /* renamed from: b */
    public final K f3039b = "";

    /* renamed from: c */
    public final V f3040c;

    /* renamed from: androidx.datastore.preferences.protobuf.l0$a */
    /* loaded from: classes.dex */
    public static class C1212a<K, V> {

        /* renamed from: a */
        public final EnumC1258u1 f3041a;

        /* renamed from: b */
        public final K f3042b = "";

        /* renamed from: c */
        public final EnumC1258u1 f3043c;

        /* renamed from: d */
        public final V f3044d;

        /* JADX WARN: Multi-variable type inference failed */
        public C1212a(EnumC1258u1.C1259a c1259a, EnumC1258u1.C1261c c1261c, C1149f c1149f) {
            this.f3041a = c1259a;
            this.f3043c = c1261c;
            this.f3044d = c1149f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1211l0(EnumC1258u1.C1259a c1259a, EnumC1258u1.C1261c c1261c, C1149f c1149f) {
        this.f3038a = new C1212a<>(c1259a, c1261c, c1149f);
        this.f3040c = c1149f;
    }

    /* renamed from: a */
    public static <K, V> int m10957a(C1212a<K, V> c1212a, K k, V v) {
        return C1263v.m10772c(c1212a.f3043c, 2, v) + C1263v.m10772c(c1212a.f3041a, 1, k);
    }

    /* renamed from: b */
    public static <K, V> void m10956b(AbstractC1214m abstractC1214m, C1212a<K, V> c1212a, K k, V v) throws IOException {
        C1263v.m10759p(abstractC1214m, c1212a.f3041a, 1, k);
        C1263v.m10759p(abstractC1214m, c1212a.f3043c, 2, v);
    }
}
