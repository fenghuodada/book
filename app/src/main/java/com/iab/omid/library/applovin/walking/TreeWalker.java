package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.adsession.C8773a;
import com.iab.omid.library.applovin.p046b.C8775a;
import com.iab.omid.library.applovin.p047c.C8786b;
import com.iab.omid.library.applovin.p047c.InterfaceC8784a;
import com.iab.omid.library.applovin.p048d.C8790b;
import com.iab.omid.library.applovin.p048d.C8793d;
import com.iab.omid.library.applovin.p048d.C8795f;
import com.iab.omid.library.applovin.p049e.C8796a;
import com.iab.omid.library.applovin.walking.C8805a;
import com.iab.omid.library.applovin.walking.p050a.C8811c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TreeWalker implements InterfaceC8784a.InterfaceC8785a {

    /* renamed from: a */
    private static TreeWalker f16747a = new TreeWalker();

    /* renamed from: b */
    private static Handler f16748b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static Handler f16749c = null;

    /* renamed from: l */
    private static final Runnable f16750l = new Runnable() { // from class: com.iab.omid.library.applovin.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().m2983h();
        }
    };

    /* renamed from: m */
    private static final Runnable f16751m = new Runnable() { // from class: com.iab.omid.library.applovin.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f16749c != null) {
                TreeWalker.f16749c.post(TreeWalker.f16750l);
                TreeWalker.f16749c.postDelayed(TreeWalker.f16751m, 200L);
            }
        }
    };

    /* renamed from: e */
    private int f16753e;

    /* renamed from: k */
    private long f16759k;

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f16752d = new ArrayList();

    /* renamed from: f */
    private boolean f16754f = false;

    /* renamed from: g */
    private final List<C8796a> f16755g = new ArrayList();

    /* renamed from: i */
    private C8805a f16757i = new C8805a();

    /* renamed from: h */
    private C8786b f16756h = new C8786b();

    /* renamed from: j */
    private C8815b f16758j = new C8815b(new C8811c());

    /* loaded from: classes3.dex */
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    /* loaded from: classes3.dex */
    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* renamed from: a */
    private void m2997a(long j) {
        if (this.f16752d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f16752d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f16753e, TimeUnit.NANOSECONDS.toMillis(j));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f16753e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2996a(View view, InterfaceC8784a interfaceC8784a, JSONObject jSONObject, EnumC8816c enumC8816c, boolean z) {
        interfaceC8784a.mo3069a(view, jSONObject, this, enumC8816c == EnumC8816c.PARENT_VIEW, z);
    }

    /* renamed from: a */
    private void m2992a(String str, View view, JSONObject jSONObject) {
        InterfaceC8784a m3072b = this.f16756h.m3072b();
        String m2974a = this.f16757i.m2974a(str);
        if (m2974a != null) {
            JSONObject mo3070a = m3072b.mo3070a(view);
            C8790b.m3055a(mo3070a, str);
            C8790b.m3051b(mo3070a, m2974a);
            C8790b.m3053a(jSONObject, mo3070a);
        }
    }

    /* renamed from: a */
    private boolean m2994a(View view, JSONObject jSONObject) {
        String m2977a = this.f16757i.m2977a(view);
        if (m2977a != null) {
            C8790b.m3055a(jSONObject, m2977a);
            C8790b.m3056a(jSONObject, Boolean.valueOf(this.f16757i.m2967d(view)));
            this.f16757i.m2966e();
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m2990b(View view, JSONObject jSONObject) {
        C8805a.C8806a m2972b = this.f16757i.m2972b(view);
        if (m2972b != null) {
            C8790b.m3057a(jSONObject, m2972b);
            return true;
        }
        return false;
    }

    public static TreeWalker getInstance() {
        return f16747a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m2983h() {
        m2982i();
        m2987d();
        m2981j();
    }

    /* renamed from: i */
    private void m2982i() {
        this.f16753e = 0;
        this.f16755g.clear();
        this.f16754f = false;
        Iterator<C8773a> it = C8775a.m3126a().m3122c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().m3146b()) {
                this.f16754f = true;
                break;
            }
        }
        this.f16759k = C8793d.m3042a();
    }

    /* renamed from: j */
    private void m2981j() {
        m2997a(C8793d.m3042a() - this.f16759k);
    }

    /* renamed from: k */
    private void m2980k() {
        if (f16749c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f16749c = handler;
            handler.post(f16750l);
            f16749c.postDelayed(f16751m, 200L);
        }
    }

    /* renamed from: l */
    private void m2979l() {
        Handler handler = f16749c;
        if (handler != null) {
            handler.removeCallbacks(f16751m);
            f16749c = null;
        }
    }

    /* renamed from: a */
    public void m2998a() {
        m2980k();
    }

    @Override // com.iab.omid.library.applovin.p047c.InterfaceC8784a.InterfaceC8785a
    /* renamed from: a */
    public void mo2995a(View view, InterfaceC8784a interfaceC8784a, JSONObject jSONObject, boolean z) {
        EnumC8816c m2969c;
        if (C8795f.m3025d(view) && (m2969c = this.f16757i.m2969c(view)) != EnumC8816c.UNDERLYING_VIEW) {
            JSONObject mo3070a = interfaceC8784a.mo3070a(view);
            C8790b.m3053a(jSONObject, mo3070a);
            if (!m2994a(view, mo3070a)) {
                boolean z2 = z || m2990b(view, mo3070a);
                if (this.f16754f && m2969c == EnumC8816c.OBSTRUCTION_VIEW && !z2) {
                    this.f16755g.add(new C8796a(view));
                }
                m2996a(view, interfaceC8784a, mo3070a, m2969c, z2);
            }
            this.f16753e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f16752d.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f16752d.add(treeWalkerTimeLogger);
    }

    /* renamed from: b */
    public void m2991b() {
        m2988c();
        this.f16752d.clear();
        f16748b.post(new Runnable() { // from class: com.iab.omid.library.applovin.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f16758j.m2949a();
            }
        });
    }

    /* renamed from: c */
    public void m2988c() {
        m2979l();
    }

    @VisibleForTesting
    /* renamed from: d */
    public void m2987d() {
        this.f16757i.m2970c();
        long m3042a = C8793d.m3042a();
        InterfaceC8784a m3073a = this.f16756h.m3073a();
        if (this.f16757i.m2973b().size() > 0) {
            Iterator<String> it = this.f16757i.m2973b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject mo3070a = m3073a.mo3070a(null);
                m2992a(next, this.f16757i.m2971b(next), mo3070a);
                C8790b.m3058a(mo3070a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f16758j.m2945b(mo3070a, hashSet, m3042a);
            }
        }
        if (this.f16757i.m2978a().size() > 0) {
            JSONObject mo3070a2 = m3073a.mo3070a(null);
            m2996a(null, m3073a, mo3070a2, EnumC8816c.PARENT_VIEW, false);
            C8790b.m3058a(mo3070a2);
            this.f16758j.m2947a(mo3070a2, this.f16757i.m2978a(), m3042a);
            if (this.f16754f) {
                for (C8773a c8773a : C8775a.m3126a().m3122c()) {
                    c8773a.m3148a(this.f16755g);
                }
            }
        } else {
            this.f16758j.m2949a();
        }
        this.f16757i.m2968d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f16752d.contains(treeWalkerTimeLogger)) {
            this.f16752d.remove(treeWalkerTimeLogger);
        }
    }
}
