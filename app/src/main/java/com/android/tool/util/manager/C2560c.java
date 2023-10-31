package com.android.tool.util.manager;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.AdapterView;
import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0510h;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.AbstractC1821a;
import androidx.viewpager.widget.ViewPager;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;
import com.qmuiteam.qmui.widget.tab.C9249b;
import com.tencent.mmkv.MMKV;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.android.tool.util.manager.c */
/* loaded from: classes.dex */
public final class C2560c {

    /* renamed from: f */
    public static C2560c f6059f;

    /* renamed from: g */
    public static final HashSet f6060g = new HashSet();

    /* renamed from: c */
    public String[] f6063c;

    /* renamed from: d */
    public ArrayList f6064d;

    /* renamed from: a */
    public int f6061a = 1;

    /* renamed from: b */
    public final SparseArray<HashMap<View, C2565e>> f6062b = new SparseArray<>();

    /* renamed from: e */
    public final C2561a f6065e = new C2561a();

    /* renamed from: com.android.tool.util.manager.c$a */
    /* loaded from: classes.dex */
    public class C2561a implements RecyclerView.InterfaceC1580l {

        /* renamed from: a */
        public final HashMap<View, Integer> f6066a = new HashMap<>();

        public C2561a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1580l
        /* renamed from: a */
        public final void mo9361a(@NonNull View view) {
            Integer remove = this.f6066a.remove(view);
            if (remove != null) {
                int intValue = remove.intValue();
                C2560c c2560c = C2560c.this;
                SparseArray<HashMap<View, C2565e>> sparseArray = c2560c.f6062b;
                c2560c.m9362j(sparseArray.get(intValue));
                sparseArray.remove(intValue);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1580l
        /* renamed from: b */
        public final void mo9360b(@NonNull View view) {
            RecyclerView recyclerView = (RecyclerView) view.getParent();
            RecyclerView.AbstractC1597y m10399I = recyclerView.m10399I(view);
            this.f6066a.put(view, Integer.valueOf(C2560c.this.m9367e(recyclerView, m10399I, (String) recyclerView.getTag(R.id.qmui_skin_adapter))));
        }
    }

    /* renamed from: com.android.tool.util.manager.c$b */
    /* loaded from: classes.dex */
    public static class C2562b {

        /* renamed from: a */
        public String f6068a;

        /* renamed from: b */
        public String f6069b;

        /* renamed from: c */
        public Object f6070c;

        /* renamed from: d */
        public final ArrayList f6071d = new ArrayList();

        /* renamed from: e */
        public final ArrayList f6072e = new ArrayList();

        /* renamed from: f */
        public C2562b f6073f = null;

        @Nullable
        /* renamed from: a */
        public final String m9359a() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6069b);
            for (C2562b c2562b = this.f6073f; c2562b != null; c2562b = c2562b.f6073f) {
                sb.insert(0, "_");
                sb.insert(0, this.f6073f.f6069b);
            }
            return sb.toString();
        }
    }

    /* renamed from: com.android.tool.util.manager.c$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2563c {
        /* renamed from: a */
        void mo9356a(C9135i c9135i, String str);
    }

    /* renamed from: com.android.tool.util.manager.c$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2564d {
    }

    /* renamed from: com.android.tool.util.manager.c$e */
    /* loaded from: classes.dex */
    public class C2565e {

        /* renamed from: a */
        public View.OnClickListener f6074a;

        /* renamed from: b */
        public View f6075b;

        /* renamed from: c */
        public final C9135i f6076c = C9135i.m2657a();

        /* renamed from: d */
        public C2562b f6077d;

        /* renamed from: e */
        public String f6078e;

        /* renamed from: f */
        public String f6079f;

        @Nullable
        /* renamed from: a */
        public final String m9358a() {
            StringBuilder sb;
            String str;
            if (this.f6077d == null) {
                return null;
            }
            if (this.f6078e != null) {
                sb = new StringBuilder("r:");
                sb.append(this.f6077d.m9359a());
                sb.append("@");
                str = this.f6078e;
            } else {
                sb = new StringBuilder("i:");
                sb.append(this.f6077d.m9359a());
                sb.append("@");
                str = this.f6079f;
            }
            sb.append(str);
            return sb.toString();
        }

        /* renamed from: b */
        public final String m9357b() {
            if (this.f6079f != null) {
                Object obj = this.f6077d.f6070c;
                return ((obj instanceof Activity) || (obj instanceof ViewGroup)) ? "@this" : obj instanceof Fragment ? "@getView()" : obj instanceof RecyclerView.AbstractC1597y ? "@itemView" : "";
            }
            return "";
        }
    }

    /* renamed from: a */
    public static void m9371a(C2560c c2560c, QMUIGroupListView qMUIGroupListView, QMUIGroupListView.C9214a c9214a, C2565e c2565e, String str, InterfaceC2563c interfaceC2563c) {
        c2560c.getClass();
        c9214a.m2572a(qMUIGroupListView.m2573b(str), new View$OnClickListenerC2583e(c2560c, c2565e, interfaceC2563c));
    }

    /* renamed from: b */
    public static void m9370b(C2562b c2562b) {
        if (c2562b.f6072e.isEmpty()) {
            return;
        }
        ArrayList arrayList = c2562b.f6072e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C2562b c2562b2 = (C2562b) arrayList.get(size);
            m9370b(c2562b2);
            if (c2562b2.f6072e.isEmpty() && c2562b2.f6071d.isEmpty()) {
                arrayList.remove(c2562b2);
            }
        }
    }

    /* renamed from: h */
    public static void m9364h(HashMap hashMap) {
        for (View view : hashMap.keySet()) {
            C2565e c2565e = (C2565e) hashMap.get(view);
            C2562b c2562b = c2565e.f6077d;
            if (c2562b != null) {
                String m2537a = MMKV.m2534d().m2537a(c2565e.m9358a());
                if (m2537a != null && !m2537a.isEmpty()) {
                    String[] split = m2537a.split(";");
                    if (c2562b.f6068a.equals(split[0])) {
                        String replaceAll = split[1].replaceAll("@.*", "");
                        C9106f.m2677c(view, replaceAll);
                        C9135i c9135i = c2565e.f6076c;
                        c9135i.getClass();
                        for (String str : replaceAll.split("[|]")) {
                            String[] split2 = str.split(":");
                            if (split2.length == 2) {
                                c9135i.f17563a.put(split2[0].trim(), split2[1].trim());
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public static void m9363i(C2565e c2565e, String str, String str2) {
        c2565e.f6075b.setTag(R.id.qmui_skin_adapter, str2);
        MMKV m2534d = MMKV.m2534d();
        StringBuilder m13052b = C0063d.m13052b("a:", str, "@");
        String str3 = c2565e.f6078e;
        if (str3 == null) {
            if (c2565e.f6079f != null) {
                str3 = "i/" + c2565e.f6079f;
            } else {
                str3 = null;
            }
        }
        m13052b.append(str3);
        m2534d.m2536b(m13052b.toString(), c2565e.f6077d.f6068a + ";" + str2 + c2565e.m9357b());
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x016d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0115 A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9369c(java.lang.Object r18, java.lang.String r19, java.util.HashMap<android.view.View, com.android.tool.util.manager.C2560c.C2565e> r20) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.tool.util.manager.C2560c.m9369c(java.lang.Object, java.lang.String, java.util.HashMap):void");
    }

    /* renamed from: d */
    public final int m9368d(View view) {
        int i = this.f6061a;
        this.f6061a = i + 1;
        HashMap<View, C2565e> hashMap = new HashMap<>();
        this.f6062b.put(i, hashMap);
        m9365g(view, hashMap);
        return i;
    }

    /* renamed from: e */
    public final int m9367e(RecyclerView recyclerView, RecyclerView.AbstractC1597y abstractC1597y, String str) {
        RecyclerView.AbstractC1572e adapter;
        int m9368d = m9368d(abstractC1597y.itemView);
        HashMap<View, C2565e> hashMap = this.f6062b.get(m9368d);
        StringBuilder m12339b = C0510h.m12339b(str, "_");
        m12339b.append(abstractC1597y.itemView.getClass().getSimpleName());
        String sb = m12339b.toString();
        m9369c(abstractC1597y, sb, hashMap);
        m9364h(hashMap);
        m9366f(hashMap);
        if (recyclerView.getAdapter() != null) {
            MMKV.m2534d().m2536b("c:" + abstractC1597y.getClass().getName() + "@" + str, adapter.getClass().getName() + ";" + sb);
        }
        return m9368d;
    }

    /* renamed from: f */
    public final void m9366f(HashMap<View, C2565e> hashMap) {
        C2562b c2562b;
        int lastIndexOf;
        for (View view : hashMap.keySet()) {
            C2565e c2565e = hashMap.get(view);
            if (c2565e != null && (c2562b = c2565e.f6077d) != null) {
                String m9359a = c2562b.m9359a();
                StringBuilder m12339b = C0510h.m12339b(m9359a, "_");
                String str = c2565e.f6078e;
                if (str == null) {
                    String str2 = c2565e.f6079f;
                    if (str2 != null && (lastIndexOf = str2.lastIndexOf(".")) >= 0 && lastIndexOf < c2565e.f6079f.length()) {
                        str = c2565e.f6079f.substring(lastIndexOf + 1);
                    } else {
                        str = null;
                    }
                }
                m12339b.append(str);
                String sb = m12339b.toString();
                if (view instanceof RecyclerView) {
                    m9363i(c2565e, m9359a, sb);
                    RecyclerView recyclerView = (RecyclerView) view;
                    for (int i = 0; i < recyclerView.getChildCount(); i++) {
                        m9367e(recyclerView, recyclerView.m10399I(recyclerView.getChildAt(i)), sb);
                    }
                    if (recyclerView.f3636C == null) {
                        recyclerView.f3636C = new ArrayList();
                    }
                    recyclerView.f3636C.add(this.f6065e);
                } else if (view instanceof ViewPager) {
                    m9363i(c2565e, m9359a, sb);
                    ViewPager viewPager = (ViewPager) view;
                    AbstractC1821a adapter = viewPager.getAdapter();
                    if (adapter != null && !(adapter instanceof C2558a)) {
                        viewPager.setAdapter(new C2558a(this, adapter, sb));
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public final void m9365g(View view, HashMap<View, C2565e> hashMap) {
        if (!(view instanceof QMUITopBar) && !(view instanceof QMUITopBarLayout) && !(view instanceof C9249b) && !(view instanceof WebView)) {
            Iterator it = f6060g.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isAssignableFrom(view.getClass())) {
                    return;
                }
            }
            C2565e c2565e = new C2565e();
            c2565e.f6075b = view;
            try {
                Field declaredField = View.class.getDeclaredField("mListenerInfo");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(view);
                if (obj != null) {
                    Field declaredField2 = obj.getClass().getDeclaredField("mOnClickListener");
                    declaredField2.setAccessible(true);
                    c2565e.f6074a = (View.OnClickListener) declaredField2.get(obj);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            View$OnClickListenerC2566d view$OnClickListenerC2566d = new View$OnClickListenerC2566d(this, c2565e, view);
            if (!(view instanceof AdapterView)) {
                view.setOnClickListener(view$OnClickListenerC2566d);
            }
            hashMap.put(view, c2565e);
            if (!(view instanceof AbsListView) && !(view instanceof ViewPager) && !(view instanceof RecyclerView) && (view instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m9365g(viewGroup.getChildAt(i), hashMap);
                }
            }
        }
    }

    /* renamed from: j */
    public final void m9362j(HashMap<View, C2565e> hashMap) {
        ArrayList arrayList;
        if (hashMap != null) {
            for (View view : hashMap.keySet()) {
                C2565e c2565e = hashMap.get(view);
                if (c2565e != null) {
                    view.setOnClickListener(c2565e.f6074a);
                }
                if ((view instanceof RecyclerView) && (arrayList = ((RecyclerView) view).f3636C) != null) {
                    arrayList.remove(this.f6065e);
                }
            }
        }
    }
}
