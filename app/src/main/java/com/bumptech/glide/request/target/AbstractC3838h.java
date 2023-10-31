package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ambrose.overwall.R;
import com.bumptech.glide.request.InterfaceC3823c;
import com.bumptech.glide.util.C3860j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@Deprecated
/* renamed from: com.bumptech.glide.request.target.h */
/* loaded from: classes.dex */
public abstract class AbstractC3838h<T extends View, Z> extends AbstractC3831a<Z> {

    /* renamed from: a */
    public final T f9921a;

    /* renamed from: b */
    public final C3839a f9922b;

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.request.target.h$a */
    /* loaded from: classes.dex */
    public static final class C3839a {
        @Nullable
        @VisibleForTesting

        /* renamed from: d */
        public static Integer f9923d;

        /* renamed from: a */
        public final View f9924a;

        /* renamed from: b */
        public final ArrayList f9925b = new ArrayList();
        @Nullable

        /* renamed from: c */
        public ViewTreeObserver$OnPreDrawListenerC3840a f9926c;

        /* renamed from: com.bumptech.glide.request.target.h$a$a */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC3840a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference<C3839a> f9927a;

            public ViewTreeObserver$OnPreDrawListenerC3840a(@NonNull C3839a c3839a) {
                this.f9927a = new WeakReference<>(c3839a);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean z;
                boolean z2;
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C3839a c3839a = this.f9927a.get();
                if (c3839a != null) {
                    ArrayList arrayList = c3839a.f9925b;
                    if (!arrayList.isEmpty()) {
                        int m6421c = c3839a.m6421c();
                        int m6422b = c3839a.m6422b();
                        boolean z3 = false;
                        if (m6421c <= 0 && m6421c != Integer.MIN_VALUE) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            if (m6422b <= 0 && m6422b != Integer.MIN_VALUE) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                z3 = true;
                            }
                        }
                        if (z3) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((InterfaceC3836f) it.next()).mo6432b(m6421c, m6422b);
                            }
                            ViewTreeObserver viewTreeObserver = c3839a.f9924a.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(c3839a.f9926c);
                            }
                            c3839a.f9926c = null;
                            arrayList.clear();
                        }
                    }
                }
                return true;
            }
        }

        public C3839a(@NonNull View view) {
            this.f9924a = view;
        }

        /* renamed from: a */
        public final int m6423a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            View view = this.f9924a;
            if (!view.isLayoutRequested() && i2 == -2) {
                if (Log.isLoggable("ViewTarget", 4)) {
                    Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
                }
                Context context = view.getContext();
                if (f9923d == null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    C3860j.m6404b(windowManager);
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    f9923d = Integer.valueOf(Math.max(point.x, point.y));
                }
                return f9923d.intValue();
            }
            return 0;
        }

        /* renamed from: b */
        public final int m6422b() {
            View view = this.f9924a;
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return m6423a(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        /* renamed from: c */
        public final int m6421c() {
            View view = this.f9924a;
            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return m6423a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }
    }

    public AbstractC3838h(@NonNull T t) {
        C3860j.m6404b(t);
        this.f9921a = t;
        this.f9922b = new C3839a(t);
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3837g
    @CallSuper
    /* renamed from: a */
    public final void mo6428a(@NonNull InterfaceC3836f interfaceC3836f) {
        this.f9922b.f9925b.remove(interfaceC3836f);
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3837g
    /* renamed from: c */
    public final void mo6427c(@Nullable InterfaceC3823c interfaceC3823c) {
        this.f9921a.setTag(R.id.glide_custom_view_target_tag, interfaceC3823c);
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3837g
    @Nullable
    /* renamed from: f */
    public final InterfaceC3823c mo6426f() {
        Object tag = this.f9921a.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof InterfaceC3823c) {
                return (InterfaceC3823c) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3837g
    @CallSuper
    /* renamed from: g */
    public void mo6425g(@Nullable Drawable drawable) {
        C3839a c3839a = this.f9922b;
        ViewTreeObserver viewTreeObserver = c3839a.f9924a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c3839a.f9926c);
        }
        c3839a.f9926c = null;
        c3839a.f9925b.clear();
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3837g
    @CallSuper
    /* renamed from: h */
    public final void mo6424h(@NonNull InterfaceC3836f interfaceC3836f) {
        boolean z;
        boolean z2;
        C3839a c3839a = this.f9922b;
        int m6421c = c3839a.m6421c();
        int m6422b = c3839a.m6422b();
        boolean z3 = false;
        if (m6421c <= 0 && m6421c != Integer.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (m6422b <= 0 && m6422b != Integer.MIN_VALUE) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                z3 = true;
            }
        }
        if (z3) {
            interfaceC3836f.mo6432b(m6421c, m6422b);
            return;
        }
        ArrayList arrayList = c3839a.f9925b;
        if (!arrayList.contains(interfaceC3836f)) {
            arrayList.add(interfaceC3836f);
        }
        if (c3839a.f9926c == null) {
            ViewTreeObserver viewTreeObserver = c3839a.f9924a.getViewTreeObserver();
            C3839a.ViewTreeObserver$OnPreDrawListenerC3840a viewTreeObserver$OnPreDrawListenerC3840a = new C3839a.ViewTreeObserver$OnPreDrawListenerC3840a(c3839a);
            c3839a.f9926c = viewTreeObserver$OnPreDrawListenerC3840a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC3840a);
        }
    }

    public final String toString() {
        return "Target for: " + this.f9921a;
    }
}
