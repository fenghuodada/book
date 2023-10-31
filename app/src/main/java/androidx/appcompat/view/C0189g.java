package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0922g2;
import androidx.core.view.C0934i2;
import androidx.core.view.InterfaceC0928h2;
import java.util.ArrayList;
import java.util.Iterator;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.g */
/* loaded from: classes.dex */
public final class C0189g {

    /* renamed from: c */
    public Interpolator f568c;

    /* renamed from: d */
    public InterfaceC0928h2 f569d;

    /* renamed from: e */
    public boolean f570e;

    /* renamed from: b */
    public long f567b = -1;

    /* renamed from: f */
    public final C0190a f571f = new C0190a();

    /* renamed from: a */
    public final ArrayList<C0922g2> f566a = new ArrayList<>();

    /* renamed from: androidx.appcompat.view.g$a */
    /* loaded from: classes.dex */
    public class C0190a extends C0934i2 {

        /* renamed from: a */
        public boolean f572a = false;

        /* renamed from: b */
        public int f573b = 0;

        public C0190a() {
        }

        @Override // androidx.core.view.C0934i2, androidx.core.view.InterfaceC0928h2
        /* renamed from: b */
        public final void mo11451b() {
            if (this.f572a) {
                return;
            }
            this.f572a = true;
            InterfaceC0928h2 interfaceC0928h2 = C0189g.this.f569d;
            if (interfaceC0928h2 != null) {
                interfaceC0928h2.mo11451b();
            }
        }

        @Override // androidx.core.view.InterfaceC0928h2
        /* renamed from: c */
        public final void mo11463c() {
            int i = this.f573b + 1;
            this.f573b = i;
            C0189g c0189g = C0189g.this;
            if (i == c0189g.f566a.size()) {
                InterfaceC0928h2 interfaceC0928h2 = c0189g.f569d;
                if (interfaceC0928h2 != null) {
                    interfaceC0928h2.mo11463c();
                }
                this.f573b = 0;
                this.f572a = false;
                c0189g.f570e = false;
            }
        }
    }

    /* renamed from: a */
    public final void m12871a() {
        if (this.f570e) {
            Iterator<C0922g2> it = this.f566a.iterator();
            while (it.hasNext()) {
                it.next().m11472b();
            }
            this.f570e = false;
        }
    }

    /* renamed from: b */
    public final void m12870b() {
        View view;
        if (this.f570e) {
            return;
        }
        Iterator<C0922g2> it = this.f566a.iterator();
        while (it.hasNext()) {
            C0922g2 next = it.next();
            long j = this.f567b;
            if (j >= 0) {
                next.m11471c(j);
            }
            Interpolator interpolator = this.f568c;
            if (interpolator != null && (view = next.f2634a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f569d != null) {
                next.m11470d(this.f571f);
            }
            View view2 = next.f2634a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f570e = true;
    }
}
