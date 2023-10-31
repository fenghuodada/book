package com.ambrose.overwall;

import android.net.VpnService;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1464h;
import com.ambrose.overwall.fragment.C2470n;
import com.ambrose.overwall.p006ui.AbstractActivityC2515a;
import com.ambrose.overwall.p006ui.AbstractC2518d;
import com.android.tool.util.manager.C2560c;
import com.permissionx.guolindev.dialog.C8966a;
import com.permissionx.guolindev.request.C8968a0;
import com.permissionx.guolindev.request.C8970b0;
import com.permissionx.guolindev.request.C8972c0;
import com.permissionx.guolindev.request.C8974d0;
import com.permissionx.guolindev.request.C8992v;
import com.permissionx.guolindev.request.C8993w;
import com.permissionx.guolindev.request.C8994x;
import com.permissionx.guolindev.request.C8995y;
import com.permissionx.guolindev.request.C8996z;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.util.C9140a;
import com.qmuiteam.qmui.util.C9147h;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C10752h;

/* loaded from: classes.dex */
public class MainActivity extends AbstractActivityC2515a {

    /* renamed from: g */
    public C2470n f5738g;

    /* renamed from: h */
    public final C2388a f5739h = new C2388a();

    /* renamed from: com.ambrose.overwall.MainActivity$a */
    /* loaded from: classes.dex */
    public class C2388a implements C9108h.InterfaceC9112d {
        public C2388a() {
        }

        @Override // com.qmuiteam.qmui.skin.C9108h.InterfaceC9112d
        /* renamed from: a */
        public final void mo2564a(int i) {
            int i2;
            boolean z;
            boolean z2 = false;
            MainActivity mainActivity = MainActivity.this;
            if (i == 3) {
                if (mainActivity != null) {
                    String[] strArr = C9140a.f17573a;
                    String str = Build.MODEL;
                    if (str != null && str.toLowerCase().contains("zte c2016")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        int i3 = C9147h.f17582a;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                C9147h.m2630c(mainActivity.getWindow(), true);
                                return;
                            } else if (i3 == 2) {
                                C9147h.m2631b(mainActivity.getWindow(), true);
                                return;
                            } else if (i3 == 3) {
                                C9147h.m2632a(mainActivity.getWindow(), true);
                                return;
                            } else {
                                return;
                            }
                        }
                        String str2 = C9140a.f17574b;
                        "v9".equals(str2);
                        if ("v5".equals(str2) || "v6".equals(str2) || "v7".equals(str2) || "v8".equals(str2)) {
                            z2 = true;
                        }
                        if (z2 && C9147h.m2630c(mainActivity.getWindow(), true)) {
                            C9147h.f17582a = 1;
                        } else if (C9147h.m2631b(mainActivity.getWindow(), true)) {
                            C9147h.f17582a = 2;
                        } else {
                            C9147h.m2632a(mainActivity.getWindow(), true);
                            C9147h.f17582a = 3;
                        }
                    }
                }
            } else if (mainActivity != null && (i2 = C9147h.f17582a) != 0) {
                if (i2 == 1) {
                    C9147h.m2630c(mainActivity.getWindow(), false);
                } else if (i2 == 2) {
                    C9147h.m2631b(mainActivity.getWindow(), false);
                } else if (i2 == 3) {
                    C9147h.m2632a(mainActivity.getWindow(), false);
                }
            }
        }
    }

    @Override // com.qmuiteam.qmui.arch.AbstractActivityC9024f, com.qmuiteam.qmui.arch.ActivityC9007a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0629l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        FragmentActivity m2824a;
        int i;
        super.onCreate(bundle);
        VpnService.prepare(this);
        getWindow().setFormat(-3);
        if (bundle == null) {
            this.f5738g = new C2470n();
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            C2470n c2470n = this.f5738g;
            beginTransaction.add(R.id.qmui_activity_fragment_container_id, c2470n, c2470n.getClass().getSimpleName()).addToBackStack(this.f5738g.getClass().getSimpleName()).commit();
        }
        C9108h m2670f = C9108h.m2670f(this);
        C9108h c9108h = this.f17200c;
        if (c9108h != null) {
            c9108h.m2664l(this);
        }
        this.f17200c = m2670f;
        if (getLifecycle().mo10538b().m10546a(AbstractC1464h.EnumC1468b.STARTED)) {
            m2670f.m2666j(this);
        }
        this.f5739h.mo2564a(m2670f.f17555f);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            List<String> m485d = C10752h.m485d(Arrays.copyOf(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            int i3 = getApplicationInfo().targetSdkVersion;
            for (String str : m485d) {
                if (C8966a.f17135a.contains(str)) {
                    linkedHashSet2.add(str);
                } else {
                    linkedHashSet.add(str);
                }
            }
            if (linkedHashSet2.contains("android.permission.ACCESS_BACKGROUND_LOCATION") && (i2 == 29 || (i2 == 30 && i3 < 30))) {
                linkedHashSet2.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                linkedHashSet.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            }
            if (linkedHashSet2.contains("android.permission.POST_NOTIFICATIONS") && i2 >= 33 && i3 >= 33) {
                linkedHashSet2.remove("android.permission.POST_NOTIFICATIONS");
                linkedHashSet.add("android.permission.POST_NOTIFICATIONS");
            }
            C8992v c8992v = new C8992v(this, linkedHashSet, linkedHashSet2);
            if (Build.VERSION.SDK_INT != 26) {
                c8992v.f17174c = c8992v.m2824a().getRequestedOrientation();
                int i4 = c8992v.m2824a().getResources().getConfiguration().orientation;
                if (i4 != 1) {
                    if (i4 == 2) {
                        m2824a = c8992v.m2824a();
                        i = 6;
                    }
                } else {
                    m2824a = c8992v.m2824a();
                    i = 7;
                }
                m2824a.setRequestedOrientation(i);
            }
            C8968a0 c8968a0 = new C8968a0(c8992v);
            C8993w c8993w = new C8993w(c8992v);
            c8968a0.f17137b = c8993w;
            C8972c0 c8972c0 = new C8972c0(c8992v);
            c8993w.f17137b = c8972c0;
            C8974d0 c8974d0 = new C8974d0(c8992v);
            c8972c0.f17137b = c8974d0;
            C8996z c8996z = new C8996z(c8992v);
            c8974d0.f17137b = c8996z;
            C8995y c8995y = new C8995y(c8992v);
            c8996z.f17137b = c8995y;
            C8970b0 c8970b0 = new C8970b0(c8992v);
            c8995y.f17137b = c8970b0;
            c8970b0.f17137b = new C8994x(c8992v);
            c8968a0.request();
        }
    }

    @Override // androidx.appcompat.app.ActivityC0101d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        System.exit(0);
        super.onDestroy();
    }

    @Override // com.qmuiteam.qmui.arch.ActivityC9007a, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (getSupportFragmentManager().findFragmentById(R.id.qmui_activity_fragment_container_id) instanceof AbstractC2518d) {
            MyApplication myApplication = MyApplication.f5741c;
            C2560c c2560c = C2560c.f6059f;
            if (c2560c != null) {
                int i = 0;
                while (true) {
                    SparseArray<HashMap<View, C2560c.C2565e>> sparseArray = c2560c.f6062b;
                    if (i < sparseArray.size()) {
                        c2560c.m9362j(sparseArray.valueAt(i));
                        i++;
                    } else {
                        sparseArray.clear();
                        return;
                    }
                }
            } else {
                throw new RuntimeException("must invoke init() to init sSkinMaker");
            }
        }
    }

    @Override // com.qmuiteam.qmui.arch.ActivityC9007a, androidx.appcompat.app.ActivityC0101d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        C9108h c9108h = this.f17200c;
        if (c9108h != null) {
            if (!c9108h.f17554e) {
                c9108h.f17557h.add(this.f5739h);
                return;
            }
            throw new RuntimeException("Can not add skinChangeListener while dispatching");
        }
    }

    @Override // com.qmuiteam.qmui.arch.ActivityC9007a, androidx.appcompat.app.ActivityC0101d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        C9108h c9108h = this.f17200c;
        if (c9108h != null) {
            if (!c9108h.f17554e) {
                c9108h.f17557h.remove(this.f5739h);
                return;
            }
            throw new RuntimeException("Can not add skinChangeListener while dispatching");
        }
    }
}
