package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.InterfaceMenuC0725a;
import androidx.core.view.C0856a2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public class C0210g implements InterfaceMenuC0725a {

    /* renamed from: y */
    public static final int[] f684y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f685a;

    /* renamed from: b */
    public final Resources f686b;

    /* renamed from: c */
    public boolean f687c;

    /* renamed from: d */
    public boolean f688d;

    /* renamed from: e */
    public InterfaceC0211a f689e;

    /* renamed from: f */
    public final ArrayList<C0214i> f690f;

    /* renamed from: g */
    public final ArrayList<C0214i> f691g;

    /* renamed from: h */
    public boolean f692h;

    /* renamed from: i */
    public final ArrayList<C0214i> f693i;

    /* renamed from: j */
    public final ArrayList<C0214i> f694j;

    /* renamed from: k */
    public boolean f695k;

    /* renamed from: m */
    public CharSequence f697m;

    /* renamed from: n */
    public Drawable f698n;

    /* renamed from: o */
    public View f699o;

    /* renamed from: v */
    public C0214i f706v;

    /* renamed from: x */
    public boolean f708x;

    /* renamed from: l */
    public int f696l = 0;

    /* renamed from: p */
    public boolean f700p = false;

    /* renamed from: q */
    public boolean f701q = false;

    /* renamed from: r */
    public boolean f702r = false;

    /* renamed from: s */
    public boolean f703s = false;

    /* renamed from: t */
    public final ArrayList<C0214i> f704t = new ArrayList<>();

    /* renamed from: u */
    public final CopyOnWriteArrayList<WeakReference<InterfaceC0226m>> f705u = new CopyOnWriteArrayList<>();

    /* renamed from: w */
    public boolean f707w = false;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0211a {
        /* renamed from: a */
        boolean mo12747a(@NonNull C0210g c0210g, @NonNull MenuItem menuItem);

        /* renamed from: b */
        void mo12746b(@NonNull C0210g c0210g);
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.view.menu.g$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0212b {
        /* renamed from: a */
        boolean mo12799a(C0214i c0214i);
    }

    public C0210g(Context context) {
        boolean z;
        boolean z2 = false;
        this.f685a = context;
        Resources resources = context.getResources();
        this.f686b = resources;
        this.f690f = new ArrayList<>();
        this.f691g = new ArrayList<>();
        this.f692h = true;
        this.f693i = new ArrayList<>();
        this.f694j = new ArrayList<>();
        this.f695k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = C0856a2.f2600a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = C0856a2.C0858b.m11579b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        this.f688d = z2;
    }

    /* renamed from: a */
    public final C0214i m12850a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0 && i5 < 6) {
            int i6 = (f684y[i5] << 16) | (65535 & i3);
            C0214i c0214i = new C0214i(this, i, i2, i3, i6, charSequence, this.f696l);
            ArrayList<C0214i> arrayList = this.f690f;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (arrayList.get(size).f718d <= i6) {
                        i4 = size + 1;
                        break;
                    }
                } else {
                    i4 = 0;
                    break;
                }
            }
            arrayList.add(i4, c0214i);
            m12843p(true);
            return c0214i;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m12850a(0, 0, 0, this.f686b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m12850a(i, i2, i3, this.f686b.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m12850a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m12850a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.f685a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C0214i m12850a = m12850a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            m12850a.setIcon(resolveInfo.loadIcon(packageManager));
            m12850a.f721g = intent3;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = m12850a;
            }
        }
        return i5;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f686b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f686b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0214i m12850a = m12850a(i, i2, i3, charSequence);
        SubMenuC0236s subMenuC0236s = new SubMenuC0236s(this.f685a, this, m12850a);
        m12850a.f729o = subMenuC0236s;
        subMenuC0236s.setHeaderTitle(m12850a.f719e);
        return subMenuC0236s;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void m12849b(InterfaceC0226m interfaceC0226m, Context context) {
        this.f705u.add(new WeakReference<>(interfaceC0226m));
        interfaceC0226m.mo12708f(context, this);
        this.f695k = true;
    }

    /* renamed from: c */
    public final void m12848c(boolean z) {
        if (this.f703s) {
            return;
        }
        this.f703s = true;
        CopyOnWriteArrayList<WeakReference<InterfaceC0226m>> copyOnWriteArrayList = this.f705u;
        Iterator<WeakReference<InterfaceC0226m>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0226m> next = it.next();
            InterfaceC0226m interfaceC0226m = next.get();
            if (interfaceC0226m == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                interfaceC0226m.mo12710b(this, z);
            }
        }
        this.f703s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0214i c0214i = this.f706v;
        if (c0214i != null) {
            mo12815d(c0214i);
        }
        this.f690f.clear();
        m12843p(true);
    }

    public final void clearHeader() {
        this.f698n = null;
        this.f697m = null;
        this.f699o = null;
        m12843p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m12848c(true);
    }

    /* renamed from: d */
    public boolean mo12815d(C0214i c0214i) {
        CopyOnWriteArrayList<WeakReference<InterfaceC0226m>> copyOnWriteArrayList = this.f705u;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f706v == c0214i) {
            m12836w();
            Iterator<WeakReference<InterfaceC0226m>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0226m> next = it.next();
                InterfaceC0226m interfaceC0226m = next.get();
                if (interfaceC0226m == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z = interfaceC0226m.mo12741e(c0214i);
                    if (z) {
                        break;
                    }
                }
            }
            m12837v();
            if (z) {
                this.f706v = null;
            }
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo12814e(@NonNull C0210g c0210g, @NonNull MenuItem menuItem) {
        InterfaceC0211a interfaceC0211a = this.f689e;
        return interfaceC0211a != null && interfaceC0211a.mo12747a(c0210g, menuItem);
    }

    /* renamed from: f */
    public boolean mo12813f(C0214i c0214i) {
        CopyOnWriteArrayList<WeakReference<InterfaceC0226m>> copyOnWriteArrayList = this.f705u;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m12836w();
        Iterator<WeakReference<InterfaceC0226m>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0226m> next = it.next();
            InterfaceC0226m interfaceC0226m = next.get();
            if (interfaceC0226m == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z = interfaceC0226m.mo12740j(c0214i);
                if (z) {
                    break;
                }
            }
        }
        m12837v();
        if (z) {
            this.f706v = c0214i;
        }
        return z;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0214i c0214i = this.f690f.get(i2);
            if (c0214i.f715a == i) {
                return c0214i;
            }
            if (c0214i.hasSubMenu() && (findItem = c0214i.f729o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C0214i m12847g(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0214i> arrayList = this.f704t;
        arrayList.clear();
        m12846h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo12809n = mo12809n();
        for (int i2 = 0; i2 < size; i2++) {
            C0214i c0214i = arrayList.get(i2);
            if (mo12809n) {
                c = c0214i.f724j;
            } else {
                c = c0214i.f722h;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (mo12809n && c == '\b' && i == 67))) {
                return c0214i;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return this.f690f.get(i);
    }

    /* renamed from: h */
    public final void m12846h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean z;
        boolean mo12809n = mo12809n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i != 67) {
            return;
        }
        ArrayList<C0214i> arrayList2 = this.f690f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0214i c0214i = arrayList2.get(i3);
            if (c0214i.hasSubMenu()) {
                c0214i.f729o.m12846h(arrayList, i, keyEvent);
            }
            if (mo12809n) {
                c = c0214i.f724j;
            } else {
                c = c0214i.f722h;
            }
            if (mo12809n) {
                i2 = c0214i.f725k;
            } else {
                i2 = c0214i.f723i;
            }
            if ((modifiers & 69647) == (i2 & 69647)) {
                z = true;
            } else {
                z = false;
            }
            if (z && c != 0) {
                char[] cArr = keyData.meta;
                if (c != cArr[0] && c != cArr[2]) {
                    if (mo12809n && c == '\b') {
                        if (i != 67) {
                        }
                    }
                }
                if (c0214i.isEnabled()) {
                    arrayList.add(c0214i);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f708x) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f690f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m12845i() {
        boolean z;
        ArrayList<C0214i> m12844l = m12844l();
        if (!this.f695k) {
            return;
        }
        CopyOnWriteArrayList<WeakReference<InterfaceC0226m>> copyOnWriteArrayList = this.f705u;
        Iterator<WeakReference<InterfaceC0226m>> it = copyOnWriteArrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            WeakReference<InterfaceC0226m> next = it.next();
            InterfaceC0226m interfaceC0226m = next.get();
            if (interfaceC0226m == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z2 |= interfaceC0226m.mo12709c();
            }
        }
        ArrayList<C0214i> arrayList = this.f693i;
        ArrayList<C0214i> arrayList2 = this.f694j;
        arrayList.clear();
        arrayList2.clear();
        if (z2) {
            int size = m12844l.size();
            for (int i = 0; i < size; i++) {
                C0214i c0214i = m12844l.get(i);
                if ((c0214i.f738x & 32) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(c0214i);
                } else {
                    arrayList2.add(c0214i);
                }
            }
        } else {
            arrayList2.addAll(m12844l());
        }
        this.f695k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m12847g(i, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo12812j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: k */
    public C0210g mo12811k() {
        return this;
    }

    @NonNull
    /* renamed from: l */
    public final ArrayList<C0214i> m12844l() {
        boolean z = this.f692h;
        ArrayList<C0214i> arrayList = this.f691g;
        if (z) {
            arrayList.clear();
            ArrayList<C0214i> arrayList2 = this.f690f;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                C0214i c0214i = arrayList2.get(i);
                if (c0214i.isVisible()) {
                    arrayList.add(c0214i);
                }
            }
            this.f692h = false;
            this.f695k = true;
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: m */
    public boolean mo12810m() {
        return this.f707w;
    }

    /* renamed from: n */
    public boolean mo12809n() {
        return this.f687c;
    }

    /* renamed from: o */
    public boolean mo12808o() {
        return this.f688d;
    }

    /* renamed from: p */
    public final void m12843p(boolean z) {
        if (!this.f700p) {
            if (z) {
                this.f692h = true;
                this.f695k = true;
            }
            CopyOnWriteArrayList<WeakReference<InterfaceC0226m>> copyOnWriteArrayList = this.f705u;
            if (!copyOnWriteArrayList.isEmpty()) {
                m12836w();
                Iterator<WeakReference<InterfaceC0226m>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference<InterfaceC0226m> next = it.next();
                    InterfaceC0226m interfaceC0226m = next.get();
                    if (interfaceC0226m == null) {
                        copyOnWriteArrayList.remove(next);
                    } else {
                        interfaceC0226m.mo12707g();
                    }
                }
                m12837v();
                return;
            }
            return;
        }
        this.f701q = true;
        if (z) {
            this.f702r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m12842q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C0214i m12847g = m12847g(i, keyEvent);
        if (m12847g != null) {
            z = m12842q(m12847g, null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            m12848c(true);
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0067, code lost:
        if ((r9 & 1) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bf, code lost:
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c1, code lost:
        m12848c(true);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m12842q(android.view.MenuItem r7, androidx.appcompat.view.menu.InterfaceC0226m r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.i r7 = (androidx.appcompat.view.menu.C0214i) r7
            r0 = 0
            if (r7 == 0) goto Lc5
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lc5
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f730p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L3e
        L19:
            androidx.appcompat.view.menu.g r1 = r7.f728n
            boolean r3 = r1.mo12814e(r1, r7)
            if (r3 == 0) goto L22
            goto L3e
        L22:
            android.content.Intent r3 = r7.f721g
            if (r3 == 0) goto L34
            android.content.Context r1 = r1.f685a     // Catch: android.content.ActivityNotFoundException -> L2c
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2c
            goto L3e
        L2c:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L34:
            androidx.core.view.b r1 = r7.f712A
            if (r1 == 0) goto L40
            boolean r1 = r1.mo11531e()
            if (r1 == 0) goto L40
        L3e:
            r1 = r2
            goto L41
        L40:
            r1 = r0
        L41:
            androidx.core.view.b r3 = r7.f712A
            if (r3 == 0) goto L4d
            boolean r4 = r3.mo11535a()
            if (r4 == 0) goto L4d
            r4 = r2
            goto L4e
        L4d:
            r4 = r0
        L4e:
            boolean r5 = r7.m12833e()
            if (r5 == 0) goto L5c
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lc4
            goto Lc1
        L5c:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L6a
            if (r4 == 0) goto L65
            goto L6a
        L65:
            r7 = r9 & 1
            if (r7 != 0) goto Lc4
            goto Lc1
        L6a:
            r9 = r9 & 4
            if (r9 != 0) goto L71
            r6.m12848c(r0)
        L71:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L85
            androidx.appcompat.view.menu.s r9 = new androidx.appcompat.view.menu.s
            android.content.Context r5 = r6.f685a
            r9.<init>(r5, r6, r7)
            r7.f729o = r9
            java.lang.CharSequence r5 = r7.f719e
            r9.setHeaderTitle(r5)
        L85:
            androidx.appcompat.view.menu.s r7 = r7.f729o
            if (r4 == 0) goto L8c
            r3.mo11530f(r7)
        L8c:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.m>> r9 = r6.f705u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L95
            goto Lbe
        L95:
            if (r8 == 0) goto L9b
            boolean r0 = r8.mo12705i(r7)
        L9b:
            java.util.Iterator r8 = r9.iterator()
        L9f:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lbe
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            androidx.appcompat.view.menu.m r4 = (androidx.appcompat.view.menu.InterfaceC0226m) r4
            if (r4 != 0) goto Lb7
            r9.remove(r3)
            goto L9f
        Lb7:
            if (r0 != 0) goto L9f
            boolean r0 = r4.mo12705i(r7)
            goto L9f
        Lbe:
            r1 = r1 | r0
            if (r1 != 0) goto Lc4
        Lc1:
            r6.m12848c(r2)
        Lc4:
            return r1
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0210g.m12842q(android.view.MenuItem, androidx.appcompat.view.menu.m, int):boolean");
    }

    /* renamed from: r */
    public final void m12841r(InterfaceC0226m interfaceC0226m) {
        CopyOnWriteArrayList<WeakReference<InterfaceC0226m>> copyOnWriteArrayList = this.f705u;
        Iterator<WeakReference<InterfaceC0226m>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0226m> next = it.next();
            InterfaceC0226m interfaceC0226m2 = next.get();
            if (interfaceC0226m2 == null || interfaceC0226m2 == interfaceC0226m) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList<C0214i> arrayList;
        int size = size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            arrayList = this.f690f;
            if (i3 < size) {
                if (arrayList.get(i3).f716b == i) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || arrayList.get(i3).f716b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m12843p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList<C0214i> arrayList;
        int size = size();
        int i2 = 0;
        while (true) {
            arrayList = this.f690f;
            if (i2 < size) {
                if (arrayList.get(i2).f715a == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0 && i2 < arrayList.size()) {
            arrayList.remove(i2);
            m12843p(true);
        }
    }

    /* renamed from: s */
    public final void m12840s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo12812j());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0236s) item.getSubMenu()).m12840s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int i2;
        ArrayList<C0214i> arrayList = this.f690f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0214i c0214i = arrayList.get(i3);
            if (c0214i.f716b == i) {
                int i4 = c0214i.f738x & (-5);
                if (z2) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                c0214i.f738x = i4 | i2;
                c0214i.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f707w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList<C0214i> arrayList = this.f690f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0214i c0214i = arrayList.get(i2);
            if (c0214i.f716b == i) {
                c0214i.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int i2;
        boolean z2;
        ArrayList<C0214i> arrayList = this.f690f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C0214i c0214i = arrayList.get(i3);
            if (c0214i.f716b == i) {
                int i4 = c0214i.f738x;
                int i5 = i4 & (-9);
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                int i6 = i5 | i2;
                c0214i.f738x = i6;
                if (i4 != i6) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            m12843p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f687c = z;
        m12843p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f690f.size();
    }

    /* renamed from: t */
    public final void m12839t(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0236s) item.getSubMenu()).m12839t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo12812j(), sparseArray);
        }
    }

    /* renamed from: u */
    public final void m12838u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f699o = view;
            this.f697m = null;
            this.f698n = null;
        } else {
            if (i > 0) {
                this.f697m = this.f686b.getText(i);
            } else if (charSequence != null) {
                this.f697m = charSequence;
            }
            if (i2 > 0) {
                Object obj = ContextCompat.f2323a;
                this.f698n = ContextCompat.C0651c.m12032b(this.f685a, i2);
            } else if (drawable != null) {
                this.f698n = drawable;
            }
            this.f699o = null;
        }
        m12843p(false);
    }

    /* renamed from: v */
    public final void m12837v() {
        this.f700p = false;
        if (this.f701q) {
            this.f701q = false;
            m12843p(this.f702r);
        }
    }

    /* renamed from: w */
    public final void m12836w() {
        if (this.f700p) {
            return;
        }
        this.f700p = true;
        this.f701q = false;
        this.f702r = false;
    }
}
