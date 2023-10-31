package com.qmuiteam.qmui.skin;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.ActivityC0101d;
import com.qmuiteam.qmui.C9056b;
import com.qmuiteam.qmui.util.C9143d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;

/* renamed from: com.qmuiteam.qmui.skin.g */
/* loaded from: classes3.dex */
public final class LayoutInflater$Factory2C9107g implements LayoutInflater.Factory2 {

    /* renamed from: d */
    public static final String[] f17536d = {"android.widget.", "android.webkit.", "android.app.", "android.view."};

    /* renamed from: e */
    public static final HashMap<String, String> f17537e = new HashMap<>();

    /* renamed from: f */
    public static boolean f17538f = true;

    /* renamed from: g */
    public static boolean f17539g = false;

    /* renamed from: a */
    public Resources.Theme f17540a;

    /* renamed from: b */
    public final WeakReference<Activity> f17541b;

    /* renamed from: c */
    public final LayoutInflater f17542c;

    public LayoutInflater$Factory2C9107g(Activity activity, LayoutInflater layoutInflater) {
        this.f17541b = new WeakReference<>(activity);
        this.f17542c = layoutInflater;
    }

    /* renamed from: a */
    public final View m2676a(String str, Context context, AttributeSet attributeSet) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InflateException, ClassNotFoundException {
        Field declaredField = LayoutInflater.class.getDeclaredField("mConstructorArgs");
        declaredField.setAccessible(true);
        LayoutInflater layoutInflater = this.f17542c;
        Object[] objArr = (Object[]) declaredField.get(layoutInflater);
        Object obj = objArr[0];
        objArr[0] = context;
        View createView = layoutInflater.createView(str, null, attributeSet);
        objArr[0] = obj;
        return createView;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View view2;
        View m2676a;
        HashMap<String, String> hashMap;
        char c;
        Activity activity = this.f17541b.get();
        if (activity instanceof ActivityC0101d) {
            view2 = ((ActivityC0101d) activity).getDelegate().mo12978e(str, context, attributeSet);
        } else {
            view2 = null;
        }
        char c2 = 4;
        int i = 0;
        if (view2 == null) {
            try {
                boolean contains = str.contains(".");
                LayoutInflater layoutInflater = this.f17542c;
                if (!contains) {
                    HashMap<String, String> hashMap2 = f17537e;
                    if (hashMap2.containsKey(str)) {
                        m2676a = layoutInflater.createView(str, hashMap2.get(str), attributeSet);
                    } else {
                        String[] strArr = f17536d;
                        for (int i2 = 0; i2 < 4; i2++) {
                            String str2 = strArr[i2];
                            try {
                                view2 = layoutInflater.createView(str, str2, attributeSet);
                            } catch (Exception unused) {
                            }
                            if (view2 != null) {
                                hashMap2.put(str, str2);
                                break;
                            }
                            continue;
                        }
                    }
                } else {
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (!f17539g) {
                            try {
                                LayoutInflater.class.getDeclaredMethod("createView", Context.class, String.class, String.class, AttributeSet.class);
                            } catch (Exception unused2) {
                                f17538f = false;
                            }
                            f17539g = true;
                        }
                        if (f17538f) {
                            m2676a = layoutInflater.createView(context, str, null, attributeSet);
                        }
                    }
                    m2676a = m2676a(str, context, attributeSet);
                }
                view2 = m2676a;
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e) {
                e.getMessage();
            }
        }
        if (view2 != null) {
            C9135i m2657a = C9135i.m2657a();
            Context context2 = view2.getContext();
            if (this.f17540a == null) {
                this.f17540a = context2.getApplicationContext().getResources().newTheme();
            }
            TypedArray obtainStyledAttributes = this.f17540a.obtainStyledAttributes(attributeSet, C9056b.f17323r, 0, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            while (true) {
                hashMap = m2657a.f17563a;
                if (i >= indexCount) {
                    break;
                }
                int index = obtainStyledAttributes.getIndex(i);
                String string = obtainStyledAttributes.getString(index);
                if (C9143d.m2642c(string)) {
                    c = c2;
                } else {
                    if (string.startsWith("?")) {
                        string = string.substring(1);
                    }
                    int identifier = context2.getResources().getIdentifier(string, "attr", context2.getPackageName());
                    if (identifier != 0) {
                        if (index == 1) {
                            m2657a.m2656b(identifier);
                        } else if (index == 0) {
                            hashMap.put("alpha", String.valueOf(identifier));
                        } else if (index == 3) {
                            hashMap.put("border", String.valueOf(identifier));
                        } else if (index == 14) {
                            m2657a.m2652f(identifier);
                        } else if (index == 8) {
                            hashMap.put("secondTextColor", String.valueOf(identifier));
                        } else if (index == 13) {
                            hashMap.put("src", String.valueOf(identifier));
                        } else if (index == 20) {
                            hashMap.put("tintColor", String.valueOf(identifier));
                        } else if (index == 12) {
                            m2657a.m2651g(identifier);
                        } else if (index == 11) {
                            hashMap.put("rightSeparator", String.valueOf(identifier));
                        } else if (index == 9) {
                            hashMap.put("bottomSeparator", String.valueOf(identifier));
                        } else if (index == 10) {
                            hashMap.put("LeftSeparator", String.valueOf(identifier));
                        } else if (index == 2) {
                            hashMap.put("bgTintColor", String.valueOf(identifier));
                        } else if (index == 7) {
                            hashMap.put("progressColor", String.valueOf(identifier));
                        } else if (index == 21) {
                            hashMap.put("underline", String.valueOf(identifier));
                        } else if (index == 5) {
                            hashMap.put("moreBgColor", String.valueOf(identifier));
                        } else if (index == 6) {
                            hashMap.put("moreTextColor", String.valueOf(identifier));
                        } else {
                            c = 4;
                            if (index == 4) {
                                hashMap.put("hintColor", String.valueOf(identifier));
                            } else if (index == 19) {
                                hashMap.put("tcTintColor", String.valueOf(identifier));
                            } else if (index == 16) {
                                hashMap.put("tclSrc", String.valueOf(identifier));
                            } else if (index == 18) {
                                hashMap.put("tctSrc", String.valueOf(identifier));
                            } else if (index == 17) {
                                hashMap.put("tcrSrc", String.valueOf(identifier));
                            } else if (index == 15) {
                                hashMap.put("tcbSrc", String.valueOf(identifier));
                            }
                        }
                    }
                    c = 4;
                }
                i++;
                c2 = c;
            }
            obtainStyledAttributes.recycle();
            if (!hashMap.isEmpty()) {
                int i3 = C9106f.f17535a;
                C9106f.m2677c(view2, m2657a.m2655c());
            }
            C9135i.m2653e(m2657a);
        }
        return view2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
