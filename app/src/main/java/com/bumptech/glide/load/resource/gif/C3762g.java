package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.C3424g;
import com.bumptech.glide.C3439k;
import com.bumptech.glide.ComponentCallbacks2C3409b;
import com.bumptech.glide.ComponentCallbacks2C3441l;
import com.bumptech.glide.gifdecoder.C3429d;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.InterfaceC3585m;
import com.bumptech.glide.load.engine.AbstractC3543m;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import com.bumptech.glide.load.resource.C3770i;
import com.bumptech.glide.request.C3827g;
import com.bumptech.glide.request.target.AbstractC3833c;
import com.bumptech.glide.signature.C3845b;
import com.bumptech.glide.util.C3860j;
import com.bumptech.glide.util.C3861k;
import java.util.ArrayList;

/* renamed from: com.bumptech.glide.load.resource.gif.g */
/* loaded from: classes.dex */
public final class C3762g {

    /* renamed from: a */
    public final GifDecoder f9755a;

    /* renamed from: b */
    public final Handler f9756b;

    /* renamed from: c */
    public final ArrayList f9757c;

    /* renamed from: d */
    public final ComponentCallbacks2C3441l f9758d;

    /* renamed from: e */
    public final InterfaceC3485d f9759e;

    /* renamed from: f */
    public boolean f9760f;

    /* renamed from: g */
    public boolean f9761g;

    /* renamed from: h */
    public C3439k<Bitmap> f9762h;

    /* renamed from: i */
    public C3763a f9763i;

    /* renamed from: j */
    public boolean f9764j;

    /* renamed from: k */
    public C3763a f9765k;

    /* renamed from: l */
    public Bitmap f9766l;

    /* renamed from: m */
    public InterfaceC3585m<Bitmap> f9767m;

    /* renamed from: n */
    public C3763a f9768n;

    /* renamed from: o */
    public int f9769o;

    /* renamed from: p */
    public int f9770p;

    /* renamed from: q */
    public int f9771q;

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.resource.gif.g$a */
    /* loaded from: classes.dex */
    public static class C3763a extends AbstractC3833c<Bitmap> {

        /* renamed from: d */
        public final Handler f9772d;

        /* renamed from: e */
        public final int f9773e;

        /* renamed from: f */
        public final long f9774f;

        /* renamed from: g */
        public Bitmap f9775g;

        public C3763a(Handler handler, int i, long j) {
            this.f9772d = handler;
            this.f9773e = i;
            this.f9774f = j;
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3837g
        /* renamed from: b */
        public final void mo6431b(@NonNull Object obj) {
            this.f9775g = (Bitmap) obj;
            Handler handler = this.f9772d;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f9774f);
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3837g
        /* renamed from: g */
        public final void mo6425g(@Nullable Drawable drawable) {
            this.f9775g = null;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.g$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3764b {
        /* renamed from: a */
        void mo6505a();
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.g$c */
    /* loaded from: classes.dex */
    public class C3765c implements Handler.Callback {
        public C3765c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            C3762g c3762g = C3762g.this;
            if (i == 1) {
                c3762g.m6507b((C3763a) message.obj);
                return true;
            } else if (i == 2) {
                c3762g.f9758d.m6729i((C3763a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    public C3762g(ComponentCallbacks2C3409b componentCallbacks2C3409b, C3429d c3429d, int i, int i2, C3770i c3770i, Bitmap bitmap) {
        InterfaceC3485d interfaceC3485d = componentCallbacks2C3409b.f9033a;
        C3424g c3424g = componentCallbacks2C3409b.f9035c;
        ComponentCallbacks2C3441l m6783e = ComponentCallbacks2C3409b.m6783e(c3424g.getBaseContext());
        ComponentCallbacks2C3441l m6783e2 = ComponentCallbacks2C3409b.m6783e(c3424g.getBaseContext());
        m6783e2.getClass();
        C3439k<Bitmap> m6736s = new C3439k(m6783e2.f9164a, m6783e2, Bitmap.class, m6783e2.f9165b).m6736s(ComponentCallbacks2C3441l.f9163k).m6736s(((C3827g) ((C3827g) new C3827g().m6468d(AbstractC3543m.f9400a).m6456q()).m6459n()).m6464i(i, i2));
        this.f9757c = new ArrayList();
        this.f9758d = m6783e;
        Handler handler = new Handler(Looper.getMainLooper(), new C3765c());
        this.f9759e = interfaceC3485d;
        this.f9756b = handler;
        this.f9762h = m6736s;
        this.f9755a = c3429d;
        m6506c(c3770i, bitmap);
    }

    /* renamed from: a */
    public final void m6508a() {
        if (this.f9760f && !this.f9761g) {
            C3763a c3763a = this.f9768n;
            if (c3763a != null) {
                this.f9768n = null;
                m6507b(c3763a);
                return;
            }
            this.f9761g = true;
            GifDecoder gifDecoder = this.f9755a;
            long uptimeMillis = SystemClock.uptimeMillis() + gifDecoder.mo6753d();
            gifDecoder.mo6755b();
            this.f9765k = new C3763a(this.f9756b, gifDecoder.mo6752e(), uptimeMillis);
            C3439k<Bitmap> m6731x = this.f9762h.m6736s((C3827g) new C3827g().m6460m(new C3845b(Double.valueOf(Math.random())))).m6731x(gifDecoder);
            m6731x.m6732w(this.f9765k, m6731x);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    public final void m6507b(C3763a c3763a) {
        this.f9761g = false;
        boolean z = this.f9764j;
        Handler handler = this.f9756b;
        if (z) {
            handler.obtainMessage(2, c3763a).sendToTarget();
        } else if (!this.f9760f) {
            this.f9768n = c3763a;
        } else {
            if (c3763a.f9775g != null) {
                Bitmap bitmap = this.f9766l;
                if (bitmap != null) {
                    this.f9759e.mo6538d(bitmap);
                    this.f9766l = null;
                }
                C3763a c3763a2 = this.f9763i;
                this.f9763i = c3763a;
                ArrayList arrayList = this.f9757c;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((InterfaceC3764b) arrayList.get(size)).mo6505a();
                }
                if (c3763a2 != null) {
                    handler.obtainMessage(2, c3763a2).sendToTarget();
                }
            }
            m6508a();
        }
    }

    /* renamed from: c */
    public final void m6506c(InterfaceC3585m<Bitmap> interfaceC3585m, Bitmap bitmap) {
        C3860j.m6404b(interfaceC3585m);
        this.f9767m = interfaceC3585m;
        C3860j.m6404b(bitmap);
        this.f9766l = bitmap;
        this.f9762h = this.f9762h.m6736s(new C3827g().m6458o(interfaceC3585m, true));
        this.f9769o = C3861k.m6401c(bitmap);
        this.f9770p = bitmap.getWidth();
        this.f9771q = bitmap.getHeight();
    }
}
