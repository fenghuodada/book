package com.qmuiteam.qmui.skin;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.C0235r;
import androidx.collection.C0482i;
import androidx.core.p003os.C0740h;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.qqface.C9094c;
import com.qmuiteam.qmui.skin.annotation.QMUISkinListenWithHierarchyChange;
import com.qmuiteam.qmui.skin.handler.C9116b;
import com.qmuiteam.qmui.skin.handler.C9117c;
import com.qmuiteam.qmui.skin.handler.C9118d;
import com.qmuiteam.qmui.skin.handler.C9119e;
import com.qmuiteam.qmui.skin.handler.C9124j;
import com.qmuiteam.qmui.skin.handler.C9125k;
import com.qmuiteam.qmui.skin.handler.C9126l;
import com.qmuiteam.qmui.skin.handler.C9127m;
import com.qmuiteam.qmui.skin.handler.C9128n;
import com.qmuiteam.qmui.skin.handler.C9129o;
import com.qmuiteam.qmui.skin.handler.C9130p;
import com.qmuiteam.qmui.skin.handler.C9131q;
import com.qmuiteam.qmui.skin.handler.C9132r;
import com.qmuiteam.qmui.skin.handler.C9133s;
import com.qmuiteam.qmui.skin.handler.C9134t;
import com.qmuiteam.qmui.skin.handler.InterfaceC9115a;
import com.qmuiteam.qmui.util.C9145f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.qmuiteam.qmui.skin.h */
/* loaded from: classes3.dex */
public final class C9108h {

    /* renamed from: i */
    public static final String[] f17543i = new String[0];

    /* renamed from: j */
    public static final ArrayMap<String, C9108h> f17544j = new ArrayMap<>();

    /* renamed from: k */
    public static final C9109a f17545k = new C9109a();

    /* renamed from: l */
    public static final HashMap<String, InterfaceC9115a> f17546l;

    /* renamed from: m */
    public static final HashMap<Integer, Resources.Theme> f17547m;

    /* renamed from: n */
    public static final View$OnLayoutChangeListenerC9110b f17548n;

    /* renamed from: o */
    public static final ViewGroup$OnHierarchyChangeListenerC9111c f17549o;

    /* renamed from: a */
    public final String f17550a;

    /* renamed from: b */
    public final Resources f17551b;

    /* renamed from: c */
    public final String f17552c;

    /* renamed from: d */
    public final SparseArray<C9113e> f17553d = new SparseArray<>();

    /* renamed from: e */
    public boolean f17554e = false;

    /* renamed from: f */
    public int f17555f = -1;

    /* renamed from: g */
    public final ArrayList f17556g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f17557h = new ArrayList();

    /* renamed from: com.qmuiteam.qmui.skin.h$a */
    /* loaded from: classes3.dex */
    public class C9109a {
    }

    /* renamed from: com.qmuiteam.qmui.skin.h$b */
    /* loaded from: classes3.dex */
    public class View$OnLayoutChangeListenerC9110b implements View.OnLayoutChangeListener {
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ViewGroup viewGroup;
            int childCount;
            C9114f m2668h;
            if (!(view instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) view).getChildCount()) <= 0 || (m2668h = C9108h.m2668h(viewGroup)) == null) {
                return;
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = viewGroup.getChildAt(i9);
                if (!m2668h.equals(C9108h.m2668h(childAt))) {
                    C9108h.m2667i(childAt.getContext(), m2668h.f17560a).m2669g(m2668h.f17561b, childAt);
                }
            }
        }
    }

    /* renamed from: com.qmuiteam.qmui.skin.h$c */
    /* loaded from: classes3.dex */
    public class ViewGroup$OnHierarchyChangeListenerC9111c implements ViewGroup.OnHierarchyChangeListener {
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            C9114f m2668h = C9108h.m2668h(view);
            if (m2668h == null || m2668h.equals(C9108h.m2668h(view2))) {
                return;
            }
            C9108h.m2667i(view2.getContext(), m2668h.f17560a).m2669g(m2668h.f17561b, view2);
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
        }
    }

    /* renamed from: com.qmuiteam.qmui.skin.h$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC9112d {
        /* renamed from: a */
        void mo2564a(int i);
    }

    /* renamed from: com.qmuiteam.qmui.skin.h$e */
    /* loaded from: classes3.dex */
    public class C9113e {

        /* renamed from: a */
        public final int f17558a;

        public C9113e(int i) {
            this.f17558a = i;
        }

        @NonNull
        /* renamed from: a */
        public final Resources.Theme m2662a() {
            HashMap<Integer, Resources.Theme> hashMap = C9108h.f17547m;
            int i = this.f17558a;
            Resources.Theme theme = hashMap.get(Integer.valueOf(i));
            if (theme == null) {
                Resources.Theme newTheme = C9108h.this.f17551b.newTheme();
                newTheme.applyStyle(i, true);
                hashMap.put(Integer.valueOf(i), newTheme);
                return newTheme;
            }
            return theme;
        }
    }

    /* renamed from: com.qmuiteam.qmui.skin.h$f */
    /* loaded from: classes3.dex */
    public class C9114f {

        /* renamed from: a */
        public final String f17560a;

        /* renamed from: b */
        public final int f17561b;

        public C9114f(String str, int i) {
            this.f17560a = str;
            this.f17561b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C9114f.class != obj.getClass()) {
                return false;
            }
            C9114f c9114f = (C9114f) obj;
            return this.f17561b == c9114f.f17561b && Objects.equals(this.f17560a, c9114f.f17560a);
        }

        public final int hashCode() {
            return Objects.hash(this.f17560a, Integer.valueOf(this.f17561b));
        }
    }

    static {
        HashMap<String, InterfaceC9115a> hashMap = new HashMap<>();
        f17546l = hashMap;
        f17547m = new HashMap<>();
        hashMap.put("background", new C9117c());
        C9130p c9130p = new C9130p();
        hashMap.put("textColor", c9130p);
        hashMap.put("secondTextColor", c9130p);
        hashMap.put("src", new C9129o());
        hashMap.put("border", new C9119e());
        C9128n c9128n = new C9128n();
        hashMap.put("topSeparator", c9128n);
        hashMap.put("rightSeparator", c9128n);
        hashMap.put("bottomSeparator", c9128n);
        hashMap.put("LeftSeparator", c9128n);
        hashMap.put("tintColor", new C9133s());
        hashMap.put("alpha", new C9116b());
        hashMap.put("bgTintColor", new C9118d());
        hashMap.put("progressColor", new C9127m());
        hashMap.put("tcTintColor", new C9132r());
        C9131q c9131q = new C9131q();
        hashMap.put("tclSrc", c9131q);
        hashMap.put("tctSrc", c9131q);
        hashMap.put("tcrSrc", c9131q);
        hashMap.put("tcbSrc", c9131q);
        hashMap.put("hintColor", new C9124j());
        hashMap.put("underline", new C9134t());
        hashMap.put("moreTextColor", new C9126l());
        hashMap.put("moreBgColor", new C9125k());
        f17548n = new View$OnLayoutChangeListenerC9110b();
        f17549o = new ViewGroup$OnHierarchyChangeListenerC9111c();
    }

    public C9108h(String str, Resources resources, String str2) {
        this.f17550a = str;
        this.f17551b = resources;
        this.f17552c = str2;
    }

    @MainThread
    /* renamed from: f */
    public static C9108h m2670f(Context context) {
        Context applicationContext = context.getApplicationContext();
        Resources resources = applicationContext.getResources();
        String packageName = applicationContext.getPackageName();
        ArrayMap<String, C9108h> arrayMap = f17544j;
        C9108h c9108h = arrayMap.get("default");
        if (c9108h == null) {
            C9108h c9108h2 = new C9108h("default", resources, packageName);
            arrayMap.put("default", c9108h2);
            return c9108h2;
        }
        return c9108h;
    }

    /* renamed from: h */
    public static C9114f m2668h(View view) {
        Object tag = view.getTag(R.id.qmui_skin_current);
        if (tag instanceof C9114f) {
            return (C9114f) tag;
        }
        return null;
    }

    @MainThread
    /* renamed from: i */
    public static C9108h m2667i(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        Resources resources = applicationContext.getResources();
        String packageName = applicationContext.getPackageName();
        ArrayMap<String, C9108h> arrayMap = f17544j;
        C9108h c9108h = arrayMap.get(str);
        if (c9108h == null) {
            C9108h c9108h2 = new C9108h(str, resources, packageName);
            arrayMap.put(str, c9108h2);
            return c9108h2;
        }
        return c9108h;
    }

    @MainThread
    /* renamed from: a */
    public final void m2675a(int i, int i2) {
        if (i > 0) {
            SparseArray<C9113e> sparseArray = this.f17553d;
            C9113e c9113e = sparseArray.get(i);
            if (c9113e != null) {
                if (c9113e.f17558a == i2) {
                    return;
                }
                throw new RuntimeException(C0235r.m12816a("already exist the theme item for ", i));
            }
            sparseArray.append(i, new C9113e(i2));
            return;
        }
        throw new IllegalArgumentException("index must greater than 0");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9 A[Catch: all -> 0x0105, TryCatch #0 {all -> 0x0105, blocks: (B:46:0x00a5, B:48:0x00a9, B:50:0x00b3, B:52:0x00be, B:53:0x00c3, B:55:0x00c7, B:57:0x00cf, B:60:0x00d7, B:62:0x00e3, B:63:0x00e8, B:64:0x00eb, B:65:0x0104, B:49:0x00b0), top: B:70:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0 A[Catch: all -> 0x0105, TryCatch #0 {all -> 0x0105, blocks: (B:46:0x00a5, B:48:0x00a9, B:50:0x00b3, B:52:0x00be, B:53:0x00c3, B:55:0x00c7, B:57:0x00cf, B:60:0x00d7, B:62:0x00e3, B:63:0x00e8, B:64:0x00eb, B:65:0x0104, B:49:0x00b0), top: B:70:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be A[Catch: all -> 0x0105, TryCatch #0 {all -> 0x0105, blocks: (B:46:0x00a5, B:48:0x00a9, B:50:0x00b3, B:52:0x00be, B:53:0x00c3, B:55:0x00c7, B:57:0x00cf, B:60:0x00d7, B:62:0x00e3, B:63:0x00e8, B:64:0x00eb, B:65:0x0104, B:49:0x00b0), top: B:70:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7 A[Catch: all -> 0x0105, TryCatch #0 {all -> 0x0105, blocks: (B:46:0x00a5, B:48:0x00a9, B:50:0x00b3, B:52:0x00be, B:53:0x00c3, B:55:0x00c7, B:57:0x00cf, B:60:0x00d7, B:62:0x00e3, B:63:0x00e8, B:64:0x00eb, B:65:0x0104, B:49:0x00b0), top: B:70:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2674b(@androidx.annotation.NonNull android.view.View r12, int r13, android.content.res.Resources.Theme r14) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.skin.C9108h.m2674b(android.view.View, int, android.content.res.Resources$Theme):void");
    }

    @MainThread
    /* renamed from: c */
    public final void m2673c(int i) {
        View view;
        Window window;
        if (this.f17555f == i) {
            return;
        }
        this.f17555f = i;
        this.f17554e = true;
        ArrayList arrayList = this.f17556g;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = ((WeakReference) arrayList.get(size)).get();
            if (obj == null) {
                arrayList.remove(size);
            } else {
                if (obj instanceof Activity) {
                    Activity activity = (Activity) obj;
                    activity.getWindow().setBackgroundDrawable(C9145f.m2635f(R.attr.qmui_skin_support_activity_background, activity, this.f17553d.get(i).m2662a()));
                    view = activity.findViewById(16908290);
                } else if (obj instanceof Fragment) {
                    view = ((Fragment) obj).getView();
                } else if (obj instanceof Dialog) {
                    window = ((Dialog) obj).getWindow();
                    if (window == null) {
                    }
                    view = window.getDecorView();
                } else if (obj instanceof PopupWindow) {
                    view = ((PopupWindow) obj).getContentView();
                } else if (obj instanceof Window) {
                    window = (Window) obj;
                    view = window.getDecorView();
                } else if (obj instanceof View) {
                    view = (View) obj;
                }
                m2669g(i, view);
            }
        }
        ArrayList arrayList2 = this.f17557h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC9112d) arrayList2.get(size2)).mo2564a(this.f17555f);
        }
        this.f17554e = false;
    }

    /* renamed from: d */
    public final boolean m2672d(Object obj) {
        ArrayList arrayList = this.f17556g;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj2 = ((WeakReference) arrayList.get(size)).get();
            if (obj2 == obj) {
                return true;
            }
            if (obj2 == null) {
                arrayList.remove(size);
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void m2671e(@NonNull View view, Resources.Theme theme, @Nullable C0482i<String, Integer> c0482i) {
        int intValue;
        InterfaceC9115a interfaceC9115a;
        if (c0482i != null) {
            for (int i = 0; i < c0482i.f1531c; i++) {
                String m12398h = c0482i.m12398h(i);
                Integer m12397l = c0482i.m12397l(i);
                if (m12397l != null && (intValue = m12397l.intValue()) != 0 && (interfaceC9115a = f17546l.get(m12398h)) != null) {
                    interfaceC9115a.mo2661a(view, theme, m12398h, intValue);
                }
            }
        }
    }

    /* renamed from: g */
    public final void m2669g(int i, View view) {
        Resources.Theme m2662a;
        if (view == null) {
            return;
        }
        C9113e c9113e = this.f17553d.get(i);
        if (c9113e == null) {
            if (i == -1) {
                m2662a = view.getContext().getTheme();
            } else {
                throw new IllegalArgumentException(C0740h.m11849a("The skin ", i, " does not exist"));
            }
        } else {
            m2662a = c9113e.m2662a();
        }
        m2663m(view, i, m2662a);
    }

    /* renamed from: j */
    public final void m2666j(@NonNull Activity activity) {
        if (!m2672d(activity)) {
            this.f17556g.add(new WeakReference(activity));
        }
        m2669g(this.f17555f, activity.findViewById(16908290));
    }

    /* renamed from: k */
    public final void m2665k(@NonNull Dialog dialog) {
        if (!m2672d(dialog)) {
            this.f17556g.add(new WeakReference(dialog));
        }
        Window window = dialog.getWindow();
        if (window != null) {
            m2669g(this.f17555f, window.getDecorView());
        }
    }

    /* renamed from: l */
    public final void m2664l(Object obj) {
        ArrayList arrayList = this.f17556g;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Object obj2 = ((WeakReference) arrayList.get(size)).get();
            if (obj2 == obj) {
                arrayList.remove(size);
                return;
            } else if (obj2 == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: m */
    public final void m2663m(@NonNull View view, int i, Resources.Theme theme) {
        boolean z;
        CharSequence text;
        C9114f m2668h = m2668h(view);
        String str = this.f17550a;
        if (m2668h != null && m2668h.f17561b == i && Objects.equals(m2668h.f17560a, str)) {
            return;
        }
        view.setTag(R.id.qmui_skin_current, new C9114f(str, i));
        if (view instanceof InterfaceC9100b) {
            ((InterfaceC9100b) view).mo2566a(theme);
        }
        Object tag = view.getTag(R.id.qmui_skin_intercept_dispatch);
        if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            return;
        }
        Object tag2 = view.getTag(R.id.qmui_skin_ignore_apply);
        boolean z2 = true;
        int i2 = 0;
        if ((tag2 instanceof Boolean) && ((Boolean) tag2).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m2674b(view, i, theme);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            f17545k.getClass();
            if ((viewGroup instanceof RecyclerView) || (viewGroup instanceof ViewPager) || (viewGroup instanceof AdapterView) || viewGroup.getClass().isAnnotationPresent(QMUISkinListenWithHierarchyChange.class)) {
                z2 = true;
            }
            if (z2) {
                viewGroup.setOnHierarchyChangeListener(f17549o);
            } else {
                viewGroup.addOnLayoutChangeListener(f17548n);
            }
            while (i2 < viewGroup.getChildCount()) {
                m2663m(viewGroup.getChildAt(i2), i, theme);
                i2++;
            }
        } else if (!z) {
            boolean z3 = view instanceof TextView;
            if (z3 || (view instanceof C9094c)) {
                if (z3) {
                    text = ((TextView) view).getText();
                } else {
                    text = ((C9094c) view).getText();
                }
                if (text instanceof Spanned) {
                    InterfaceC9102d[] interfaceC9102dArr = (InterfaceC9102d[]) ((Spanned) text).getSpans(0, text.length(), InterfaceC9102d.class);
                    if (interfaceC9102dArr != null) {
                        while (i2 < interfaceC9102dArr.length) {
                            interfaceC9102dArr[i2].mo2650a(theme);
                            i2++;
                        }
                    }
                    view.invalidate();
                }
            }
        }
    }
}
