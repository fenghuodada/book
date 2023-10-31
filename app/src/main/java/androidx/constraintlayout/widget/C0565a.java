package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.core.C0511i;
import androidx.constraintlayout.motion.widget.C0552c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes.dex */
public final class C0565a {

    /* renamed from: a */
    public final boolean f2005a;

    /* renamed from: b */
    public final String f2006b;

    /* renamed from: c */
    public final int f2007c;

    /* renamed from: d */
    public int f2008d;

    /* renamed from: e */
    public float f2009e;

    /* renamed from: f */
    public String f2010f;

    /* renamed from: g */
    public boolean f2011g;

    /* renamed from: h */
    public int f2012h;

    public C0565a(C0565a c0565a, Object obj) {
        this.f2005a = false;
        this.f2006b = c0565a.f2006b;
        this.f2007c = c0565a.f2007c;
        m12164c(obj);
    }

    public C0565a(String str, int i, Object obj, boolean z) {
        this.f2005a = false;
        this.f2006b = str;
        this.f2007c = i;
        this.f2005a = z;
        m12164c(obj);
    }

    /* renamed from: a */
    public static void m12166a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        int resourceId;
        float dimension;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0582i.f2177e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z = false;
        Object obj = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index != 3) {
                    i4 = 4;
                    if (index != 2) {
                        if (index == 7) {
                            dimension = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                        } else if (index == 4) {
                            dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                        } else if (index == 5) {
                            obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                            i = 2;
                        } else {
                            if (index == 6) {
                                resourceId = obtainStyledAttributes.getInteger(index, -1);
                            } else if (index == 9) {
                                obj = obtainStyledAttributes.getString(index);
                                i = 5;
                            } else {
                                i3 = 8;
                                if (index == 8) {
                                    resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                    if (resourceId == -1) {
                                        resourceId = obtainStyledAttributes.getInt(index, -1);
                                    }
                                }
                            }
                            obj = Integer.valueOf(resourceId);
                            i = i3;
                        }
                        obj = Float.valueOf(dimension);
                        i = 7;
                    }
                }
                i3 = i4;
                resourceId = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(resourceId);
                i = i3;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new C0565a(str, i, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public static void m12165b(View view, HashMap<String, C0565a> hashMap) {
        String str;
        StringBuilder sb;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            C0565a c0565a = hashMap.get(str2);
            if (!c0565a.f2005a) {
                str = C0552c.m12192b("set", str2);
            } else {
                str = str2;
            }
            try {
            } catch (IllegalAccessException e) {
                e = e;
                sb = new StringBuilder(" Custom Attribute \"");
                sb.append(str2);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
            } catch (InvocationTargetException e3) {
                e = e3;
                sb = new StringBuilder(" Custom Attribute \"");
                sb.append(str2);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            }
            switch (C0511i.m12337b(c0565a.f2007c)) {
                case 0:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(c0565a.f2008d));
                    continue;
                case 1:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(c0565a.f2009e));
                    continue;
                case 2:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(c0565a.f2012h));
                    continue;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(c0565a.f2012h);
                    method.invoke(view, colorDrawable);
                    continue;
                case 4:
                    cls.getMethod(str, CharSequence.class).invoke(view, c0565a.f2010f);
                    continue;
                case 5:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(c0565a.f2011g));
                    continue;
                case 6:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(c0565a.f2009e));
                    continue;
                case 7:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(c0565a.f2008d));
                    continue;
                default:
                    continue;
            }
            Log.e("TransitionLayout", e2.getMessage());
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
        }
    }

    /* renamed from: c */
    public final void m12164c(Object obj) {
        switch (C0511i.m12337b(this.f2007c)) {
            case 0:
            case 7:
                this.f2008d = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.f2009e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f2012h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f2010f = (String) obj;
                return;
            case 5:
                this.f2011g = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
