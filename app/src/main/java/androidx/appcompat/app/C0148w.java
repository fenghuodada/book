package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.C0320d;
import androidx.appcompat.widget.C0343f;
import androidx.appcompat.widget.C0383m0;
import androidx.appcompat.widget.C0414t;
import androidx.collection.C0482i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.app.w */
/* loaded from: classes.dex */
public class C0148w {

    /* renamed from: b */
    public static final Class<?>[] f388b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f389c = {16843375};

    /* renamed from: d */
    public static final int[] f390d = {16844160};

    /* renamed from: e */
    public static final int[] f391e = {16844156};

    /* renamed from: f */
    public static final int[] f392f = {16844148};

    /* renamed from: g */
    public static final String[] f393g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final C0482i<String, Constructor<? extends View>> f394h = new C0482i<>();

    /* renamed from: a */
    public final Object[] f395a = new Object[2];

    /* renamed from: androidx.appcompat.app.w$a */
    /* loaded from: classes.dex */
    public static class View$OnClickListenerC0149a implements View.OnClickListener {

        /* renamed from: a */
        public final View f396a;

        /* renamed from: b */
        public final String f397b;

        /* renamed from: c */
        public Method f398c;

        /* renamed from: d */
        public Context f399d;

        public View$OnClickListenerC0149a(@NonNull View view, @NonNull String str) {
            this.f396a = view;
            this.f397b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NonNull View view) {
            int id;
            String str;
            Method method;
            if (this.f398c == null) {
                View view2 = this.f396a;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.f397b;
                    if (context != null) {
                        try {
                            if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                                this.f398c = method;
                                this.f399d = context;
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                        if (context instanceof ContextWrapper) {
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            context = null;
                        }
                    } else {
                        if (view2.getId() == -1) {
                            str = "";
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                        }
                        StringBuilder m13052b = C0063d.m13052b("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                        m13052b.append(view2.getClass());
                        m13052b.append(str);
                        throw new IllegalStateException(m13052b.toString());
                    }
                }
            }
            try {
                this.f398c.invoke(this.f399d, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public C0320d mo4321a(Context context, AttributeSet attributeSet) {
        return new C0320d(context, attributeSet);
    }

    @NonNull
    /* renamed from: b */
    public AppCompatButton mo4320b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @NonNull
    /* renamed from: c */
    public C0343f mo4319c(Context context, AttributeSet attributeSet) {
        return new C0343f(context, attributeSet);
    }

    @NonNull
    /* renamed from: d */
    public C0414t mo4318d(Context context, AttributeSet attributeSet) {
        return new C0414t(context, attributeSet);
    }

    @NonNull
    /* renamed from: e */
    public C0383m0 mo4317e(Context context, AttributeSet attributeSet) {
        return new C0383m0(context, attributeSet);
    }

    /* renamed from: f */
    public final View m12929f(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String concat;
        C0482i<String, Constructor<? extends View>> c0482i = f394h;
        Constructor<? extends View> orDefault = c0482i.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            orDefault = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f388b);
            c0482i.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f395a);
    }
}
