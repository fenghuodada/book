package androidx.loader.app;

import androidx.annotation.NonNull;
import androidx.collection.C0483j;
import androidx.core.util.C0798b;
import androidx.lifecycle.AbstractC1460f0;
import androidx.lifecycle.C1469h0;
import androidx.lifecycle.C1478j0;
import androidx.lifecycle.C1489r;
import androidx.lifecycle.InterfaceC1483m;
import androidx.lifecycle.InterfaceC1490s;
import androidx.lifecycle.viewmodel.AbstractC1497a;
import java.io.PrintWriter;

/* renamed from: androidx.loader.app.b */
/* loaded from: classes.dex */
public final class C1516b extends AbstractC1515a {
    @NonNull

    /* renamed from: a */
    public final InterfaceC1483m f3492a;
    @NonNull

    /* renamed from: b */
    public final C1518b f3493b;

    /* renamed from: androidx.loader.app.b$a */
    /* loaded from: classes.dex */
    public static class C1517a<D> extends C1489r<D> {
        @Override // androidx.lifecycle.LiveData
        /* renamed from: f */
        public final void mo10513f() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: g */
        public final void mo10512g() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: h */
        public final void mo10511h(@NonNull InterfaceC1490s<? super D> interfaceC1490s) {
            super.mo10511h(interfaceC1490s);
        }

        @Override // androidx.lifecycle.C1489r, androidx.lifecycle.LiveData
        /* renamed from: i */
        public final void mo10510i(D d) {
            super.mo10510i(d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            C0798b.m11796a(sb, null);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b */
    /* loaded from: classes.dex */
    public static class C1518b extends AbstractC1460f0 {

        /* renamed from: b */
        public static final C1519a f3494b = new C1519a();

        /* renamed from: a */
        public final C0483j<C1517a> f3495a = new C0483j<>();

        /* renamed from: androidx.loader.app.b$b$a */
        /* loaded from: classes.dex */
        public static class C1519a implements C1469h0.InterfaceC1471b {
            @Override // androidx.lifecycle.C1469h0.InterfaceC1471b
            @NonNull
            public final <T extends AbstractC1460f0> T create(@NonNull Class<T> cls) {
                return new C1518b();
            }

            @Override // androidx.lifecycle.C1469h0.InterfaceC1471b
            public final AbstractC1460f0 create(Class cls, AbstractC1497a abstractC1497a) {
                return create(cls);
            }
        }

        @Override // androidx.lifecycle.AbstractC1460f0
        public final void onCleared() {
            super.onCleared();
            C0483j<C1517a> c0483j = this.f3495a;
            int i = c0483j.f1535c;
            if (i <= 0) {
                Object[] objArr = c0483j.f1534b;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                c0483j.f1535c = 0;
                return;
            }
            ((C1517a) c0483j.f1534b[0]).getClass();
            throw null;
        }
    }

    public C1516b(@NonNull InterfaceC1483m interfaceC1483m, @NonNull C1478j0 c1478j0) {
        this.f3492a = interfaceC1483m;
        this.f3493b = (C1518b) new C1469h0(c1478j0, C1518b.f3494b).m10545a(C1518b.class);
    }

    @Deprecated
    /* renamed from: b */
    public final void m10514b(String str, PrintWriter printWriter) {
        C0483j<C1517a> c0483j = this.f3493b.f3495a;
        if (c0483j.f1535c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (c0483j.f1535c > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(c0483j.f1533a[0]);
                printWriter.print(": ");
                printWriter.println(((C1517a) c0483j.f1534b[0]).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0798b.m11796a(sb, this.f3492a);
        sb.append("}}");
        return sb.toString();
    }
}
