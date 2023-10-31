package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.activity.result.C0063d;
import androidx.annotation.LayoutRes;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0157c;
import androidx.appcompat.view.menu.C0214i;
import androidx.appcompat.view.menu.MenuItemC0216j;
import androidx.appcompat.widget.C0427x0;
import androidx.appcompat.widget.C0430x1;
import androidx.core.internal.view.InterfaceMenuC0725a;
import androidx.core.internal.view.InterfaceMenuItemC0726b;
import androidx.core.view.AbstractC0893b;
import androidx.core.view.C0854a0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.f */
/* loaded from: classes.dex */
public final class C0186f extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f526e;

    /* renamed from: f */
    public static final Class<?>[] f527f;

    /* renamed from: a */
    public final Object[] f528a;

    /* renamed from: b */
    public final Object[] f529b;

    /* renamed from: c */
    public final Context f530c;

    /* renamed from: d */
    public Object f531d;

    /* renamed from: androidx.appcompat.view.f$a */
    /* loaded from: classes.dex */
    public static class MenuItem$OnMenuItemClickListenerC0187a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class<?>[] f532c = {MenuItem.class};

        /* renamed from: a */
        public final Object f533a;

        /* renamed from: b */
        public final Method f534b;

        public MenuItem$OnMenuItemClickListenerC0187a(Object obj, String str) {
            this.f533a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f534b = cls.getMethod(str, f532c);
            } catch (Exception e) {
                StringBuilder m13052b = C0063d.m13052b("Couldn't resolve menu item onClick handler ", str, " in class ");
                m13052b.append(cls.getName());
                InflateException inflateException = new InflateException(m13052b.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f534b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f533a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.f$b */
    /* loaded from: classes.dex */
    public class C0188b {

        /* renamed from: A */
        public CharSequence f535A;

        /* renamed from: B */
        public CharSequence f536B;

        /* renamed from: a */
        public final Menu f540a;

        /* renamed from: h */
        public boolean f547h;

        /* renamed from: i */
        public int f548i;

        /* renamed from: j */
        public int f549j;

        /* renamed from: k */
        public CharSequence f550k;

        /* renamed from: l */
        public CharSequence f551l;

        /* renamed from: m */
        public int f552m;

        /* renamed from: n */
        public char f553n;

        /* renamed from: o */
        public int f554o;

        /* renamed from: p */
        public char f555p;

        /* renamed from: q */
        public int f556q;

        /* renamed from: r */
        public int f557r;

        /* renamed from: s */
        public boolean f558s;

        /* renamed from: t */
        public boolean f559t;

        /* renamed from: u */
        public boolean f560u;

        /* renamed from: v */
        public int f561v;

        /* renamed from: w */
        public int f562w;

        /* renamed from: x */
        public String f563x;

        /* renamed from: y */
        public String f564y;

        /* renamed from: z */
        public AbstractC0893b f565z;

        /* renamed from: C */
        public ColorStateList f537C = null;

        /* renamed from: D */
        public PorterDuff.Mode f538D = null;

        /* renamed from: b */
        public int f541b = 0;

        /* renamed from: c */
        public int f542c = 0;

        /* renamed from: d */
        public int f543d = 0;

        /* renamed from: e */
        public int f544e = 0;

        /* renamed from: f */
        public boolean f545f = true;

        /* renamed from: g */
        public boolean f546g = true;

        public C0188b(Menu menu) {
            this.f540a = menu;
        }

        /* renamed from: a */
        public final <T> T m12873a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0186f.this.f530c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: b */
        public final void m12872b(MenuItem menuItem) {
            boolean z;
            MenuItem enabled = menuItem.setChecked(this.f558s).setVisible(this.f559t).setEnabled(this.f560u);
            boolean z2 = false;
            if (this.f557r >= 1) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.f551l).setIcon(this.f552m);
            int i = this.f561v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            String str = this.f564y;
            C0186f c0186f = C0186f.this;
            if (str != null) {
                if (!c0186f.f530c.isRestricted()) {
                    if (c0186f.f531d == null) {
                        c0186f.f531d = C0186f.m12875a(c0186f.f530c);
                    }
                    menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC0187a(c0186f.f531d, this.f564y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f557r >= 2) {
                if (menuItem instanceof C0214i) {
                    C0214i c0214i = (C0214i) menuItem;
                    c0214i.f738x = (c0214i.f738x & (-5)) | 4;
                } else if (menuItem instanceof MenuItemC0216j) {
                    MenuItemC0216j menuItemC0216j = (MenuItemC0216j) menuItem;
                    try {
                        Method method = menuItemC0216j.f743e;
                        InterfaceMenuItemC0726b interfaceMenuItemC0726b = menuItemC0216j.f742d;
                        if (method == null) {
                            menuItemC0216j.f743e = interfaceMenuItemC0726b.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemC0216j.f743e.invoke(interfaceMenuItemC0726b, Boolean.TRUE);
                    } catch (Exception e) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                    }
                }
            }
            String str2 = this.f563x;
            if (str2 != null) {
                menuItem.setActionView((View) m12873a(str2, C0186f.f526e, c0186f.f528a));
                z2 = true;
            }
            int i2 = this.f562w;
            if (i2 > 0) {
                if (!z2) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractC0893b abstractC0893b = this.f565z;
            if (abstractC0893b != null) {
                if (menuItem instanceof InterfaceMenuItemC0726b) {
                    ((InterfaceMenuItemC0726b) menuItem).mo11872a(abstractC0893b);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.f535A;
            boolean z3 = menuItem instanceof InterfaceMenuItemC0726b;
            if (z3) {
                ((InterfaceMenuItemC0726b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0854a0.m11590h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.f536B;
            if (z3) {
                ((InterfaceMenuItemC0726b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0854a0.m11585m(menuItem, charSequence2);
            }
            char c = this.f553n;
            int i3 = this.f554o;
            if (z3) {
                ((InterfaceMenuItemC0726b) menuItem).setAlphabeticShortcut(c, i3);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0854a0.m11591g(menuItem, c, i3);
            }
            char c2 = this.f555p;
            int i4 = this.f556q;
            if (z3) {
                ((InterfaceMenuItemC0726b) menuItem).setNumericShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0854a0.m11587k(menuItem, c2, i4);
            }
            PorterDuff.Mode mode = this.f538D;
            if (mode != null) {
                if (z3) {
                    ((InterfaceMenuItemC0726b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    C0854a0.m11588j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.f537C;
            if (colorStateList != null) {
                if (z3) {
                    ((InterfaceMenuItemC0726b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    C0854a0.m11589i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f526e = clsArr;
        f527f = clsArr;
    }

    public C0186f(Context context) {
        super(context);
        this.f530c = context;
        Object[] objArr = {context};
        this.f528a = objArr;
        this.f529b = objArr;
    }

    /* renamed from: a */
    public static Object m12875a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? m12875a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m12874b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        char charAt;
        char charAt2;
        int i2;
        boolean z;
        AbstractC0893b abstractC0893b;
        ColorStateList colorStateList;
        C0188b c0188b = new C0188b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType != 1) {
                Menu menu2 = c0188b.f540a;
                if (eventType != i) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z3 && name2.equals(str)) {
                            z3 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            c0188b.f541b = 0;
                            c0188b.f542c = 0;
                            c0188b.f543d = 0;
                            c0188b.f544e = 0;
                            c0188b.f545f = true;
                            c0188b.f546g = true;
                        } else if (name2.equals("item")) {
                            if (!c0188b.f547h) {
                                AbstractC0893b abstractC0893b2 = c0188b.f565z;
                                if (abstractC0893b2 != null && abstractC0893b2.mo11535a()) {
                                    c0188b.f547h = true;
                                    c0188b.m12872b(menu2.addSubMenu(c0188b.f541b, c0188b.f548i, c0188b.f549j, c0188b.f550k).getItem());
                                } else {
                                    c0188b.f547h = true;
                                    c0188b.m12872b(menu2.add(c0188b.f541b, c0188b.f548i, c0188b.f549j, c0188b.f550k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z2 = true;
                        }
                    }
                } else if (!z3) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C0186f c0186f = C0186f.this;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c0186f.f530c.obtainStyledAttributes(attributeSet, C0157c.f425p);
                        c0188b.f541b = obtainStyledAttributes.getResourceId(1, 0);
                        c0188b.f542c = obtainStyledAttributes.getInt(3, 0);
                        c0188b.f543d = obtainStyledAttributes.getInt(4, 0);
                        c0188b.f544e = obtainStyledAttributes.getInt(5, 0);
                        c0188b.f545f = obtainStyledAttributes.getBoolean(2, true);
                        c0188b.f546g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = c0186f.f530c;
                        C0430x1 c0430x1 = new C0430x1(context, context.obtainStyledAttributes(attributeSet, C0157c.f426q));
                        c0188b.f548i = c0430x1.m12469i(2, 0);
                        c0188b.f549j = (c0430x1.m12470h(5, c0188b.f542c) & (-65536)) | (c0430x1.m12470h(6, c0188b.f543d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        c0188b.f550k = c0430x1.m12467k(7);
                        c0188b.f551l = c0430x1.m12467k(8);
                        c0188b.f552m = c0430x1.m12469i(0, 0);
                        String m12468j = c0430x1.m12468j(9);
                        if (m12468j == null) {
                            charAt = 0;
                        } else {
                            charAt = m12468j.charAt(0);
                        }
                        c0188b.f553n = charAt;
                        c0188b.f554o = c0430x1.m12470h(16, 4096);
                        String m12468j2 = c0430x1.m12468j(10);
                        if (m12468j2 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = m12468j2.charAt(0);
                        }
                        c0188b.f555p = charAt2;
                        c0188b.f556q = c0430x1.m12470h(20, 4096);
                        if (c0430x1.m12466l(11)) {
                            i2 = c0430x1.m12477a(11, false);
                        } else {
                            i2 = c0188b.f544e;
                        }
                        c0188b.f557r = i2;
                        c0188b.f558s = c0430x1.m12477a(3, false);
                        c0188b.f559t = c0430x1.m12477a(4, c0188b.f545f);
                        c0188b.f560u = c0430x1.m12477a(1, c0188b.f546g);
                        c0188b.f561v = c0430x1.m12470h(21, -1);
                        c0188b.f564y = c0430x1.m12468j(12);
                        c0188b.f562w = c0430x1.m12469i(13, 0);
                        c0188b.f563x = c0430x1.m12468j(15);
                        String m12468j3 = c0430x1.m12468j(14);
                        if (m12468j3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && c0188b.f562w == 0 && c0188b.f563x == null) {
                            abstractC0893b = (AbstractC0893b) c0188b.m12873a(m12468j3, f527f, c0186f.f529b);
                        } else {
                            if (z) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            abstractC0893b = null;
                        }
                        c0188b.f565z = abstractC0893b;
                        c0188b.f535A = c0430x1.m12467k(17);
                        c0188b.f536B = c0430x1.m12467k(22);
                        if (c0430x1.m12466l(19)) {
                            c0188b.f538D = C0427x0.m12479c(c0430x1.m12470h(19, -1), c0188b.f538D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            c0188b.f538D = null;
                        }
                        if (c0430x1.m12466l(18)) {
                            c0188b.f537C = c0430x1.m12476b(18);
                        } else {
                            c0188b.f537C = colorStateList;
                        }
                        c0430x1.m12464n();
                        c0188b.f547h = false;
                    } else if (name3.equals("menu")) {
                        c0188b.f547h = true;
                        SubMenu addSubMenu = menu2.addSubMenu(c0188b.f541b, c0188b.f548i, c0188b.f549j, c0188b.f550k);
                        c0188b.m12872b(addSubMenu.getItem());
                        m12874b(xmlResourceParser, attributeSet, addSubMenu);
                    } else {
                        str = name3;
                        z3 = true;
                    }
                }
                eventType = xmlResourceParser.next();
                i = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(@LayoutRes int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0725a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f530c.getResources().getLayout(i);
                    m12874b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
