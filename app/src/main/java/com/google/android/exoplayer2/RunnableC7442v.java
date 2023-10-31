package com.google.android.exoplayer2;

import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.C6968g0;
import com.google.android.exoplayer2.C6989k0;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.video.InterfaceC7494v;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.v */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7442v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f13997a;

    /* renamed from: b */
    public final /* synthetic */ Object f13998b;

    /* renamed from: c */
    public final /* synthetic */ Object f13999c;

    public /* synthetic */ RunnableC7442v(int i, Object obj, Object obj2) {
        this.f13997a = i;
        this.f13998b = obj;
        this.f13999c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        boolean z;
        boolean z2;
        switch (this.f13997a) {
            case 0:
                C6968g0 c6968g0 = (C6968g0) this.f13998b;
                C6989k0.C6993d c6993d = (C6989k0.C6993d) this.f13999c;
                int i = c6968g0.f12062w - c6993d.f12239c;
                c6968g0.f12062w = i;
                boolean z3 = true;
                if (c6993d.f12240d) {
                    c6968g0.f12063x = c6993d.f12241e;
                    c6968g0.f12064y = true;
                }
                if (c6993d.f12242f) {
                    c6968g0.f12065z = c6993d.f12243g;
                }
                if (i == 0) {
                    AbstractC6984j1 abstractC6984j1 = c6993d.f12238b.f14256a;
                    if (!c6968g0.f12038D.f14256a.m5685p() && abstractC6984j1.m5685p()) {
                        c6968g0.f12039E = -1;
                        c6968g0.f12040F = 0L;
                    }
                    if (!abstractC6984j1.m5685p()) {
                        List asList = Arrays.asList(((C6737c1) abstractC6984j1).f10895j);
                        if (asList.size() == c6968g0.f12051l.size()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C7394a.m5131d(z2);
                        for (int i2 = 0; i2 < asList.size(); i2++) {
                            ((C6968g0.C6969a) c6968g0.f12051l.get(i2)).f12067b = (AbstractC6984j1) asList.get(i2);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (c6968g0.f12064y) {
                        if (c6993d.f12238b.f14257b.equals(c6968g0.f12038D.f14257b) && c6993d.f12238b.f14259d == c6968g0.f12038D.f14274s) {
                            z3 = false;
                        }
                        if (z3) {
                            if (!abstractC6984j1.m5685p() && !c6993d.f12238b.f14257b.m5394a()) {
                                C7508z0 c7508z0 = c6993d.f12238b;
                                InterfaceC7188p.C7189a c7189a = c7508z0.f14257b;
                                long j3 = c7508z0.f14259d;
                                Object obj = c7189a.f12928a;
                                AbstractC6984j1.C6986b c6986b = c6968g0.f12050k;
                                abstractC6984j1.mo5689g(obj, c6986b);
                                j2 = j3 + c6986b.f12156e;
                            } else {
                                j2 = c6993d.f12238b.f14259d;
                            }
                        }
                        j = j2;
                        z = z3;
                    } else {
                        j = -9223372036854775807L;
                        z = false;
                    }
                    c6968g0.f12064y = false;
                    c6968g0.m5768h0(c6993d.f12238b, 1, c6968g0.f12065z, false, z, c6968g0.f12063x, j, -1);
                    return;
                }
                return;
            default:
                InterfaceC7494v.C7495a c7495a = (InterfaceC7494v.C7495a) this.f13998b;
                c7495a.getClass();
                int i3 = C7408g0.f13905a;
                c7495a.f14217b.mo4901G((Exception) this.f13999c);
                return;
        }
    }
}
